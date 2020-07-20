/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.objetos;

import java.util.Date;

/**
 *
 * @author Alexander
 */
public class Bienes {
    private String Nombre;
    private String Nacionalidad;
    private long Id;
    private Date FechaPago;
    private double CantidadPago;
    private long CodigoFactura;
    private String CiudadPago;
    private int Codigo;
    private Date FechaAdquisicion;
    private double Valor;
    private String Direccion;

    public Bienes() {
    }

    public Bienes(String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor,String Direccion) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Id = Id;
        this.FechaPago = FechaPago;
        this.CantidadPago = CantidadPago;
        this.CodigoFactura = CodigoFactura;
        this.CiudadPago = CiudadPago;
        this.Codigo = Codigo;
        this.FechaAdquisicion = FechaAdquisicion;
        this.Valor = Valor;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

   public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
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
        return super.toString().concat("-Nombre del duenoño: ").concat(Nombre).concat("-Naionalidad").concat(Nacionalidad).concat("-ID:").concat(String.valueOf(Id))
                .concat("Ciudad de Pago ").concat(CiudadPago).concat("-Fecha de Pago: ").concat(String.valueOf(FechaPago).
                 concat("-Cantidad a pagar").concat(String.valueOf(CantidadPago))).concat("-Codigo Factura: ").concat(String.valueOf(CodigoFactura))
                .concat("-Fecha Adquisicion").concat(String.valueOf(FechaAdquisicion)).concat(CiudadPago).concat("-Codigo").concat(String.valueOf(Codigo))
                .concat("-Valor del Bien:").concat(String.valueOf(Valor)); 
    }
}
