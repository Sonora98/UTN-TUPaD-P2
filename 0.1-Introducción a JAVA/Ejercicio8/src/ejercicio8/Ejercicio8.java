
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio8 {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Declaración y asignación de variables
        double num1, num2, division;
        
         // Inputs
        System.out.print("Ingrese un primer número entero: ");
        num1 = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese un segundo numero entero: ");
        num2 = Double.parseDouble(input.nextLine());
        
        // Operaciones
        division = num1 / num2;
        
        // Outputs
        System.out.println("DIVISION: " + num1 + " / " + num2 + " = " + division);
        
        
    }
    
}
