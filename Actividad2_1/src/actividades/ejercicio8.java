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
        Scanner teclado=new Scanner(System.in);
        int m=(int)(Math.random()*100+1);
        
        int n=0;
        while(n!=m){
            System.out.println("Adivina el numero: ");
            n=teclado.nextInt();
            if(n<m){
                System.out.println("El numero a adivinar es mayor");
            }else if(n>m){
                System.out.println("El numero a adivinar es menor");
            }else{
                System.out.println("¡Felicidades!! Acertaste");
            }
        }
    }
}
