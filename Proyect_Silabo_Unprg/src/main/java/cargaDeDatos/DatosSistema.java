package cargaDeDatos;

import entidades.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que encapsula todos los datos del sistema
 */
public class DatosSistema {
    
    private List<Silabo> silabos;
    private List<Facultad> facultades;
    private List<Docente> docentes;
    private List<Usuario> usuarios;

    public DatosSistema() {
        this.silabos = new ArrayList<>();
        this.facultades = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Silabo> getSilabos() {
        return silabos;
    }

    public void setSilabos(List<Silabo> silabos) {
        this.silabos = silabos != null ? silabos : new ArrayList<>();
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades != null ? facultades : new ArrayList<>();
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes != null ? docentes : new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios != null ? usuarios : new ArrayList<>();
    }

    /**
     * Verifica si hay datos cargados en el sistema
     */
    public boolean tieneDatos() {
        return !silabos.isEmpty() || !facultades.isEmpty() || 
               !docentes.isEmpty() || !usuarios.isEmpty();
    }

    /**
     * Obtiene un resumen de los datos cargados
     */
    public String obtenerResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Datos cargados:\n");
        resumen.append("- Sílabos: ").append(silabos.size()).append("\n");
        resumen.append("- Facultades: ").append(facultades.size()).append("\n");
        resumen.append("- Docentes: ").append(docentes.size()).append("\n");
        resumen.append("- Usuarios: ").append(usuarios.size());
        return resumen.toString();
    }
}
