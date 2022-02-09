package com.capgemini;
import java.io.*;

class LeerFichero {
   
	public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\osanche4\\Desktop\\curso\\pruebaLectura.txt"); //archivo.txt
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String cadena;
         while((cadena=br.readLine())!=null)
            System.out.println(cadena);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
//      FileWriter fichero = null;
//      PrintWriter pw = null;
//      try
//      {
//          fichero = new FileWriter("C:\\Users\\osanche4\\Desktop\\curso\\pruebaLectura.txt");
//          pw = new PrintWriter(fichero);
//          
//          
//      } catch (Exception ef) {
//          ef.printStackTrace();
//      } finally {
//         try {
//         // Nuevamente aprovechamos el finally para 
//         // asegurarnos que se cierra el fichero.
//         if (null != fichero)
//            fichero.close();
//         } catch (Exception e2) {
//            e2.printStackTrace();
//         }
//      }
      
      
      
      
      
      
   }
}
