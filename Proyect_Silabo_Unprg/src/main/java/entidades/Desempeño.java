package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

@JacksonXmlRootElement(localName = "desempeño")
public class Desempeño {

    @JacksonXmlProperty(localName = "nombre")
    private String nombre;
    
    @JacksonXmlProperty(localName = "descripcion")
    private String Desempeño;
    
    @JacksonXmlProperty(localName = "unidad")
    private Unidad unidad;

    public Desempeño() {
    }

    public Desempeño(String nombre, String Desempeño, Unidad unidad) {
        this.nombre = nombre;
        this.Desempeño = Desempeño;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesempeño() {
        return Desempeño;
    }

    public void setDesempeño(String Desempeño) {
        this.Desempeño = Desempeño;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

}
