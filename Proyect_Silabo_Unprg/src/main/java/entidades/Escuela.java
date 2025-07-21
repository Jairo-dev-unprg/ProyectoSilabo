
package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "escuela")
public class Escuela {
    
    @JacksonXmlElementWrapper(localName = "ciclos")
    @JacksonXmlProperty(localName = "ciclo")
    private List<Ciclo> ciclo;
    
    @JacksonXmlProperty(localName = "nombre")
    private String nombre;
    
    @JacksonXmlProperty(localName = "vigente")
    private boolean vigente;

    public Escuela() {
    }

    public Escuela(List<Ciclo> ciclo, String nombre, boolean vigente) {
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.vigente = vigente;
    }

    public List<Ciclo> getCiclo() {
        return ciclo;
    }

    public void setCiclo(List<Ciclo> ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }


    
}
