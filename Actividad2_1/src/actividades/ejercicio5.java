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
public class ejercicio5 {

    public static void main(String[] args) {

        /*Crea un programa que pida al usuario un número entero positivo y calcule su factorial
usando un bucle while.*/
        Scanner teclado = new Scanner(System.in);

        String numero; //Declaro una variable para almacenar el número como cadena

        // Bucle que solicita el número hasta que el usuario ingrese un valor válido 
        do {
            System.out.println("Introduce un número entero positivo: ");
            numero = teclado.next(); //Se lee el número como cadena
        } while (!esNumero(numero)); //El bucle se repite si el valor ingresado no es un número 
        int num = Integer.parseInt(numero); //convierte la cadena numero a un número entero
        long resultado = 1; //Inicializamos la variable resultado para almacenar el factorial 
        //Se usa "long" para manejar numeros grandes.
        int contador = 1; //Inicializamos el contador para realizar la multiplicación

        //Bucle while para calcular el factorial
        while (contador != num + 1) { // El bucle se ejecuta mientras contador sea diferente de num + 1.
            resultado = resultado * contador;  // Multiplica resultado por contador.
            contador++; //Incrementa el contador en 1. 
        }

        //Imprime el resultado del factorial.
        System.out.println("El factorial de " + num + " es: " + resultado);
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
