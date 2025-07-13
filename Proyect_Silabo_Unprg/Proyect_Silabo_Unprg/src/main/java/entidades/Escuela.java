
package entidades;

import java.util.ArrayList;
import java.util.List;


public class Escuela {
    private List<Curso> cursos;
    private String nombre;
    private boolean vigente;

    public Escuela() {
    }

    public Escuela(List<Curso> cursos, String nombre, boolean vigete) {
        this.cursos = cursos;
        this.nombre = nombre;
        this.vigente = vigete;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigete() {
        return vigente;
    }

    public void setVigete(boolean vigete) {
        this.vigente = vigete;
    }

 
    
}
