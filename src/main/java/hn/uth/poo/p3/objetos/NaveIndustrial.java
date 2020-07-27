/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Buddys
 */
public class NaveIndustrial extends BienesInmuebles {
    private String JefeInterno;
    private int numeroMaquinarias;
    private int numeroOficina;
    private int numeroTrabjadores;
    private int numeroNave;

    
    static final double ISV = 0.15;

    public NaveIndustrial(String JefeInterno, int numeroMaquinarias, int numeroOficina, int numeroTrabjadores, int numeroNave, double Area, String CiudadPropiedad, String Coordenadas, String ColindaN, String ColindaS, String ColindaE, String ColindaO, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(Area, CiudadPropiedad, Coordenadas, ColindaN, ColindaS, ColindaE, ColindaO, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.JefeInterno = JefeInterno;
        this.numeroMaquinarias = numeroMaquinarias;
        this.numeroOficina = numeroOficina;
        this.numeroTrabjadores = numeroTrabjadores;
        this.numeroNave = numeroNave;
    }    

    public NaveIndustrial() {
        super();
    }
    
    public int getNumeroNave() {
        return numeroNave;
    }

    public void setNumeroNave(int numeroNave) {
        this.numeroNave = numeroNave;
    }

    public String getJefeInterno() {
        return JefeInterno;
    }

    public void setJefeInterno(String JefeInterno) {
        this.JefeInterno = JefeInterno;
    }

    public int getNumeroMaquinarias() {
        return numeroMaquinarias;
    }

    public void setNumeroMaquinarias(int numeroMaquinarias) {
        this.numeroMaquinarias = numeroMaquinarias;
    }

    public int getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(int numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public int getNumeroTrabjadores() {
        return numeroTrabjadores;
    }

    public void setNumeroTrabjadores(int numeroTrabjadores) {
        this.numeroTrabjadores = numeroTrabjadores;
    }

    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV; 
    }

    @Override
    public String toString() {
        return super.toString().concat("-Nombre del Jefe Interno: ").concat(JefeInterno).concat("-Numero de maquiarias: ").concat(String.valueOf(numeroMaquinarias))
                .concat("-Cantidad de Oficionas: ").concat(String.valueOf(numeroOficina)).concat("-Numero de Trabajdores: ").concat(String.valueOf(numeroTrabjadores)); 
    }
    
    
}
