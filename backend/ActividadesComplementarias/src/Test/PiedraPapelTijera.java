package Test;

import javax.swing.JOptionPane;

public class PiedraPapelTijera {

	String jugador1, jugador2;
	private boolean finalizarJuego = false;
	private String mensaje = "";

	public PiedraPapelTijera() {
		inicializar();
	}
	
	public void inicializar() {
		jugador1="";
		jugador2="";
		mensaje="pendiente de inicializar";
		finalizarJuego = false;
	}

	public static void comenzarJuego() {
		String jugador1, jugador2;
		PiedraPapelTijera juego = new PiedraPapelTijera();
		
		do {
		JOptionPane.showMessageDialog(null, "Este es el juego de Piedra, Papel y Tijera, tendr�s que elegir una opci�n para jugar");
		jugador1 = JOptionPane.showInputDialog(null,"T� eres el jugador 1, elige tu jugada entre piedra, papel y tijera");
		jugador2 = JOptionPane.showInputDialog(null,"T� eres el jugador 2, elige tu jugada entre piedra, papel y tijera");
		juego.jugada(jugador1, jugador2);
		JOptionPane.showMessageDialog(null, juego.getMensaje());
		}while (!juego.getTerminado());
		

	}

	public String jugada(String jugada1, String jugada2) {
		
		if(jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera")) {
			 mensaje = "La piedra gana a la tijera, ha ganado el jugador 1";
		}else if (jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("piedra")) {
			 mensaje = "La piedra gana a la tijera, ha ganado el jugador 2";
		}else if (jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("papel")) {
			 mensaje = "La tijera gana al papel, ha ganado el jugador 1";
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			 mensaje = "La tijera gana al papel, ha ganado el jugador 2";
		}else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("piedra")) {
			 mensaje = "El papel gana a la piedra, ha ganado el jugador 1";}
		else if (jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("papel")) {
			 mensaje = "El papel gana a la piedra, ha ganado el jugador 2";}
		else {
			
			 mensaje = "El valor introducido no es correcto";
			}
		
		finalizarJuego = true;
		return mensaje;
				
		
	}

	public String getMensaje() {
		return mensaje;
	}

	public boolean getTerminado() {
		return finalizarJuego;
	}
}