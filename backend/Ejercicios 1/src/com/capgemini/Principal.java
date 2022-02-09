package com.capgemini;

public class Principal {

	public static void main(String[] args) {
		String calculoLeido;
		String[] decodificado;
		Calculadora calculadora = new Calculadora();
		calculoLeido = calculadora.LeerFichero();
		decodificado = calculadora.decodificarCadena(calculoLeido);
		double resultado = calculadora.calcular(decodificado);
		System.out.println(resultado);

	}

}
