package com.acarballeira.boletin4.arbore.drivers;
import com.acarballeira.boletin4.arbore.Arbore;
import com.acarballeira.boletin4.arbore.TipoFolla;

public class DriverArbore  {
    
    public static void main(String[] args) {
        
        System.out.println("=== PROBANDO LA CLASE ARBORE ===\n");
        
        // ÁRBOL 1: Pino
        Arbore arbore1 = new Arbore();
        arbore1.nomeComun = "Piñeiro";
        arbore1.nomeLatino = "Pinus Pinaster";
        arbore1.tipoFolla = TipoFolla.PERENNE;
        arbore1.altura = 25.5;
        arbore1.concello = "Barreiros";
        arbore1.anoNacemento = 2000;
        
        System.out.println(arbore1);
        System.out.println();  // Línea en blanco
        
        // ÁRBOL 2: Castaño
        Arbore arbore2 = new Arbore();
        arbore2.nomeComun = "Castiñeira";
        arbore2.nomeLatino = "Castanea Sativa";
        arbore2.tipoFolla = TipoFolla.CADUCO;
        arbore2.altura = 20.0;
        arbore2.concello = "Ourense";
        arbore2.anoNacemento = 1990;
        
        System.out.println(arbore2);
        System.out.println();
        
        // ÁRBOL 3: Roble
        Arbore arbore3 = new Arbore();
        arbore3.nomeComun = "Carballo";
        arbore3.nomeLatino = "Quercus Robur";
        arbore3.tipoFolla = TipoFolla.CADUCO;
        arbore3.altura = 18.75;
        arbore3.concello = "Celanova";
        arbore3.anoNacemento = 2001;
        
        System.out.println(arbore3);
    }
}