package com.example.domains.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.domains.contracts.repositories.CountryRepository;
import com.example.domains.contracts.services.CountryService;
import com.example.domains.entities.Country;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

@Service
public class CountryServiceImpl implements CountryService {
	private CountryRepository dao;
	
	public CountryServiceImpl(CountryRepository dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Country> getAll() {
		return dao.findAll();
	}
	
	@Override
	public Country getOne(Integer id) throws NotFoundException {
		var item = dao.findById(id);
		if(item.isEmpty())
			throw new NotFoundException();
		return item.get();
	}
	
	@Override
	public Country add(Country item) throws DuplicateKeyException, InvalidDataException {
		if(item == null)
			throw new IllegalArgumentException();
		if(dao.findById(item.getCountryId()).isPresent())
			throw new DuplicateKeyException();
		if(item.isInvalid())
			throw new InvalidDataException(item.getErrorsMessage());
		return dao.save(item);
	}
	@Override
	public Country change(Country item) throws NotFoundException, InvalidDataException  {
		if(item == null)
			throw new IllegalArgumentException();
		if(dao.findById(item.getCountryId()).isEmpty())
			throw new NotFoundException();
		if(item.isInvalid())
			throw new InvalidDataException(item.getErrorsMessage());
		return dao.save(item);
	}
	@Override
	public void delete(Country item) {
		if(item == null)
			throw new IllegalArgumentException();
		deleteById(item.getCountryId());
		
	}
	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
}
