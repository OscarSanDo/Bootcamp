package Test;
import javax.swing.JOptionPane;



public class PruebaDoWhile {

	public static void main(String[] args) {
		
		
		String genero = "";
	
		int pesoIdeal = 0;
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu sexo (M si es masculino o F si es femenino): ");
							
		} while (genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("F") == false);
		
		
		
		if (genero.equalsIgnoreCase("M") == true  ) {
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centímetros: "));
			
			pesoIdeal = altura - 110;
			
			JOptionPane.showMessageDialog(null, "Su peso ideal es: " + pesoIdeal);
			
		} else {
				
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centímetros: "));
				
			pesoIdeal = altura - 120;	
			
			JOptionPane.showMessageDialog(null, "Su peso ideal es: " + pesoIdeal);
			}
			

	}

}
