package com.dpcj;

public class Condicionales {
    public static void main(String[] args) {

        /*
         * Calificación de un estudiante: Escribe un programa que pida al usuario que
         * ingrese una calificación numérica y luego muestre un mensaje indicando si el
         * estudiante aprobó o reprobó el curso. Puedes utilizar un condicional anidado
         * para evaluar si la calificación es mayor o igual a 60 para aprobar y menor
         * para reprobar.
         */
        int nota1 = 10;
        int nota2 = 10;
        if (nota1 != nota2) {
            System.out.println("su puntuacion es alta");
        } else if (nota1 == nota2) {
            System.out.println("su puntuacion es media");
        } else {
            System.out.println("no paso");
        }

        /*
         * Determinar si un número es positivo, negativo o cero: Escribe un programa que
         * pida al usuario que ingrese un número y luego muestre un mensaje indicando si
         * el número es positivo, negativo o cero. Puedes utilizar condicionales
         * individuales para evaluar cada caso.
         */

        /*
         * Scanner scanEntrada = new Scanner(System.in);
         * System.out.println("Ingresa un numero");
         * int numero = scanEntrada.nextInt();
         * if (numero > 0) {
         * System.out.println("el numero es positivo");
         * } else if (numero < 0) {
         * System.out.println("el numero es negativo");
         * } else{
         * System.out.println("el numero es cero");
         * }
         * scanEntrada.close();
         */

    }
}