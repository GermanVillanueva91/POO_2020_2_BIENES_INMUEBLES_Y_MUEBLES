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
public class Persona {
    private String Nombre;
    private long Id;
    private String Profesion;
    private long numeroTelefono;
    private String Sexo;
    private Date FechaNacimiento;

    public Persona() {
    }

    public Persona(Date FechaNacimiento,String Sexo,String Nombre, long Id, String Profesion, long numeroTelefono) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Profesion = Profesion;
        this.numeroTelefono = numeroTelefono;
        this.Sexo = Sexo;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
}
