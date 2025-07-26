package entidades;

import java.util.List;

public class HabilidadRequerida {

    private String habilidad;
    private List<Semana> semanas;
    

    public HabilidadRequerida() {
    }

    public HabilidadRequerida(String habilidad, List<Semana> semanas) {
        this.habilidad = habilidad;
        this.semanas = semanas;
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



}
