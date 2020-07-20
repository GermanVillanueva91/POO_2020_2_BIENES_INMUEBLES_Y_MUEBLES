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
public abstract class BienesMuebles extends Bienes implements IBienes{
    private String NumeroPlaca;
    private boolean Aereo_Terrestre;
    private String Marca;
    private String NumeroSerieMotor;  
    private String Color;  
    private Date FechaFabricacion;
    private String TipoMotor;

    public BienesMuebles() {
        super();
    }

    public BienesMuebles(String TipoMotor,String NumeroPlaca, boolean Aereo_Terrestre, String Marca, String NumeroSerieMotor, String Color, Date FechaFabricacion, String Nombre, String Nacionalidad, long Id, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, int Codigo, Date FechaAdquisicion, double Valor, String Direccion) {
        super(Nombre, Nacionalidad, Id, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion);
        this.NumeroPlaca = NumeroPlaca;
        this.Aereo_Terrestre = Aereo_Terrestre;
        this.Marca = Marca;
        this.NumeroSerieMotor = NumeroSerieMotor;
        this.Color = Color;
        this.FechaFabricacion = FechaFabricacion;
        this.TipoMotor = TipoMotor;
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

    public boolean isAereo_Terrestre() {
        return Aereo_Terrestre;
    }

    public void setAereo_Terrestre(boolean Aereo_Terrestre) {
        this.Aereo_Terrestre = Aereo_Terrestre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
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
                .concat("-Marca del Medio: ").concat(Marca).concat("-Tipo de Medio (Aereo o Terrestre): ").concat(String.valueOf(Aereo_Terrestre)).concat("-Fecha de Fabricacion").concat(String.valueOf(FechaFabricacion))
                .concat("-Color del Medio: ").concat(Color); 
    }

    
    
    
}
