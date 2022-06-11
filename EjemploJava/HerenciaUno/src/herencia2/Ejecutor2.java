/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        entry.useLocale(Locale.US);

        EstudianteDistancia ola = new EstudianteDistancia();

        System.out.println("Ingrese los nombres del estudiante:");
        ola.establecerNombresEstudiante(entry.nextLine());
        System.out.println("Ingrese los apellidos del estudiante:");
        ola.establecerApellidoEstudiante(entry.nextLine());
        System.out.println("Ingrese la edad del estudiante:");
        ola.establecerEdadEstudiante(entry.nextInt());
        entry.nextLine();
        System.out.println("Ingrese la identificacion del estudiante:");
        ola.establecerIdentificacionEstudiante(entry.nextLine());
        System.out.println("Ingrese el número de asignaturas:");
        ola.establecerNumeroAsginaturas(entry.nextInt());
        System.out.println("Ingrese el costo de la asignatura:");
        ola.establecerCostoAsignatura(entry.nextDouble());
        ola.calcularMatriculaDistancia();

        /*
        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Identificación: %s\n"
                + "Número de asignaturas: %d\n"
                + "Costo de asignaturas: %.2f\n"
                + "Costo Matrícula a Distancia: %.2f\n",
                ola.obtenerNombresEstudiante(),
                ola.obtenerApellidoEstudiante(),
                ola.obtenerEdadEstudiante(),
                ola.obtenerIdentificacionEstudiante(),
                ola.obtenerNumeroAsignaturas(),
                ola.obtenerCostoAsignatura(),
                ola.obtenerMatriculaDistancia());
         */
        System.out.println(ola);
    }
}
