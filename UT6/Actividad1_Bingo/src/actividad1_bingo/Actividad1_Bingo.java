/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1_bingo;

/**
 *
 * @author Tarde
 */
public class Actividad1_Bingo {

    /**
     * @param args the command line arguments
     */
    static int carton[][]=new int [5][5];
    public static void main(String[] args) {
      
           System.out.println(mostrarCarton());
    
       
    }

    public static boolean buscaNum(int valor) {
        for (int fila = 0; fila < 5; fila++) {
        for (int col = 0; col < 5; col++) {
            if (valor == carton[fila][col]) {
                return true;
            }
        }
    }
    return false;
    }

    public static Object mostrarCarton() {
      
         int num; 
       
       for(int fila=0; fila<5; fila++){
                for(int col=0; col<5; col++){
                    //Genra un numero aleatorio entre 1 y 75
                    num=(int)(Math.random()*75)+1;
                    
                    //Verificamos que el numero no se repita en el cartón 
                    while(buscaNum(num)){
                        num=(int)(Math.random()*75)+1;
                    }
                    
                    //Asigna el numero al carton en la posicion correspondiente 
                    carton[fila][col]=num; 
                    
                }
            }
            //La posicion central del carton es un espacio libre(0)
            carton[2][2]=0;
            
        return carton;
    }
    
}
