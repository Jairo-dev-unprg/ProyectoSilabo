package cargaDeDatos;

import entidades.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase de ejemplo para demostrar el uso del sistema de carga y guardado XML
 */
public class EjemploUsoXML {
    
    public static void main(String[] args) {
        ejemploBasico();
    }
    
    public static void ejemploBasico() {
        System.out.println("=== Ejemplo de uso del sistema XML ===\n");
        
        try {
            // 1. Crear datos de ejemplo
            System.out.println("1. Creando datos de ejemplo...");
            
            // Crear docente
            Docente docente = new Docente();
            docente.setNombres("Juan Carlos");
            docente.setApellidos("García López");
            docente.setGradoAcademico("Doctor");
            docente.setDNI("12345678");
            docente.setCorreo("jgarcia@unprg.edu.pe");
            
            // Crear curso
            Curso curso = new Curso();
            curso.setNombre("Programación Orientada a Objetos");
            curso.setTipo("Obligatorio");
            curso.setCodigoCurso("CS001");
            curso.setPrerrequisitos("Programación I");
            curso.setCicloEstudio(3);
            curso.setCreditos(4);
            curso.setHorasTeoricaSemanales(3);
            curso.setHorasPracticasSemanales(2);
            curso.setSumilla("Curso de programación orientada a objetos...");
            curso.setCompetenciaProfesional("Desarrolla software usando POO");
            curso.setCapacidadDelCurso("Capacidad de análisis y diseño");
            curso.setVigente(true);
            
            // Crear facultad
            Facultad facultad = new Facultad();
            facultad.setNombre("Facultad de Ingeniería");
            facultad.setAbreviatura("FI");
            facultad.setVigente(true);
            facultad.setDepartamentosAcademicos(new ArrayList<>());
            
            // Crear departamento
            DepartamentoAcademico departamento = new DepartamentoAcademico();
            departamento.setNombre("Computación e Informática");
            departamento.setVigente(true);
            departamento.setEscuelas(new ArrayList<>());
            
            // Crear escuela
            Escuela escuela = new Escuela();
            escuela.setNombre("Ingeniería de Sistemas");
            escuela.setVigente(true);
            escuela.setCiclo(new ArrayList<>());
            
            // Crear sílabo
            Silabo silabo = new Silabo();
            silabo.setFacultad(facultad);
            silabo.setDepartamento(departamento);
            silabo.setEscuela(escuela);
            silabo.setCurso(curso);
            silabo.setDocente(docente);
            silabo.setSemanas("16 semanas");
            silabo.setFechaInicio(new Date());
            silabo.setFechaFin(new Date());
            silabo.setMetodologiaEnseñanza("Metodología activa");
            silabo.setActividadesAuditorias("Actividades prácticas");
            silabo.setFuentesReferenciales("Libros y artículos");
            
            // 2. Guardar datos en XML
            System.out.println("2. Guardando datos en XML...");
            
            // Guardar sílabo individual
            String rutaSilabo = System.getProperty("user.home") + "/ProyectoSilabo/ejemplo_silabo.xml";
            ArchivosXML.guardarSilabo(silabo, rutaSilabo);
            System.out.println("   Sílabo guardado en: " + rutaSilabo);
            
            // Guardar docente
            List<Docente> docentes = new ArrayList<>();
            docentes.add(docente);
            String rutaDocentes = System.getProperty("user.home") + "/ProyectoSilabo/ejemplo_docentes.xml";
            ArchivosXML.guardarDocentes(docentes, rutaDocentes);
            System.out.println("   Docentes guardados en: " + rutaDocentes);
            
            // 3. Cargar datos desde XML
            System.out.println("\n3. Cargando datos desde XML...");
            
            // Cargar sílabo
            Silabo silaboRecuperado = ArchivosXML.cargarSilabo(rutaSilabo);
            System.out.println("   Sílabo cargado:");
            System.out.println("   - Curso: " + silaboRecuperado.getCurso().getNombre());
            System.out.println("   - Docente: " + silaboRecuperado.getDocente().getFullName());
            System.out.println("   - Facultad: " + silaboRecuperado.getFacultad().getNombre());
            
            // Cargar docentes
            List<Docente> docentesRecuperados = ArchivosXML.cargarDocentes(rutaDocentes);
            System.out.println("   Docentes cargados: " + docentesRecuperados.size());
            
            // 4. Verificar archivos
            System.out.println("\n4. Verificando archivos XML...");
            boolean esValido = ArchivosXML.esArchivoXMLValido(rutaSilabo);
            System.out.println("   Archivo sílabo válido: " + esValido);
            
            String info = ArchivosXML.obtenerInfoArchivo(rutaSilabo);
            System.out.println("   Información del archivo:");
            System.out.println("   " + info.replace("\n", "\n   "));
            
            System.out.println("\n=== Ejemplo completado exitosamente ===");
            
        } catch (Exception e) {
            System.err.println("Error en el ejemplo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Ejemplo de uso con datos del sistema principal
     */
//    public static void ejemploConDatosSistema() {
//        try {
//            System.out.println("=== Ejemplo con datos del sistema ===\n");
//            
//            // Cargar datos desde el sistema principal
//            com.mycompany.proyect_silabo_unprg.Proyect_Silabo_Unprg.cargarDatos();
//            
//            // Guardar todos los datos
//            com.mycompany.proyect_silabo_unprg.Proyect_Silabo_Unprg.guardarDatosEnXML();
//            
//            // Cargar todos los datos
//            String directorio = System.getProperty("user.home") + "/ProyectoSilabo/datos";
//            DatosSistema datos = ArchivosXML.cargarTodosLosDatos(directorio);
//            
//            System.out.println("Datos cargados del sistema:");
//            System.out.println(datos.obtenerResumen());
//            
//        } catch (Exception e) {
//            System.err.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
