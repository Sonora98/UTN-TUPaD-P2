
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio5 {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Declaración y asignación de variables
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        // Inputs
        System.out.print("Ingrese un primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese un segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        // Operaciones
        suma = num1+num2;
        resta = num1-num2;
        multiplicacion = num1*num2;
        division = (double) num1 / num2;
        
        
        // Outputs
        System.out.println("SUMA: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("RESTA: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("MULTIPLICACION: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("DIVISION: " + num1 + " / " + num2 + " = " + division);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
