package com.capgemini;

public class SepararCadena {

	public static void main(String[] args) {
	
		
		String cadena = "3+4+3,4-7*1=";
		cadena = cadena.replace(",", ".");
		String[] cadena_separada = cadena.split("(?<=[-+*/()])");
		Calculadora calculadora = new Calculadora();
		double resultado = 0;

//		for (int i = 0; i < cadena_separada.length; i++) {
//
//			Double operando = Double.parseDouble(cadena_separada[i].substring(0, cadena_separada[i].length() - 1));
//			char operador = cadena_separada[i].charAt(cadena_separada[i].length() - 1);
//
//			System.out.println(cadena_separada[i] + " " + operando + " " + operador);
//			
//			resultado = calculadora.calcular(operando, operador);
//		}
		
	//System.out.println("El resultado es " + resultado);
//	resultado = calculadora.dividir(6.00, 3.00);
//	System.out.println("El resultado es " + resultado);
	}
	
	
}
