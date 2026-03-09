package com.acarballeira.exercicio05;

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

public abstract class Figura implements Comparable<Figura> {

	private String nombre;
	private Unidad unidad;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
		this.unidad = Unidad.CM;
	}

	public Figura(String nombre, Unidad unidad) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Unidad getUnidad() {
		return this.unidad;
	}

	public abstract double obtenerArea();

	public abstract double obtenerVolumen();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return this.nombre.equals(nombre) && this.unidad.equals(unidad);
	}

	@Override
	public int compareTo(Figura other) {

		if (this.nombre.compareTo(other.nombre) < 0) {
			return -1;
		}

		else if (this.nombre.compareTo(other.nombre) > 0) {
			return 1;
		}

		// Si iguales, segundo criterio
		else if (this.unidad.compareTo(unidad) < 0) {
			return -1;
		}

		else if (this.unidad.compareTo(unidad) > 0) {
			return 1;
		}

		return 0; // Totalmente iguales }

	}

}