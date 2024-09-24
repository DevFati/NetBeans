/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodeif;

import java.util.Scanner;

/**
 *
 * @author Tarde
 */
public class UsodeIf {
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce el primer numero ");
        
        int num1=teclado.nextInt();
        System.out.println("Introduce el segundo numero ");

        int num2=teclado.nextInt();
    
    if(num1+num2>=0){
            System.out.println("El resultado es positivo");
    }else{
            System.out.println("El resultado es negativo");
        
    }
    
    
    
    
}
}
