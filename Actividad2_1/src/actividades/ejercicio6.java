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
public class ejercicio6 {
    public static void main(String[] args) {
        /*Realiza un programa que pida al usuario una palabra y cuente cuántas vocales tiene.*/
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce una palabra: ");
        String palabra=teclado.next();
        char vocales[]={'a','e','i','o','u'};
        int contador=0;
        for(int i=0;i<palabra.length();i++){
            for(int j=0;j<vocales.length;j++){
                if(palabra.charAt(i)==vocales[j]){
                    contador++;
                }
            }
            
        }
        System.out.println("La palabra tiene "+contador+" vocales.");
        
    }
}
