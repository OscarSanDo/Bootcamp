package com.example.application.resources;
import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
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

import com.example.application.dtos.ActorDTO;


import com.example.domains.contracts.services.ActorService;
import com.example.domains.contracts.services.FilmService;
import com.example.domains.entities.Actor;
import com.example.domains.entities.City;
import com.example.domains.entities.Country;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/peliculas")
public class FilmResource {
	@Autowired
	private FilmService srv;


	@GetMapping
	public List<ActorDTO> getAll() {
		return srv.getByProjection(ActorDTO.class);
	}

	@GetMapping(params = "page")
	public Page<ActorDTO> getAll(Pageable page) {
		return srv.getByProjection(page, ActorDTO.class);
	}

	@GetMapping(path = "/{id}")
	public CiudadDetailsDTO getOneDetails(@PathVariable int id, @RequestParam(required = false, defaultValue = "details") String mode)
			throws NotFoundException {
			return CiudadDetailsDTO.from(srv.getOne(id));
	}
	@GetMapping(path = "/{id}", params = "mode=edit")
	public CiudadEditDTO getOneEdit(@PathVariable int id, @RequestParam(required = true) String mode)
			throws NotFoundException {
			return CiudadEditDTO.from(srv.getOne(id));
	}

	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody CiudadEditDTO item)
			throws InvalidDataException, DuplicateKeyException {
		var entity = CiudadEditDTO.from(item);
		if (entity.isInvalid())
			throw new InvalidDataException(entity.getErrorsMessage());
		entity = srv.add(entity);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(entity.getCityId()).toUri();
		return ResponseEntity.created(location).build();

	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void update(@PathVariable int id, @Valid @RequestBody CiudadEditDTO item)
			throws InvalidDataException, NotFoundException {
		if (id != item.getCityId())
			throw new InvalidDataException("No coinciden los identificadores");
		var entity = CiudadEditDTO.from(item);
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
