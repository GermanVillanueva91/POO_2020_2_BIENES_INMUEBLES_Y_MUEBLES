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
public class Camion extends BienesMuebles {
    private String TipoCamion;
    private int CapacidadCarga;
    private int NumeroLlantas;
    private int NumeroPuertas;
    private double Peso;
    static final double ISV = 0.15;

    public Camion() {
        super();
    }

    public Camion(String TipoCamion, int CapacidadCarga, int NumeroLlantas, int NumeroPuertas, double Peso, String NumeroPlaca, String NumeroSerieMotor, String Color, Date FechaFabricacion, String Marca, String TipoMotor, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(NumeroPlaca, NumeroSerieMotor, Color, FechaFabricacion, Marca, TipoMotor, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.TipoCamion = TipoCamion;
        this.CapacidadCarga = CapacidadCarga;
        this.NumeroLlantas = NumeroLlantas;
        this.NumeroPuertas = NumeroPuertas;
        this.Peso = Peso;
    }

    public String getTipoCamion() {
        return TipoCamion;
    }

    public void setTipoCamion(String TipoCamion) {
        this.TipoCamion = TipoCamion;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public int getNumeroLlantas() {
        return NumeroLlantas;
    }

    public void setNumeroLlantas(int NumeroLlantas) {
        this.NumeroLlantas = NumeroLlantas;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Tipo de caminon").concat(TipoCamion).concat("-Capacidad de Carga: ").concat(String.valueOf(CapacidadCarga))
            .concat("-Numero de Llantas: ").concat(String.valueOf(NumeroLlantas)).concat("-Numero de Puertas: ").concat(String.valueOf(NumeroPuertas))
            .concat("-Peso de Camion: ").concat(String.valueOf(Peso));
    }
    
    

    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }
    
    
    
}
