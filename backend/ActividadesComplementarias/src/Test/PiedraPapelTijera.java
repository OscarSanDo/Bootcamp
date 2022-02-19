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
		jugador1 = "";
		jugador2 = "";
		mensaje = "pendiente de inicializar";
		finalizarJuego = false;
	}

	public static void comenzarJuego() {
		String jugador1, jugador2;
		PiedraPapelTijera juego = new PiedraPapelTijera();

		do {
			JOptionPane.showMessageDialog(null,
					"Este es el juego de Piedra, Papel y Tijera, tendrás que elegir una opción para jugar");
			jugador1 = JOptionPane.showInputDialog(null,
					"Tú eres el jugador 1, elige tu jugada entre piedra, papel y tijera");
			jugador2 = JOptionPane.showInputDialog(null,
					"Tú eres el jugador 2, elige tu jugada entre piedra, papel y tijera");
			JOptionPane.showMessageDialog(null, "PIEDRA");
			JOptionPane.showMessageDialog(null, "PAPEL");
			JOptionPane.showMessageDialog(null, "O TIJERA");
			JOptionPane.showMessageDialog(null, "UNA");
			JOptionPane.showMessageDialog(null, "DOS");
			JOptionPane.showMessageDialog(null, "Y TRES!!!");
			juego.jugada(jugador1, jugador2);
			JOptionPane.showMessageDialog(null, juego.getMensaje());
		} while (!juego.getTerminado());

	}

	public String jugada(String jugada1, String jugada2) {

		if (jugada1.equalsIgnoreCase(jugada2)) {
			mensaje = "Ha habido un empate, volved a intentarlo";
			finalizarJuego = false;
			return mensaje;
		}
		if (jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("tijera")) {
			mensaje = "La piedra gana a la tijera, ha ganado el jugador 1";
			finalizarJuego = true;
		} else if (jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("piedra")) {
			mensaje = "La piedra gana a la tijera, ha ganado el jugador 2";
			finalizarJuego = true;
		} else if (jugada1.equalsIgnoreCase("tijera") && jugada2.equalsIgnoreCase("papel")) {
			mensaje = "La tijera gana al papel, ha ganado el jugador 1";
			finalizarJuego = true;
		} else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("tijera")) {
			mensaje = "La tijera gana al papel, ha ganado el jugador 2";
			finalizarJuego = true;
		} else if (jugada1.equalsIgnoreCase("papel") && jugada2.equalsIgnoreCase("piedra")) {
			mensaje = "El papel gana a la piedra, ha ganado el jugador 1";
			finalizarJuego = true;
		} else if (jugada1.equalsIgnoreCase("piedra") && jugada2.equalsIgnoreCase("papel")) {
			mensaje = "El papel gana a la piedra, ha ganado el jugador 2";
			finalizarJuego = true;
		} else {
			mensaje = "El valor introducido no es correcto, volved a intentarlo";
			//finalizarJuego = false;
		}

		return mensaje;

	}

	public String getMensaje() {
		return mensaje;
	}

	public boolean getTerminado() {
		return finalizarJuego;
	}
}