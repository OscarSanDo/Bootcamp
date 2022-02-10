package com.clases.ajedrez;

import com.ajedrez.enums.Color;

public class pruebas {

	public static void main(String[] args) throws JuegoException {
		
		Juego jg = new Juego();
		jg.inicializar();
		jg.jugada("A1B1");
		
		//Torre t = new Torre(Color.NEGRO);
		//Tablero tb = new Tablero();
		//Movimiento mv = new Movimiento("A1B2");
		//t.mover(mv, tb);
		//System.out.println();
	}

}
