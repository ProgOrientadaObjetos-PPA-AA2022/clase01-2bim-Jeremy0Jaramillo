/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import herencia1.Estudiante;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        entry.useLocale(Locale.US);

        System.out.println("Ingrese (1) para Estudiante Presencial, "
                + "Ingrese (2) para Estudiante a Distancia:");
        String confir = entry.nextLine();
        if ("1".equals(confir) || "2".equals(confir)) {
            Estudiante ola = new Estudiante();
            System.out.println("Ingrese los nombres del estudiante:");
            String nomb = entry.nextLine();
            System.out.println("Ingrese los apellidos del estudiante:");
            String apel = entry.nextLine();
            System.out.println("Ingrese la identificacion del estudiante:");
            String iden = entry.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            int eda = entry.nextInt();
            entry.nextLine();

            if ("1".equals(confir)) {
                EstudiantePresencial ola1 = new EstudiantePresencial();
                ola1.establecerNombresEstudiante(nomb);
                ola1.establecerApellidoEstudiante(apel);
                ola1.establecerEdadEstudiante(eda);
                ola1.establecerIdentificacionEstudiante(iden);
                System.out.println("Ingrese el número de créditos:");
                ola1.establecerNumeroCreditos(entry.nextInt());
                System.out.println("Ingrese el costo del crédito:");
                ola1.establecerCostoCredito(entry.nextDouble());
                ola1.calcularMatriculaPresencial();

                System.out.println(ola1);
                System.out.println("Fin del Programa.");
            } else {
                if ("2".equals(confir)) {
                    EstudianteDistancia ola2 = new EstudianteDistancia();
                    ola2.establecerNombresEstudiante(nomb);
                    ola2.establecerApellidoEstudiante(apel);
                    ola2.establecerEdadEstudiante(eda);
                    ola2.establecerIdentificacionEstudiante(iden);
                    System.out.println("Ingrese el número de asignaturas:");
                    ola2.establecerNumeroAsginaturas(entry.nextInt());
                    System.out.println("Ingrese el costo de la asignatura:");
                    ola2.establecerCostoAsignatura(entry.nextDouble());
                    ola2.calcularMatriculaDistancia();

                    System.out.println(ola2);
                    System.out.println("Fin del Programa.");
                }
            }
        } else {
            System.out.println("Opción fuera de límites.\nFin de Programa");
        }
    }
}
