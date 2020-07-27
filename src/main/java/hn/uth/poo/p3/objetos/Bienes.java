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
 * @author Alexander
 */
public class Bienes {
    
    private Date FechaPago;
    private double CantidadPago;
    private long CodigoFactura;
    private String CiudadPago;
    private String Codigo;//STRING
    private Date FechaAdquisicion;
    private double Valor;
    private String Direccion;
    private ArrayList<Persona> Propietarios;
    private Notario notario;

    public Bienes() {
    }

    public Bienes(Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        this.FechaPago = FechaPago;
        this.CantidadPago = CantidadPago;
        this.CodigoFactura = CodigoFactura;
        this.CiudadPago = CiudadPago;
        this.Codigo = Codigo;
        this.FechaAdquisicion = FechaAdquisicion;
        this.Valor = Valor;
        this.Direccion = Direccion;
        this.Propietarios = Propietarios;
        this.notario = notario;
    }

    public ArrayList<Persona> getPropietarios() {
        return Propietarios;
    }

    public void setPropietarios(ArrayList<Persona> Propietarios) {
        this.Propietarios = Propietarios;
    }

    public Notario getNotario() {
        return notario;
    }

    public void setNotario(Notario notario) {
        this.notario = notario;
    }
    

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

   public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public Date getFechaAdquisicion() {
        return FechaAdquisicion;
    }

    public void setFechaAdquisicion(Date FechaAdquisicion) {
        this.FechaAdquisicion = FechaAdquisicion;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

   
    public Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public double getCantidadPago() {
        return CantidadPago;
    }

    public void setCantidadPago(double CantidadPago) {
        this.CantidadPago = CantidadPago;
    }

    public long getCodigoFactura() {
        return CodigoFactura;
    }

    public void setCodigoFactura(long CodigoFactura) {
        this.CodigoFactura = CodigoFactura;
    }

    public String getCiudadPago() {
        return CiudadPago;
    }

    public void setCiudadPago(String CiudadPago) {
        this.CiudadPago = CiudadPago;
    }
    
    @Override
    public String toString() {
        return super.toString().concat("Ciudad de Pago ").concat(CiudadPago).concat("-Fecha de Pago: ").concat(String.valueOf(FechaPago).
                 concat("-Cantidad a pagar").concat(String.valueOf(CantidadPago))).concat("-Codigo Factura: ").concat(String.valueOf(CodigoFactura))
                .concat("-Fecha Adquisicion").concat(String.valueOf(FechaAdquisicion)).concat(CiudadPago).concat("-Codigo").concat(String.valueOf(Codigo))
                .concat("-Valor del Bien:").concat(String.valueOf(Valor)); 
    }
}
