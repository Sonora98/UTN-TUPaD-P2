/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        char categoria;
        String descuento;

        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoria (A, B o C): ");
        categoria = Character.toUpperCase(input.nextLine().charAt(0));

        switch (categoria) {
            case 'A':
                descuento = "%10";
                break;
            case 'B':
                descuento = "%15";
                break;
            default:
                descuento = "%20";
                break;
        }

        System.out.println("Precio original: " + precio + "\nDescuento aplicado: " + descuento + "\nPrecio final: " + aplicarDescuento(precio, categoria));

    }

    static double aplicarDescuento(double precio, char categoria) {
        return (categoria == 'A') ? precio * 0.9
                : (categoria == 'B') ? precio * 0.85
                        : precio * 0.8;

    }

}
