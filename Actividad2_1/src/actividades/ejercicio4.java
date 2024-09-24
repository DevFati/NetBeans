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
public class ejercicio4 {
    public static void main(String[] args) {
        /*Escribe un programa que solicite un número y muestre su tabla de multiplicar (del 1 al 10)
en la consola.*/
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numero=teclado.nextInt();
        
        System.err.println("Tabla de multiplicar del "+numero+": ");
        for(int i=0;i<=10;i++){
            System.out.println(+numero+" x "+i+" : "+numero*i);
        }
        
    }
}
