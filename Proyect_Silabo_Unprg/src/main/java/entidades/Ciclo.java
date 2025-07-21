
package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

@JacksonXmlRootElement(localName = "ciclo")
public class Ciclo {
    
    @JacksonXmlElementWrapper(localName = "cursos")
    @JacksonXmlProperty(localName = "curso")
    private List<Curso> curos;
    
    @JacksonXmlProperty(localName = "nombre")
    private String Ciclo; 
    
    @JacksonXmlProperty(localName = "vigente")
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
