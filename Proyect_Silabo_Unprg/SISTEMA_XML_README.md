# Sistema de Carga y Guardado XML - Proyecto Sílabo UNPRG

## Descripción

Este sistema permite guardar y cargar todos los datos del proyecto de sílabos en archivos XML, facilitando la persistencia de datos, backup y intercambio de información entre diferentes instancias de la aplicación.

## Características

### ✅ Funcionalidades Implementadas

- **Serialización/Deserialización XML** de todas las entidades del sistema
- **Guardado automático** de datos al iniciar la aplicación
- **Carga automática** de datos al inicializar el sistema
- **Exportación individual** de sílabos desde la interfaz
- **Guardado masivo** de todos los datos del sistema
- **Validación** de archivos XML
- **Información de archivos** (tamaño, fecha, etc.)

### 🏗️ Arquitectura

#### Entidades con Anotaciones XML
Todas las entidades principales han sido anotadas con Jackson XML:

- `Silabo` - Elemento raíz principal
- `Facultad` - Facultades con sus departamentos
- `DepartamentoAcademico` - Departamentos con escuelas
- `Escuela` - Escuelas con ciclos
- `Ciclo` - Ciclos con cursos
- `Curso` - Cursos con desempeños
- `Docente` - Información de docentes (sin imágenes)
- `Usuario` - Usuarios del sistema
- `Desempeño` - Desempeños de cursos
- `Unidad` - Unidades de aprendizaje

#### Clases de Soporte
- `ArchivosXML` - Clase principal para operaciones XML
- `DatosSistema` - Encapsula todos los datos del sistema
- `SilaboWrapper` - Wrapper para listas de sílabos
- `FacultadWrapper` - Wrapper para listas de facultades
- `DocenteWrapper` - Wrapper para listas de docentes
- `UsuarioWrapper` - Wrapper para listas de usuarios

## Uso del Sistema

### 1. Carga Automática al Iniciar

Al ejecutar la aplicación, el sistema automáticamente:

1. Intenta cargar datos desde XML en `~/ProyectoSilabo/datos/`
2. Si no existen archivos XML, carga datos hardcodeados
3. Guarda automáticamente los datos en XML para futuras ejecuciones

```java
// En Proyect_Silabo_Unprg.main()
if (!cargarDatosDesdeXML()) {
    cargarDatos(); // Datos hardcodeados
    guardarDatosEnXML(); // Guardar para próxima vez
}
```

### 2. Exportar Sílabo desde la Interfaz

Desde cualquier ventana de creación de sílabo:

1. Hacer clic en el botón **"Exportar"**
2. Seleccionar ubicación y nombre del archivo
3. El sílabo se guarda en formato XML

### 3. Guardar Todos los Datos

Desde el menú de exportación:

1. Ir a **"Exportar"** en la ventana principal
2. Hacer clic en **"Exportar"**
3. Seleccionar **"Guardar datos en XML"**
4. Los datos se guardan en `~/ProyectoSilabo/datos/`

### 4. Abrir Archivos XML

Desde la ventana principal:

1. Hacer clic en **"Abrir"**
2. Seleccionar archivo XML de sílabo
3. El sílabo se carga y muestra en una nueva ventana

## Estructura de Archivos XML

### Directorio de Datos
```
~/ProyectoSilabo/datos/
├── silabos.xml      # Todos los sílabos
├── facultades.xml   # Facultades con estructura completa
├── docentes.xml     # Lista de docentes
└── usuarios.xml     # Usuarios del sistema
```

### Ejemplo de XML de Sílabo
```xml
<silabo>
    <facultad>
        <nombre>Facultad de Ingeniería</nombre>
        <abreviatura>FI</abreviatura>
        <vigente>true</vigente>
        <departamentosAcademicos>
            <departamento>
                <nombre>Computación e Informática</nombre>
                <!-- ... -->
            </departamento>
        </departamentosAcademicos>
    </facultad>
    <curso>
        <nombre>Programación Orientada a Objetos</nombre>
        <codigoCurso>CS001</codigoCurso>
        <creditos>4</creditos>
        <!-- ... -->
    </curso>
    <docente>
        <nombres>Juan Carlos</nombres>
        <apellidos>García López</apellidos>
        <gradoAcademico>Doctor</gradoAcademico>
        <!-- ... -->
    </docente>
    <!-- ... más datos del sílabo ... -->
</silabo>
```

## API de Programación

### Clase Principal: ArchivosXML

#### Métodos de Guardado
```java
// Guardar un sílabo individual
ArchivosXML.guardarSilabo(silabo, "ruta/silabo.xml");

// Guardar todos los datos del sistema
ArchivosXML.guardarTodosLosDatos(directorio, silabos, facultades, docentes, usuarios);

// Guardar lista de facultades
ArchivosXML.guardarFacultades(facultades, "ruta/facultades.xml");
```

#### Métodos de Carga
```java
// Cargar un sílabo individual
Silabo silabo = ArchivosXML.cargarSilabo("ruta/silabo.xml");

// Cargar todos los datos del sistema
DatosSistema datos = ArchivosXML.cargarTodosLosDatos(directorio);

// Cargar lista de docentes
List<Docente> docentes = ArchivosXML.cargarDocentes("ruta/docentes.xml");
```

#### Métodos de Utilidad
```java
// Verificar si un archivo XML es válido
boolean esValido = ArchivosXML.esArchivoXMLValido("ruta/archivo.xml");

// Obtener información de un archivo
String info = ArchivosXML.obtenerInfoArchivo("ruta/archivo.xml");
```

### Integración con el Sistema Principal

```java
// Métodos añadidos a Proyect_Silabo_Unprg
public static boolean cargarDatosDesdeXML()
public static void guardarDatosEnXML()
public static void guardarSilabo(Silabo silabo, String rutaArchivo)
public static Silabo cargarSilabo(String rutaArchivo)
```

## Configuración y Dependencias

### Dependencias Maven Añadidas
```xml
<!-- Jackson para XML -->
<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.16.1</version>
</dependency>
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.16.1</version>
</dependency>
<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
    <version>2.16.1</version>
</dependency>
```

## Ejemplo de Uso Completo

```java
// Ejemplo básico de uso
public void ejemploCompleto() {
    try {
        // 1. Crear datos
        Silabo silabo = new Silabo();
        // ... configurar silabo ...
        
        // 2. Guardar en XML
        ArchivosXML.guardarSilabo(silabo, "mi_silabo.xml");
        
        // 3. Cargar desde XML
        Silabo silaboRecuperado = ArchivosXML.cargarSilabo("mi_silabo.xml");
        
        // 4. Verificar resultado
        System.out.println("Curso: " + silaboRecuperado.getCurso().getNombre());
        
    } catch (IOException e) {
        System.err.println("Error: " + e.getMessage());
    }
}
```

## Beneficios del Sistema

1. **Persistencia**: Los datos se mantienen entre sesiones
2. **Backup**: Fácil respaldo de toda la información
3. **Portabilidad**: Archivos XML estándar, legibles y transferibles
4. **Compatibilidad**: Formato abierto compatible con otras herramientas
5. **Estructura**: Datos organizados jerárquicamente
6. **Validación**: Verificación automática de integridad de archivos

## Ubicación de Archivos

- **Datos del sistema**: `~/ProyectoSilabo/datos/`
- **Sílabos individuales**: Ubicación seleccionada por el usuario
- **Ejemplos**: `~/ProyectoSilabo/ejemplo_*.xml`

## Consideraciones Especiales

- Las **imágenes de firmas** no se serializan en XML (marcadas con `@JsonIgnore`)
- Las **fechas** se formatean como `yyyy-MM-dd`
- Los **archivos XML** se formatean con indentación para mejor legibilidad
- El sistema crea **automáticamente** los directorios necesarios

## Pruebas y Validación

Para probar el sistema, ejecutar:

```java
cargaDeDatos.EjemploUsoXML.main(args);
```

Este ejemplo demuestra todas las funcionalidades básicas del sistema XML.
