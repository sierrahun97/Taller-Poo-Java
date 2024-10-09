import java.util.HashSet;
import java.util.Set;

public class Escuela {

    private Set<Estudiante> listaEstudiantes;

    //Constructor
    public Escuela() {
        this.listaEstudiantes = new HashSet<>();
    }

    //Metodo para agregar listaEstudiantes
    public Set<Estudiante> getEstudiantes() {
        return listaEstudiantes;
    }

    public void setEstudiantes(Set<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {

        for (Estudiante e : listaEstudiantes) {
            if (e.getIdentificacion() == estudiante.getIdentificacion()) {
                System.out.println("Ya existe el estudiante");
            } else {
                listaEstudiantes.add(estudiante);
            }
        }
    }

    public Estudiante buscarEstudiante(int identificacion) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getIdentificacion() == identificacion) {
                return e;
            } else {
                System.out.println("No existe el estudiante");
            }
        }
        return null;
    }

    public Estudiante actualizarEstudiante(int identificacion, String nombre, double calificacion) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getIdentificacion() == identificacion) {
                e.setNombre(nombre);
                e.setCalificacion(calificacion);
            } else {
                System.out.println("No existe el estudiante");
            }
        }
        return null;
    }

    public void eliminarEstudiante(int identificacion) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getIdentificacion() == identificacion) {
                listaEstudiantes.remove(e);
                System.out.println("Estudiante eliminado de la lista");
            }
        }
    }
}