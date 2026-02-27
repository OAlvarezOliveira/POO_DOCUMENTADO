package com.acarballeira.boletin4.tiempo;

public class Tiempo { // ← Mayúscula

	private int hora;
	private int minuto;
	private int segundo;

	// Constructor 1: Sin parámetros (00:00:00)
	public Tiempo() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	// Constructor 2: Solo hora (HH:00:00)
	public Tiempo(int hora) {
		setHora(hora);
		this.minuto = 0;
		this.segundo = 0;
	}

	// Constructor 3: Hora y minuto (HH:MM:00)
	public Tiempo(int hora, int minuto) {
		setHora(hora);
		setMinuto(minuto);
		this.segundo = 0;
	}

	// Constructor 4: Completo (HH:MM:SS)
	public Tiempo(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	// GETTERS
	public int getHora() {
		return this.hora;
	}

	public int getMinuto() {
		return this.minuto;
	}

	public int getSegundo() {
		return this.segundo;
	}

	// SETTERS con validación
	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Valor de hora incorrecto, se establece a 0");
			this.hora = 0;
		}
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			System.out.println("Valor de minuto incorrecto, se establece a 0");
			this.minuto = 0;
		}
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			System.out.println("Valor de segundo incorrecto, se establece a 0");
			this.segundo = 0;
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);

	}
	
	/**
	 * Incrementa un segundo al tiempo actual
	 * Maneja el cambio de minuto y hora automáticamente
	 */
	public void incrementarSegundo() {
	    this.segundo++;
	    
	    if (this.segundo > 59) {
	        this.segundo = 0;
	        this.minuto++;
	        
	        if (this.minuto > 59) {
	            this.minuto = 0;
	            this.hora++;
	            
	            if (this.hora > 23) {
	                this.hora = 0;  // Vuelve a 00:00:00
	            }
	        }
	    }
	}
	
	/**
	 * Compara si este tiempo es igual a otro
	 * @param otro El tiempo a comparar
	 * @return true si son iguales, false si no
	 */
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;  // Es el mismo objeto
	    }
	    
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;  // No es un Tiempo
	    }
	    
	    Tiempo otro = (Tiempo) obj;
	    
	    return this.hora == otro.hora && 
	           this.minuto == otro.minuto && 
	           this.segundo == otro.segundo;
	}

}
