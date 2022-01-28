package com.capgemini;

import java.util.Random;
import java.util.Scanner;

public class juegoAdivina {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int intentos = 10; // variable para guardar el número de intentos
		int cadUsuario;
		int numeroRandom = new Random().nextInt(101); // genera el numero aleatorio

		System.out.println("Adivina el número entre 0 y 100");
		System.out.print("Tienes 10 intentos.");
		//System.out.println(numeroRandom);

		do {
			System.out.println("Introduce un número entre 0 y 100: ");
			cadUsuario = scanner.nextInt();
		
			
			if (cadUsuario == numeroRandom) {
				System.out.println("Has acertado");
				break;

			} else if (cadUsuario > numeroRandom) {
				System.out.println("El numero Random es menor, te quedan " + --intentos + " intentos: ");


			} else if (cadUsuario < numeroRandom) {
				System.out.println("El numero Random es mayor, te quedan " + --intentos + " intentos: ");
			}

		} while (intentos > 0);
		
		if (intentos == 0) {
		System.out.println("No te quedan intentos, has perdido la partida");}
	}

}
