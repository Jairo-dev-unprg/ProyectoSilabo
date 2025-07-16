
package entidades;

import java.util.List;


public class Ciclo {
    private List<Curso> curos;
    private String Ciclo; 
    private boolean vigente;

    public Ciclo() {
    }

    public Ciclo(List<Curso> curos, String Ciclo, boolean vigente) {
        this.curos = curos;
        this.Ciclo = Ciclo;
        this.vigente = vigente;
    }

    public List<Curso> getCuros() {
        return curos;
    }

    public void setCuros(List<Curso> curos) {
        this.curos = curos;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    
}
