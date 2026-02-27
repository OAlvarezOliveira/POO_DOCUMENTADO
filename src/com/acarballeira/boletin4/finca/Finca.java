package com.acarballeira.boletin4.finca;

public class Finca {

	private Parcela parcela;
	private String toponimo;
	private TipoCultivo cultivo;
	private boolean regadio;
	private double metrosLimpos;

// Constructores
	public Finca() {
		this.parcela = null;
		this.toponimo = null;
		this.cultivo = null;
		this.regadio = false;
	}

	public Finca(Parcela parcela, String toponimo, TipoCultivo cultivo, boolean regadio) {
		this.parcela = parcela;
		this.toponimo = toponimo;
		this.cultivo = cultivo;
		this.regadio = regadio;
		this.metrosLimpos = this.parcela.getMetros(); // Todos los metros están limpios

	}

// Getters & Setters	
	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

	public String getToponimo() {
		return toponimo;
	}

	public void setToponimo(String toponimo) {
		this.toponimo = toponimo;
	}

	public TipoCultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(TipoCultivo cultivo) {
		this.cultivo = cultivo;
	}

	public boolean isRegadio() {
		return regadio;
	}

	public void setRegadio(boolean regadio) {
		this.regadio = regadio;
	}

	public double getMetrosLimpos() {
		return metrosLimpos;
	}

	public void setMetrosLimpos(double metrosLimpos) {
		this.metrosLimpos = metrosLimpos;
	}

// Otros Metodos
	public void incrementarSupALimpar(double metros) {

		double resultado;

		if (metros >= 0 && this.metrosLimpos - metros >= 0) {

			resultado = this.metrosLimpos - metros;
			this.metrosLimpos = resultado;
			System.out.printf("Hai que limpar %.2f m² de finca\n", metros);

		} else {

			resultado = this.metrosLimpos;
			System.out.printf(
					"O valor introducido non he correcto , non se limparon mais metros a superficie limpa e de %.2f",
					resultado);

		}

	}

	public void  decrementarSupALimpar(double metros) {

		double resultado;

		if (metros >= 0 && this.metrosLimpos + metros <= this.parcela.getMetros()) {

			resultado = this.metrosLimpos + metros;
			this.metrosLimpos = resultado;
			System.out.printf("Limparonse %.2f m² de finca\n", metros);

		} else {

			resultado = this.metrosLimpos;
			System.out.printf(
					"O valor introducido non he correcto , non se limparon mais metros a superficie limpa e de %.2f",
					resultado);
		}

	}

	@Override
	public String toString() {
	    return String.format("*** FINCA *** %s\nTipo de Cultivo: %s\nRegadío: %b\nCoordenadas de referencia: %d,%d - %d,%d\nMetros Totais: %.3f\nMetros limpos: %.3f",
	                         this.toponimo,
	                         this.cultivo,
	                         this.regadio,
	                         this.parcela.getPuntoRef1().getX(),
	                         this.parcela.getPuntoRef1().getY(),
	                         this.parcela.getPuntoRef2().getX(),
	                         this.parcela.getPuntoRef2().getY(),
	                         this.parcela.getMetros(),
	                         this.metrosLimpos);  
	}
	
}
