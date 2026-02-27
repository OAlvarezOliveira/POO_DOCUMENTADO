package com.acarballeira.exercicio4.tiempo.driver;

import com.acarballeira.exercicio4.tiempo.Tiempo;

public class PruebaTiempoCorrido {
    
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA TIEMPO CORRIDO ===\n");
        
        // 1. Definir hora de inicio
        Tiempo inicio = new Tiempo(14, 55, 0);
        
        // 2. Definir hora de fin
        Tiempo fin = new Tiempo(14, 55, 7);
        
        // 3. Crear un tiempo actual (copia del inicio)
        Tiempo actual = new Tiempo(inicio.getHora(), inicio.getMinuto(), inicio.getSegundo());
        
        System.out.println("Hora de inicio: " + inicio);
        System.out.println("Hora de fin: " + fin);
        System.out.println("\nContando...\n");
        
        // 4. Bucle: mientras actual NO sea igual a fin
        while (!actual.equals(fin)) {
            System.out.println(actual);
            actual.incrementarSegundo();
            
            // Pausa de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // 5. Mostrar la hora final
        System.out.println(actual);
        System.out.println("\n¡Tiempo finalizado!");
    }
}