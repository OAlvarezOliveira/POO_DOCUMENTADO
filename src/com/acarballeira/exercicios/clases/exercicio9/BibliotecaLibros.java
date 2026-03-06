package com.acarballeira.exercicios.clases.exercicio9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class BibliotecaLibros {

	private static Libro[] biblioteca;
	private static final int MAX_LIBROS = 100;

	public static void main(String[] args) {

		int opcion;

		creaBiblioteca();
		cargarDatosPrueba();
//		Libro l = new Libro("La vida","Pepe","Anaya",150);
//		Libro l2 = new Libro("La vida","Pepe","Editex",250);
//		
//		System.out.println(l.equals(l2));
//
//		System.exit(0);
		do {
			opcion = opcionMenu();
			ejecutaOpcion(opcion);
		} while (opcion != 7);

	}

	private static void cargarDatosPrueba() {
		biblioteca[0] = new Libro("El sulfato atómico", "Ibañez", "Bruguera", 450);
		biblioteca[1] = new Libro("Probas", "Julio Mosquera", "Editorial X", 510);
		biblioteca[2] = new Libro("Introduccion a las bases de datos", "Marta ", "A Carballeira", 110);
		biblioteca[3] = new Libro("Probas", "Adolfo Dominguez", "Editorial X", 510);
		biblioteca[4] = new Libro("Probas II", "Adolfo Dominguez", "Editorial X", 510);
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
			Arrays.sort(biblioteca, 0 , numeroLibros());
			break;
		case 6:
			Arrays.sort(biblioteca, 0 , numeroLibros(), Comparator.reverseOrder());
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
		String titulo, autor, editorial;
		int numPaginas;


		System.out.printf("\nMODIFICAR\n");
		System.out.println("======\n");


		System.out.printf("Por favor, introduzca o código do libro que desexa modificar: ");
		codigo = Integer.parseInt(teclado.nextLine());


		// Buscar código en el vector
		for (int i = 0; i < biblioteca.length; i++) {
			if (biblioteca[i] != null && codigo == biblioteca[i].getCodigo()) {
				//Voy pedir todos los datos del libro
				
					System.out.printf("\nModificar");
					Libro libMod = biblioteca[i];
					System.out.printf("\n =========\n");

					System.out.printf("Introduzca el título: ");
					libMod.setTitulo(teclado.nextLine());
					System.out.printf("Introduzca el autor: ");
					libMod.setAutor(teclado.nextLine());
					System.out.printf("Introduzca la editorial: ");
					libMod.setEditorial(teclado.nextLine());
					System.out.printf("Introduzca el número de páginas: ");
					libMod.setNumPaxinas(Integer.parseInt(teclado.nextLine()));
					break;
					
			} else if (i == biblioteca.length - 1) {
				System.out.printf("\nNo hay ningún libro con el código introducido.\n");
			}
		}

	}

	private static void borrar() {
		Scanner teclado = new Scanner(System.in);
		int codigo;
		System.out.printf("\nBORRAR\n");
		System.out.printf("--------\n");

		System.out.printf("Por favor introduczca el cogido del libro que desexa borrar");
		codigo = Integer.parseInt(teclado.nextLine());

//			for (int i = 0; i < biblioteca.length; i++) {
//				
//				if(biblioteca[i] != null && biblioteca[i].getCodigo() == codigo  ) 
//				{
//					biblioteca[i] = null;
//					System.out.printf("Borrado Correcto");
//					break;
//				}
//					
//			}
//			
		boolean eliminado = false;
		int posicion = 0;
		while (!eliminado) {

			if (biblioteca[posicion] != null && biblioteca[posicion].getCodigo() == codigo) {
				biblioteca[posicion] = null;
				System.out.printf("Borrado Correcto");
				eliminado = true;
				
		        for (int i = posicion; i < biblioteca.length - 1; i++) {
		        	
		            biblioteca[i] = biblioteca[i + 1];
		        }
		        biblioteca[biblioteca.length - 1] = null;
			}
			
			posicion++;
		}
		if (!eliminado) {
			System.out.printf("No se encontro el codigo a eliminar");
		}

	}

	private static void alta() {

		Scanner teclado = new Scanner(System.in);
		String titulo, autor, editorial;
		int numPaginas;

		if (numeroLibros() == MAX_LIBROS) {
			System.out.printf("La biblioteca está llena. No se pueden crear más libros");
		} else {
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
			// ahora vamos almacenar el libro en el vector biblioteca
			// 1º bucamos el primer hueco libre
			int primeraLibre = -1;
			do {

				primeraLibre++;

			} while (biblioteca[primeraLibre] != null);
			biblioteca[primeraLibre] = l;

			// otra opcion
			// biblioteca[numeroLibros()]=l;

		}

	}

	private static int numeroLibros() {

		int numLibros = 0;

		for (Libro libro : biblioteca) {
			if (libro != null) {
				numLibros++;
			}
		}
		return numLibros;
	}

	private static void listar() {

		System.out.printf("\n LISTADO");
		System.out.printf("\n =========\n");
		for (Libro libro : biblioteca) {
			if (libro == null) {
				break;
			}
			System.out.println(libro);
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
		System.out.printf("5. Ordenar ASC\n");
		System.out.printf("6. Ordenar DESC\n");
		System.out.printf("7. Salir\n");
		System.out.printf("Introduzca una opción: ");

		return Integer.parseInt(sc.nextLine());
	}

	private static void creaBiblioteca() {
		biblioteca = new Libro[MAX_LIBROS];
	}

}
