/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;

        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Clasificación: " + clasificarEdad(edad));

    }

    static String clasificarEdad(int edad) {
        return (edad < 12) ? "Niño"
                : (edad <= 17) ? "Adolescente"
                        : (edad <= 59) ? "Adulto"
                                : "Adulto mayor";
    }
}
