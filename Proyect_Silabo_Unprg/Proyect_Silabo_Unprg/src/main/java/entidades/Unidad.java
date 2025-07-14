
package entidades;

import java.util.List;

public class Unidad {
    private Desempeño desempeño;
    private String nombre;
    private List<HabilidadRequerida> habilidades;

    public Unidad() {
    }

    public Unidad(Desempeño desempeño, String nombre, List<HabilidadRequerida> habilidades) {
        this.desempeño = desempeño;
        this.nombre = nombre;
        this.habilidades = habilidades;
    }
    

    public Desempeño getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(Desempeño desempeño) {
        this.desempeño = desempeño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HabilidadRequerida> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<HabilidadRequerida> habilidades) {
        this.habilidades = habilidades;
    }
    
    
    
    
}
