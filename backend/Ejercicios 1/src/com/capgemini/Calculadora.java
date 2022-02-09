package com.capgemini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Calculadora {

	private double total = 0.0;
	private char pendiente = '+';

	public double calcular(String[] operaciones) {
        for (int i = 0; i < operaciones.length; i++) {
            double operando = Double.parseDouble(operaciones[i].substring(0, operaciones[i].length() - 1));
            char operador = operaciones[i].charAt(operaciones[i].length() - 1);
            switch (pendiente) {
            case '+':
                total += operando;
                break;
            case '-':
                total -= operando;
                break;
            case '*':
                total *= operando;
                break;
            case '/':
                total /= operando;
                break;
            case '=':
                total += operando;
            }
            pendiente = operador;
        }
        return total;
    }

	public String[] decodificarCadena(String cadena) {
        cadena = cadena.replace(",", ".");
        String[] cadenaDecodificada = cadena.split("(?<=[-+*/()])");
        for (int i = 0; i < cadenaDecodificada.length; i++) {
            System.out.println(cadenaDecodificada[i]);
        }
        return cadenaDecodificada;
    }

	public String LeerFichero() {
		 File archivo = null;
	      FileReader fileReader = null;
	      BufferedReader bufferedReader = null;
	      String cadenaLeida= null;
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\osanche4\\Desktop\\curso\\pruebaLectura.txt"); //archivo.txt
	         fileReader = new FileReader (archivo);
	         bufferedReader = new BufferedReader(fileReader);

	         // Lectura del fichero
	         
	         cadenaLeida=bufferedReader.readLine();
	           
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fileReader ){   
	            	fileReader.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
				
		return cadenaLeida;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}