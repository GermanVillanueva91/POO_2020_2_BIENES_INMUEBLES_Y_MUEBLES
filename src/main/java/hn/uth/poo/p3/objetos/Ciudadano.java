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
public class Ciudadano {
    private int Id;
    private String Nomre;

    public Ciudadano() {
    }

    public Ciudadano(int Id, String Nomre) {
        this.Id = Id;
        this.Nomre = Nomre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomre() {
        return Nomre;
    }

    public void setNomre(String Nomre) {
        this.Nomre = Nomre;
    }
}
