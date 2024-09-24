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
public class ejercicio1 {
    
    public static void main(String[] args) {
        /*Crea un programa que le pida al usuario dos números y luego imprima la suma de esos
dos números*/
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1=teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2=teclado.nextInt();
        
        System.err.println("La suma de "+numero1+" y "+numero2+" es: "+numero1+numero2);
        
        
    }
}
