package Test;

public class Libro {
	
	int ISBN;
	String titulo;
	String autor;
	int numPag;
	

	public Libro(int ISBN, String titulo, String autor, int numPag) {
		
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		
	}


	public int getISBN() {
		return ISBN;
	}


	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getNumPag() {
		return numPag;
	}


	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	public String toString() {
		return "El libro " + titulo + " con ISBN = " + ISBN + " creado por el autor " + autor + " tiene " + numPag + " páginas";
	}

	public String comparaPag(Libro libro1, Libro libro2) {
		if (libro1.getNumPag() > libro2.getNumPag()) {
			return ("el libro " + libro1.getTitulo() + " tiene más páginas que el libro " + libro2.getTitulo());
		}else {
			return ("el libro " + libro2.getTitulo() + " tiene más páginas que el libro " + libro1.getTitulo());
		}
		
		
	}
	
}
