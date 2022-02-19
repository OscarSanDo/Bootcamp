package Test;



public class PruebasMain {

	public static void main(String[] args) {

		
		Libro libro1 = new Libro(1234567890, "La venganza de los juntos", "John Cobra", 300);
		Libro libro2 = new Libro(1111111111, "Los árboles de color azul", "Michael Lordop", 600);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		System.out.println(libro1.comparaPag(libro1, libro2));
		
	}

	

}
