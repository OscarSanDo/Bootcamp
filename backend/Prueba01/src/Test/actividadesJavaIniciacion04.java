package Test;

import java.util.*;

public class actividadesJavaIniciacion04 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);	
		
		int centigrados;
		double fahrenheit;
		
		System.out.println("Introduce los grados cent�grados: ");
		centigrados = scanner.nextInt();
		
		fahrenheit = 32 + (9 * centigrados / 5);
		
		System.out.println( centigrados + " grados cent�grados equivalen a " + fahrenheit + " Fahrenheit");
		
	}
	
}
	