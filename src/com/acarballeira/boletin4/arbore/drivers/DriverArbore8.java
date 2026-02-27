package com.acarballeira.boletin4.arbore.drivers;

import java.time.LocalDate;

import com.acarballeira.boletin4.arbore.Arbore;
import com.acarballeira.boletin4.arbore.TipoFolla;
import com.acarballeira.boletin4.finca.Coordenada;

public class DriverArbore8 {

	public static void main(String[] args) {
		// 1. Crear árbol
		Arbore arbol = new Arbore(25.5, 2000, "Barreiros", "Piñeiro", "Pinus Pinaster", TipoFolla.PERENNE);

		// 2. Asignar ubicación inicial
		Coordenada ubicacionInicial = new Coordenada(10, 20);
		arbol.setLocalizacion(ubicacionInicial);

		// 3. Mostrar
		System.out.println(arbol);
		System.out.println("Ubicación: " + arbol.getLocalizacion().getX() + "," + arbol.getLocalizacion().getY());

		// 4. Trasplantar sin fecha
		Coordenada nuevaUbicacion1 = new Coordenada(30, 40);
		arbol.trasplantar(nuevaUbicacion1);

		// 5. Mostrar cambios
		System.out.println("Nueva ubicación: " + arbol.getLocalizacion().getX() + "," + arbol.getLocalizacion().getY());

		// 6. Trasplantar con fecha
		Coordenada nuevaUbicacion2 = new Coordenada(50, 60);
		LocalDate hoy = LocalDate.now();
		arbol.trasplantar(nuevaUbicacion2, hoy);

		// 7. Mostrar cambios
		System.out.println("Última ubicación: " + arbol.getLocalizacion().getX() + "," + arbol.getLocalizacion().getY());
		System.out.println("Fecha trasplante: " + arbol.getFechaTrasplante());

	}

}
