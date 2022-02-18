package Test;

import java.util.*;

public class actividadesJavaIniciacion11 {

public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca el día de nacimiento: ");
        int dia = scanner.nextInt();
        
        System.out.print("Introduzca el mes de nacimiento: ");
        int mes = scanner.nextInt();
        
        System.out.print("Introduzca el año de nacimiento: ");
        int año = scanner.nextInt();
        
        System.out.println("el día es " + dia+ "/" + mes+ "/" + año);
        
        int sumaVariables = dia + mes + año;
        
        String v =Integer.toString(sumaVariables);
        int numeroSuerte = 0;
        
        for (int i = 0; i < v.length(); i++) {
        	numeroSuerte = numeroSuerte + Integer.parseUnsignedInt(v.charAt(i) + "");
        }
        
        System.out.println("Tu número de la suerte es : " + numeroSuerte);
        
}
	
}
