package Principal;

import java.util.Scanner;

/**
 *
 * @author Arita
 */
public class Menu {

    Scanner tec = new Scanner(System.in);

    public void menuOpciones() {
        int opcion = 0;
        do {

            System.out.println(". . . Menu de Opciones . . .");
            System.out.println("1. Registro de docentes\n"
                    + "2. Registros de estudiantes\n"
                    + "3. Registro de materias\n"
                    + "4. Registro de califiaciones\n"
                    + "5. Visualizar reportes\n"
                    + "6. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    registroDocente();
                    break;
                case 2:
                    registroEstudiantes();
                    break;
                case 3:
                    tec.nextLine();
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

        } while (opcion != 6);

    }

    private void registroMaterias() {
    Materias mate = new Materias();
    System.out.println("Nombre de la materia:");
    mate.setNombreMate(tec.nextLine().toUpperCase());
    Almacen.getInstance().materia.add(mate);
}

    private void registroEstudiantes() {
        Estudiante es = new Estudiante();
        System.out.println("Ingrese su nombre:");
        tec.next();
        es.setNombre(tec.nextLine().toUpperCase());
        System.out.println("Ingrese su apellido:");
        tec.next();
        es.setApellido(tec.nextLine().toUpperCase());
        Almacen.getInstance().estudiante.add(es);

    }

    private void registroDocente() {
        Docente doce = new Docente();
        System.out.println("Ingrese su nombre:");
        tec.next();
        doce.setNombre(tec.nextLine().toUpperCase());
        System.out.println("Ingrese su apellido");
        doce.setApellido(tec.nextLine().toUpperCase());
        System.out.println("Ingrese la materia a impartir");
        tec.next();
        doce.setMateria(tec.nextLine().toUpperCase());
        Almacen.getInstance().docente.add(doce);
    }

    private void registroCalificaciones() {
        Calificaciones cal = new Calificaciones();
        mostrarMaterias();
//        System.out.println("Seleccione la materia ha gregar la calificacion:");
//        // cal.setNombreMate(nombreMate);
//        System.out.println("Ingrese su nombre:");
    }

    private void visualizarReportes() {
    }

    private void mostrarMaterias() {
        int i = 0;
        for (Materias mate : Almacen.getInstance().materia) {
            System.out.println((i + 1) +" "+ mate.getNombreMate());
        };
    }

}
