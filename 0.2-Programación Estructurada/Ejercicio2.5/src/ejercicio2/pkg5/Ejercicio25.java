/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        int num, suma;

        suma = 0; //inicio acumulador

        //inputs
        System.out.print("Ingrese un numero distinto que '0': ");
        num = Integer.parseInt(input.nextLine());

        //ciclo while (suma de pares)
        while (num != 0) {
            suma = (num % 2 == 0) ? suma + num : suma;

            System.out.print("Ingrese un numero ('0' para terminar): ");
            num = Integer.parseInt(input.nextLine());

        }
        //salida
        System.out.println("La suma de los numeros pares ingresados es: " + suma);

    }

}
