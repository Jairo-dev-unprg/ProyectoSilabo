package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

@JacksonXmlRootElement(localName = "unidad")
public class Unidad {
    
    @JacksonXmlProperty(localName = "nombre")
    private String nombre;
    
    @JacksonXmlProperty(localName = "desempeño")
    private String desempeño;
    
    @JacksonXmlProperty(localName = "habilidadesRequeridas")
    private String habilidadesRequeridas;
    
    @JacksonXmlProperty(localName = "semanas")
    private String semanas;
    
    @JacksonXmlProperty(localName = "conocimientos")
    private String conocimientos;
    
    @JacksonXmlProperty(localName = "actividades")
    private String actividades;
    
    @JacksonXmlProperty(localName = "evidenciaAprendizaje")
    private String evidenciaAprendizaje;

    public Unidad() {
    }

public Unidad(String nombre, String desempeño, String habilidadesRequeridas, String semanas,
                  String conocimientos, String actividades, String evidenciaAprendizaje) {
        this.nombre = nombre;
        this.desempeño = desempeño;
        this.habilidadesRequeridas = habilidadesRequeridas;
        this.semanas = semanas;
        this.conocimientos = conocimientos;
        this.actividades = actividades;
        this.evidenciaAprendizaje = evidenciaAprendizaje;
    }

    public String getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(String desempeño) {
        this.desempeño = desempeño;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setHabilidadesRequeridas(String habilidadesRequeridas) {
        this.habilidadesRequeridas = habilidadesRequeridas;
    }

    public String getSemanas() {
        return semanas;
    }

    public void setSemanas(String semanas) {
        this.semanas = semanas;
    }

    public String getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String conocimientos) {
        this.conocimientos = conocimientos;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getEvidenciaAprendizaje() {
        return evidenciaAprendizaje;
    }

    public void setEvidenciaAprendizaje(String evidenciaAprendizaje) {
        this.evidenciaAprendizaje = evidenciaAprendizaje;
    }

    

}
