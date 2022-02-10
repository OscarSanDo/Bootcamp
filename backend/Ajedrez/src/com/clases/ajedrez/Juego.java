package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class Juego {
	
	private Tablero elTablero;
	private Color elTurno;
	private boolean partidaActiva = false;
	
	public Tablero getTablero() {
		return elTablero;
	}
	
	public Color turno() {
		return elTurno;
	}
	
	public void inicializar() {
		elTablero = new Tablero();
		
		elTablero.piezas[0][0] = new Torre(Color.BLANCO);
		elTablero.piezas[1][0] = new Caballo(Color.BLANCO);
		elTablero.piezas[2][0] = new Alfil(Color.BLANCO);
		elTablero.piezas[3][0] = new Dama(Color.BLANCO);
		elTablero.piezas[4][0] = new Rey(Color.BLANCO);
		elTablero.piezas[5][0] = new Alfil(Color.BLANCO);
		elTablero.piezas[6][0] = new Caballo(Color.BLANCO);
		elTablero.piezas[7][0] = new Torre(Color.BLANCO);
		
		elTablero.piezas[0][7] = new Torre(Color.NEGRO);
		elTablero.piezas[1][7] = new Caballo(Color.NEGRO);
		elTablero.piezas[2][7] = new Alfil(Color.NEGRO);
		elTablero.piezas[3][7] = new Dama(Color.NEGRO);
		elTablero.piezas[4][7] = new Rey(Color.NEGRO);
		elTablero.piezas[5][7] = new Alfil(Color.NEGRO);
		elTablero.piezas[6][7] = new Caballo(Color.NEGRO);
		elTablero.piezas[7][7] = new Torre(Color.NEGRO);
				
		for(int i = 0; i < 8; i++) {
			elTablero.piezas[i][1] = new Peon(Color.BLANCO);
			elTablero.piezas[i][6] = new Peon(Color.NEGRO);
		}
	}
	
	public void jugada(String jugada) {
		
	}
	
	private void movimiento(Movimiento movimiento) {
		
	}
	
	private void cambiaTurno() {
		
	}
	
	private void promocionaPeon() {
		
	}

}

