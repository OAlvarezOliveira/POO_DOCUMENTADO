package com.acarballeira.exercicio05;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		super("Triangulo");
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(double base, double altura,Unidad unidad) {
		super("Triangulo",unidad);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double obtenerArea() {

		return (this.base*this.altura)/2;
	}

	@Override
	public double obtenerVolumen() {

		return 0;
	}
	
	
	
	
	

}
