/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author Fatima Mortahil Chachou
 */
public class ejercicio2 {

    public static void main(String[] args) {
        /* Crea un programa que convierta una temperatura dada en grados Celsius a Fahrenheit.
La fórmula es: F = (C * 9/5) + 32.*/

        Scanner teclado = new Scanner(System.in);

        String grados; //Declaramos la variable para almacenar la temperatura en Celsius como cadena

        // Bucle que solicita los grados hasta que el usuario ingrese un valor válido 
        do {
            System.out.println("Intoduce la temperatura en grados Celsius: ");
            grados = teclado.next(); //Se leen los grados como cadena
        } while (!esValido(grados)); //El bucle se repite si el valor ingresado no es valido

        double gradosNum = Double.parseDouble(grados); //convierte la cadena grados a un número 

        //Calculamos la conversion de grados Celsius a Fahrenheit utilizando la formula: 
        //F = (C*9/5)+32 
        //Luego imprimimos el resultado con la temperatura convertida
        System.out.println(gradosNum + " celsius son: " + ((gradosNum * 9 / 5) + 32) + " grados fahrenheit");

    }

    //Método para verificar si la cadena ingresada es un número válido (puede ser negativo o decimal)
    private static boolean esValido(String numero) {
        //Si la cadena contiene solo dígitos del 0 al 9 ,decimales o negativos, devuelve true

        if (numero.matches("-?[0-9]+(\\.[0-9]+)?")) {
            return true; //Si la cadena es un numero válido, devuelve true.
        } else {
            //Si la cadena no es número válido, muestra un numero de error
            System.out.println("Introduce un número válido!");
            return false; //Devuelve false, lo que hará que el bucle en main() se repita.
        }

    }
}
