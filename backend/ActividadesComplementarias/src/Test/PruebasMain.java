package Test;



public class PruebasMain {

	public static void main(String[] args) {

		
		PiedraPapelTijera.comenzarJuego();
		
	}
//		 Scanner sc = new Scanner(System.in);
//
//		 int a = (int) ((Math.random() * 100)+1); // N�mero aleatorio de 1 a 100.
//		 int b; // N�mero introducido por el usuario.
//		 int i; // Contador para bucle for.
//
//		 System.out.println("El juego consiste en averiguar un n�mero secreto de 100 posibles.");
//
//		 System.out.print("Tienes 10 intentos. Escribe un n�mero entre 1 y 100: ");
//		 b = sc.nextInt();
//		 
//		 for (i=0; i<=9; i++) { 
//
//		    // Primero se eval�a si se ha acertado.
//		    
//		    if (a == b) {  
//		      System.out.println("�Has acertado!"); 
//		      break;
//		    }     
//		    else if (i == 9) { 
//		      System.out.println("Lo siento: �has perdido!. El n�mero era el: " + a); 
//		      break; 
//		    } 
//		    else if (a > b) {
//		      System.out.println("El n�mero secreto es MAYOR que " + b);
//		    }
//		    else if (a < b) {
//		      System.out.println("El n�mero secreto es MENOR que " + b);
//		    }
//
//		    // Por �ltimo un bucle if que sirve para dar una pista y avisarte de la �ltima oportunidad.
//		    
//		    if (i <=1) { 
//		     System.out.print("Otro intento: "); 
//		     b = sc.nextInt(); } 
//		    else if (i <=7) { 
//		    int x = (int) (a/10);
//		    System.out.println("Una pista, la primera cifra es " + x);
//		    System.out.print("Int�ntalo de nuevo: ");
//		    b = sc.nextInt(); } 
//		   else if (i == 8) {
//		   System.out.print("Oh, oh... �LTIMO intento: ");
//		   b = sc.nextInt(); }
//		    }
//		  }
	
	
}
