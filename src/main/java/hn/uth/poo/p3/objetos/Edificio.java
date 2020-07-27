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
public class Edificio extends BienesInmuebles {
    private int numeroDePisos;
    private int cantidadLocales;
    private String Color;
    private String NombreEdificio;
    private boolean UsoActual;
    static final double ISV = 0.15;
    private long numeroEdificio;

    public Edificio(int numeroDePisos, int cantidadLocales, String Color, String NombreEdificio, boolean UsoActual, long numeroEdificio, double Area, String CiudadPropiedad, String Coordenadas, String ColindaN, String ColindaS, String ColindaE, String ColindaO, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(Area, CiudadPropiedad, Coordenadas, ColindaN, ColindaS, ColindaE, ColindaO, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.numeroDePisos = numeroDePisos;
        this.cantidadLocales = cantidadLocales;
        this.Color = Color;
        this.NombreEdificio = NombreEdificio;
        this.UsoActual = UsoActual;
        this.numeroEdificio = numeroEdificio;
    }

    
    public long getNumeroEdificio() {
        return numeroEdificio;
    }

    public void setNumeroEdificio(long numeroEdificio) {
        this.numeroEdificio = numeroEdificio;
    }
    
    public Edificio() {
        super();
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public int getCantidadLocales() {
        return cantidadLocales;
    }

    public void setCantidadLocales(int cantidadLocales) {
        this.cantidadLocales = cantidadLocales;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getNombreEdificio() {
        return NombreEdificio;
    }

    public void setNombreEdificio(String NombreEdificio) {
        this.NombreEdificio = NombreEdificio;
    }

    public boolean isUsoActual() {
        return UsoActual;
    }

    public void setUsoActual(boolean UsoActual) {
        this.UsoActual = UsoActual;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Nombre Edificio: ").concat(NombreEdificio).concat("-Color: ").concat(Color).concat("-Cantidad de Locales").concat(String.valueOf(cantidadLocales))
                .concat(" Uso actual del edicio: ").concat(String.valueOf(UsoActual)).concat("-Numero Edificio: ").concat(String.valueOf(numeroEdificio)); 
    }
    
    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }
    
}
