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
public class NaveIndustrial extends BienesInmuebles {
    private String JefeInterno;
    private int numeroMaquinarias;
    private int numeroOficina;
    private int numeroTrabjadores;
    static final double ISV = 0.15;

    public NaveIndustrial(String JefeInterno, int numeroMaquinarias, int numeroOficina, int numeroTrabjadores, double Area, String CiudadPropiedad, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(Area, CiudadPropiedad, Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.JefeInterno = JefeInterno;
        this.numeroMaquinarias = numeroMaquinarias;
        this.numeroOficina = numeroOficina;
        this.numeroTrabjadores = numeroTrabjadores;
    }

    public NaveIndustrial() {
        super();
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
