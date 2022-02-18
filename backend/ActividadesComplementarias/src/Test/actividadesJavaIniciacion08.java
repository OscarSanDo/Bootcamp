package Test;

import java.util.Scanner;
/*
 * Lee un número de 3 cifras y muestra por pantalla las cifras del número                                 
 */

public class actividadesJavaIniciacion08 {
	
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        System.out.print("Introduzca valor de N: ");
	        numero = scanner.nextInt(); //supondremos que el número introducido tiene 3 cifras
	        
	        System.out.println("Primera cifra de " + numero + " -> " + (numero/100));
	        System.out.println("Cifra central de " + numero + " -> " + (numero/10)%10);
	        System.out.println("Última cifra  de " + numero + " -> " + (numero%10));
	        
	     
	}
	
	
	
	
	

}
