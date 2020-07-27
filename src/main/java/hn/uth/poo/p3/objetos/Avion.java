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
public class Avion extends BienesMuebles{
    private int CantidadTurbinas;
    private int CantidadPasajeros;
    private int CantidadLlantas;
    private String TipoAvion;
    static final double ISV = 0.15;
    
    public Avion() {
        super();
    }

    public Avion(int CantidadTurbinas, int CantidadPasajeros, int CantidadLlantas, String TipoAvion, String NumeroPlaca, String NumeroSerieMotor, String Color, Date FechaFabricacion, String Marca, String TipoMotor, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(NumeroPlaca, NumeroSerieMotor, Color, FechaFabricacion, Marca, TipoMotor, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.CantidadTurbinas = CantidadTurbinas;
        this.CantidadPasajeros = CantidadPasajeros;
        this.CantidadLlantas = CantidadLlantas;
        this.TipoAvion = TipoAvion;
    }

    public int getCantidadTurbinas() {
        return CantidadTurbinas;
    }

    public void setCantidadTurbinas(int CantidadTurbinas) {
        this.CantidadTurbinas = CantidadTurbinas;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public int getCantidadLlantas() {
        return CantidadLlantas;
    }

    public void setCantidadLlantas(int CantidadLlantas) {
        this.CantidadLlantas = CantidadLlantas;
    }

    public String getTipoAvion() {
        return TipoAvion;
    }

    public void setTipoAvion(String TipoAvion) {
        this.TipoAvion = TipoAvion;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Tipo de Avion: ").concat(TipoAvion).concat("-Cantidad Maxima de Pasajeros: ").concat(String.valueOf(CantidadPasajeros))
                .concat("-Cantidad de Turbinas: ").concat(String.valueOf(CantidadTurbinas)).concat("-Cantidad de Llantas: ").concat(String.valueOf(CantidadLlantas)); //To change body of generated methods, choose Tools | Templates.
    }
      
    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }
    
}
