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
        
        Scanner teclado=new Scanner(System.in);
        float [] calificaciones=new float [5];
        float suma=0;
        for(int i=0;i<5;i++){
            System.out.println("Introduce la "+(i+1)+" calificacion: ");
            calificaciones[i]=teclado.nextFloat();
            suma=suma+calificaciones[i];
            
        }
        System.out.println(suma/calificaciones.length);
        
    }
}
