/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.pkg10;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio210 {

    
    
    
    public static void main(String[] args) {
        //declaracion de variables
        Scanner input = new Scanner(System.in);
        int stockActual, cantVendido, cantRecibido, stockNuevo;
        
        //inputs
        System.out.print("Ingrese el stock actual: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendido = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecibido = Integer.parseInt(input.nextLine());
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantVendido, cantRecibido));
        
        
        
    }
    //metodos
    static int actualizarStock(int stockActual, int cantVendido, int cantRecibido){
        return stockActual - cantVendido + cantRecibido;
    }
    
     
    
    
}
