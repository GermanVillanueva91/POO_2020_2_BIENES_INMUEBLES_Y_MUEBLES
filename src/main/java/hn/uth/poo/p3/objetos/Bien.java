/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

/**
 *
 * @author Alexander
 */
public class Bien {
    private boolean Inmueble;
    private boolean Mueble;

    public Bien() {
    }

    public Bien(boolean Inmueble, boolean Mueble) {
        this.Inmueble = Inmueble;
        this.Mueble = Mueble;
    }

    public boolean isInmueble() {
        return Inmueble;
    }

    public void setInmueble(boolean Inmueble) {
        this.Inmueble = Inmueble;
    }

    public boolean isMueble() {
        return Mueble;
    }

    public void setMueble(boolean Mueble) {
        this.Mueble = Mueble;
    }
}
