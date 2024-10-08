/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author Fatima Mortahil Chachou
 *
 */
public class ejercicio1 {

    public static void main(String[] args) {
        /*Crea un programa que le pida al usuario dos números y luego imprima la suma de esos
dos números*/
        Scanner teclado = new Scanner(System.in);
        String numero1; //Declaro una variable para almacenar el primer número como cadena

        // Bucle que solicita el primer número hasta que el usuario ingrese un valor válido 
        do {
            System.out.println("Introduce el primer número: ");
            numero1 = teclado.next(); //Se lee el primer número como cadena
        } while (!esNumero(numero1)); //El bucle se repite si el valor ingresado no es un número 

        double num1 = Double.parseDouble(numero1); //convierte la cadena numero1 a un número 
        // Realizamos el mismo proceso para el segundo número
        String numero2;
        do {
            System.out.println("Introduce el segundo número: ");
            numero2 = teclado.next();
        } while (!esNumero(numero2));

        double num2 = Double.parseDouble(numero2);

        //Imprimimos la suma de los dos números
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));

    }

    //Método para verificar si la cadena es un número válido
    private static boolean esNumero(String numero) {
        //Si la cadena contiene solo dígitos del 0 al 9 ,decimales o negativos, devuelve true
        if (numero.matches("-?[0-9]+(\\.[0-9]+)?")) {
            return true;
        } else {
            //Si la cadena no es número válido, muestra un numero de error
            System.out.println("Introduce un número válido!");
            return false;
        }

    }
}
