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
public class ListaBienesMuebles {
    ArrayList<BienesMuebles> listaMuebles;
    
    public ListaBienesMuebles(){
        listaMuebles = new ArrayList <BienesMuebles>();
    }
    
    public void addListaBienesMuebles(BienesMuebles bienesMuebles ){
        listaMuebles.add(bienesMuebles);
    }
    
    public void imprimirLista(){
        for (BienesMuebles e : listaMuebles) {
            System.out.print(e.toString()+"\n");
        }
    }
    
}
