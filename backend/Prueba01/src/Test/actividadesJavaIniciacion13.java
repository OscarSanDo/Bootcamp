package Test;

import javax.swing.*;



public class actividadesJavaIniciacion13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Actividad if 1
//	int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero entero"));
//	
//	if (numeroEntero % 2 == 0) {
//		JOptionPane.showMessageDialog(null, "El n�mero es par");
//	}else {
//		JOptionPane.showMessageDialog(null, "El n�mero es impar");
//	}
//		Actividad if 2
//		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero entero"));
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero entero"));
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
//		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero entero"));
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro n�mero entero"));
//		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el �ltimo n�mero entero"));
//		
//	
//		if (num1 > num2) {
//			
//			if ( num1 > num3) {
//				JOptionPane.showMessageDialog(null, "El numero " + num1 +" es el mayor de los 3 n�meros ");
//			
//			}else {
//				JOptionPane.showMessageDialog(null, "El numero " + num3 +" es el mayor de los 3 n�meros ");
//			}
//			
//						
//		} else if ( num2 > num3) {
//			
//			JOptionPane.showMessageDialog(null, "El numero " + num2 +" es el mayor de los 3 n�meros ");
//			
//		} else  {
//			JOptionPane.showMessageDialog(null, "El numero " + num3 +" es el mayor de los 3 n�meros ");
//		}
		
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero del mes"));
		
		if (mes < 0 || mes > 12 ) {
			JOptionPane.showMessageDialog(null, "El n�mero introducido no se corresponde con ning�n mes");
		} else {
			switch(mes){                                 
            case 1: System.out.print("Enero");
                    break;
            case 2: System.out.print("Febrero");
                    break;
            case 3: System.out.print("Marzo");
                    break;
            case 4: System.out.print("Abril");
                    break;
            case 5: System.out.print("Mayo");
                    break;
            case 6: System.out.print("Junio");
                    break;
            case 7: System.out.print("Julio");
                    break;
            case 8: System.out.print("Agosto");
                    break;
            case 9: System.out.print("Septiembre");
                    break;
            case 10: System.out.print("Octubre");
                    break;
            case 11: System.out.print("Noviembre");
                    break;
            case 12: System.out.print("Diciembre");
                    break;
        }
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
				JOptionPane.showMessageDialog(null, "El mes introducido es  y tiene 30 d�as");
			}else if (mes == 2) {
				JOptionPane.showMessageDialog(null, "El mes introducido es  y tiene 28 d�as");
			}else {
				JOptionPane.showMessageDialog(null, "El mes introducido es  y tiene 31 d�as");
			}
			
		}
		
		
	}

}
                                                                                 
