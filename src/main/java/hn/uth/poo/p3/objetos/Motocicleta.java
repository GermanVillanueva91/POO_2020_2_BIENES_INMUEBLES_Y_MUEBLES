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
public class Motocicleta extends BienesMuebles {
    private int numeroRuedas;
    private String TipoTransmision;
    private double peso ;
    private int numeroCambios;
    static final double ISV = 0.15;

    public Motocicleta(int numeroRuedas, String TipoTransmision, double peso, int numeroCambios, String TipoMotor, String NumeroPlaca, boolean Aereo_Terrestre, String Marca, String NumeroSerieMotor, String Color, Date FechaFabricacion, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(TipoMotor, NumeroPlaca, Aereo_Terrestre, Marca, NumeroSerieMotor, Color, FechaFabricacion, Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.numeroRuedas = numeroRuedas;
        this.TipoTransmision = TipoTransmision;
        this.peso = peso;
        this.numeroCambios = numeroCambios;
    }

    public Motocicleta() {
        super();
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoTransmision() {
        return TipoTransmision;
    }

    public void setTipoTransmision(String TipoTransmision) {
        this.TipoTransmision = TipoTransmision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Numero de ruedas").concat(String.valueOf(numeroRuedas)).concat("-numero de Cambios").concat(String.valueOf(numeroCambios))
            .concat("-Tipo de Transmision: ").concat(TipoTransmision).concat("-Peso de la Motocicleta: ").concat(String.valueOf(peso)); 
    }
    
    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }
    
    
}
