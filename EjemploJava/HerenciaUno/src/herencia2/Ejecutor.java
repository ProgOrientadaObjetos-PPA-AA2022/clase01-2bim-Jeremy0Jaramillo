/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;

public class Ejecutor {

    public static void main(String[] args) {
        EstudiantePresencial ola = new EstudiantePresencial();
        ola.establecerNombresEstudiante("Mepara");
        ola.establecerApellidoEstudiante("Elorto");
        ola.establecerEdadEstudiante(19);
        ola.establecerIdentificacionEstudiante("1101010");
        ola.establecerNumeroCreditos(120);
        ola.establecerCostoCredito(20.50);
        ola.calcularMatriculaPresencial();

        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Identificación: %s\n"
                + "Número de créditos: %d\n"
                + "CostoCréditos: %.2f\n"
                + "Costo Matrícula: %.2f\n",
                ola.obtenerNombresEstudiante(),
                ola.obtenerApellidoEstudiante(),
                ola.obtenerEdadEstudiante(),
                ola.obtenerIdentificacionEstudiante(),
                ola.obtenerNumeroCreditos(),
                ola.obtenerCostoCredito(),
                ola.obtenerMatriculaPresencial());
    }
}
