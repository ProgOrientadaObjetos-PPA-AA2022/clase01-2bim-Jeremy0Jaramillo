/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double costo;

    public Vehiculo(String n, String m, double c) {
        tipo = n;
        matricula = m;
        costo = c;
    }

    public void establecerTipo(String m) {
        tipo = m;
    }
    
    public void establecerMatricula(String m) {
        matricula = m;
    }

    public void establecerCosto(double m) {
        costo = m;
    }

    public String obtenerTipo() {
        return tipo;
    }
    
    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerCosto() {
        return costo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tipo de Vehiculo: %s"
                + "\nMatricula del Vehiculo: %s"
                + "\nCosto del Vehiculo: %.2f",
                tipo,
                matricula,
                costo);
        return cadena;
    }
}
