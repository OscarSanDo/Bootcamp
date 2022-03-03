package com.example.domains.contracts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domains.entities.Country;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface CountryRepository extends JpaRepository<Country, Integer> {

}