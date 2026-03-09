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

public class Circulo  extends Figura{
	
	private double radio;

	
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;

	}
	
	public Circulo(double radio,Unidad unidad) {
		super("Circulo",unidad);
		this.radio = radio;

	}


	@Override
	public double obtenerArea() {

		return (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public double obtenerVolumen() {

		return 0;
	}

}
