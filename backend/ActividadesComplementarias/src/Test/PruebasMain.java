package Test;



public class PruebasMain {

	public static void main(String[] args) {

		
		PiedraPapelTijera.comenzarJuego();
		
	}
//		 Scanner sc = new Scanner(System.in);
//
//		 int a = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
//		 int b; // Número introducido por el usuario.
//		 int i; // Contador para bucle for.
//
//		 System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");
//
//		 System.out.print("Tienes 10 intentos. Escribe un número entre 1 y 100: ");
//		 b = sc.nextInt();
//		 
//		 for (i=0; i<=9; i++) { 
//
//		    // Primero se evalúa si se ha acertado.
//		    
//		    if (a == b) {  
//		      System.out.println("¡Has acertado!"); 
//		      break;
//		    }     
//		    else if (i == 9) { 
//		      System.out.println("Lo siento: ¡has perdido!. El número era el: " + a); 
//		      break; 
//		    } 
//		    else if (a > b) {
//		      System.out.println("El número secreto es MAYOR que " + b);
//		    }
//		    else if (a < b) {
//		      System.out.println("El número secreto es MENOR que " + b);
//		    }
//
//		    // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.
//		    
//		    if (i <=1) { 
//		     System.out.print("Otro intento: "); 
//		     b = sc.nextInt(); } 
//		    else if (i <=7) { 
//		    int x = (int) (a/10);
//		    System.out.println("Una pista, la primera cifra es " + x);
//		    System.out.print("Inténtalo de nuevo: ");
//		    b = sc.nextInt(); } 
//		   else if (i == 8) {
//		   System.out.print("Oh, oh... ÚLTIMO intento: ");
//		   b = sc.nextInt(); }
//		    }
//		  }
	
	
}
