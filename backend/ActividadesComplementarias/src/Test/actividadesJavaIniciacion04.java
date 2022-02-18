package Test;

import java.util.*;

public class actividadesJavaIniciacion04 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);	
		
		int centigrados;
		double fahrenheit;
		
		System.out.println("Introduce los grados centígrados: ");
		centigrados = scanner.nextInt();
		
		fahrenheit = 32 + (9 * centigrados / 5);
		
		System.out.println( centigrados + " grados centígrados equivalen a " + fahrenheit + " Fahrenheit");
		
	}
	
}
	