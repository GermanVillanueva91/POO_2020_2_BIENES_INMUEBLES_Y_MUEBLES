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
public class ListaBinesInmuebles {
    ArrayList<BienesInmuebles> listaBienesInmubles;
    
    public ListaBinesInmuebles(){
        listaBienesInmubles = new ArrayList <BienesInmuebles>();
    }
    
    public void addlistaBienesInmubles(BienesInmuebles bienesInmuebles ){
        listaBienesInmubles.add(bienesInmuebles);
    }
    
    public void imprimirLista(){
        for (BienesInmuebles e : listaBienesInmubles) {
            System.out.print(e.toString()+"\n");
        }
    }
    
}
