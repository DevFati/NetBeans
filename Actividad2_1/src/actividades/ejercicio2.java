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
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Intoduce la temperatura en grados Celsius: ");
        int grados=teclado.nextInt();
        
        System.out.println(grados+" celsius son: "+((grados*9/5)+32)+" farenheit");
        
    }
}
