package com.acarballeira.exercicio05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App {
	private static ArrayList<Figura> figuras;

	public static void main(String[] args) {

		crearFiguras();
	//	Collections.sort(figuras);
		mostrarFiguras();

		


	}

	private static void mostrarFiguras() {

		for (Figura figura : figuras) {

			if (figura instanceof Cilindro) {
				System.out.printf("Informacion figuras %s Area: %.2f Volumen: %.2f , UDs %s \n", figura.getNombre(),
						figura.obtenerArea(), figura.obtenerVolumen(),figura.getUnidad());
			} else {

				System.out.printf("Informacion figuras %s Area: %.2f , UDs %s \n", figura.getNombre(), figura.obtenerArea(),figura.getUnidad());
			}
		}

	}

	private static void crearFiguras() {

		figuras = new ArrayList<Figura>();

		figuras.add(new Triangulo(10, 12, Unidad.M));
		figuras.add(new Circulo(1));
		figuras.add(new Cilindro(34, 45,Unidad.M));
		figuras.add(new Cilindro(8, 1,Unidad.CM));
	}

}
