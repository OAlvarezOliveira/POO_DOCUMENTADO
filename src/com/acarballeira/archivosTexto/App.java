package com.acarballeira.archivosTexto;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


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
	
	private static ArrayList<Persona> lista;
	
	public static void main(String[] args) {
		
		leerArchivo();
		Collections.sort(lista);
		mostar();
		Collections.sort(lista,Collections.reverseOrder());
		mostrarEdadEmpleados();
		
	}
	
	private static void mostar() {
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
	}

	private static void mostrarEdadEmpleados() {
		
		for (Persona persona : lista) {
			
			if(persona instanceof Empleado) {System.out.println(persona.getEdad());}

		}
	}
	
	
	private static void 	leerArchivo() {
		
		lista = new ArrayList<Persona>();
		String linea;
		String [] parametros;
		InputStream ip = App.class.getResourceAsStream("/com/acarballeira/archivosTexto/datos.txt");

		Scanner sc = new Scanner(ip);
		
		while(sc.hasNext()) {
			
			linea = sc.nextLine();
			parametros = linea.split(";");
			
			if (parametros.length == 2) {
				//creamos persona
				
				Persona p = new Persona(parametros[0], Integer.parseInt(parametros[1]));
				lista.add(p);
				
			}else if (parametros.length == 3) {
				
				Empleado e = new Empleado (parametros[0], Integer.parseInt(parametros[1]),Double.parseDouble(parametros[2]));
				lista.add(e);
				
			}
		}
		
		
	}
	

}
