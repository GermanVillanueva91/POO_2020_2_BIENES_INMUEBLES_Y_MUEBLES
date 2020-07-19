/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

import java.util.Date;

/**
 *
 * @author Alexander
 */
public class Persona {
    private int Id;
    private String Nombre;
    private String Ciudad;
    private String EstadoCivil;
    private Date FechaNacimiento;

    public Persona() {
    }

    public Persona(int Id, String Nombre, String Ciudad, String EstadoCivil, Date FechaNacimiento) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.EstadoCivil = EstadoCivil;
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        return ("Nombre").concat(Nombre).concat("-Id").concat(String.valueOf(Id).concat("-Ciudad")
                .concat(Ciudad).concat("-Estado Civil ").concat(EstadoCivil).concat("-Fecha Nacimiento")
                .concat(String.valueOf(FechaNacimiento)));
    }
    
    
}
