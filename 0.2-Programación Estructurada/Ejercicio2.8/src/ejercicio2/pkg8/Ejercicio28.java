/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento;

        //inputs
        System.out.print("Ingrese el precio base del producto': ");
        precioBase = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());

        System.out.println("El precio final del producto es: " + calcularPrecioFinal(impuesto, descuento, precioBase));

    }

    //metodos
    static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {

        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));

    }

}
