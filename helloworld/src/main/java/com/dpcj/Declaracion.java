package com.dpcj;

import java.util.Scanner;

public class Declaracion {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 32 y 255>");
        int numero = Integer.parseInt(scannerInput.nextLine());
        if (numero > 31 && numero < 255)
            System.out.printf("Su numero es: %d y su codigo ascii es: %c", numero, (char) numero);
        else {
            System.err.println("Debe ser entre 32 y 255");
        }
        scannerInput.close();
    }
}