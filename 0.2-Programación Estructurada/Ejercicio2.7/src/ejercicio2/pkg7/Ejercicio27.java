/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg7;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        int nota;

        //ciclo do while: inputs
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());

            if (nota < 0 || nota > 10) {

                System.out.println("Error: Nota inválida.");

            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");

    }

}
