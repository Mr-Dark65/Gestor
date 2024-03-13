package Principal;

import java.util.Scanner;
/**
 *
 * @author Arita
 */
public class Menu {
     Scanner sc = new Scanner(System.in);

    public void menuOpciones() {
        int opcion = 0;
        System.out.println(". . . Menu de Opciones . . .");
        System.out.println("1. Registro de docentes\n"
                + "2. Registros de estudiantes\n"
                + "3. Registro de materias\n"
                + "4. Registro de califiaciones\n"
                + "5. Visualizar reportes\n"
                + "6. Salir");

        System.out.println("Ingrese una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                registroDocente();

                break;
            case 2:
                registroEstudiantes();
                break;
            case 3:
                registroMaterias();
                break;
            case 4:
                registroCalificaciones();
                break;
            case 5:
                visualizarReportes();
                break;
            case 6:
                System.out.println("Gracias por utilizar el programa . . .");
                break;
            default:
                throw new AssertionError();
        }

    }

    private void registroMaterias() {
        System.out.println("Hila");
    }

    private void registroEstudiantes() {
    }

    private void registroDocente() {
        System.out.println("hola");
    }

    private void registroCalificaciones() {
    }

    private void visualizarReportes() {
    }
    
}
