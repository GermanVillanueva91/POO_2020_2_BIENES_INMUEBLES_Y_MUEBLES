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
public class Historial implements IHistorial{
    private ArrayList<BienesMuebles> bienesMuebles;
    private ArrayList<BienesInmuebles> bienesInmuebles;

    public Historial(ArrayList<BienesMuebles> bienesMuebles, ArrayList<BienesInmuebles> bienesInmuebles) {
        this.bienesMuebles = bienesMuebles;
        this.bienesInmuebles = bienesInmuebles;
    }

    public Historial() {
    }

    public ArrayList<BienesMuebles> getBienesMuebles() {
        return bienesMuebles;
    }

    public void setBienesMuebles(ArrayList<BienesMuebles> bienesMuebles) {
        this.bienesMuebles = bienesMuebles;
    }

    public ArrayList<BienesInmuebles> getBienesInmuebles() {
        return bienesInmuebles;
    }

    public void setBienesInmuebles(ArrayList<BienesInmuebles> bienesInmuebles) {
        this.bienesInmuebles = bienesInmuebles;
    }
    
    @Override
    public double CalculoPagosTotales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
