package entidades;

import java.util.List;

public class HabilidadRequerida {

    private String habilidad;
    private List<Conocimiento> conocimientos;
    private EvidenciaAprendizaje evidenciasAprendizaje;

    public HabilidadRequerida() {
    }

    public HabilidadRequerida(String habilidad, List<Conocimiento> conocimientos, EvidenciaAprendizaje evidenciasAprendizaje) {
        this.habilidad = habilidad;
        this.conocimientos = conocimientos;
        this.evidenciasAprendizaje = evidenciasAprendizaje;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public List<Conocimiento> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(List<Conocimiento> conocimientos) {
        this.conocimientos = conocimientos;
    }

    public EvidenciaAprendizaje getEvidenciasAprendizaje() {
        return evidenciasAprendizaje;
    }

    public void setEvidenciasAprendizaje(EvidenciaAprendizaje evidenciasAprendizaje) {
        this.evidenciasAprendizaje = evidenciasAprendizaje;
    }

    
}
