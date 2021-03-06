package com.example.application.resources;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.application.dtos.RentalDetailsDTO;
import com.example.application.dtos.RentalEditDTO;
import com.example.application.dtos.RentalShortDTO;
import com.example.domains.contracts.services.RentalService;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/alquileres")
@Api(value = "/alquileres", description = "Mantenimiento de alquileres", produces = "application/json, application/xml", consumes = "application/json, application/xml")
public class RentalResource {
	@Autowired
	private RentalService srv;

	@GetMapping
	@ApiOperation(value = "Listado de alquileres")
	@Transactional
	public List<RentalShortDTO> getAll() {
		return srv.getByProjection(RentalShortDTO.class);
	}

	@GetMapping(params = "page")
	@ApiOperation(value = "Listado paginable de alquileres")
	@Transactional
	public Page<RentalShortDTO> getAll(@ApiParam(required = false) Pageable page) {
		return srv.getByProjection(page, RentalShortDTO.class);
	}

	@GetMapping(path = "/{id}")
	@ApiOperation(value = "Recuperar un alquiler por Id")
	public RentalDetailsDTO getOneDetails(@PathVariable int id,
			@RequestParam(required = false, defaultValue = "details") String mode) throws NotFoundException {
		return RentalDetailsDTO.from(srv.getOne(id));
	}

	@GetMapping(path = "/{id}", params = "mode=edit")
	@ApiOperation(value = "Recupera un alquiler")
	@ApiResponses({ @ApiResponse(code = 200, message = "Alquiler encontrado"),
			@ApiResponse(code = 404, message = "Alquiler no encontrado") })
	public RentalEditDTO getOneEdit(@ApiParam(value = "Identificador del alquiler") @PathVariable int id,
			@ApiParam(value = "Versi??n completa o editable", required = false, allowableValues = "details,edit", defaultValue = "edit") @RequestParam() String mode)
			throws NotFoundException {
		return RentalEditDTO.from(srv.getOne(id));
	}

	@PostMapping
	@Transactional
	@ApiOperation(value = "A??adir un alquiler nuevo")
	@ApiResponses({ @ApiResponse(code = 201, message = "Alquiler a??adido"),
			@ApiResponse(code = 400, message = "Error al validar o clave duplicada"),
	})
	public ResponseEntity<Object> create(@Valid @RequestBody RentalEditDTO item)
			throws InvalidDataException, DuplicateKeyException, NotFoundException {
		var entity = RentalEditDTO.from(item);
		if (entity.isInvalid())
			throw new InvalidDataException(entity.getErrorsMessage());
		entity = srv.add(entity);
		item.update(entity);
		srv.change(entity);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(entity.getRentalId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
		@ApiOperation(value = "Actualizar valores alquiler")
	@ApiResponses({ @ApiResponse(code = 202, message = "Alquiler actualizado"),
			@ApiResponse(code = 404, message = "Error al actualizar datos"),
	})
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	@Transactional
	public void update(@PathVariable int id, @Valid @RequestBody RentalEditDTO item)
			throws InvalidDataException, NotFoundException {
		if (id != item.getRentalId())
			throw new InvalidDataException("No coinciden los identificadores");
		var entity = srv.getOne(id);
		item.update(entity);
		if (entity.isInvalid())
			throw new InvalidDataException(entity.getErrorsMessage());
		srv.change(entity);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Borrar un alquiler existente")
	@ApiResponses({ @ApiResponse(code = 204, message = "Alquiler borrado"),
			@ApiResponse(code = 404, message = "Alquiler no encontrado") })
	public void delete(@ApiParam(value = "Identificador de alquileres") @PathVariable int id) {
		srv.deleteById(id);
	}
}
