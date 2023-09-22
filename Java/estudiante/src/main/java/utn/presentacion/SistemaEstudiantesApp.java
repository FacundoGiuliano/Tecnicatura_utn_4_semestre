package utn.presentacion;

import java.util.Scanner;

import utn.datos.EstudianteDAO;
import utn.dominio.Estudiante;

public class SistemaEstudiantesApp {
    public static void main( String[] args ){
        var salir = false;
        var consola = new Scanner(System.in);
        var estudianteDAO = new EstudianteDAO();
        while(!salir){
            try {
                mostrarMenu(); // Este sera el metodo que dolvera un booleano
                salir = ejecutarOpciones(consola, estudianteDAO);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Ocurrio un error al ejecutar la operacion: "+e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                *****Sistema de estudiantes*****
                1. Listar estudiantes
                2. Buscar estudiantes
                3. Agregar estudiante
                4. Modificar estudiante
                5. Eliminar estudiante
                6. Salir
                ELige una opcion:
                """);
    }

    // Regresa un valor booleano  ya que es el que puede mofidicar la variable salir
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch(opcion){ 
            case 1 -> {
                System.out.println("Listado de estudiantes...");
                // no muestra la informacion, solo recupera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes(); // recibe el listado
                // iteramos cada objet ode tipo estudiante
                estudiantes.forEach(System.out::println); //para imprimir la lista
            }

            case 2 -> {
                System.out.println("Introduce el id del estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if(encontrado)
                    System.out.println("El estudiante ha sido encontrado: "+estudiante);
                else
                    System.out.println("Estudiante no encontrado.");
            }

            case 3 -> {
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                // Crear el onjeto estudiante sin id
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if(agregado)
                    System.out.println("EL estudiante fue agregado: "+estudiante);
                else
                    System.out.println("EL estudiante no fue agregado.");
            }

            case 4 -> {
                System.out.println("Modificar estudiante: ");
                System.out.println("ID estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                // crear el objeto estudiante a modificar
                var estudiante = 
                        new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if(modificado)
                    System.out.println("Estudiante modificado: "+estudiante);
                else
                    System.out.println("El estudiante no fue modificado.");
            }
            case 5 -> {
                System.out.println("Eliminar estudiante: ");
                System.out.println("ID estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if(eliminado)
                    System.out.println("Estudiante eliminado: "+estudiante);
                else
                    System.out.println("El estudiante no fue eliminado.");
            }
            case 6 -> {
                System.out.println("Hasta pronto !");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida");
        }
        return salir;
    }

}