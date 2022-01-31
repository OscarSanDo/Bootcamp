package com.capgemini;

public class DecodificarCadenas {
	
	
	public static void main(String[] args) {
	
		String cadena = "3+4+3,4-7*1=";		//guarda la cadena original
		int posicion = 0;
		String[] operadores = new String[4];
		operadores[0] = "+";
		operadores[1] = "-";
		operadores[2] = "*";
		operadores[3] = "=";
		
		double Total = 0;				
		
		String cadenaBuscar = "";		//guarda la cadena modificada
		

		for( int j = 0; j <= cadena.length() - 1; j++ ) {
			
			cadenaBuscar = cadena.substring( posicion, cadena.length() );
			
			for (int i = 0; i <= operadores.length -1; i++) {
				
				if( cadenaBuscar.indexOf(operadores[i]) >= 0 ) {
					String operacion = cadenaBuscar.substring( 0, (cadenaBuscar.indexOf(operadores[i]) + 1));
					String numero = operacion.substring(0, operacion.length() - 1);
					String operador = operacion.substring(operacion.length() - 1 , operacion.length());
					Total = Calcular( Total, numero, operador);
					System.out.println(cadenaBuscar.substring( 0, (cadenaBuscar.indexOf(operadores[i]) + 1)));
					posicion = posicion + cadenaBuscar.indexOf(operadores[i]) + 1;
					j = posicion;
					break;
				}
				
			}
		}
		System.out.println("El resultado de las operaciones de la cadena es " + Total);
	}
	
	
	
	
	public static double Calcular( double total, String numero, String operador ) {  //método para convertir a double y calcular resultado
		
		numero = numero.replace(",", ".");
		switch(operador) {
			case "+":
				total = total + Double.parseDouble(numero);
				break;
			case "-":
				total = total - Double.parseDouble(numero);
				break;
			case "*":
				total = total * Double.parseDouble(numero);
				break;
		}
		
		return total;
		
	}

}
