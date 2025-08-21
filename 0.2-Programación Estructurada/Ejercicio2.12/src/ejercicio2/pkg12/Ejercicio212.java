/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg12;

/**
 *
 * @author Fernando
 */
public class Ejercicio212 {

    public static void main(String[] args) {

        //declaracion de array
        double[] precios = {122, 22, 15.5, 0.50, 3};

        //ciclo for imprimimos todos los valores
        System.out.println("Precios Originales:");
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("$" + precio);
        }
        
        //modificacion del 3er valor (posicion 2)
        precios[2] = 69;

        //ciclo for imprimimos todos los valores
        System.out.println("Precios Modificados:");
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("$" + precio);

        }

    }

}
