package entidades;

import java.util.List;


public class Curso {
    
    private String nombre;
    private String tipo;
    private String codigoCurso;
    private String prerrequisitos;
    private int cicloEstudio;
    private int creditos;
    private int HorasTeoricaSemanales;
    private int HorasPracticasSemanales;
    private String sumilla;
    private String competenciaProfesional;
    private String capacidadDelCurso;
    private List<Competencia>competencias;
    private boolean vigente;

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Curso() {
    }

    public Curso(String nombre, String tipo, String codigoCurso, String prerrequisitos, int cicloEstudio, int creditos, int HorasTeoricaSemanales, int HorasPracticasSemanales, String sumilla,String competenciaProfesional,String capacidaddelCurso, List<Competencia> competencias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoCurso = codigoCurso;
        this.prerrequisitos = prerrequisitos;
        this.cicloEstudio = cicloEstudio;
        this.creditos = creditos;
        this.HorasTeoricaSemanales = HorasTeoricaSemanales;
        this.HorasPracticasSemanales = HorasPracticasSemanales;
        this.sumilla = sumilla;
        this.capacidadDelCurso = capacidaddelCurso;
        this.competenciaProfesional = competenciaProfesional;
        this.competencias = competencias;
        this.vigente=true;
    }

    public String getCapacidadDelCurso() {
        return capacidadDelCurso;
    }

    public void setCapacidadDelCurso(String capacidadDelCurso) {
        this.capacidadDelCurso = capacidadDelCurso;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(String prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public int getCicloEstudio() {
        return cicloEstudio;
    }

    public void setCicloEstudio(int cicloEstudio) {
        this.cicloEstudio = cicloEstudio;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHorasTeoricaSemanales() {
        return HorasTeoricaSemanales;
    }

    public void setHorasTeoricaSemanales(int HorasTeoricaSemanales) {
        this.HorasTeoricaSemanales = HorasTeoricaSemanales;
    }

    public int getHorasPracticasSemanales() {
        return HorasPracticasSemanales;
    }

    public void setHorasPracticasSemanales(int HorasPracticasSemanales) {
        this.HorasPracticasSemanales = HorasPracticasSemanales;
    }

    public String getSumilla() {
        return sumilla;
    }

    public void setSumilla(String sumilla) {
        this.sumilla = sumilla;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    public String getCompetenciaProfesional() {
        return competenciaProfesional;
    }

    public void setCompetenciaProfesional(String competenciaProfesional) {
        this.competenciaProfesional = competenciaProfesional;
    }
    
    

}