package cargaDeDatos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import entidades.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Clase para manejar operaciones de carga y guardado de datos en archivos XML
 */
public class ArchivosXML {
    
    private static XmlMapper xmlMapper;
    
    static {
        // Configurar el mapper XML
        xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JavaTimeModule());
        xmlMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
    
    // ==================== MÉTODOS DE GUARDADO ====================
    
    /**
     * Guarda un silabo en un archivo XML
     */
    public static void guardarSilabo(Silabo silabo, String rutaArchivo) throws IOException {
        xmlMapper.writeValue(new File(rutaArchivo), silabo);
    }
    
    /**
     * Guarda una lista de sílabos en un archivo XML
     */
    public static void guardarSilabos(List<Silabo> silabos, String rutaArchivo) throws IOException {
        SilaboWrapper wrapper = new SilaboWrapper();
        wrapper.setSilabos(silabos);
        xmlMapper.writeValue(new File(rutaArchivo), wrapper);
    }
    
    /**
     * Guarda una facultad en un archivo XML
     */
    public static void guardarFacultad(Facultad facultad, String rutaArchivo) throws IOException {
        xmlMapper.writeValue(new File(rutaArchivo), facultad);
    }
    
    /**
     * Guarda una lista de facultades en un archivo XML
     */
    public static void guardarFacultades(List<Facultad> facultades, String rutaArchivo) throws IOException {
        FacultadWrapper wrapper = new FacultadWrapper();
        wrapper.setFacultades(facultades);
        xmlMapper.writeValue(new File(rutaArchivo), wrapper);
    }
    
    /**
     * Guarda una lista de docentes en un archivo XML
     */
    public static void guardarDocentes(List<Docente> docentes, String rutaArchivo) throws IOException {
        DocenteWrapper wrapper = new DocenteWrapper();
        wrapper.setDocentes(docentes);
        xmlMapper.writeValue(new File(rutaArchivo), wrapper);
    }
    
    /**
     * Guarda una lista de usuarios en un archivo XML
     */
    public static void guardarUsuarios(List<Usuario> usuarios, String rutaArchivo) throws IOException {
        UsuarioWrapper wrapper = new UsuarioWrapper();
        wrapper.setUsuarios(usuarios);
        xmlMapper.writeValue(new File(rutaArchivo), wrapper);
    }
    
    /**
     * Guarda todos los datos del sistema en archivos XML separados
     */
    public static void guardarTodosLosDatos(String directorioBase, 
                                          List<Silabo> silabos,
                                          List<Facultad> facultades,
                                          List<Docente> docentes,
                                          List<Usuario> usuarios) throws IOException {
        
        // Crear directorio si no existe
        File dir = new File(directorioBase);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        
        // Guardar cada tipo de dato en su archivo correspondiente
        if (silabos != null && !silabos.isEmpty()) {
            guardarSilabos(silabos, directorioBase + "/silabos.xml");
        }
        
        if (facultades != null && !facultades.isEmpty()) {
            guardarFacultades(facultades, directorioBase + "/facultades.xml");
        }
        
        if (docentes != null && !docentes.isEmpty()) {
            guardarDocentes(docentes, directorioBase + "/docentes.xml");
        }
        
        if (usuarios != null && !usuarios.isEmpty()) {
            guardarUsuarios(usuarios, directorioBase + "/usuarios.xml");
        }
    }
    
    // ==================== MÉTODOS DE CARGA ====================
    
    /**
     * Carga un silabo desde un archivo XML
     */
    public static Silabo cargarSilabo(String rutaArchivo) throws IOException {
        return xmlMapper.readValue(new File(rutaArchivo), Silabo.class);
    }
    
    /**
     * Carga una lista de sílabos desde un archivo XML
     */
    public static List<Silabo> cargarSilabos(String rutaArchivo) throws IOException {
        SilaboWrapper wrapper = xmlMapper.readValue(new File(rutaArchivo), SilaboWrapper.class);
        return wrapper.getSilabos();
    }
    
    /**
     * Carga una facultad desde un archivo XML
     */
    public static Facultad cargarFacultad(String rutaArchivo) throws IOException {
        return xmlMapper.readValue(new File(rutaArchivo), Facultad.class);
    }
    
    /**
     * Carga una lista de facultades desde un archivo XML
     */
    public static List<Facultad> cargarFacultades(String rutaArchivo) throws IOException {
        FacultadWrapper wrapper = xmlMapper.readValue(new File(rutaArchivo), FacultadWrapper.class);
        return wrapper.getFacultades();
    }
    
    /**
     * Carga una lista de docentes desde un archivo XML
     */
    public static List<Docente> cargarDocentes(String rutaArchivo) throws IOException {
        DocenteWrapper wrapper = xmlMapper.readValue(new File(rutaArchivo), DocenteWrapper.class);
        return wrapper.getDocentes();
    }
    
    /**
     * Carga una lista de usuarios desde un archivo XML
     */
    public static List<Usuario> cargarUsuarios(String rutaArchivo) throws IOException {
        UsuarioWrapper wrapper = xmlMapper.readValue(new File(rutaArchivo), UsuarioWrapper.class);
        return wrapper.getUsuarios();
    }
    
    /**
     * Carga todos los datos del sistema desde archivos XML
     */
    public static DatosSistema cargarTodosLosDatos(String directorioBase) throws IOException {
        DatosSistema datos = new DatosSistema();
        
        // Cargar silabos si existe el archivo
        File archivoSilabos = new File(directorioBase + "/silabos.xml");
        if (archivoSilabos.exists()) {
            datos.setSilabos(cargarSilabos(archivoSilabos.getAbsolutePath()));
        }
        
        // Cargar facultades si existe el archivo
        File archivoFacultades = new File(directorioBase + "/facultades.xml");
        if (archivoFacultades.exists()) {
            datos.setFacultades(cargarFacultades(archivoFacultades.getAbsolutePath()));
        }
        
        // Cargar docentes si existe el archivo
        File archivoDocentes = new File(directorioBase + "/docentes.xml");
        if (archivoDocentes.exists()) {
            datos.setDocentes(cargarDocentes(archivoDocentes.getAbsolutePath()));
        }
        
        // Cargar usuarios si existe el archivo
        File archivoUsuarios = new File(directorioBase + "/usuarios.xml");
        if (archivoUsuarios.exists()) {
            datos.setUsuarios(cargarUsuarios(archivoUsuarios.getAbsolutePath()));
        }
        
        return datos;
    }
    
    // ==================== MÉTODOS DE UTILIDAD ====================
    
    /**
     * Verifica si un archivo XML es válido
     */
    public static boolean esArchivoXMLValido(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            if (!archivo.exists() || !archivo.canRead()) {
                return false;
            }
            
            // Intentar parsear el archivo
            xmlMapper.readTree(archivo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    /**
     * Obtiene información básica de un archivo XML
     */
    public static String obtenerInfoArchivo(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            if (!archivo.exists()) {
                return "El archivo no existe";
            }
            
            StringBuilder info = new StringBuilder();
            info.append("Nombre: ").append(archivo.getName()).append("\n");
            info.append("Tamaño: ").append(archivo.length()).append(" bytes\n");
            info.append("Última modificación: ").append(new java.util.Date(archivo.lastModified()));
            
            return info.toString();
        } catch (Exception e) {
            return "Error al obtener información: " + e.getMessage();
        }
    }
}
