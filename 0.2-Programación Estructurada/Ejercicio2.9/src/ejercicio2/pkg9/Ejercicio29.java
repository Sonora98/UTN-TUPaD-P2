/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg9;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner input = new Scanner(System.in);
        double peso, precioProducto, costoEnvio;
        String zona;

        //Inputs
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();

        costoEnvio = calcularCostoEnvio(peso, zona);

        //Outputs
        System.out.println("El costo de envío es: " + costoEnvio + "\nEl total a pagar es: " + calcularTotalCompra(precioProducto, costoEnvio));

    }

    //funciones
    //calculo de costo del envio
    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }
    
    //calculo del total de la compra
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}
