package edu.bill.dio;

import edu.bill.dio.model.Gato;

public class PrimeirosPassos {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		Gato gato = new Gato("Mial","caramelo",2);
		Livro livro = new Livro("Olhinhos de gato","Cecília Meireles",184);
		
		System.out.println("Soma : " + (a+b));
		
		System.out.println(gato);
		System.out.println(livro);
	}
	
}
class Livro{
	
		String titulo;
		String autor;
		Integer numeroPaginas;
		
		public Livro() {}

		public Livro(String titulo, String autor, Integer numeroPaginas) {
			this.titulo = titulo;
			this.autor = autor;
			this.numeroPaginas = numeroPaginas;
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

		public Integer getNumeroPaginas() {
			return numeroPaginas;
		}

		public void setNumeroPaginas(Integer numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}

		@Override
		public String toString() {
			return "Livro [titulo= " + titulo + ", autor= " + autor + ", numeroPaginas= " + numeroPaginas + "]";
		}
		
		
	}