package entidades;

class EvidenciaAprendizaje {
    
    private String nombre;
    private String tipoEvidencia;
    private String instrumentoEvaluacion;

    public EvidenciaAprendizaje() {
    }

    public EvidenciaAprendizaje(String nombre, String tipoEvidencia, String instrumentoEvaluacion) {
        this.nombre = nombre;
        this.tipoEvidencia = tipoEvidencia;
        this.instrumentoEvaluacion = instrumentoEvaluacion;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEvidencia() {
        return tipoEvidencia;
    }

    public void setTipoEvidencia(String tipoEvidencia) {
        this.tipoEvidencia = tipoEvidencia;
    }

    public String getInstrumentoEvaluacion() {
        return instrumentoEvaluacion;
    }

    public void setInstrumentoEvaluacion(String instrumentoEvaluacion) {
        this.instrumentoEvaluacion = instrumentoEvaluacion;
    }
    
    
}
