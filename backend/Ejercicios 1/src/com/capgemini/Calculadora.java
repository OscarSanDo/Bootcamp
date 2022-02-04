package com.capgemini;

public class Calculadora {

	private double total = 0.0;
	private char pendiente = '+'; 

	public double calcular(double operando, char operador) {
		switch (pendiente) {
		case '+':
			total += operando;
			break;
		case '-':
			total -= operando;
			break;
		case '*':
			total *= operando;
			break;
		case '/':
			total /= operando;
			break;
		case '=':
			total += operando;
		}
		pendiente = operador; 
		return total; 
	
	}
	
	public static double dividir (double num1, double num2) {
		double resultado = num1/num2;
		 return resultado;
		 
	}
	
}
