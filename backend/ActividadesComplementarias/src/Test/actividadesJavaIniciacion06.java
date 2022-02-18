package Test;

import java.util.*;

public class actividadesJavaIniciacion06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		double velocidadKmh;
		double velocidadMs ;
		
		System.out.println("Introduce la velocidad en Km/h: ");
		velocidadKmh = scanner.nextDouble();
			
		velocidadMs = (velocidadKmh * 1000)/3600;
		
		System.out.println("La velocidad de " + velocidadKmh + " Km/h es igual a " + velocidadMs + " m/s" );
		
		
		
	}

}
