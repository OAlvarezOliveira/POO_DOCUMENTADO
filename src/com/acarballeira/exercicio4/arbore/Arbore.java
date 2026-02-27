package com.acarballeira.exercicio4.arbore;
import java.time.LocalDate;

import com.acarballeira.exercicio4.finca.Coordenada;

public class Arbore {

	// Variable estática - compartida por todos los árboles
	private static int numArbores = 0;

	// Atributos públicos
	public double altura; // Altura en metros (con decimales)
	public int anoNacemento; // Año de nacimiento
	public String concello; // Municipio donde está ubicado
	public String nomeComun; // Nombre común (ej: "Roble")
	public String nomeLatino; // Nombre científico
	public TipoFolla tipoFolla; // Tipo de hoja: CADUCO o PERENNE
	private Coordenada localizacion;      // Dónde está el árbol
	private LocalDate fechaTrasplante;    // Cuándo se trasplantó (puede ser null)

	// Constructor por defecto (sin parámetros)
	public Arbore() {
		numArbores++; // Incrementa el contador cada vez que se crea un árbol
	}
	
	// Constructor con todos los parámetros
	public Arbore(double altura, int anoNacemento, String concello, 
	              String nomeComun, String nomeLatino, TipoFolla tipoFolla) {
	    
	    numArbores++;  // Incrementar el contador
	    
	    // Asignar parámetros a atributos usando this
	    this.altura = altura;
	    this.anoNacemento = anoNacemento;
	    this.concello = concello;
	    this.nomeComun = nomeComun;
	    this.nomeLatino = nomeLatino;
	    this.tipoFolla = tipoFolla;
	}
	
	//Getter y Setters
	
	
	
	public Coordenada getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Coordenada localizacion) {
		this.localizacion = localizacion;
	}

	public LocalDate getFechaTrasplante() {
		return fechaTrasplante;
	}

	public void setFechaTrasplante(LocalDate fechaTrasplante) {
		this.fechaTrasplante = fechaTrasplante;
	}
	

	// Método para mostrar información del árbol
	@Override
	public String toString() {
	    return String.format("Nome: %s\nNome latino: %s\nTipo Folla: %s\nAltura: %.2f m\nConcello: %s\nAno nacemento: %d",
	                         this.nomeComun, this.nomeLatino, this.tipoFolla, this.altura, this.concello, this.anoNacemento);
	}

	// Método estático para obtener el número total de árboles creados
	public static int getNumArbores() {
		return numArbores;
	}
	
	// Versión 1: Solo nueva ubicación
	public void trasplantar(Coordenada nuevaLocalizacion) {
		this.localizacion = nuevaLocalizacion; // Cambiar solo la ubicación

	}

	public void trasplantar(Coordenada nuevaLocalizacion, LocalDate fecha) {
	    trasplantar(nuevaLocalizacion);  // Llama al método 1 (cambia ubicación)
	    this.fechaTrasplante = fecha;    // Además guarda la fecha
	}
	
	
	
	
	
	
	
	
}
