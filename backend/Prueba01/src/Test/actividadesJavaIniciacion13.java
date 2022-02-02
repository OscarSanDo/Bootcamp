package Test;

import javax.swing.*;



public class actividadesJavaIniciacion13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Actividad if 1
//	int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
//	
//	if (numeroEntero % 2 == 0) {
//		JOptionPane.showMessageDialog(null, "El número es par");
//	}else {
//		JOptionPane.showMessageDialog(null, "El número es impar");
//	}
//		Actividad if 2
//		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
//		
//		if (num1%num2 == 0) {
//			
//			JOptionPane.showMessageDialog(null, "El resultado es " + num1/num2);
//		}else {
//			JOptionPane.showMessageDialog(null, "El numero " + num1 +" no es divisible por " + num2);
//		}
//		
//		Actividad if 3
//		
//		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número entero"));
//		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el último número entero"));
//		
//	
//		if (num1 > num2) {
//			
//			if ( num1 > num3) {
//				JOptionPane.showMessageDialog(null, "El numero " + num1 +" es el mayor de los 3 números ");
//			
//			}else {
//				JOptionPane.showMessageDialog(null, "El numero " + num3 +" es el mayor de los 3 números ");
//			}
//			
//						
//		} else if ( num2 > num3) {
//			
//			JOptionPane.showMessageDialog(null, "El numero " + num2 +" es el mayor de los 3 números ");
//			
//		} else  {
//			JOptionPane.showMessageDialog(null, "El numero " + num3 +" es el mayor de los 3 números ");
//		}
		
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del mes"));
		
		if (mes < 0 || mes > 12 ) {
			JOptionPane.showMessageDialog(null, "El número introducido no se corresponde con ningún mes");
		} else {
			switch(mes){                                 
            case 1: JOptionPane.showMessageDialog(null, "Enero");;
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Febrero");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Marzo");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Abril");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Mayo");
                    break;
            case 6: JOptionPane.showMessageDialog(null, "Junio");
                    break;
            case 7: JOptionPane.showMessageDialog(null, "Julio");
                    break;
            case 8: JOptionPane.showMessageDialog(null, "Agosto");
                    break;
            case 9: JOptionPane.showMessageDialog(null, "Septiembre");
                    break;
            case 10: JOptionPane.showMessageDialog(null, "Octubre");
                    break;
            case 11: JOptionPane.showMessageDialog(null, "Noviembre");
                    break;
            case 12: JOptionPane.showMessageDialog(null, "Diciembre");
                    break;
        }
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
				JOptionPane.showMessageDialog(null, "El mes introducido tiene 30 días");
			}else if (mes == 2) {
				JOptionPane.showMessageDialog(null, "El mes introducido tiene 28 días");
			}else {
				JOptionPane.showMessageDialog(null, "El mes introducido tiene 31 días");
			}
			
		}
		
		
	}

}
                                                                                 
