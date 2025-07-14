package com.mycompany.proyect_silabo_unprg;

import GUI.JFLogeo;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import entidades.Ciclo;
import entidades.Desempeño;
import entidades.Curso;
import entidades.DepartamentoAcademico;
import entidades.Docente;
import entidades.Escuela;
import entidades.Facultad;
import entidades.Silabo;
import entidades.Unidad;
import entidades.Usuario;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

//RECARGA PA KEVIN 

public class Proyect_Silabo_Unprg {

    private static void cargarCompetenciaGenerales() {
        competenciaProfesionalGenerales[0] = "Fortalece su desarrollo personal y cultural basado en la reflexión,autoestima, creatividad e Identidad nacional y con la UNPRG.";
        competenciaProfesionalGenerales[1] = "Propone soluciones a situaciones de su contexto, sobre la base de ciudadanía, democracia y desarrollo";
        competenciaProfesionalGenerales[2] = "Resuelve problemas en situaciones de contexto real, sobre la base del razonamiento lógico matemático";
        competenciaProfesionalGenerales[3] = "Gestiona proyectos académicos, teniendo en cuenta demandas, directivas y uso de herramientas tecnológicas.";
        competenciaProfesionalGenerales[4] = "Comunica de manera oral y escrita sus ideas a través de diversos textos con diferentes propósitos, teniendo en cuenta formatos, normativa, interlocutores y el contexto.";
        competenciaProfesionalGenerales[5] = "Evalúa situaciones problemas y razonamientos usando principios elementales de la filosofía práctica y del pensamiento    crítico, asumiendo una postura ética que permita solución de problemas y toma de decisiones.";
    }

    private static void cargarCompetenciaEspecifica() {
        // COMPETENCIA PROFESIONAL
        
        competenciaProfesionalEspecifica[0] = "Gestiona bases de datos de acuerdo a las estrategias y continuidad operativa organizacional, considerando los estándares y buenas prácticas de ingeniería del software.";
        competenciaProfesionalEspecifica[1] = "Construye software multiplataforma que genere valor al negocio y satisfagan las necesidades de las organizaciones y sociedad en general, aplicando procesos de desarrollo.";
        competenciaProfesionalEspecifica[2] = "Desarrolla aplicaciones de inteligencia artificial que simulan las destrezas, razonamiento y el comportamiento humano, basados en metodologías, estándares vigentes y principios éticos.";
        competenciaProfesionalEspecifica[3] = "Implementa soluciones de redes y comunicaciones de datos en las organizaciones, garantizando la conectividad, teniendo en cuenta aspectos de seguridad, gestión y cumplimiento de las normativas internacionales.";
        competenciaProfesionalEspecifica[4] = "Desarrolla estrategias basadas en las tecnologías de la información, alineadas a las necesidades y en concordancia con la gestión integral de los recursos organizacionales, aplicando estándares internacionales y buenas prácticas.";
        competenciaProfesionalEspecifica[5] = "Desarrolla capacidades investigativas en proyectos tecnológicos computacionales, que satisfagan las necesidades de la sociedad, aplicando el método científico y los lineamientos establecidos por la Universidad.";
    }

    private static void capacidadCurso() {
         //CAPACIDADES PROFESIONALES
        capacidadCursoEpici[0] = "Examina el funcionamiento de los diversos módulos de un sistema operativo, teniendo en cuenta la administración de los recursos de un sistema computacional.";
        capacidadCursoEpici[1] = "Implementa sistemas analógicos, teniendo en cuenta los fundamentos de la electrónica.";

    }

    private static String[] competenciaProfesionalGenerales = new String[6];
    private static String[] competenciaProfesionalEspecifica = new String[6];
    private static String[] competenciaprofesionalMedicina = new String[6];
    private static String[] SumillasEpici = new String[2];
    private static String[] SumillasMedicina = new String[2];

    private static String[] capacidadCursoEpici = new String[2];
    private static String[] capacidadCursoMedicina = new String[2];

    public static List<Silabo> silabos = new ArrayList<>();

    public static List<Facultad> facultad = new ArrayList<>();

    public static List<DepartamentoAcademico> dpFAG = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFCCBB = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFACEAC = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFACFYM = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFACHSE = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFDCCPP = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFE = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFIA = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFICSA = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFIME = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFMH = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFMV = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFIQIA = new ArrayList<>();
    public static List<DepartamentoAcademico> dpFIZ = new ArrayList<>();

    public static List<Escuela> escuelasEpici = new ArrayList<>();
    public static List<Escuela> escuelasElectronica = new ArrayList<>();
    public static List<Escuela> escuelaMedicina = new ArrayList<>();

    public static List<Ciclo> ciclos4Epici = new ArrayList<>();
    public static List<Ciclo> ciclos4Electronica = new ArrayList<>();
    public static List<Ciclo> ciclos4Medicina = new ArrayList<>();

    public static List<Curso> cursoEpici = new ArrayList<>();
    public static List<Curso> cursosElectronica = new ArrayList<>();
    public static List<Curso> cursoMediciona = new ArrayList<>();

    public static List<Desempeño> desempeñosFDSO = new ArrayList<>();
    public static List<Desempeño> desempeñosEA = new ArrayList<>();
    public static List<Desempeño> desempeñosMPM = new ArrayList<>();
    public static List<Desempeño> desempeñosPF = new ArrayList<>();

    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Docente> docentes = new ArrayList<>();

    public static void main(String[] args) {
        FlatMonokaiProIJTheme.setup();
        JFLogeo logeo = new JFLogeo();
    }

    public static void cargarDatos() {
        datosDocente();
        datosUsuario();
        datosFacultades();
        datosDepatamentoAcademico();
        datosEscuela();
        datosCiclo();
        cargarSumilla();
        cargaCompetencia();
        capacidadCurso();
        cargarDesepeños();
        datosCurso();

    }

    private static void datosUsuario() {
        usuarios.add(new Usuario("jairo", "123", docentes.get(0)));
        usuarios.add(new Usuario("pedro", "123", docentes.get(1)));
    }


    private static void datosDocente() {
    BufferedImage firmaJairo = null;
    BufferedImage firmaPedro = null;

    try {
        firmaJairo = ImageIO.read(Docente.class.getResourceAsStream("/firma_jairo.jpg"));
        firmaPedro = ImageIO.read(Docente.class.getResourceAsStream("/firma_pedro.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }

    docentes.add(new Docente("Jairo Kariny", "Aranda Gomez", "Ingeniero", "60775041", "jaranda@unprg.edu.pe", firmaJairo));
    docentes.add(new Docente("Pedro Jose", "Perez Gomez", "Doctor", "60775042", "pejomez@unprg.edu.pe", firmaPedro));
}
    
    
    private static void datosFacultades() {
        facultad.add(new Facultad(dpFAG, "Facultad de Agronomía", "FAG", true));
        facultad.add(new Facultad(dpFCCBB, "Facultad de Ciencias Biológicas", "FCCBB", true));
        facultad.add(new Facultad(dpFACEAC, "Facultad de Ciencias Económicas, Administrativas y Contables", "FACEAC", true));
        facultad.add(new Facultad(dpFACFYM, "Facultad de Ciencias Físicas y Matemáticas", "FACFYM", true));
        facultad.add(new Facultad(dpFACHSE, "Facultad de Ciencias Histórico Sociales y Educación", "FACHSE", true));
        facultad.add(new Facultad(dpFDCCPP, "Facultad de Derecho y Ciencias Políticas", "FDCCPP", true));
        facultad.add(new Facultad(dpFE, "Facultad de Enfermería", "FE", true));
        facultad.add(new Facultad(dpFIA, "Facultad de Ingeniería Agrícola", "FIA", true));
        facultad.add(new Facultad(dpFICSA, "Facultad de Ingeniería Civil, de Sistemas y de Arquitectura", "FICSA", true));
        facultad.add(new Facultad(dpFIME, "Facultad de Ingeniería Mecánica y Eléctrica", "FIME", true));
        facultad.add(new Facultad(dpFMH, "Facultad de Medicina Humana", "FMH", true));
        facultad.add(new Facultad(dpFMV, "Facultad de Medicina Veterinaria", "FMV", true));
        facultad.add(new Facultad(dpFIQIA, "Facultad de Ingeniería Química e Industrias Alimentarias", "FIQIA", true));
        facultad.add(new Facultad(dpFIZ, "Facultad de Zootecnia", "FIZ", true));
    }

    private static void datosDepatamentoAcademico() {
        dpFACFYM.add(new DepartamentoAcademico(escuelasEpici, "Computacion y electronica", true));
        dpFMH.add(new DepartamentoAcademico(escuelaMedicina, "Docente", true));
    }

    private static void datosEscuela() {
        escuelasEpici.add(new Escuela(ciclos4Epici, "Computación e informática", true));
        escuelasElectronica.add(new Escuela(ciclos4Electronica, "Electronica", true));

        escuelaMedicina.add(new Escuela(ciclos4Medicina, "Escuela de medicina", true));
    }

    private static void datosCiclo() {
        ciclos4Epici.add(new Ciclo(cursoEpici, "IV", true));
        ciclos4Medicina.add(new Ciclo(cursoMediciona, "IV", true));
    }

    private static void datosCurso() {

        cursoEpici.add(new Curso("Fundamentos de Sistemas Operativos", "Específico", "CYEE1022", "Lógica Matemática", 4, 4, 3, 2, SumillasEpici[0], competenciaProfesionalEspecifica[3], capacidadCursoEpici[0], desempeñosFDSO));
        cursoEpici.add(new Curso("Electrónica Analógica", "Específico", "CYEE1021", "Fundamentos de física,Lógica Matemática", 4, 5, 2, 4, SumillasEpici[1],  competenciaProfesionalEspecifica[2],capacidadCursoEpici[1], desempeñosEA));
        cursoMediciona.add(new Curso("Microbiología y Parasitología Médica", "Obligatorio", "CBAE1016", "Biología Celular, Histología, Bioquímica", 4, 5, 2, 6, SumillasEpici[1],competenciaprofesionalMedicina[0] , capacidadCursoEpici[0], desempeñosMPM));
        cursoMediciona.add(new Curso("Pensamiento Filosófico", "Estudios generales.", "HUMG1032", "No Aplica", 4, 2, 1, 2, SumillasEpici[1], competenciaprofesionalMedicina[1] ,capacidadCursoEpici[1], desempeñosPF));

    }

    private static void cargarSumilla() {
        SumillasEpici[0] = "\"La asignatura “Fundamentos de Sistemas Operativos” tiene como resultado de aprendizaje el desarrollo dela capacidad “Examina el funcionamiento de los diversos módulos de un sistema operativo teniendo en cuenta la administración de los recursos de un sistema computacional” que contribuye al desarrollo de la competencia específica “Implementa soluciones de redes y comunicaciones de datos en las organizaciones garantizando la conectividad, teniendo en cuenta aspectos de seguridad, gestión y cumplimiento de las normativas internacionales”, del perfil de egreso. Es una asignatura de naturaleza teórico-práctico, enmarcada en el enfoque por competencia que posibilita una metodología activa en un entorno real de enseñanza aprendizaje situando al estudiante como protagonista de su aprendizaje y al docente como facilitador del proceso formativo. Propone actividades como: presentación de propósito de la sesión, recojo de saberes previos a través de preguntas, revisión documentación digital, planteamiento y resolución de casos, presentación de productos, trabajos individuales y/o en equipos; que posibiliten el conocimiento sobre: Introducción a los sistemas operativos, Estructura de los sistemas operativos, Manejo de Interrupciones, Algoritmos de Administración del procesador, Controladores de tráfico, Planificación de procesos; igualmente, algoritmos de administración de la memoria física, particionamiento estático, particionamiento dinámico, particionamiento dinámico reubicable, paginación, administración de memoria virtual, paginación bajo solicitud, segmentación, algoritmos de administración de los dispositivos de entrada y salida, algoritmos de administración de la información, file system. Así mismo, las habilidades relacionadas con: descripción de las estructuras de los sistemas operativos y su funcionamiento, identificación del manejo de las interrupciones, comprobación de los algoritmos de administración del procesador, determinación de los controladores de tráfico, demostración de la planificación de procesos, identificación de los algoritmos de administración de memoria física; finalmente, comprobación del funcionamiento del particionamiento estático, dinámico, dinámico reubicable, y de la paginación, identificación de la administración de memoria virtual y la comprobación del funcionamiento de la paginación bajo solicitud, de la segmentación y de los algoritmos de administración de los dispositivos de entrada y salida y el funcionamiento de los algoritmos de administración de la información.";

        SumillasEpici[1] = "La asignatura de “Electrónica Analógica” tiene como resultado de aprendizaje el desarrollo de la capacidad “Implementa sistemas analógicos teniendo en cuenta los fundamentos de la electrónica” que contribuye al desarrollo de la competencia específica “Desarrolla aplicaciones de inteligencia artificial que simulan las destrezas, razonamiento y el comportamiento humano, basados en metodologías, estándares vigentes, y principios éticos”, del perfil de egreso. Es una asignatura de naturaleza teórico práctica, enmarcada en el enfoque por competencia que posibilita una metodología activa en un entorno real de enseñanza aprendizaje situando al estudiante como protagonista de su aprendizaje y al docente como facilitador del proceso formativo. Propone actividades como: expectación de vídeo motivacional, presentación de propósito de la sesión, recojo de saberes previos a través de preguntas, práctica dirigida, planteamiento y resolución de casos, presentación de productos, trabajos individuales y/o en equipos; que posibiliten el conocimiento de la teoría electrónica: semiconductores tipo P y tipo N, tipos de diodos semiconductores, funcionamiento, características, codificación, polarizaciones de los diodos semiconductores, diodos rectificador, así como, el Transistor Bipolar (BJT), polarización con IB constante, autopolarización, por divisor de voltaje, el transistor como conmutador: tiempos de conmutación, limitaciones de frecuencia, aplicaciones, el transistor Unipolar, polarizaciones básicas, cálculo y diseño de circuitos, análisis en baja señal del JFET y Mosfet; finalmente, el amplificador cascodo, Darlington y amplificador diferencial, funcionamiento y análisis en Corriente alterna y corriente continua, fuentes de alimentación reguladas y estabilizadas, reguladores de voltaje positivo y negativo, el Amplificador operacional: Características, funcionamiento, Sumador, restador. Integrador, diferenciador, como filtro, integrador, diferenciador, comparador de ventana, conversiones de voltaje corriente y corriente voltaje. Así mismo, las habilidades relacionadas con el uso de los parámetros eléctricos de los diodos, clasificación de los diodos, realización de mediciones con el ohmímetro, así mismo, la diferenciación de los tipos de transistores, aplicación de la conmutación de señales eléctricas por medio de transistores; finalmente, diferenciación de los tipos de amplificadores, el conocimiento de los procesos de regulación y estabilización de fuentes de alimentación y aplicaciones del amplificador operacional.";

        SumillasMedicina[0] = "El curso Microbiología y Parasitología Médica, tiene como resultado de aprendizaje el desarrollo de la\n"
                + "capacidad “Analiza las características biológicas y morfológicas de las bacterias, virus, hongos y parásitos que\n"
                + "afectan al ser humano con las enfermedades que producen, considerando las técnicas y métodos de\n"
                + "diagnóstico microbiológico e inmunológico” que contribuye al desarrollo de la competencia específica\n"
                + "“Desarrolla intervenciones preventivo-promocionales de salud pública, basándose en sólidos fundamentos de\n"
                + "la medicina, evidencia científica disponible, principios éticos, política y normativa vigente” del perfil de Egreso”.\n"
                + "Es un curso de naturaleza teórico práctica, enmarcado en el enfoque por competencia que posibilita una\n"
                + "metodología activa en un entorno real de enseñanza aprendizaje situando al estudiante como protagonista de\n"
                + "su aprendizaje y al docente como facilitador del proceso formativo. Propone actividades que posibiliten los\n"
                + "conocimientos: estructura bacteriana metabolismo y genética bacteriana, bacterias grampositivas y\n"
                + "gramnegativos, técnicas y métodos de diagnóstico para bacterias, características generales y estructura de los\n"
                + "hongos, los Virus, generalidades, estructura, clasificación, replicación viral, patobiología de la replicación viral.\n"
                + "Relación parásito y hospedero, definición de parásito, clasificación de parásitos patógenos para el hombre.\n"
                + "Protozoos intestinales y genitales, helmintos y cestodos; amebas de vida libre, leishmania, plasmodium.\n"
                + "Desarrolla habilidades como: Identifica las bacterias según la coloración gram y su caracterización bioquímica.\n"
                + "Realiza cultivos de bacterias y antibiogramas. Interpreta los resultados de cultivos y antibiogramas. Relaciona\n"
                + "las características biológicas de las bacterias con su patogenicidad, identifica levaduras y mohos de mayor\n"
                + "importancia en el ser humano, a través de observaciones microscópicas y cultivos, utiliza métodos\n"
                + "inmunológicos para la determinación de los virus más frecuentes, relaciona las características biológicas de los\n"
                + "hongos y virus con su patogenicidad, identifica protozoos en muestras intestinales y de sangre, describe\n"
                + "helmintos y céstodos según las características de su ciclo evolutivo, relaciona las características biológicas de\n"
                + "los parásitos con su patogenicidad. Selecciona información científica en fuentes confiables.";
        SumillasMedicina[1] = "El curso de Pensamiento Filosófico tiene como resultado de aprendizaje el desarrollo de las capacidades\n"
                + "“Formula razonamientos y toma decisiones en torno a situaciones y problemas teniendo en cuenta principios\n"
                + "elementales de filosofía y pensamiento crítico” y “Aplica principios elementales de filosofía y de pensamiento\n"
                + "crítico en situaciones vivenciales con postura ética“, que contribuye al desarrollo de la competencia general\n"
                + "“Evalúa situaciones, problemas y razonamientos usando principios elementales de la filosofía práctica y del pensamiento crítico asumiendo una postura ética que permita solución de problemas y toma de decisiones”,\n"
                + "del Perfil de Egreso.\n"
                + "Es un curso de naturaleza teórico-práctica, enmarcado en el enfoque por competencias que posibilita una\n"
                + "metodología activa en un entorno real de enseñanza aprendizaje situando al estudiante como protagonista\n"
                + "de su aprendizaje y al docente como facilitador del proceso formativo. Propone actividades que posibiliten\n"
                + "los conocimientos: filosofía, objeto de estudio, disciplinas y métodos, su utilidad práctica, modos de\n"
                + "comprensión del mundo: Filosofía, cosmovisión, pensamiento e ideología, el ser humano como problema, su\n"
                + "comprensión en integración multidimensional, el problema del conocimiento, su comprensión procesual\n"
                + "sistémica, el quehacer científico, potencialidades y limitaciones, ética, moral, axiología y filosofía política,\n"
                + "diferenciación, complementariedad e importancia, transversalidad en los actos humanos: principios, valores,\n"
                + "virtudes y normas jurídicas, derechos humanos, problematicidad y comprensión, interacción ciudadana:\n"
                + "Prudencia, Responsabilidad y compromiso social. Desarrolla habilidades como: define el objeto de estudio\n"
                + "de la filosofía, sus disciplinas y métodos valorando su utilidad práctica; diferencia las distintas\n"
                + "comprensiones sobre el mundo identificándolas en acontecimientos situados, analiza las múltiples\n"
                + "dimensiones del ser humano comprendiéndolas de manera integral, comprende la situación de la realidad\n"
                + "del conocimiento y del quehacer científico en perspectiva filosófica, define argumentativa de las nociones\n"
                + "implicadas en la filosofía práctica, comprende los distintos aspectos transversales de los actos humanos\n"
                + "clarificándolas desde la ética, analiza situaciones prácticas problematizadoras en perspectiva ética, asume un\n"
                + "compromiso ético en su actuar personal como futuro profesional";
    }

    private static void cargaCompetencia() {
        cargarCompetenciaGenerales();
        cargarCompetenciaEspecifica();
        cargaCompetenciaMedicina();
    }

    private static void cargaCompetenciaMedicina() {
        competenciaprofesionalMedicina[0] = "Desarrolla intervenciones preventivo-promocionales de salud pública, basándose en sólidos fundamentos de la medicina, evidencia científica\n"
                + "disponible, principios éticos, política y normativa vigente";
        competenciaprofesionalMedicina[1] = "Evalúa situaciones, problemas y razonamientos usando principios elementales de la filosofía práctica y del pensamiento crítico asumiendo una postura ética que permita solución de problemas y toma de decisiones.";
    }

    private static void cargarDesepeños() {
        Unidad unidad1EA = new Unidad();
        Unidad unidad2EA = new Unidad();
        Unidad unidad3EA = new Unidad();
        
        desempeñosEA.add(new Desempeño("D1","Realiza mediciones de los parámetros eléctricos en un circuito con diodos, teniendo en cuenta los procesos de polarización y rectificación de señales eléctricas.", unidad1EA));
        desempeñosEA.add(new Desempeño("D2","Realiza circuitos con transistores teniendo en cuenta las leyes de conmutación de las señales eléctricas.", unidad2EA));
        desempeñosEA.add(new Desempeño("D3","Realiza circuitos con amplificadores operacionales y fuentes de alimentación reguladas y estabilizadas, teniendo en cuenta la entrada y salida de voltajes..", unidad3EA));
    }

}
