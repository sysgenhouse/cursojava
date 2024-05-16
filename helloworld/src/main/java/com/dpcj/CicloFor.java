package com.dpcj;

import java.util.Random;

public class CicloFor {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            int numero = random.nextInt(5) + 1;
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
}