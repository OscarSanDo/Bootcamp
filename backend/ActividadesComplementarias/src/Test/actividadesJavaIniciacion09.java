package Test;

import java.util.Scanner;

public class actividadesJavaIniciacion09 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		int numero;
		
		System.out.print("Introduzca un número de 5 cifras: ");
        numero = scanner.nextInt();
		
        System.out.println(numero/10000);
        System.out.println(numero/1000);
        System.out.println(numero/100);
        System.out.println(numero/10);
        System.out.println(numero);
		
		
	}

}
