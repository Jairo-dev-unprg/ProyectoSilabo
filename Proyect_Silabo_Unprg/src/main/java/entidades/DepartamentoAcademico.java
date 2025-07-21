
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
    private List<Escuela> Escuelas;
    
    @JacksonXmlProperty(localName = "nombre")
    private String nombre;
    
    @JacksonXmlProperty(localName = "vigente")
    private boolean vigente;

    public DepartamentoAcademico() {
    }

    public DepartamentoAcademico(List<Escuela> Escuelas, String nombre, boolean vigente) {
        this.Escuelas = Escuelas;
        this.nombre = nombre;
        this.vigente = vigente;
    }

    public List<Escuela> getEscuelas() {
        return Escuelas;
    }

    public void setEscuelas(List<Escuela> Escuelas) {
        this.Escuelas = Escuelas;
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
