
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaración y asignación de variables
        String nombre;
        int edad;
            
        // Inputs
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        // Outputs
        
        System.out.println("Buenos dias " + nombre + ". ¿Tienes " + edad + " años? Increible.");
               
        
    }
    
}
