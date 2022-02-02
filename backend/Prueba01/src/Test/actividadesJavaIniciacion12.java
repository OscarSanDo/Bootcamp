package Test;
import javax.swing.*;

public class actividadesJavaIniciacion12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
		
		
		int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de productos vendidos"));
		
		int iva = Integer.parseInt(JOptionPane.showInputDialog("Introduce el IVA que se le aplica al producto (solo el número)"));
		
		Double precioTotalsinIva = precio*numProductos;
		Double ivaTotal = precioTotalsinIva * iva/100;

		JOptionPane.showMessageDialog(null, "El precio total de los productos sin iva es: "+ precioTotalsinIva + "\nEl precio total del iva es " + ivaTotal + 
				"\nEl total a pagar es: " + (precioTotalsinIva +  ivaTotal));
		
		//System.out.println(precio);
		
	}

}
