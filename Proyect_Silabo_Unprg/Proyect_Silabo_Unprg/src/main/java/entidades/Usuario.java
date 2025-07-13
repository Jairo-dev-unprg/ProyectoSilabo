
package entidades;


public class Usuario {
    
    private String usario;
    private String contraseña;
    private Docente docente;

    public Usuario() {
    }

    public Usuario(String usario, String contraseña, Docente docente) {
        this.usario = usario;
        this.contraseña = contraseña;
        this.docente = docente;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
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
        return "Usuario: " + usario + ", Contraseña: " + contraseña + "\n" + docente.toString();
    }
    
}
