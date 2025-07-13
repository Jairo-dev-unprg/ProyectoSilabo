package entidades;

import java.util.List;

public class HabilidadRequerida {

    private String nombre;
    private List<Conocimiento> conocimientos;
    private List<EvidenciaAprendizaje> evidenciasAprendizaje;

    public HabilidadRequerida() {
    }

    public HabilidadRequerida(String nombre, List<Conocimiento> conocimientos, List<EvidenciaAprendizaje> evidenciasAprendizaje) {
        this.nombre = nombre;
        this.conocimientos = conocimientos;
        this.evidenciasAprendizaje = evidenciasAprendizaje;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Conocimiento> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(List<Conocimiento> conocimientos) {
        this.conocimientos = conocimientos;
    }

    public List<EvidenciaAprendizaje> getEvidenciasAprendizaje() {
        return evidenciasAprendizaje;
    }

    public void setEvidenciasAprendizaje(List<EvidenciaAprendizaje> evidenciasAprendizaje) {
        this.evidenciasAprendizaje = evidenciasAprendizaje;
    }
    
}
