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
public class ejercicio8 {

    public static void main(String[] args) {
        /*Escribe un programa que genere un número aleatorio entre 1 y 100, y permita al usuario
adivinar el número. El programa debe dar pistas si el número es mayor o menor que la
adivinanza del usuario, hasta que acierte.*/
        Scanner teclado = new Scanner(System.in);
        int m = (int) (Math.random() * 100 + 1); //Genera un número aleatorio entre 1 y 100 (inclusivo).

        int n = 0; //Inicializa la variable n que almacenará la adivinanza del usuario. 

        //Bucle que se repite hasta que el usuario adivine el número correcto.
        while (n != m) {
            String numero; //Declaro una variable para almacenar la adivinanza como cadena
            // Bucle que solicita la adivinanza hasta que el usuario ingrese un valor válido 
            do {
                System.out.println("Adivina el numero: ");
                numero = teclado.next(); //Se lee la adivinanza como cadena
            } while (!esNumero(numero)); //El bucle se repite si el valor ingresado no es un número válido

            n = Integer.parseInt(numero); //convierte la cadena numero a un número entero

            //Comprueba si el numero es menor, mayor o igual al número aleatorio. 
            if (n < m) {
                System.out.println("El numero a adivinar es mayor");
            } else if (n > m) {
                System.out.println("El numero a adivinar es menor");
            } else {
                System.out.println("¡Felicidades!! Acertaste");
            }
        }
    }
    //Método para verificar si la cadena es un número válido
    private static boolean esNumero(String numero) {
        //Si la cadena contiene solo dígitos del 0 al 9   devuelve true
        if (numero.matches("[0-9]+")) {
            return true;
        } else {
            //Si la cadena no es número válido, muestra un numero de error
            System.out.println("Introduce un número entero positivo válido!");
            return false;
        }

    }
}
