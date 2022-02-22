package com.example.ioc;


import org.springframework.stereotype.Service;

@Service 
public class ServicioImpl implements Servicio{

	
	@Override
	public void run() {
		System.out.println("soy un servicio");
		
	}

}
