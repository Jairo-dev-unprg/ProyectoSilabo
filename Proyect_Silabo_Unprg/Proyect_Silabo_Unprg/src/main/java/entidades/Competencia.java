package entidades;

import java.util.List;

public class Competencia {

    private String nombre;
    private String Desempeño;
    private List<HabilidadRequerida> habilidadesrequeridas;

    public Competencia() {
    }

    public Competencia(String nombre, String Desempeño, List<HabilidadRequerida> habilidadesrequeridas) {
        this.nombre = nombre;
        this.Desempeño = Desempeño;
        this.habilidadesrequeridas = habilidadesrequeridas;
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

    public List<HabilidadRequerida> getHabilidadesrequeridas() {
        return habilidadesrequeridas;
    }

    public void setHabilidadesrequeridas(List<HabilidadRequerida> habilidadesrequeridas) {
        this.habilidadesrequeridas = habilidadesrequeridas;
    }



}
