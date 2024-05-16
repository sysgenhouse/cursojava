package com.dpcj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lectura de datos
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int inputScanner = Integer.parseInt(scannerStr.nextLine());
        System.out.printf("Su numero es: %s y su %c", inputScanner, (char) inputScanner);
        scannerStr.close();
    }
}