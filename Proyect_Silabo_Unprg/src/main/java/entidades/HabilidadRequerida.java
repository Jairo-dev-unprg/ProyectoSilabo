package entidades;

import java.util.List;

public class HabilidadRequerida {

    private String nombreHabilidad;
    private int cantidadSemanas;
    private List<Semana> semanas;

    public HabilidadRequerida() {
    }

    public HabilidadRequerida(String habilidad, int cantidadSemanas, List<Semana> semanas) {
        this.nombreHabilidad = habilidad;
        this.cantidadSemanas = cantidadSemanas;
        this.semanas = semanas;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String habilidad) {
        this.nombreHabilidad = habilidad;
    }

    public int getCantidadSemanas() {
        return cantidadSemanas;
    }

    public void setCantidadSemanas(int cantidadSemanas) {
        this.cantidadSemanas = cantidadSemanas;
    }

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
    }

}
