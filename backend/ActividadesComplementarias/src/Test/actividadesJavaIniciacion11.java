package Test;

import java.util.*;

public class actividadesJavaIniciacion11 {

public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca el d�a de nacimiento: ");
        int dia = scanner.nextInt();
        
        System.out.print("Introduzca el mes de nacimiento: ");
        int mes = scanner.nextInt();
        
        System.out.print("Introduzca el a�o de nacimiento: ");
        int a�o = scanner.nextInt();
        
        System.out.println("el d�a es " + dia+ "/" + mes+ "/" + a�o);
        
        int sumaVariables = dia + mes + a�o;
        
        String v =Integer.toString(sumaVariables);
        int numeroSuerte = 0;
        
        for (int i = 0; i < v.length(); i++) {
        	numeroSuerte = numeroSuerte + Integer.parseUnsignedInt(v.charAt(i) + "");
        }
        
        System.out.println("Tu n�mero de la suerte es : " + numeroSuerte);
        
}
	
}
