/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg6;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        int num, positivo, negativo, cero;

        //inicio acumuladores
        positivo = 0;
        negativo = 0;
        cero = 0;

        //inputs ciclo for
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + "-Ingrese un numero: ");
            num = Integer.parseInt(input.nextLine());
            if (num > 0) {
                positivo += 1;
            } else if (num < 0) {
                negativo += 1;
            } else {
                cero += 1;

            }
        }

        System.out.println("Resultados: \nPositivos: " + positivo + "\nNegativos: " + negativo + "\nCeros: " + cero);

    }

}
