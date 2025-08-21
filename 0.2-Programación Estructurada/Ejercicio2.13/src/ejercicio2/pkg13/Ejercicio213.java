/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg13;

/**
 *
 * @author Fernando
 */
public class Ejercicio213 {

    public static void main(String[] args) {
        //declaracion de array
        double[] precios = {122, 22, 15.5, 0.50, 3};

        System.out.println("Precios Originales: ");
        impresionArray(precios, 0);

        precios[3] = 75;
        System.out.println("Precios Modificados: ");
        impresionArray(precios, 0);

    }

    static void impresionArray(double[] array, int indice) {
        if (indice == array.length) { //caso base
            return;
        }
        // Mostrar el precio actual
        System.out.println((indice + 1) + "-Precio: $" + array[indice]);
        // Llamada recursiva al siguiente índice
        impresionArray(array, indice + 1);
    }

}
