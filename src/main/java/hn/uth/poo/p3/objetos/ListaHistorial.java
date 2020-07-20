/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

import java.util.ArrayList;

/**
 *
 * @author Buddys
 */
public class ListaHistorial {
    ArrayList<Historial> listaHistorial;
    
    public ListaHistorial(){
        listaHistorial = new ArrayList <Historial>();
    }
    
    public void addListaHistorial(Historial historial ){
        listaHistorial.add(historial);
    }
    
    public void imprimirLista(){
        for (Historial e : listaHistorial) {
            System.out.print(e.toString()+"\n");
        }  
    }    
}
