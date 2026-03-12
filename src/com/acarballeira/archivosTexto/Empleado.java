package com.acarballeira.archivosTexto;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Empleado extends Persona {
	
	private double salario;

	public Empleado(String nombre, int edad, double salario) {
		super(nombre, edad);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return String.format(""
				+ "Empleado : \n"
				+ "salario:%s, \n"
				+ "Datos generales:%s \n", 
				salario, 
				super.toString());
	}
	
	
	

}
