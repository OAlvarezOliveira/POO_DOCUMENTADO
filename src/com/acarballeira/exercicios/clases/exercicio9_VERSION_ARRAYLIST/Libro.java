package com.acarballeira.exercicios.clases.exercicio9_VERSION_ARRAYLIST;

public class Libro implements Comparable<Libro>{

	protected String titulo;
	protected String autor;
	protected String editorial;
	protected int numPaxinas;
	protected int codigo;
	private static int ultimoCodigoAsignado = -1;
	protected static final byte INCREMENTO_CODIGO = 5;
	
	public Libro(String titulo, String autor) {		
		this.titulo = titulo;
		this.autor = autor;
		if(ultimoCodigoAsignado == -1) {
			//Significa que aún no se ha creado ningún libro
			this.codigo = 0;
		} else {
			this.codigo = ultimoCodigoAsignado + INCREMENTO_CODIGO;
		}
		ultimoCodigoAsignado = this.codigo;
	}

	public Libro(String titulo, String autor, String editorial, int numPaxinas) {		
		this(titulo, autor);
		this.editorial = editorial;
		this.numPaxinas = numPaxinas;
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaxinas() {
		return numPaxinas;
	}

	public void setNumPaxinas(int numPaxinas) {
		this.numPaxinas = numPaxinas;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return String.format("\n········ LIBRO ·········\n"
				+ "Título: %s\n"
				+ "Autor: %s\n"
				+ "Editorial: %s\n"
				+ "Número de páginas: %d. Código interno: %d\n"
				+ "·····················\n",
				this.titulo,
				this.autor,
				this.editorial,
				this.numPaxinas,
				this.codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Libro other = (Libro) obj;
		
		//return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
		return this.autor.equals(other.autor) && this.titulo.equals(other.titulo);
	}

	@Override
	public int compareTo(Libro o) {
		
		Libro l = (Libro) o;
		if(this.titulo.compareTo(l.titulo) < 0){
			return  -1;
		} else if(this.titulo.compareTo(l.titulo) > 0) {
			return 1;
		} else if(this.autor.compareTo(l.autor) < 0){
			return  -1;
		} else if(this.autor.compareTo(l.autor) > 0){
			return  1;
		} 		
		
		return 0;
	}

}
