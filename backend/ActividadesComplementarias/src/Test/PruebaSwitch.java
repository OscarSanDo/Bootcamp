package Test;
import java.util.*;
import javax.swing.*;


public class PruebaSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		
		int entradaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción escribiendo el número que corresponda: \n1: Cuadrado\n2: Rectángulo\n3: Triángulo\n4: Círculo"));
		
		switch (entradaUsuario) {
		
		case 1:
			
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		
		JOptionPane.showMessageDialog(null, "El area del cuadrado es " + Math.pow(lado, 2));
		break;
		
		case 2:
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectángulo"));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectángulo"));
		
		JOptionPane.showMessageDialog(null, "El area del rectángulo es " + base*altura);
		break;
		
		case 3:
			
		int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo"));
		int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triángulo"));	
			
		JOptionPane.showMessageDialog(null, "El area del triangulo es " + (baseT*alturaT)/2);
		break;
		
		case 4:
			
		int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo"));
		
		JOptionPane.showMessageDialog(null, "El area del círculo es " + Math.PI*(Math.pow(radio, 2)));
		break;
		
		default:
			
			JOptionPane.showMessageDialog(null, "La opción seleccionana no es correcta");	
		
		}
		
		
		
	}

}
