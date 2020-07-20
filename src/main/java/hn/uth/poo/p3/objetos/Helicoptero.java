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
public class Helicoptero extends BienesMuebles {
    private int numeroHelices;
    private int CantidadPasajeros;
    private double AlturaMaximaVuelo;
    private String TipoHelicoptero;
    private double peso;
    private double CapacidadCarga;
    static final double ISV = 0.15;

    public Helicoptero(int numeroHelices, int CantidadPasajeros, double AlturaMaximaVuelo, String TipoHelicoptero, double peso, double CapacidadCarga, String TipoMotor, String NumeroPlaca, boolean Aereo_Terrestre, String Marca, String NumeroSerieMotor, String Color, Date FechaFabricacion, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(TipoMotor, NumeroPlaca, Aereo_Terrestre, Marca, NumeroSerieMotor, Color, FechaFabricacion, Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.numeroHelices = numeroHelices;
        this.CantidadPasajeros = CantidadPasajeros;
        this.AlturaMaximaVuelo = AlturaMaximaVuelo;
        this.TipoHelicoptero = TipoHelicoptero;
        this.peso = peso;
        this.CapacidadCarga = CapacidadCarga;
    }

    public Helicoptero() {
        super();
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public double getAlturaMaximaVuelo() {
        return AlturaMaximaVuelo;
    }

    public void setAlturaMaximaVuelo(double AlturaMaximaVuelo) {
        this.AlturaMaximaVuelo = AlturaMaximaVuelo;
    }

    public String getTipoHelicoptero() {
        return TipoHelicoptero;
    }

    public void setTipoHelicoptero(String TipoHelicoptero) {
        this.TipoHelicoptero = TipoHelicoptero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(double CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }
    
}
