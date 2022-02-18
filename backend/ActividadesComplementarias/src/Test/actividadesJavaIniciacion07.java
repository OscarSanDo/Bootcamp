package Test;

import java.util.*;


public class actividadesJavaIniciacion07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		double longitud1;
		double longitud2;
		double hipotenusa;
		
		System.out.println("Introduce la longitud del primer cateto: ");
		longitud1 = scanner.nextDouble();
		System.out.println("Introduce la longitud del segundo cateto: ");
		longitud2 = scanner.nextDouble();
			
		hipotenusa = Math.sqrt(Math.pow(longitud1,2)+ Math.pow(longitud2, 2));
		
		System.out.println("La hipotenusa es igual a " + hipotenusa );
	}
	
}
