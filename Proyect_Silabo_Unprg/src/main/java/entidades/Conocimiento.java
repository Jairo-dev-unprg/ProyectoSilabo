package entidades;

public class Conocimiento {

    private String nombre;
    private String ActividadAprendizaje;

    public Conocimiento() {
    }

    public Conocimiento(String nombre, String ActividadAprendizaje) {
        this.nombre = nombre;
        this.ActividadAprendizaje = ActividadAprendizaje;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividadAprendizaje() {
        return ActividadAprendizaje;
    }

    public void setActividadAprendizaje(String ActividadAprendizaje) {
        this.ActividadAprendizaje = ActividadAprendizaje;
    }

    
}
