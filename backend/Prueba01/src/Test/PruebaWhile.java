package Test;

import javax.swing.JOptionPane;

public class PruebaWhile {

	public static void main(String[] args) {
		
		String clave = "Oscar";
		String pass  = "";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseņa: ");
			
			if (clave.equals(pass)==false) {
				
				JOptionPane.showMessageDialog(null, "Contraseņa incorrecta");
			}
						
		}
		JOptionPane.showMessageDialog(null, "Contraseņa correcta, acceso permitido");
	}

}
