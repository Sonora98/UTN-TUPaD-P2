/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg11;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio211 {

    //variable global (constante)
    final static double DESCUENTO = 0.10;

    public static void main(String[] args) {
        //declaracion de variables
        Scanner input = new Scanner(System.in);
        double precioProducto;

        //Inputs
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());

        //outputs
        System.out.println("El descuento especial aplicado es: " + precioProducto * DESCUENTO + "\nEl precio final con descuento es: " + calcularDescuentoEspecial(precioProducto));

    }

    //metodos
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO;
        return precio - descuentoAplicado;

    }

}
