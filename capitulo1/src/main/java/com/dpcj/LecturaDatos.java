package com.dpcj;

import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        Scanner scanEntrada = new Scanner(System.in);
        System.out.println("Ingresar un Numero");
        int numero = scanEntrada.nextInt();
        System.out.println("Su Numero es: " + numero);
        scanEntrada.close();
    }
}
