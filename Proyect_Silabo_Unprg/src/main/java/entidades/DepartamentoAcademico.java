
package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "departamentoAcademico")
public class DepartamentoAcademico {
    
    @JacksonXmlElementWrapper(localName = "escuelas")
    @JacksonXmlProperty(localName = "escuela")
    private List<Escuela> escuelas;
    
    @JacksonXmlProperty(localName = "nombre")
    private String nombre;
    
    @JacksonXmlProperty(localName = "vigente")
    private boolean vigente;

    public DepartamentoAcademico() {
    }

    public DepartamentoAcademico(List<Escuela> escuelas, String nombre, boolean vigente) {
        this.escuelas = escuelas;
        this.nombre = nombre;
        this.vigente = vigente;
    }

    public List<Escuela> getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(List<Escuela> escuelas) {
        this.escuelas = escuelas;
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
