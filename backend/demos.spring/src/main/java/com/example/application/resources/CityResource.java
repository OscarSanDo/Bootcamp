package com.example.application.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.application.dtos.CityDetailsDTO;
import com.example.application.dtos.CityEditDTO;
import com.example.domains.contracts.services.CityService;
import com.example.domains.entities.City;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/ciudades")
public class CityResource {
	@Autowired
	private CityService srv;

	@GetMapping
	public List<CityDetailsDTO> getAll() {
		return srv.getAll().stream().map(CityDetailsDTO::from).toList();
	}

	@GetMapping(path = "/{id}")
	public CityDetailsDTO getOneDetails(@PathVariable int id, @RequestParam(required = false, defaultValue = "details") String mode)
			throws NotFoundException {
			return CityDetailsDTO.from(srv.getOne(id));
	}
	@GetMapping(path = "/{id}", params = "mode=edit")
	public CityEditDTO getOneEdit(@PathVariable int id, @RequestParam(required = true) String mode)
			throws NotFoundException {
			return CityEditDTO.from(srv.getOne(id));
	}
	@GetMapping(path = "/{id}", params = "mode=entity")
	public City getOneEntity(@PathVariable int id, @RequestParam(required = true) String mode)
			throws NotFoundException {
			return srv.getOne(id);
	}
//	@GetMapping(path = "/{id}", params = "modo=details")
//	public ResponseEntity<Object> getOne(@PathVariable int id, @RequestParam(required = false, defaultValue = "details") String modo)
//			throws NotFoundException {
//		if ("edit".equals(modo))
//			return ResponseEntity.ok(CiudadEditDTO.from(srv.getOne(id)));
//		else
//			return ResponseEntity.ok(CiudadDetailsDTO.from(srv.getOne(id)));
//	}

	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody CityEditDTO item)
			throws InvalidDataException, DuplicateKeyException {
		var entity = CityEditDTO.from(item);
		if (entity.isInvalid())
			throw new InvalidDataException(entity.getErrorsMessage());
		entity = srv.add(entity);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(entity.getCityId()).toUri();
		return ResponseEntity.created(location).build();

	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void update(@PathVariable int id, @Valid @RequestBody CityEditDTO item)
			throws InvalidDataException, NotFoundException {
		if (id != item.getCityId())
			throw new InvalidDataException("No coinciden los identificadores");
		var entity = CityEditDTO.from(item);
		if (entity.isInvalid())
			throw new InvalidDataException(entity.getErrorsMessage());
		srv.change(entity);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		srv.deleteById(id);
	}
}