package com.acarballeira.exercicio4.arbore.drivers;

import com.acarballeira.exercicio4.arbore.Arbore;
import com.acarballeira.exercicio4.arbore.TipoFolla;

public class DriverArbore2 {
    
    public static void main(String[] args) {
        
        System.out.println("=== PROBANDO EJERCICIO 2 - Constructor con parámetros ===\n");
        
        // Crear árboles usando el constructor con parámetros
        // Orden: altura, anoNacemento, concello, nomeComun, nomeLatino, tipoFolla
        
        Arbore arbore1 = new Arbore(25.5, 2000, "Barreiros", "Piñeiro", "Pinus Pinaster", TipoFolla.PERENNE);
        Arbore arbore2 = new Arbore(20.0, 1990, "Ourense", "Castiñeira", "Castanea Sativa", TipoFolla.CADUCO);
        Arbore arbore3 = new Arbore(18.75, 2001, "Celanova", "Carballo", "Quercus Robur", TipoFolla.CADUCO);
        
        // Mostrar información de los árboles
        System.out.println(arbore1);
        System.out.println();
        System.out.println(arbore2);
        System.out.println();
        System.out.println(arbore3);
        System.out.println();
        
        // Mostrar el número total de árboles creados
        System.out.println("=====================================");
        System.out.println("Total de árbores creadas: " + Arbore.getNumArbores());
        System.out.println("=====================================");
    }
}
