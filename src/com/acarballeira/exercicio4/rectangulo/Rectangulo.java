package com.acarballeira.exercicio4.rectangulo;

public class Rectangulo {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calculaArea() { 
	    return this.base * this.altura;
	}

	public double calculaPerimetro() {  
	    return 2 * (this.base + this.altura);
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        int baseInt = (int) Math.round(this.base);
        int alturaInt = (int) Math.round(this.altura);
        
        for (int i = 0; i < alturaInt; i++) {
            for (int j = 0; j < baseInt; j++) {
                if (i == 0 || i == alturaInt - 1 || j == 0 || j == baseInt - 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
}