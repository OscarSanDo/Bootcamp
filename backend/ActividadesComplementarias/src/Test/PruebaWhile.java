package Test;

import javax.swing.JOptionPane;

public class PruebaWhile {

	public static void main(String[] args) {
		
		String clave = "Oscar";
		String pass  = "";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contrase�a: ");
			
			if (clave.equals(pass)==false) {
				
				JOptionPane.showMessageDialog(null, "Contrase�a incorrecta");
			}
						
		}
		JOptionPane.showMessageDialog(null, "Contrase�a correcta, acceso permitido");
	}

}
