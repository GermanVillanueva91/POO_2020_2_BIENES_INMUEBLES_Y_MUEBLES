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
    private Date FechaPago;
    private double CantidadPago;
    private long CodigoFactura;
    private String CiudadPago;

    public Bienes() {
    }

    public Bienes(Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago) {
        this.FechaPago = FechaPago;
        this.CantidadPago = CantidadPago;
        this.CodigoFactura = CodigoFactura;
        this.CiudadPago = CiudadPago;
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
                concat("-Cantidad a pagar").concat(String.valueOf(CantidadPago))).concat("-Codigo Factura: ").concat(String.valueOf(CodigoFactura)); 
    }
}
