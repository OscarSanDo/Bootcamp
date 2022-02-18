package Test;

import java.util.*;


public class actividadesJavaIniciacion05 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		
		double radio;
		double longitud;
		double area;
		
		System.out.println("Introduce el radio de la circunferencia: ");
		radio = scanner.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("La longitud de la circunferencia es " + longitud + " y el área es " + area);
		
	}

}
