/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

import java.util.Date;

/**
 *
 * @author Buddys
 */
public class Notario extends Persona {
    private int NumeroNotario;

    public Notario() {
        super();
    }

    public Notario(int NumeroNotario, Date FechaNacimiento, String Sexo, String Nombre, long Id, String Profesion, long numeroTelefono) {
        super(FechaNacimiento, Sexo, Nombre, Id, Profesion, numeroTelefono);
        this.NumeroNotario = NumeroNotario;
    }
    

    public int getNumeroNotario() {
        return NumeroNotario;
    }

    public void setNumeroNotario(int NumeroNotario) {
        this.NumeroNotario = NumeroNotario;
    }
    
    
}
