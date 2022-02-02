package Test;

import java.util.Scanner;

public class actividadesJavaIniciacion03 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);	
		
		int num1;
			
		System.out.println("Introduce un número entero: ");
		num1 = scanner.nextInt();
				
		System.out.println("El doble de " + num1 + " es el número: " + num1*2);
		System.out.println("El triple de " + num1 + " es el número: " + num1*3);
		
		
	}
}
