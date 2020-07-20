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
public class Carro extends BienesMuebles {
    private int numeroPuertas;
    private int numeroRuedas;
    private String TipoVehiculo;
    private String TipoTransimision;
    private double pesoVehiculo;
    static final double ISV = 0.15;

    public Carro() {
        super();
    }

    public Carro(int numeroPuertas, int numeroRuedas, String TipoVehiculo, String TipoTransimision, double pesoVehiculo, String TipoMotor, String NumeroPlaca, boolean Aereo_Terrestre, String Marca, String NumeroSerieMotor, String Color, Date FechaFabricacion, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(TipoMotor, NumeroPlaca, Aereo_Terrestre, Marca, NumeroSerieMotor, Color, FechaFabricacion, Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.TipoVehiculo = TipoVehiculo;
        this.TipoTransimision = TipoTransimision;
        this.pesoVehiculo = pesoVehiculo;
    }

    

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getTipoTransimision() {
        return TipoTransimision;
    }

    public void setTipoTransimision(String TipoTransimision) {
        this.TipoTransimision = TipoTransimision;
    }

    public double getPesoVehiculo() {
        return pesoVehiculo;
    }

    public void setPesoVehiculo(double pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Tipo de Vehiculo").concat(TipoVehiculo).concat("-Tipo de Transmision: ").concat(TipoTransimision).concat("-Numero Puertas").concat(String.valueOf(numeroPuertas))
                .concat("-Numero de Ruedas: ").concat(String.valueOf(numeroRuedas)).concat("-Peso Vehiculo: ").concat(String.valueOf(pesoVehiculo)); 
    }
    
    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }
    
    
}
