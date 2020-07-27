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
public class Casa extends BienesInmuebles{
    private int numeroHabitantes;
    private int numeroHabitaciones;
    private String colorCasa;
    private int numeroCasa;
    static final double ISV = 0.15;

    public Casa(int numeroHabitantes, int numeroHabitaciones, String colorCasa, int numeroCasa, double Area, String CiudadPropiedad, String Coordenadas, String ColindaN, String ColindaS, String ColindaE, String ColindaO, Date FechaPago, double CantidadPago, long CodigoFactura, String CiudadPago, String Codigo, Date FechaAdquisicion, double Valor, String Direccion, ArrayList<Persona> Propietarios, Notario notario) {
        super(Area, CiudadPropiedad, Coordenadas, ColindaN, ColindaS, ColindaE, ColindaO, FechaPago, CantidadPago, CodigoFactura, CiudadPago, Codigo, FechaAdquisicion, Valor, Direccion, Propietarios, notario);
        this.numeroHabitantes = numeroHabitantes;
        this.numeroHabitaciones = numeroHabitaciones;
        this.colorCasa = colorCasa;
        this.numeroCasa = numeroCasa;
    }

   
    public Casa() {
        super();
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getColorCasa() {
        return colorCasa;
    }

    public void setColorCasa(String colorCasa) {
        this.colorCasa = colorCasa;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    @Override
    public double CalcularPagoInmueble(double pago) {
        return pago * ISV;
    }

    @Override
    public String toString() {
        return super.toString().concat("-Numero de Habitantes: ").concat(String.valueOf(numeroHabitantes)).concat("-Numero de Habitaciones: ").concat(String.valueOf(numeroHabitaciones))
                .concat(" Color de la casa: ").concat(colorCasa).concat(String.valueOf(String.valueOf(numeroCasa)));
    }
}
