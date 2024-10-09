import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear objeto estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 123, 3.5);
        Estudiante estudiante2 = new Estudiante("Santi", 456, 4.5);
        Estudiante estudiante3 = new Estudiante("Yecibeth", 789, 4.7);
        Estudiante estudiante4 = new Estudiante("Esteban", 123, 4.7);

        //Crear un objeto escuela
        Escuela escuela = new Escuela();

        escuela.agregarEstudiante(estudiante1);
        escuela.agregarEstudiante(estudiante2);
        escuela.agregarEstudiante(estudiante3);
        escuela.agregarEstudiante(estudiante4);
        System.out.println(escuela.getEstudiantes());


        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
            int opcion;
            System.out.println("Escoge la opción " +
                    "\n1. para agregar un nuevo estudiante " +
                    "\n2. Buscar un estudiante " +
                    "\nsalir. para salir");
            opcion = scanner.next().charAt(0);
            scanner.nextLine();
            switch (opcion) {
                case '1':
                    System.out.println("Escribe el nombre del estudiante: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Escribe el numero de identificacion del estudiante: ");
                    int identificacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Escribe la calificacion del estudiante: ");
                    double calificacion = scanner.nextDouble();
                    scanner.nextLine();
                    Estudiante estudiante = new Estudiante(nombre, identificacion, calificacion);
                    escuela.agregarEstudiante(estudiante);
                    break;

                case '2':
                    System.out.println("Escribe el número de identificación del estudiante: ");
                    int buscarIdentificacion = scanner.nextInt();
                    escuela.buscarEstudiante(buscarIdentificacion);
                    System.out.println(escuela.buscarEstudiante(buscarIdentificacion));
                    break;

                default:
                    salir = true;
            }
        } while (!salir);
    }
}
