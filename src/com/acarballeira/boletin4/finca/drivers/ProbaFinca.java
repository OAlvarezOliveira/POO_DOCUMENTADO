package com.acarballeira.boletin4.finca.drivers;

import com.acarballeira.boletin4.finca.Coordenada;
import com.acarballeira.boletin4.finca.Finca;
import com.acarballeira.boletin4.finca.Parcela;
import com.acarballeira.boletin4.finca.TipoCultivo;

public class ProbaFinca {

	public static void main(String[] args) {

		System.out.println("=== PROBANDO SISTEMA DE FINCAS ===\n");

		// FINCA 1: AS REGADAS (de cultivo, con regadío)
		Coordenada c1 = new Coordenada(4, 5);
		Coordenada c2 = new Coordenada(8, 9);
		Parcela parcela1 = new Parcela(c1, c2, 500.0);
		Finca finca1 = new Finca(parcela1, "As Regadas", TipoCultivo.CULTIVO, true);

		System.out.println(finca1);
		System.out.println();

		// Prueba: hay que limpiar 100 m²
		finca1.incrementarSupALimpar(100);
		System.out.println("\nDespués de incrementar 100 m² a limpiar:");
		System.out.println(finca1);
		System.out.println();

		// Prueba: se limpiaron 50 m²
		finca1.decrementarSupALimpar(50);
		System.out.println("\nDespués de decrementar 50 m² (se limpiaron):");
		System.out.println(finca1);

		System.out.println("\n" + "=".repeat(50) + "\n");

		// FINCA 2: MONTE DO CASTRO (monte bajo, sin regadío)
		Coordenada c3 = new Coordenada(10, 15);
		Coordenada c4 = new Coordenada(30, 25);
		Parcela parcela2 = new Parcela(c3, c4, 800.0);
		Finca finca2 = new Finca(parcela2, "Monte do Castro", TipoCultivo.MONTE_BAIXO, false);

		System.out.println(finca2);
		System.out.println();

		// Prueba: hay que limpiar 300 m² (se ensucia)
		finca2.incrementarSupALimpar(300);
		System.out.println("\nDespués de incrementar 300 m² a limpiar:");
		System.out.println(finca2);
		System.out.println();

		// Prueba: se limpiaron 200 m²
		finca2.decrementarSupALimpar(200);
		System.out.println("\nDespués de decrementar 200 m²:");
		System.out.println(finca2);
		System.out.println();

		// Prueba: intentar limpiar más de lo que tiene (validación)
		finca2.decrementarSupALimpar(1000);
		System.out.println("\nDespués de intentar decrementar 1000 m² (debe dar error):");
		System.out.println(finca2);
	}
}