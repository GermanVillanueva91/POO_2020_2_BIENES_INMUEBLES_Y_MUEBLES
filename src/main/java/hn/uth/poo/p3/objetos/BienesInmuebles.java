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
public abstract class BienesInmuebles extends Bienes implements IBienes {
   private double Area;
   private String CiudadPropiedad;

    public BienesInmuebles(double Area, String CiudadPropiedad, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.Area = Area;
        this.CiudadPropiedad = CiudadPropiedad;
    }

    
    public BienesInmuebles() {
        super();
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public String getCiudadPropiedad() {
        return CiudadPropiedad;
    }

    public void setCiudadPropiedad(String CiudadPropiedad) {
        this.CiudadPropiedad = CiudadPropiedad;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Area Propiedad: ").concat(String.valueOf(Area)).concat("-Ciudad de la Propiedad: ").concat(CiudadPropiedad); 
    }
}
