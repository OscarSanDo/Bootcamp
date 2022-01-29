package com.capgemini;

import java.util.Random;
import javax.swing.JOptionPane;


public class JuegoDelNumero {

	public static void main(String[] args) {

        int intentos = 10;
        int numeroRandom = Inicializar();
        System.out.println(numeroRandom);

        do {
            intentos -= 1;
            boolean aciertoJugada = jugada(numeroRandom, intentos);
            if ( aciertoJugada ){
                break;
            };
        }while ( intentos > 0);
       
        if (intentos == 0) {
        JOptionPane.showMessageDialog(null, "Te has quedado sin intentos, has perdido la partida");}

    }

    private static boolean jugada(int numeroRandom, int intentos){

        String resp = JOptionPane.showInputDialog(null, "Introduce un número entre 0 y 100:");
  
        int cadUsuario = Integer.parseInt(resp);

        if (cadUsuario == numeroRandom) {
            JOptionPane.showMessageDialog(null, "Has Acertado el Número ");
            return true;
        } else if (cadUsuario > numeroRandom) {
            JOptionPane.showMessageDialog(null, "El numero Random es menor, te quedan " + intentos + " intentos: ");
        } else if (cadUsuario < numeroRandom) {
            JOptionPane.showMessageDialog(null, "El numero Random es mayor, te quedan " + intentos + " intentos: ");
        }
        return false;
        
    }

    private static int Inicializar(){
        return new Random().nextInt(101); 
    }
}


