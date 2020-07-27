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
public abstract class BienesInmuebles extends Bienes implements IBienes {
   private double Area;
   private String CiudadPropiedad;
   private String Coordenadas;
   private String ColindaN;
   private String ColindaS;
   private String ColindaE;
   private String ColindaO;

    public BienesInmuebles(double Area, String CiudadPropiedad, String Coordenadas, String ColindaN, String ColindaS, String ColindaE, String ColindaO, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.Area = Area;
        this.CiudadPropiedad = CiudadPropiedad;
        this.Coordenadas = Coordenadas;
        this.ColindaN = ColindaN;
        this.ColindaS = ColindaS;
        this.ColindaE = ColindaE;
        this.ColindaO = ColindaO;
    }

   

    public String getCoordenadas() {
        return Coordenadas;
    }

    public void setCoordenadas(String Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    public String getColindaN() {
        return ColindaN;
    }

    public void setColindaN(String ColindaN) {
        this.ColindaN = ColindaN;
    }

    public String getColindaS() {
        return ColindaS;
    }

    public void setColindaS(String ColindaS) {
        this.ColindaS = ColindaS;
    }

    public String getColindaE() {
        return ColindaE;
    }

    public void setColindaE(String ColindaE) {
        this.ColindaE = ColindaE;
    }

    public String getColindaO() {
        return ColindaO;
    }

    public void setColindaO(String ColindaO) {
        this.ColindaO = ColindaO;
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
