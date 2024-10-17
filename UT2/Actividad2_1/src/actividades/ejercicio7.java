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
public class ejercicio7 {

    public static void main(String[] args) {
        /*Crea un programa que pida 5 calificaciones, las guarde en un array y luego calcule y
muestre el promedio de las mismas.*/

        Scanner teclado = new Scanner(System.in);
        float[] calificaciones = new float[5]; //Declaramos un array de tipo float para almacenar 5 calificaciones 
        float suma = 0; //Inicializamos una variable para acumular la suma de las calificaciones. 

        //Bucle para solicitar las 5 calificaciones al usuario. 
        for (int i = 0; i < 5; i++) {

            String calificacion; //Declaro una variable para almacenar la calificación

            // Bucle que solicita la calificaciñon hasta que el usuario ingrese un valor válido
            do {
                System.out.println("Introduce la " + (i + 1) + " calificación: "); //Pedimos al usuario que introduzca la calificación
                calificacion = teclado.next(); //Se lee la calificación ingresada como cadena. 
            } while (!esNumero(calificacion)); //Se repite el bucle mientras el valor ingresado no sea un número válido

            Float nota = Float.parseFloat(calificacion); //convierte la cadena calificacion a un número de tipo Float

            //Almacenamos la calificación en el array
            calificaciones[i] = nota;
            //Suma la calificación a la variable suma
            suma = suma + calificaciones[i];
        }

        //Calcula y muestra la media de las calificaciones.
        System.out.println("El promedio total es: " + (suma / calificaciones.length));
    }

    //Método para verificar si la cadena es un número válido
    private static boolean esNumero(String numero) {
        //Si la cadena contiene solo dígitos del 0 al 9 o decimales  devuelve true
        if (numero.matches("[0-9]+(\\.[0-9]+)?")) {
            return true;
        } else {
            //Si la cadena no es número válido, muestra un numero de error
            System.out.println("Introduce un número válido!");
            return false;
        }

    }
}
