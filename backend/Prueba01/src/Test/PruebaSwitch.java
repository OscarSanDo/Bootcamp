package Test;
import java.util.*;
import javax.swing.*;


public class PruebaSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		
		int entradaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opci�n escribiendo el n�mero que corresponda: \n1: Cuadrado\n2: Rect�ngulo\n3: Tri�ngulo\n4: C�rculo"));
		
		switch (entradaUsuario) {
		
		case 1:
			
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		
		JOptionPane.showMessageDialog(null, "El area del cuadrado es " + Math.pow(lado, 2));
		break;
		
		case 2:
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rect�ngulo"));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rect�ngulo"));
		
		JOptionPane.showMessageDialog(null, "El area del rect�ngulo es " + base*altura);
		break;
		
		case 3:
			
		int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del tri�ngulo"));
		int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del tri�ngulo"));	
			
		JOptionPane.showMessageDialog(null, "El area del triangulo es " + (baseT*alturaT)/2);
		break;
		
		case 4:
			
		int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del c�rculo"));
		
		JOptionPane.showMessageDialog(null, "El area del c�rculo es " + Math.PI*(Math.pow(radio, 2)));
		break;
		
		default:
			
			JOptionPane.showMessageDialog(null, "La opci�n seleccionana no es correcta");	
		
		}
		
		
		
	}

}
