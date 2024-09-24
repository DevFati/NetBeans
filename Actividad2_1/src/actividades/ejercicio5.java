/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Scanner;

/**
 *
 * @author Tarde
 */
public class ejercicio5 {
    public static void main(String[] args) {
        
        /*Crea un programa que pida al usuario un número entero positivo y calcule su factorial
usando un bucle while.*/
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce un numero entero posiivo: ");
        int numero=teclado.nextInt();
        int resultado=1;
        int contador=1;
        
        while(contador!=numero+1){
            resultado=resultado*contador;
            contador++;
        }
        
        System.out.println("El factorial de "+numero+" es: "+resultado);
        
        
    }
}
