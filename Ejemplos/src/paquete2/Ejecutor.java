/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

public class Ejecutor {
    public static void main(String[] args) {
        
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCosto(102100.23);
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCosto(33200.62);
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCosto(51221.01);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCosto(74300.10);
        
        
        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        
        //double c = listaEdificios[2].obtenerCosto();
        
        //System.out.println(c);
        
        Vehiculo ve1 = new Vehiculo("Auto", "lbb0011", 14100);
        Vehiculo ve2 = new Vehiculo("Camioneta", "lcb0011", 17100);
        Vehiculo ve3 = new Vehiculo("Auto", "lbd0012", 5010);
        Vehiculo ve4 = new Vehiculo("Camioneta", "lcc0011", 23200);
        Vehiculo ve5 = new Vehiculo("Camioneta", "ldc0011", 21450);
        
        Vehiculo[] listaVehiculos = {ve1, ve2, ve3, ve4, ve5};
        
        Empresa EDH = new Empresa();
        EDH.establecerNombre("Empresa de Hojas");
        EDH.establecerEdificios(listaEdificios);
        EDH.establecerCostoBienesInmuebles();
        EDH.establecerVehiculos(listaVehiculos);
        EDH.establecerCostoVehiculos();
        EDH.establecerCostoTotalBienes();
                
        //System.out.printf("%.2f\n",EDH.obtenerCostoBienesInmuebles());
        System.out.printf("%s\n",EDH);
        // Crear una arreglo de 4 elementos de tipo Edificio
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
