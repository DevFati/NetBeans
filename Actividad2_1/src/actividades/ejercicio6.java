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
public class ejercicio6 {

    public static void main(String[] args) {
        /*Realiza un programa que pida al usuario una palabra y cuente cuántas vocales tiene.*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();
        //Declaro un array de caracteres que contiene las vocales. 
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0; //Inicializo un contador para las vocales encontradas. 
        //Convierte la palabra a minúsculas para facilitar la comparación. 
        palabra = palabra.toLowerCase();

        //Bucle para recorrer cada carácter de la palabra. 
        for (int i = 0; i < palabra.length(); i++) {
            //Bucle para recorrer el array de vocales.
            for (int j = 0; j < vocales.length; j++) {
                //Comprueba si el caracter actual de la palabra es una vocal.
                if (palabra.charAt(i) == vocales[j]) {
                    contador++; //Incrementa el contador si se encuentra una vocal
                }
            }

        }

        //Imprime el numero total de vocales encontradas en la palabra
        System.out.println("La palabra tiene " + contador + " vocales.");

    }
}
