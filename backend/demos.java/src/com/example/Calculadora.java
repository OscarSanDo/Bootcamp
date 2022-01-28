package com.example;

public class Calculadora {
	public int suma(int a, int b) {
		return a + b;
	}
	
	public double suma(double a, double b) {
		return a + b;
	}
	

	public double avg(double... resto) {
		if(resto.length == 0) return 0;
		if(resto.length == 1) return resto[0];
		double acumula = 0.0;
		for(int i=0; i < resto.length; acumula += resto[i++]);
		//for(double valor: resto) acumula += valor;
		return acumula / resto.length;
	}

	/*
	
	public double avg(double primero, double... resto) {
		if(resto.length == 0) return primero;
		double acumula = primero;
		for(int i=0; i < resto.length; acumula += resto[i++]);
		//for(double valor: resto) acumula += valor;
		return acumula / resto.length;
	}
	*/
}
