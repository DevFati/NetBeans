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
 * 
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        /*Crea un programa que le pida al usuario dos números y luego imprima la suma de esos
dos números*/
        Scanner teclado=new Scanner(System.in);
        int numero1;
        do{
             System.out.println("Introduce el primer numero: ");
          numero1=teclado.nextInt();
        }while(!esNumero(numero1));
       
        
        
        
        System.out.println("Introduce el segundo numero: ");
        int numero2=teclado.nextInt();
        
        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+numero1+numero2);
        
        
    }

    private static boolean esNumero(int numero) {
        String num=numero+"";
        if(num.matches("[0-9]+")){
            return true;
        }else{
            System.out.println("Introduce un numero valido!");
            return false;
        }
        
        
    }
}
