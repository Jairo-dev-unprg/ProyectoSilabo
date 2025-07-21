
package entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.awt.image.BufferedImage;

@JacksonXmlRootElement(localName = "docente")
public class Docente {
    
    @JacksonXmlProperty(localName = "nombres")
    private String nombres;
    
    @JacksonXmlProperty(localName = "apellidos")
    private String Apellidos;
    
    @JacksonXmlProperty(localName = "gradoAcademico")
    private String gradoAcademico;
    
    @JacksonXmlProperty(localName = "dni")
    private String DNI;
    
    @JsonIgnore // No serializar imagen en XML
    private BufferedImage firma;
    
    @JacksonXmlProperty(localName = "correo")
    private String correo;

    public Docente() {
    }
    
    public Docente(String nombres, String Apellidos, String gradoAcademico, String DNI, String correo, BufferedImage firma) {
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.gradoAcademico = gradoAcademico;
        this.DNI = DNI;
        this.correo = correo;
        this.firma=firma;
    }

    public BufferedImage getFirma() {
        return firma;
    }

    public void setFirma(BufferedImage firma) {
        this.firma = firma;
    }
    
    
    public String getFullName(){
        return Apellidos + ", " + nombres;
    }

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return "Docente: " + nombres + Apellidos + ", DNI: " + DNI + ", Grado: " + gradoAcademico + ", Correo: " + correo;
    }
}
