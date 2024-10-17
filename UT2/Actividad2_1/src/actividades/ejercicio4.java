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
 */
public class ejercicio4 {

    public static void main(String[] args) {
        /*Escribe un programa que solicite un número y muestre su tabla de multiplicar (del 1 al 10)
en la consola.*/

        Scanner teclado = new Scanner(System.in);
        String numero; //Declaro una variable para almacenar el número como cadena

        // Bucle que solicita el número hasta que el usuario ingrese un valor válido 
        do {
            System.out.println("Introduce un número entero: ");
            numero = teclado.next(); //Se lee el número como cadena
        } while (!esNumero(numero)); //El bucle se repite si el valor ingresado no es un número 

        int num = Integer.parseInt(numero); //convierte la cadena numero a un número entero

        System.out.println("Tabla de multiplicar del " + num + ": ");
        // Bucle que genera la tabla de multiplicar del número ingresado.
        for (int i = 0; i <= 10; i++) { //El bucle va desde 1 hasta 10
            // Imprime el resultado de la multiplicación.
            System.out.println(+num + " x " + i + " : " + num * i);
        }

    }

    //Método para verificar si la cadena es un número válido
    private static boolean esNumero(String numero) {
        //Si la cadena contiene solo dígitos del 0 al 9 devuelve true
        if (numero.matches("[0-9]+")) {
            return true;
        } else {
            //Si la cadena no es número válido, muestra un numero de error
            System.out.println("Introduce un número válido!");
            return false;
        }

    }
}
