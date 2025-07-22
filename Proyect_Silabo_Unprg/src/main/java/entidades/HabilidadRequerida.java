package entidades;

import java.util.List;

public class HabilidadRequerida {

    private String habilidad;
    private List<Semana> semanas;
    private EvidenciaAprendizaje evidenciasAprendizaje;

    public HabilidadRequerida() {
    }

    public HabilidadRequerida(String habilidad, List<Semana> semanas, EvidenciaAprendizaje evidenciasAprendizaje) {
        this.habilidad = habilidad;
        this.semanas = semanas;
        this.evidenciasAprendizaje = evidenciasAprendizaje;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
    }

    public EvidenciaAprendizaje getEvidenciasAprendizaje() {
        return evidenciasAprendizaje;
    }

    public void setEvidenciasAprendizaje(EvidenciaAprendizaje evidenciasAprendizaje) {
        this.evidenciasAprendizaje = evidenciasAprendizaje;
    }

}
