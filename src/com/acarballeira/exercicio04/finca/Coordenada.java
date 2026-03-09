package com.acarballeira.exercicio04.finca;

public class Coordenada {

	private int x;
	private int y;

	public Coordenada() {

//		this.x = 0;
//		this.y = 0;
		this(0,0);

	}

	public Coordenada(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + this.x +"," + this.y + ")";
	}
	
	

}
