package cargaDeDatos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import entidades.Silabo;
import java.util.List;

@JacksonXmlRootElement(localName = "silabos")
public class SilaboWrapper {
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "silabo")
    private List<Silabo> silabos;

    public SilaboWrapper() {
    }

    public List<Silabo> getSilabos() {
        return silabos;
    }

    public void setSilabos(List<Silabo> silabos) {
        this.silabos = silabos;
    }
}
