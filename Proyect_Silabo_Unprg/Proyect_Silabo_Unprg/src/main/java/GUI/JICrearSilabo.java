package GUI;

import GUI.modelos.CiclosComboModel;
import GUI.modelos.CursoComboModel;
import entidades.Ciclo;
import entidades.Curso;
import entidades.DepartamentoAcademico;
import entidades.Escuela;
import entidades.Facultad;
import entidades.Silabo;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class JICrearSilabo extends javax.swing.JInternalFrame {

    private static JICrearSilabo frm;
    private static Silabo silabo;
    private static Escuela escuela;
    private static Facultad facultad;
    private static DepartamentoAcademico departamento;
    private Ciclo cicloSeleccionado;
    private Curso cursoSeleccionado;

    private List<Ciclo> ciclosVigentes;
    private List<Curso> cursosVigentes;
    private CiclosComboModel modeloCiclos = new CiclosComboModel();
    private CursoComboModel modeloCursos = new CursoComboModel();

    public JICrearSilabo(Silabo silabo) {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setBorder(null);
        this.facultad = silabo.getFacultad();
        this.departamento = silabo.getDepatamento();
        this.escuela = silabo.getEscuela();
        cargarDatosASilabo();
        cargarCiclosDeSilabo();

    }

    public static JICrearSilabo crear(javax.swing.JDesktopPane contenedor, Silabo silabo) {
        if (JICrearSilabo.frm == null) {
            JICrearSilabo.frm = new JICrearSilabo(silabo);
            JICrearSilabo.frm.setResizable(true);
            contenedor.add(JICrearSilabo.frm);
        }
        return JICrearSilabo.frm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pn8 = new javax.swing.JTabbedPane();
        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUniversidad = new javax.swing.JLabel();
        txtUniversidad = new javax.swing.JTextField();
        lblDepartamento = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        lblEscuela = new javax.swing.JLabel();
        txtEscuela = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbCiclos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbCursos = new javax.swing.JComboBox<>();
        lblPrerrequistos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        axtPrerrequisitos = new javax.swing.JTextArea();
        lblCodigoCurso = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        lblCreditos = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHorasSemanales = new javax.swing.JTextField();
        lblHorasTeoricas = new javax.swing.JLabel();
        lblHorasPracticas = new javax.swing.JLabel();
        txtHorasTeoricas = new javax.swing.JTextField();
        txtHorasPracticas = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaFinal = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        bntSiguiente1 = new javax.swing.JButton();
        lblSemestreAcademico = new javax.swing.JLabel();
        txtSemestreAcademico = new javax.swing.JTextField();
        lblFacultad = new javax.swing.JLabel();
        txtFacultad = new javax.swing.JTextField();
        pn2 = new javax.swing.JPanel();
        btnSiguiente2 = new javax.swing.JButton();
        btnAtras2 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        axtSumilla = new javax.swing.JTextArea();
        pn3 = new javax.swing.JPanel();
        btnSiguiente3 = new javax.swing.JButton();
        bntAtras3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        atxCompetenciaProfesional = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        atxCapacidadCurso = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        pn4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        btnAnterior4 = new javax.swing.JButton();
        btnSiguiente4 = new javax.swing.JButton();
        pn5 = new javax.swing.JPanel();
        ADS = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnSiguiente5 = new javax.swing.JButton();
        btnAnterior5 = new javax.swing.JButton();
        pn6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAtras6 = new javax.swing.JButton();
        btnSiguiente6 = new javax.swing.JButton();
        pn7 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btnSiguiente7 = new javax.swing.JButton();
        btnAnterior7 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        lblBienvenida = new javax.swing.JLabel();
        lblBienvenida1 = new javax.swing.JLabel();
        pnFirma = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        panVisualizacion = new javax.swing.JPanel();

        pn1.setBorder(javax.swing.BorderFactory.createTitledBorder("I. INFORMACIÓN GENERAL"));

        lblUniversidad.setText("Universidad: ");

        txtUniversidad.setEditable(false);
        txtUniversidad.setEnabled(false);

        lblDepartamento.setText("Departamento academico:");

        txtDepartamento.setEditable(false);
        txtDepartamento.setEnabled(false);

        lblEscuela.setText("Escuela:");

        txtEscuela.setEditable(false);

        jLabel5.setText("Ciclo:");

        cmbCiclos.setModel(this.modeloCiclos);
        cmbCiclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiclosActionPerformed(evt);
            }
        });

        jLabel6.setText("Curso:");

        cmbCursos.setModel(this.modeloCursos);
        cmbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursosActionPerformed(evt);
            }
        });

        lblPrerrequistos.setText("Prerrequisitos:");

        axtPrerrequisitos.setEditable(false);
        axtPrerrequisitos.setColumns(20);
        axtPrerrequisitos.setRows(5);
        jScrollPane2.setViewportView(axtPrerrequisitos);

        lblCodigoCurso.setText("Codigo del curso:");

        txtCodigoCurso.setEditable(false);

        lblCreditos.setText("Creditos: ");

        txtCreditos.setEditable(false);

        jLabel10.setText("Horas semanales:");

        txtHorasSemanales.setEditable(false);

        lblHorasTeoricas.setText("Teoricas:");

        lblHorasPracticas.setText("Practicas:");

        txtHorasTeoricas.setEditable(false);

        txtHorasPracticas.setEditable(false);

        lblDuracion.setText("Duración: ");

        txtDuracion.setEditable(false);
        txtDuracion.setText("16 semanas");

        lblFechaInicio.setText("Fecha Inicio: ");

        lblFechaFinal.setText("Fecha Final:");

        txtFechaFinal.setEditable(false);

        jLabel16.setText("Docente: ");

        jTextField12.setEditable(false);

        jLabel17.setText("Grado: ");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lic", "Mag", "Dr", "Cat", "Mtro", " " }));

        jLabel18.setText("Correo:");

        bntSiguiente1.setText("Siguiente");
        bntSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSiguiente1ActionPerformed(evt);
            }
        });

        lblSemestreAcademico.setText("Semestre academico:");

        lblFacultad.setText("Facultad: ");

        txtFacultad.setEditable(false);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(748, 748, 748))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntSiguiente1)
                .addGap(446, 446, 446))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn1Layout.createSequentialGroup()
                                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtHorasSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pn1Layout.createSequentialGroup()
                                                        .addComponent(lblHorasTeoricas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtHorasTeoricas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                    .addGroup(pn1Layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(lblHorasPracticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtHorasPracticas, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                                        .addGap(53, 53, 53)
                                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDuracion)
                                                .addGap(19, 19, 19))
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lblFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFechaInicio)
                                                    .addComponent(txtFechaFinal)))))
                                    .addGroup(pn1Layout.createSequentialGroup()
                                        .addComponent(lblPrerrequistos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2))
                                    .addGroup(pn1Layout.createSequentialGroup()
                                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbCiclos, 0, 1, Short.MAX_VALUE)
                                                .addGap(80, 80, 80))
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addComponent(lblCodigoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(lblSemestreAcademico)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSemestreAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pn1Layout.createSequentialGroup()
                                        .addComponent(lblFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn1Layout.createSequentialGroup()
                                                .addComponent(lblDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(lblEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                                .addComponent(txtDepartamento))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                                .addComponent(lblUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFacultad)
                                    .addComponent(txtUniversidad, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))))))
                .addGap(476, 476, 476))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniversidad)
                    .addComponent(txtUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultad)
                    .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamento)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(lblEscuela)
                        .addGap(18, 18, 18)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbCiclos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCreditos)
                            .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoCurso)
                            .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSemestreAcademico)
                            .addComponent(txtSemestreAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblPrerrequistos)))
                        .addGap(31, 31, 31)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn1Layout.createSequentialGroup()
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtHorasSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHorasTeoricas)
                                    .addComponent(txtHorasTeoricas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHorasPracticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHorasPracticas)))
                            .addGroup(pn1Layout.createSequentialGroup()
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDuracion)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFechaInicio)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFechaFinal)
                                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(bntSiguiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addComponent(txtEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pn8.addTab("Pagina 1", pn1);

        pn2.setBorder(javax.swing.BorderFactory.createTitledBorder("II. SUMILLA"));

        btnSiguiente2.setText("Siguiente");
        btnSiguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente2ActionPerformed(evt);
            }
        });

        btnAtras2.setText("atras");
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });

        axtSumilla.setEditable(false);
        axtSumilla.setColumns(20);
        axtSumilla.setRows(5);
        jScrollPane19.setViewportView(axtSumilla);

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addGap(0, 443, Short.MAX_VALUE)
                        .addComponent(btnAtras2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente2))
                    .addComponent(jScrollPane19))
                .addContainerGap())
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente2)
                    .addComponent(btnAtras2))
                .addContainerGap())
        );

        pn8.addTab("Pagina 2", pn2);

        btnSiguiente3.setText("Siguiente");
        btnSiguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente3ActionPerformed(evt);
            }
        });

        bntAtras3.setText("Atras");
        bntAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtras3ActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("III. COMPETENCIA PROFESIONAL"));

        atxCompetenciaProfesional.setColumns(20);
        atxCompetenciaProfesional.setRows(5);
        jScrollPane4.setViewportView(atxCompetenciaProfesional);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("IV. CAPACIDAD DEL CURSO"));

        atxCapacidadCurso.setColumns(20);
        atxCapacidadCurso.setRows(5);
        jScrollPane6.setViewportView(atxCapacidadCurso);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("V. DESEMPEÑOS DE LAS UNIDADES DIDÁCTICAS"));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane7.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntAtras3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente3))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente3)
                    .addComponent(bntAtras3))
                .addContainerGap())
        );

        pn8.addTab("Pagina 3", pn3);

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder("VI. PROGRAMA DE CONTENIDOS."));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Desempeños", "Nombre Unidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Desempeños", "habilidades Requeridas", "Semanas", "Conocimientos", "Actividades", "Evidencia de Aprendizaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable2);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Unidad:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAnterior4.setText("Anterior");
        btnAnterior4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior4ActionPerformed(evt);
            }
        });

        btnSiguiente4.setText("Siguiente");
        btnSiguiente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(884, 884, 884))
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addComponent(btnAnterior4)
                        .addGap(43, 43, 43)
                        .addComponent(btnSiguiente4)
                        .addGap(859, 859, 859)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(412, 412, 412))
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente4)
                            .addComponent(btnAnterior4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))))
        );

        pn8.addTab("Pagina 4", pn4);

        pn5.setBorder(javax.swing.BorderFactory.createTitledBorder("VIII. SISTEMA DE CALIFICACIÓN"));

        ADS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Evidencia de apredizaje", "Siglas", "Peso", "Cronograma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable3);

        javax.swing.GroupLayout ADSLayout = new javax.swing.GroupLayout(ADS);
        ADS.setLayout(ADSLayout);
        ADSLayout.setHorizontalGroup(
            ADSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        ADSLayout.setVerticalGroup(
            ADSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        jTextField14.setEditable(false);

        jLabel20.setText("Promedio final =");

        btnSiguiente5.setText("Siguiente");
        btnSiguiente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente5ActionPerformed(evt);
            }
        });

        btnAnterior5.setText("Anterior");
        btnAnterior5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ADS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnterior5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSiguiente5)
                .addContainerGap())
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(ADS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente5)
                    .addComponent(btnAnterior5))
                .addContainerGap())
        );

        pn8.addTab("Pagina 5", pn5);

        pn6.setBorder(javax.swing.BorderFactory.createTitledBorder("IX. METODOLOGÍA DE ENSEÑANZA – APRENDIZAJE Y ACTIVIDADES DE INVESTIGACIÓN FORMATIVA"));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane11.setViewportView(jTextArea5);

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Metodología para el proceso formativo:\n\n");
        jScrollPane12.setViewportView(jTextArea8);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("Metodología para la investigación formativa:");
        jScrollPane13.setViewportView(jTextArea9);

        jLabel21.setText("Metodología para la investigación formativa");

        jLabel22.setText("Metodología para el proceso formativo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(0, 284, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Detallado");

        btnAtras6.setText("Atras");
        btnAtras6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras6ActionPerformed(evt);
            }
        });

        btnSiguiente6.setText("Siguiente");
        btnSiguiente6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn6Layout = new javax.swing.GroupLayout(pn6);
        pn6.setLayout(pn6Layout);
        pn6Layout.setHorizontalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane11)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras6)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente6)
                .addContainerGap())
        );
        pn6Layout.setVerticalGroup(
            pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn6Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn6Layout.createSequentialGroup()
                        .addGroup(pn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente6)
                            .addComponent(btnAtras6))
                        .addContainerGap())))
        );

        pn8.addTab("Pagina 6", pn6);

        pn7.setBorder(javax.swing.BorderFactory.createTitledBorder("X. ACTIVIDADES DE TUTORÍA: ÁREA ACADÉMICA"));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jScrollPane14.setViewportView(jTextArea10);

        jButton2.setText("PLAN DE DINAMIZACIÓN Y SEGUIMIENTO");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Etapas", "Actividades"
            }
        ));
        jScrollPane15.setViewportView(jTable4);

        jScrollPane16.setViewportView(jScrollPane15);

        btnSiguiente7.setText("Siguiente");
        btnSiguiente7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente7ActionPerformed(evt);
            }
        });

        btnAnterior7.setText("Anterior");
        btnAnterior7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn7Layout = new javax.swing.GroupLayout(pn7);
        pn7.setLayout(pn7Layout);
        pn7Layout.setHorizontalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn7Layout.createSequentialGroup()
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnterior7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente7)))
                .addContainerGap())
        );
        pn7Layout.setVerticalGroup(
            pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente7)
                            .addComponent(btnAnterior7))
                        .addContainerGap())))
        );

        pn8.addTab("Pagina 7", pn7);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("XI. REFERENCIAS"));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane17.setViewportView(jTextArea11);

        lblBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setText("{Lugar}, {mes} de {Año}");

        lblBienvenida1.setBackground(new java.awt.Color(255, 255, 255));
        lblBienvenida1.setText("{Grado}. {FullName}");

        javax.swing.GroupLayout pnFirmaLayout = new javax.swing.GroupLayout(pnFirma);
        pnFirma.setLayout(pnFirmaLayout);
        pnFirmaLayout.setHorizontalGroup(
            pnFirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        pnFirmaLayout.setVerticalGroup(
            pnFirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        jButton3.setText("Anterior");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exportar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(pnFirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(lblBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnFirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pn8.addTab("Pagina 8", jPanel13);

        jSplitPane1.setLeftComponent(pn8);

        javax.swing.GroupLayout panVisualizacionLayout = new javax.swing.GroupLayout(panVisualizacion);
        panVisualizacion.setLayout(panVisualizacionLayout);
        panVisualizacionLayout.setHorizontalGroup(
            panVisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        panVisualizacionLayout.setVerticalGroup(
            panVisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        jScrollPane18.setViewportView(panVisualizacion);

        jScrollPane1.setViewportView(jScrollPane18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtras3ActionPerformed
        this.pn8.setSelectedIndex(1);
    }//GEN-LAST:event_bntAtras3ActionPerformed

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        this.pn8.setSelectedIndex(0);
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btnSiguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente2ActionPerformed
        this.pn8.setSelectedIndex(2);
    }//GEN-LAST:event_btnSiguiente2ActionPerformed

    private void bntSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSiguiente1ActionPerformed
        this.pn8.setSelectedIndex(1);
    }//GEN-LAST:event_bntSiguiente1ActionPerformed

    private void btnSiguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente3ActionPerformed
        this.pn8.setSelectedIndex(3);
    }//GEN-LAST:event_btnSiguiente3ActionPerformed

    private void btnSiguiente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente4ActionPerformed
        this.pn8.setSelectedIndex(4);
    }//GEN-LAST:event_btnSiguiente4ActionPerformed

    private void btnAnterior4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior4ActionPerformed
        this.pn8.setSelectedIndex(2);
    }//GEN-LAST:event_btnAnterior4ActionPerformed

    private void btnSiguiente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente5ActionPerformed
        this.pn8.setSelectedIndex(5);
    }//GEN-LAST:event_btnSiguiente5ActionPerformed

    private void btnSiguiente6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente6ActionPerformed
        this.pn8.setSelectedIndex(6);
    }//GEN-LAST:event_btnSiguiente6ActionPerformed

    private void btnSiguiente7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente7ActionPerformed
        this.pn8.setSelectedIndex(7);
    }//GEN-LAST:event_btnSiguiente7ActionPerformed

    private void btnAnterior5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior5ActionPerformed
        this.pn8.setSelectedIndex(3);
    }//GEN-LAST:event_btnAnterior5ActionPerformed

    private void btnAtras6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras6ActionPerformed
        this.pn8.setSelectedIndex(4);
    }//GEN-LAST:event_btnAtras6ActionPerformed

    private void btnAnterior7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior7ActionPerformed
        this.pn8.setSelectedIndex(5);
    }//GEN-LAST:event_btnAnterior7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.pn8.setSelectedIndex(6);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbCiclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiclosActionPerformed
        int pos = this.cmbCiclos.getSelectedIndex();
        if (pos > -1) {
            this.cicloSeleccionado = this.ciclosVigentes.get(pos);
            cargarCusos();
        }
    }//GEN-LAST:event_cmbCiclosActionPerformed

    private void cmbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursosActionPerformed
        int pos = this.cmbCursos.getSelectedIndex();
        if (pos > -1) {
            this.cursoSeleccionado = this.cursosVigentes.get(pos);
            cargarDatosDeCurso();
        }
    }//GEN-LAST:event_cmbCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADS;
    private javax.swing.JTextArea atxCapacidadCurso;
    private javax.swing.JTextArea atxCompetenciaProfesional;
    private javax.swing.JTextArea axtPrerrequisitos;
    private javax.swing.JTextArea axtSumilla;
    private javax.swing.JButton bntAtras3;
    private javax.swing.JButton bntSiguiente1;
    private javax.swing.JButton btnAnterior4;
    private javax.swing.JButton btnAnterior5;
    private javax.swing.JButton btnAnterior7;
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnAtras6;
    private javax.swing.JButton btnSiguiente2;
    private javax.swing.JButton btnSiguiente3;
    private javax.swing.JButton btnSiguiente4;
    private javax.swing.JButton btnSiguiente5;
    private javax.swing.JButton btnSiguiente6;
    private javax.swing.JButton btnSiguiente7;
    private javax.swing.JComboBox<String> cmbCiclos;
    private javax.swing.JComboBox<String> cmbCursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblBienvenida1;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblEscuela;
    private javax.swing.JLabel lblFacultad;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblHorasPracticas;
    private javax.swing.JLabel lblHorasTeoricas;
    private javax.swing.JLabel lblPrerrequistos;
    private javax.swing.JLabel lblSemestreAcademico;
    private javax.swing.JLabel lblUniversidad;
    private javax.swing.JPanel panVisualizacion;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JPanel pn5;
    private javax.swing.JPanel pn6;
    private javax.swing.JPanel pn7;
    private javax.swing.JTabbedPane pn8;
    private javax.swing.JPanel pnFirma;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEscuela;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtHorasPracticas;
    private javax.swing.JTextField txtHorasSemanales;
    private javax.swing.JTextField txtHorasTeoricas;
    private javax.swing.JTextField txtSemestreAcademico;
    private javax.swing.JTextField txtUniversidad;
    // End of variables declaration//GEN-END:variables

    public void cargarDatosASilabo() {
        this.txtUniversidad.setText("Universidad Nacional Pedro Ruiz Gallo");
        this.txtFacultad.setText(this.facultad.getNombre());
        this.txtDepartamento.setText(this.departamento.getNombre());
        this.txtEscuela.setText(this.escuela.getNombre());
    }

    private void cargarCiclosDeSilabo() {
        this.ciclosVigentes = new ArrayList<>();
        for (Ciclo ciclo1 : this.escuela.getCiclo()) {
            if (ciclo1.isVigente() == true) {
                this.ciclosVigentes.add(ciclo1);
            }
        }
        this.modeloCiclos.setCiclo(ciclosVigentes);
        this.cmbCiclos.setSelectedIndex(-1);
    }

    private void cargarCusos() {
        if (this.cicloSeleccionado != null) {
            this.cursosVigentes = new ArrayList<>();
            for (Curso curo : this.cicloSeleccionado.getCuros()) {
                if (curo.isVigente() == true) {
                    this.cursosVigentes.add(curo);
                }
            }
            this.modeloCursos.setCurso(this.cursosVigentes);
            this.cmbCursos.setSelectedIndex(-1);
        }
    }

    private void cargarDatosDeCurso() {
        if (this.cursoSeleccionado != null) {
            int horasTeoricas = this.cursoSeleccionado.getHorasTeoricaSemanales();
            int horasPracticas = this.cursoSeleccionado.getHorasTeoricaSemanales();

            this.txtCodigoCurso.setText(cursoSeleccionado.getCodigoCurso());
            this.txtCreditos.setText(String.valueOf(cursoSeleccionado.getCreditos()));
            this.txtHorasSemanales.setText(String.valueOf(horasTeoricas + horasPracticas));
            this.txtHorasTeoricas.setText(String.valueOf(horasTeoricas));
            this.txtHorasPracticas.setText(String.valueOf(horasTeoricas));
            this.txtCodigoCurso.setText(cursoSeleccionado.getCodigoCurso());
            this.axtPrerrequisitos.setText(this.cursoSeleccionado.getPrerrequisitos());

            this.axtSumilla.setLineWrap(true);
            this.axtSumilla.setWrapStyleWord(true);
            this.axtSumilla.setText(this.cursoSeleccionado.getSumilla());
            this.atxCompetenciaProfesional.setLineWrap(true);
            this.atxCompetenciaProfesional.setWrapStyleWord(true);
            this.atxCompetenciaProfesional.setText(this.cursoSeleccionado.getCompetenciaProfesional());
            this.atxCapacidadCurso.setLineWrap(true);
            this.atxCapacidadCurso.setWrapStyleWord(true);
            this.atxCapacidadCurso.setText(this.cursoSeleccionado.getCapacidadDelCurso());
        }

    }
}
