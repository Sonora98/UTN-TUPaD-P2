/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingrese un 1er numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese un 2do numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese un 3er numero entero: ");
        num3 = Integer.parseInt(input.nextLine());

        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es " + num2);

        } else {
            System.out.println("El mayor es " + num3);

        }

    }

}
