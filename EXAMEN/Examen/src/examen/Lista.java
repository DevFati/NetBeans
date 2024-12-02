/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author Fatima Mortahil Chachou
 */
public class Lista {
     private static ArrayList<Prov>lista=new ArrayList<Prov>();

    public static void añadirProveedor(Prov p){
        lista.add(p);
    }
    public static ArrayList<Prov> getListaProveedores() {
        return lista;
    }
}
