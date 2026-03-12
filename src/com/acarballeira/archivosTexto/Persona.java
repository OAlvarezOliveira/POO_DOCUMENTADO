package com.acarballeira.archivosTexto;

import java.util.Objects;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.setEdad(edad);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		
		if(edad >0 ) {this.edad = edad;}else {
			
			System.out.println("La edad introducida no es correcta");
		}
		
		

	}


	@Override
	public String toString() {
		return String.format(""
				+"·············\n"
				+ "Persona:\n"
				+ "nombre:%s\n"
				+ "edad:%d"
				+"·············"
				, nombre, edad);
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && this.nombre.equals(other.nombre);
	}


	@Override
	public int compareTo(Persona o) {

		if((this.edad > o.edad )) {
			
			return 1;
		}else if((this.edad < o.edad )) {
			
			return -1;
		}else {
			
			return  this.nombre.compareTo(o.nombre);
		} 
		
	}

}
