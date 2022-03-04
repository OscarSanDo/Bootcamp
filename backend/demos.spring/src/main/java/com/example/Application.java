package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import com.example.application.dtos.ActorDTO;
import com.example.application.dtos.ActorShortDTO;
import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.contracts.services.ActorService;
import com.example.domains.entities.Actor;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.ioc.Servicio;
import com.example.jdbc.ConsultaSQL;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.sql.Date;
import java.sql.Timestamp;

import javax.transaction.Transactional;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
@EnableOpenApi
@SpringBootApplication
public class Application implements CommandLineRunner { 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

	@Override
	@Transactional
	public void run(String... args) {

}
}
