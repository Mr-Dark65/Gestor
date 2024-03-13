package Principal;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Gestor_Datos {   
public class Estudiante {
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String direccion;

    public Estudiante(String nombres, String apellidos, String telefono, String correo, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    public void modificarInformacion(String nombres, String apellidos, String telefono, String correo, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

    public static void modificarEstudiante(Estudiante estudiante) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los nuevos nombres del estudiante:");
        String nombres = scanner.nextLine();

        System.out.println("Ingrese los nuevos apellidos del estudiante:");
        String apellidos = scanner.nextLine();

        System.out.println("Ingrese el nuevo teléfono del estudiante:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese el nuevo correo del estudiante:");
        String correo = scanner.nextLine();

        System.out.println("Ingrese la nueva dirección del estudiante:");
        String direccion = scanner.nextLine();

        estudiante.modificarInformacion(nombres, apellidos, telefono, correo, direccion);

        System.out.println("La información del estudiante ha sido modificada exitosamente.");
    }
        public static void eliminarEstudiante(List<Estudiante> listaEstudiantes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el estudiante que desea eliminar:");
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante estudiante = listaEstudiantes.get(i);
            System.out.println((i + 1) + ". " + estudiante.getNombres() + " " + estudiante.getApellidos());
        }
        System.out.println("Ingrese el número correspondiente al estudiante que desea eliminar:");
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= listaEstudiantes.size()) {
            listaEstudiantes.remove(opcion - 1);
            System.out.println("El estudiante ha sido eliminado correctamente.");
        } else {
            System.out.println("Opción inválida. No se ha realizado ninguna eliminación.");
        }
    }
       public static void modificarNombreApellido(List<Estudiante> estudiantes, List<Docente> docentes) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar lista de estudiantes y docentes
        System.out.println("Lista de Estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i).getNombres() + " " + estudiantes.get(i).getApellidos());
        }

        System.out.println("\nLista de Docentes:");
        for (int i = 0; i < docentes.size(); i++) {
            System.out.println((i + 1) + ". " + docentes.get(i).getNombres() + " " + docentes.get(i).getApellidos());
        }

        // Pedir al usuario que elija un estudiante o docente por su índice
        System.out.println("\nIngrese el número de la persona que desea modificar:");
        int indice = scanner.nextInt();

        // Comprobar si el índice está en el rango válido
        if (indice > 0 && indice <= estudiantes.size()) {
            Estudiante estudianteSeleccionado = estudiantes.get(indice - 1);
            modificarNombreApellido(estudianteSeleccionado);
        } else if (indice > estudiantes.size() && indice <= estudiantes.size() + docentes.size()) {
            Docente docenteSeleccionado = docentes.get(indice - estudiantes.size() - 1);
            modificarNombreApellido(docenteSeleccionado);
        } else {
            System.out.println("El número ingresado no es válido.");
        }
    }

    private static void modificarNombreApellido(Persona persona) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nuevo nombre:");
        String nuevoNombre = scanner.nextLine();

        System.out.println("Ingrese el nuevo apellido:");
        String nuevoApellido = scanner.nextLine();

        persona.setNombres(nuevoNombre);
        persona.setApellidos(nuevoApellido);

        System.out.println("El nombre y apellido han sido modificados exitosamente.");
    }
    }
    


             
             
    

