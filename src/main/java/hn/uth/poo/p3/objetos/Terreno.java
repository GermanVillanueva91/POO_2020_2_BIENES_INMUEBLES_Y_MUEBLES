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
public class Terreno extends BienesInmuebles{
    private String Descripcion;
    private String TipoCerco;
    private String UsoTerreno;
    static final double ISV = 0.15;

    public Terreno(String Descripcion, String TipoCerco, String UsoTerreno, double Area, String CiudadPropiedad, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(Area, CiudadPropiedad, Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.Descripcion = Descripcion;
        this.TipoCerco = TipoCerco;
        this.UsoTerreno = UsoTerreno;
    }

    public Terreno() {
        super();
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipoCerco() {
        return TipoCerco;
    }

    public void setTipoCerco(String TipoCerco) {
        this.TipoCerco = TipoCerco;
    }

    public String getUsoTerreno() {
        return UsoTerreno;
    }

    public void setUsoTerreno(String UsoTerreno) {
        this.UsoTerreno = UsoTerreno;
    }
     
     
    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Descripcion").concat(Descripcion).concat("-Tipo de Cerco: ").concat(TipoCerco).concat("-Uso actual del terreno: ").concat(UsoTerreno); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
