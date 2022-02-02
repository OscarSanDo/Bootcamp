package Test;

import java.util.*;

public class actividadesJavaIniciacion10 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        System.out.print("Introduzca valor de N: ");
        numero = scanner.nextInt();  //supondremos que el número introducido tiene 5 cifras                                 
        System.out.println(numero%10);
        System.out.printf("%02d %n",numero%100);
        System.out.printf("%03d %n",numero%1000);
        System.out.printf("%04d %n",numero%10000);
        System.out.printf("%05d %n",numero);
}
}