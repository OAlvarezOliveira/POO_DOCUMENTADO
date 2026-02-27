package com.acarballeira.exercicio4.tiempo.driver;

import com.acarballeira.exercicio4.tiempo.Tiempo;

public class PruebaTiempo {
    
    public static void main(String[] args) {
        
        System.out.println("=== PROBANDO CLASE TIEMPO ===\n");
        
        // Probar constructor sin parámetros
        Tiempo t1 = new Tiempo();
        System.out.println("Constructor vacío: " + t1);
        
        // Probar constructor con solo hora
        Tiempo t2 = new Tiempo(14);
        System.out.println("Solo hora (14): " + t2);
        
        // Probar constructor con hora y minuto
        Tiempo t3 = new Tiempo(9, 30);
        System.out.println("Hora y minuto (9:30): " + t3);
        
        // Probar constructor completo
        Tiempo t4 = new Tiempo(23, 59, 59);
        System.out.println("Completo (23:59:59): " + t4);
        
        System.out.println("\n=== PROBANDO VALIDACIÓN ===\n");
        
        // Probar valores inválidos
        Tiempo t5 = new Tiempo(25, 70, -5);
        System.out.println("Valores inválidos (25:70:-5): " + t5);
        
        // Probar modificación con setter
        System.out.println("\n=== MODIFICANDO CON SETTERS ===\n");
        Tiempo t6 = new Tiempo();
        System.out.println("Tiempo inicial: " + t6);
        
        t6.setHora(15);
        System.out.println("Después de setHora(15): " + t6);
        
        t6.setMinuto(45);
        System.out.println("Después de setMinuto(45): " + t6);
        
        t6.setSegundo(30);
        System.out.println("Después de setSegundo(30): " + t6);
        
        // Probar setter con valor inválido
        t6.setHora(99);
        System.out.println("Después de setHora(99): " + t6);
    }
}
