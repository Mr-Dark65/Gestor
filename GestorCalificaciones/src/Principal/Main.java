/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author thexe
 */
public class Main {

class ReporteCalificaciones {
    private List<Calificacion> calificaciones;

    public ReporteCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void mostrarCalificaciones(String materiaSeleccionada) {
        // Imprimir encabezados de la tabla
        System.out.println("+--------------+--------------+--------------+--------------+");
        System.out.println("|   Materia    |    Fecha     |   Nombre     | Calificación |");
        System.out.println("+--------------+--------------+--------------+--------------+");

        // Imprimir las calificaciones para la materia seleccionada
        for (Calificacion calificacion : calificaciones) {
            if (calificacion.getMateria().equals(materiaSeleccionada)) {
                System.out.printf("| %-12s | %-12s | %-12s | %-12d |\n", calificacion.getMateria(), calificacion.getFecha(), calificacion.getNombre(), calificacion.getCalificacion());
            }
        }

        // Imprimir línea final de la tabla
        System.out.println("+--------------+--------------+--------------+--------------+\n");
    }
}
}
