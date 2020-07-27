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
public abstract class BienesMuebles extends Bienes implements IBienes{
    private String NumeroPlaca;
    private String NumeroSerieMotor;  
    private String Color;  
    private Date FechaFabricacion;
    private String TipoMotor;
    private String Marca;

    public BienesMuebles() {
        super();
    }

    public BienesMuebles(String NumeroPlaca, String NumeroSerieMotor, String Color, Date FechaFabricacion,String Marca, String TipoMotor, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.NumeroPlaca = NumeroPlaca;
        this.NumeroSerieMotor = NumeroSerieMotor;
        this.Color = Color;
        this.FechaFabricacion = FechaFabricacion;
        this.TipoMotor = TipoMotor;
        this.Marca = Marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    
    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String TipoMotor) {
        this.TipoMotor = TipoMotor;
    }
    

    public String getNumeroPlaca() {
        return NumeroPlaca;
    }

    public void setNumeroPlaca(String NumeroPlaca) {
        this.NumeroPlaca = NumeroPlaca;
    }

    public String getNumeroSerieMotor() {
        return NumeroSerieMotor;
    }

    public void setNumeroSerieMotor(String NumeroSerieMotor) {
        this.NumeroSerieMotor = NumeroSerieMotor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getFechaFabricacion() {
        return FechaFabricacion;
    }

    public void setFechaFabricacion(Date FechaFabricacion) {
        this.FechaFabricacion = FechaFabricacion;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Numero de Placa").concat(String.valueOf(NumeroPlaca)).concat("-Numero de serie del motor").concat(String.valueOf(NumeroSerieMotor))
                .concat("-Marca del Medio: ").concat("-Fecha de Fabricacion").concat(String.valueOf(FechaFabricacion))
                .concat("-Color del Medio: ").concat(Color); 
    }

    
    
    
}
