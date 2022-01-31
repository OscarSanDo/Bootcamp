package com.capgemini;

public class Calculadora {

	double total = 0;
	double operando = 0;
	char operador ='+';
	
	public double calcular(double operando, char operador) {
		
		
		switch(operador) {
		case '+':
			total = total + operando;
			break;
		case '-':
			total = total - operando;
			break;
		case '*':
			total = total * operando;
			break;
	}
	
	return total;
	
	}
	
}
