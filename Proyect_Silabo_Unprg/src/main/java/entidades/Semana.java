
package entidades;

public class Semana {
    
    private int numeroSemana;
    private String conocimiento;
    private String actividadAprendizaje;

    public Semana() {
    }

    public Semana(int numeroSemana, String conocimiento, String actividadAprendizaje) {
        this.numeroSemana = numeroSemana;
        this.conocimiento = conocimiento;
        this.actividadAprendizaje = actividadAprendizaje;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public void setNumeroSemana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getActividadAprendizaje() {
        return actividadAprendizaje;
    }

    public void setActividadAprendizaje(String actividadAprendizaje) {
        this.actividadAprendizaje = actividadAprendizaje;
    }
    
    
    
    
}
