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

public class Cilindro  extends Figura{
	
	private double radio;
	private double altura;

	
	public Cilindro(double radio,double altura) {
		super("Cilindro",Unidad.CM);
		this.radio = radio;
		this.altura = altura;
	}
	
	
	public Cilindro(double radio,double altura,Unidad unidad) {
		super("Cilindro",unidad);
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public double obtenerArea() {

		return 2* (Math.PI * Math.pow(radio, 2)) 
				+ 2* Math.PI * this.radio*this.altura;
		
	}

	@Override
	public double obtenerVolumen() {

		return ((Math.PI * Math.pow(radio, 2))*this.altura);
	
	}

}
