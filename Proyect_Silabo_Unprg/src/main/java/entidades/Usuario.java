
package entidades;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "usuario")
public class Usuario {
    
    @JacksonXmlProperty(localName = "nombreUsuario")
    private String nombreUsuario;
    
    @JacksonXmlProperty(localName = "contraseña")
    private String contraseña;
    
    @JacksonXmlProperty(localName = "docente")
    private Docente docente;
    
    
    //justto
    
    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contraseña, Docente docente) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.docente = docente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }



    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    @Override
    public String toString() {
        return "Usuario: " + nombreUsuario + ", Contraseña: " + contraseña + "\n" + docente.toString();
    }
    
}
