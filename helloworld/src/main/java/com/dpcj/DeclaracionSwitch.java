package com.dpcj;

import java.util.Random;

public class DeclaracionSwitch {
    public static void main(String[] args) {
        Random numeroRamdom = new Random();
        int numero = numeroRamdom.nextInt(5) + 1;
        System.out.println("numero: " + numero);

        switch (numero) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            default:
                System.out.println("No se por que");
        }
    }
}