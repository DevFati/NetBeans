/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

/**
 *
 * @author Tarde
 */
public class Bingo {

    //Definiendo una matriz tridimensional para almacenar los cartones del bingo 
    static int carton[][][] = new int [4][5][5];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inicio; 
        int num; 
        
        //Llenando los cartones
        
        for(int numCarton=0; numCarton<4; numCarton++){
            inicio=1; 
            for(int fila=0; fila<5; fila++){
                for(int col=0; col<5; col++){
                    //Genra un numero aleatorio entre inicio y inicio +14
                    num=(int)(Math.random()*15)+inicio;
                    
                    //Verificamos que el numero no se repita en el cartón 
                    while(buscaNum(numCarton, num)){
                        num=(int)(Math.random()*15) + inicio; 
                        
                    }
                    
                    //Asigna el numero al carton en la posicion correspondiente 
                    carton[numCarton][fila][col]=num; 
                    
                }
                
                //Aumenta el rango de numeros en 15 para la siguiente columna
                inicio=inicio+15;
            }
            //La posicion central del carton es un espacio libre(0)
            carton[numCarton][2][2]=0;
        }
        //Muestra los cartones de bingo generados
        mostrarCartones();
    }

// Método que verifica si un número ya está en el cartón para evitar repeticiones
public static boolean buscaNum(int numCarton, int valor) {
    for (int fila = 0; fila < 5; fila++) {
        for (int col = 0; col < 5; col++) {
            if (valor == carton[numCarton][fila][col]) {
                return true;
            }
        }
    }
    return false;
}

// Muestra todos los cartones de bingo generados en el arreglo multidimensional
public static void mostrarCartones() {
    for (int numCarton = 0; numCarton < 4; numCarton++) {
        System.out.println("Cartón: " + numCarton);
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(carton[numCarton][fila][col] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        System.out.println(); // Salto de línea entre cartones
    }
}

    
}
