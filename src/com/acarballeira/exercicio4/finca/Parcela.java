package com.acarballeira.exercicio4.finca;

public class Parcela {

	private Coordenada puntoRef1;
	private Coordenada puntoRef2;
	private double metros;

	public Parcela(Coordenada puntoRef1, Coordenada puntoRef2, double metros) {
		this.puntoRef1 = puntoRef1;
		this.puntoRef2 = puntoRef2;
		this.metros = metros;
	}

	public Coordenada getPuntoRef1() {
		return puntoRef1;
	}

	public void setPuntoRef1(Coordenada puntoRef1) {
		this.puntoRef1 = puntoRef1;
	}

	public Coordenada getPuntoRef2() {
		return puntoRef2;
	}

	public void setPuntoRef2(Coordenada puntoRef2) {
		this.puntoRef2 = puntoRef2;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

}
