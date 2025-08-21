package ejercicio2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;

        System.out.print("Ingrese el año: ");
        anio = Integer.parseInt(input.nextLine());

        System.out.println(anio + (esBisiesto(anio) ? " es bisiesto" : " no es bisiesto"));

    }

    static boolean esBisiesto(int num) {
        return ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0);

    }

}
