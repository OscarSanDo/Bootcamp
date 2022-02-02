package Test;

import javax.swing.JOptionPane;

public class PruebaWhile {

	public static void main(String[] args) {
		
		String clave = "Oscar";
		String pass  = "";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
			
			if (clave.equals(pass)==false) {
				
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
			}
						
		}
		JOptionPane.showMessageDialog(null, "Contraseña correcta, acceso permitido");
	}

}
