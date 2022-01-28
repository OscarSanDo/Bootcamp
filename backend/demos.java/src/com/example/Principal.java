/**
 * 
 */
package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author osanche4
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	String s = "Hola ";
	//	s += "mundo";
	//	System.out.println(s);
		Dias dia = Dias.DOMINGO;
		System.out.println(dia);
		
		Calculadora c = new Calculadora();
	//	System.out.println(c.avg());
		System.out.println(c.avg(5));
		System.out.println(c.avg(1, 2, 3, 4, 5));
	}
	


}


