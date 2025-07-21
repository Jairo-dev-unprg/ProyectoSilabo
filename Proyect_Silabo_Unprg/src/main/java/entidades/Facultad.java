
package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "facultad")
public class Facultad {
    
    @JacksonXmlElementWrapper(localName = "departamentosAcademicos")
    @JacksonXmlProperty(localName = "departamento")
    private List<DepartamentoAcademico> departamentosAcademicos;
    
    @JacksonXmlProperty(localName = "nombre")
    private String nombre; 
    
    @JacksonXmlProperty(localName = "abreviatura")
    private String abreviatura;
    
    @JacksonXmlProperty(localName = "vigente")
    private boolean vigente;

    public Facultad() {
    }

    public Facultad(List<DepartamentoAcademico> departamentosAcademicos, String nombre, String abreviatura, boolean vigente) {
        this.departamentosAcademicos = departamentosAcademicos;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.vigente = vigente;
    }

    public List<DepartamentoAcademico> getDepartamentosAcademicos() {
        return departamentosAcademicos;
    }

    public void setDepartamentosAcademicos(List<DepartamentoAcademico> departamentosAcademicos) {
        this.departamentosAcademicos = departamentosAcademicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
}
