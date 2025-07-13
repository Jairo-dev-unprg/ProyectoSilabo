
package entidades;


public class Usuario {
    
    private String nombreUsuario;
    private String contraseña;
    private Docente docente;

    
    //justto
    
    public Usuario() {
    }

    public Usuario(String usario, String contraseña, Docente docente) {
        this.nombreUsuario = usario;
        this.contraseña = contraseña;
        this.docente = docente;
    }

    public String getUsario() {
        return nombreUsuario;
    }

    public void setUsario(String usario) {
        this.nombreUsuario = usario;
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
