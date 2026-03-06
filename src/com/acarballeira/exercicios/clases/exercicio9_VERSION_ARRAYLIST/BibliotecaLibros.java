package com.acarballeira.exercicios.clases.exercicio9_VERSION_ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BibliotecaLibros {

	private static ArrayList<Libro> biblioteca;

	public static void main(String[] args) {

		int opcion;
		
		creaBiblioteca();
		cargarDatosPrueba();
		do {
			opcion = opcionMenu();
			ejecutaOpcion(opcion);
		} while (opcion != 7);

	}

	private static void cargarDatosPrueba() {
		biblioteca.add (new Libro("Probas", "Zacarías", "Editorial X", 10));
		biblioteca.add (new Libro("El sulfato atómico", "Ibañez", "Bruguera", 450));
		biblioteca.add (new Libro("Probas", "Julio Mosquera", "Editorial X", 10));
		biblioteca.add (new Libro("Introducción a las bases de datos", "Navathe, Elmasri", "Editorial McGraw-Hill", 175));
		biblioteca.add (new Libro("Probas", "Adolfo Domínguez", "Editorial X", 10));

	}

	/**
	 * En base a la opción elegida invoca el método específico asociado a esa opción
	 * 
	 * @param opcion La opción elegida
	 */
	private static void ejecutaOpcion(int opcion) {

		switch (opcion) {
		case 1:
			listar();
			break;
		case 2:
			alta();
			break;
		case 3:
			modificar();
			break;
		case 4:
			borrar();
			break;
		case 5:
			biblioteca.sort(null);			
			break;
		case 6:
			Collections.sort(biblioteca, Comparator.reverseOrder());
			break;
		case 7:
			System.out.printf("Saliendo ...\n");
			break;
		default:
			System.out.printf("Opción no válida \n");
		}

	}

	private static void modificar() {
		Scanner teclado = new Scanner(System.in);
		int codigo;

		System.out.printf("\nMODIFICAR\n");
		System.out.println("======\n");

		System.out.printf("Por favor, introduzca o código do libro que desexa modificar: ");
		codigo = Integer.parseInt(teclado.nextLine());

		// Buscar código en el vector
		for (int i = 0; i < biblioteca.size(); i++) {
			if ( codigo == biblioteca.get(i).getCodigo()) {
				// Voy pedir todos los datos del libro
				System.out.printf("\n =========\n");
				Libro libMod = biblioteca.get(i);
				
				System.out.printf("Introduzca el título: ");
				libMod.setTitulo(teclado.nextLine());				
				System.out.printf("Introduzca el autor: ");
				libMod.setAutor(teclado.nextLine());
				System.out.printf("Introduzca la editorial: ");
				libMod.setEditorial(teclado.nextLine());
				System.out.printf("Introduzca el número de páginas: ");
				libMod.setNumPaxinas(Integer.parseInt(teclado.nextLine()));
				break;
				
			} else if (i == biblioteca.size()) {
				System.out.printf("\nNo hay ningún libro con el código introducido.\n");
			}
		}

	}

	private static void borrar() {

		Scanner teclado = new Scanner(System.in);
		int codigo;
		int i;

		System.out.printf("\nBORRAR\n");
		System.out.println("======\n");

		System.out.printf("Por favor, introduzca o código do libro que desexa borrar: ");
		codigo = Integer.parseInt(teclado.nextLine());


		i = 0;
		while (i < biblioteca.size() && biblioteca.get(i).getCodigo() != codigo ) {
			
			i++;
		} // while

		if (i >= biblioteca.size()) {
			System.out.printf("\nNo hay ningún libro con el código introducido.\n");
		} else {
			biblioteca.remove(i);
			System.out.printf("\nLibro eliminado correctamente.\n");
		}

	} 

	private static void alta() {

		Scanner teclado = new Scanner(System.in);
		String titulo, autor, editorial;
		int numPaginas;

			System.out.printf("\n NOVO LIBRO");
			System.out.printf("\n =========\n");

			System.out.printf("Introduzca el título: ");
			titulo = teclado.nextLine();
			System.out.printf("Introduzca el autor: ");
			autor = teclado.nextLine();
			System.out.printf("Introduzca la editorial: ");
			editorial = teclado.nextLine();
			System.out.printf("Introduzca el número de páginas: ");
			numPaginas = Integer.parseInt(teclado.nextLine());

			Libro l = new Libro(titulo, autor, editorial, numPaginas);
			biblioteca.add(l);

	}


	private static void listar() {

		System.out.printf("\n LISTADO");
		System.out.printf("\n =========\n");
		for (Libro libro : biblioteca) {

				System.out.print(libro);
		}
		

	}

	/**
	 * Muestra el menú, solicita una entrada al usuario y la devuelve
	 * 
	 * @return entero positivo con la opción elegida
	 */
	private static int opcionMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.printf("\n\nBIBLIOTECA DA CARBALLEIRA\n");
		System.out.printf("============================\n");
		System.out.printf("1. Listado\n");
		System.out.printf("2. Alta de libro\n");
		System.out.printf("3. Modificación de libro\n");
		System.out.printf("4. Borrar libro\n");
		System.out.printf("5. Ordenar de forma ascendente\n");
		System.out.printf("6. Ordenar de forma descendente\n");
		System.out.printf("7. Salir\n");
		System.out.printf("Introduzca una opción: ");

		return Integer.parseInt(sc.nextLine());
	}

	private static void creaBiblioteca() {
		biblioteca = new ArrayList<Libro>();
	}

}
