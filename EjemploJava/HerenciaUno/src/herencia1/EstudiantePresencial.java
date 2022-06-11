
package herencia1;

public class EstudiantePresencial extends Estudiante{
    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        matriculaPresencial: Real */
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Identificación: %s\n"
                + "Número de créditos: %d\n"
                + "Costo de crédito: %.2f\n"
                + "Costo Matrícula Presencial: %.2f\n",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerEdadEstudiante(),
                obtenerIdentificacionEstudiante(),
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());
        return cadena;
    }
    
}
