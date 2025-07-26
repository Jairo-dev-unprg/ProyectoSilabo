package GUI;

import entidades.Unidad;
import java.util.List;
import javax.swing.JFrame;

public class JFUnidades extends javax.swing.JFrame {

    private static JFUnidades instancia;
    private List<Unidad> unidades;

    
    private JFUnidades() {
        this.unidades = unidades;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Reinicia instancia cuando se cierre la ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                instancia = null;
            }
        });
    }

   // Método Singleton público para mostrar la ventana
    public static JFUnidades mostrar(List<Unidad> unidades) {
        if (instancia == null) {
            instancia = new JFUnidades();
        } else {
            instancia.actualizarUnidades(unidades); // Actualiza datos si ya está abierta
            instancia.toFront();
        }

        instancia.setVisible(true);
        return instancia;
    }

    // Método para refrescar lista de unidades
    public void actualizarUnidades(List<Unidad> nuevasUnidades) {
        this.unidades = nuevasUnidades;
        // Aquí puedes actualizar tabla, paneles o vista general
        // Por ahora, solo actualiza la referencia a los datos
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntCancelar = new javax.swing.JButton();
        btnAcepetarEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNombreHabilidad = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblUnidad1 = new javax.swing.JLabel();
        cmbUnidad1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        panSemana = new javax.swing.JPanel();
        lblConocimiento = new javax.swing.JLabel();
        scpConocimiento = new javax.swing.JScrollPane();
        txaConocimiento = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        scpActividadesAprendizaje = new javax.swing.JScrollPane();
        txaActividadesDeAprendizaje = new javax.swing.JTextArea();
        lblEvidenciaAprendizaje = new javax.swing.JLabel();
        lblTipoEvidencia = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblEvidencia = new javax.swing.JLabel();
        scpEvidencia = new javax.swing.JScrollPane();
        txaEvidencia = new javax.swing.JTextArea();
        lblInstrumentoEvaluación = new javax.swing.JLabel();
        scpInstrumentoEvaluación = new javax.swing.JScrollPane();
        txaInstrumentoEvaluación = new javax.swing.JTextArea();
        btnGuardarSemana = new javax.swing.JButton();
        btnConfigurarSemana = new javax.swing.JButton();
        panRegistroDeHabilidades = new javax.swing.JPanel();
        cmbUnidad = new javax.swing.JComboBox<>();
        lblUnidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scpDesempeñoEsperado = new javax.swing.JScrollPane();
        txaDesempeñoEsperado = new javax.swing.JTextArea();
        panAgregarHabilidad = new javax.swing.JPanel();
        panListadoHabilidades = new javax.swing.JPanel();
        scpTablaListado = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        panHabilidad = new javax.swing.JPanel();
        lblHabilidad = new javax.swing.JLabel();
        scpHabilidad = new javax.swing.JScrollPane();
        txaHabilidad = new javax.swing.JTextArea();
        lblSemanas = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnAceptarHabilidadNueva = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardarHabilidades = new javax.swing.JButton();
        btnConfigurarHabilidades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntCancelar.setText("Cancelar");

        btnAcepetarEditar.setText("Aceptar");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Configurar Habilidades"));
        jPanel1.setEnabled(false);

        lblNombreHabilidad.setText("Habilidad: ");
        lblNombreHabilidad.setEnabled(false);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setEnabled(false);

        lblUnidad1.setText("Unidad: ");
        lblUnidad1.setEnabled(false);

        cmbUnidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUnidad1.setSelectedIndex(-1);
        cmbUnidad1.setEnabled(false);

        jLabel2.setText("Semana: ");
        jLabel2.setEnabled(false);

        jSpinner2.setEnabled(false);

        panSemana.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Semana"));
        panSemana.setEnabled(false);

        lblConocimiento.setText("Conocimiento: ");
        lblConocimiento.setEnabled(false);

        txaConocimiento.setColumns(20);
        txaConocimiento.setRows(5);
        txaConocimiento.setEnabled(false);
        scpConocimiento.setViewportView(txaConocimiento);

        jLabel3.setText("Actividad de aprendizaje: ");
        jLabel3.setEnabled(false);

        txaActividadesDeAprendizaje.setColumns(20);
        txaActividadesDeAprendizaje.setRows(5);
        txaActividadesDeAprendizaje.setEnabled(false);
        scpActividadesAprendizaje.setViewportView(txaActividadesDeAprendizaje);

        lblEvidenciaAprendizaje.setText("EVIDENCIA APRENDIZAJE: ");
        lblEvidenciaAprendizaje.setEnabled(false);

        lblTipoEvidencia.setText("Tipo de Evidencia: ");
        lblTipoEvidencia.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exámenes", "Trabajos Escritos", "Presentaciones Orales ", "Proyectos", "Portafolios", "Pruebas Prácticas", "Observaciones Conductuales", "Entrevistas de Competencias", "Autoevaluaciones y Diarios de Aprendizaje", "Informes de Progreso", "Comentarios y Retroalimentación", "Creaciones Artísticas", "Maquetas y Prototipos", "Videojuegos y Aplicaciones Digitales", "Cuadernos de Notas y Bitácoras" }));
        jComboBox1.setEnabled(false);

        lblEvidencia.setText("Evidencia: ");
        lblEvidencia.setEnabled(false);

        txaEvidencia.setColumns(20);
        txaEvidencia.setRows(5);
        txaEvidencia.setEnabled(false);
        scpEvidencia.setViewportView(txaEvidencia);

        lblInstrumentoEvaluación.setText("Instrumento Evaluación:");
        lblInstrumentoEvaluación.setEnabled(false);

        txaInstrumentoEvaluación.setColumns(20);
        txaInstrumentoEvaluación.setRows(5);
        txaInstrumentoEvaluación.setEnabled(false);
        scpInstrumentoEvaluación.setViewportView(txaInstrumentoEvaluación);

        btnGuardarSemana.setText("Guardar");
        btnGuardarSemana.setEnabled(false);

        javax.swing.GroupLayout panSemanaLayout = new javax.swing.GroupLayout(panSemana);
        panSemana.setLayout(panSemanaLayout);
        panSemanaLayout.setHorizontalGroup(
            panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSemanaLayout.createSequentialGroup()
                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSemanaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panSemanaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scpActividadesAprendizaje))
                            .addGroup(panSemanaLayout.createSequentialGroup()
                                .addComponent(lblConocimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scpConocimiento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSemanaLayout.createSequentialGroup()
                                .addComponent(lblEvidenciaAprendizaje)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSemanaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSemanaLayout.createSequentialGroup()
                                .addComponent(lblInstrumentoEvaluación)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSemanaLayout.createSequentialGroup()
                                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEvidencia)
                                    .addComponent(lblTipoEvidencia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panSemanaLayout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(207, 207, 207))
                            .addComponent(scpEvidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                            .addComponent(scpInstrumentoEvaluación, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSemanaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarSemana)))
                .addContainerGap())
        );
        panSemanaLayout.setVerticalGroup(
            panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSemanaLayout.createSequentialGroup()
                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSemanaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scpConocimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                    .addComponent(lblConocimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(scpActividadesAprendizaje, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(lblEvidenciaAprendizaje)
                .addGap(19, 19, 19)
                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoEvidencia)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEvidencia)
                    .addComponent(scpEvidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(panSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpInstrumentoEvaluación, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(lblInstrumentoEvaluación))
                .addGap(49, 49, 49)
                .addComponent(btnGuardarSemana)
                .addGap(20, 20, 20))
        );

        btnConfigurarSemana.setText("Configurar");
        btnConfigurarSemana.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUnidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbUnidad1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreHabilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnConfigurarSemana, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUnidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidad1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreHabilidad)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnConfigurarSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        panRegistroDeHabilidades.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro Habilidades"));

        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUnidad.setSelectedIndex(-1);

        lblUnidad.setText("Unidad: ");

        jLabel1.setText("Desempeño Esperado:");

        txaDesempeñoEsperado.setEditable(false);
        txaDesempeñoEsperado.setColumns(20);
        txaDesempeñoEsperado.setRows(5);
        scpDesempeñoEsperado.setViewportView(txaDesempeñoEsperado);

        panAgregarHabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Agregamos habilidades"), "Agregamos la habilidad Requerida"));

        panListadoHabilidades.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listado Habilidades"));
        panListadoHabilidades.setEnabled(false);

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Habilidad Requerida", "Semanas"
            }
        ));
        tblListado.setEnabled(false);
        scpTablaListado.setViewportView(tblListado);

        btnNuevo.setText("Nuevo");
        btnNuevo.setEnabled(false);

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panListadoHabilidadesLayout = new javax.swing.GroupLayout(panListadoHabilidades);
        panListadoHabilidades.setLayout(panListadoHabilidadesLayout);
        panListadoHabilidadesLayout.setHorizontalGroup(
            panListadoHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListadoHabilidadesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panListadoHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panListadoHabilidadesLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(30, 30, 30)
                        .addComponent(btnModificar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panListadoHabilidadesLayout.createSequentialGroup()
                        .addComponent(scpTablaListado, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                        .addGap(9, 9, 9))))
        );
        panListadoHabilidadesLayout.setVerticalGroup(
            panListadoHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panListadoHabilidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpTablaListado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panListadoHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevo))
                .addGap(44, 44, 44))
        );

        panHabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Habilidad"));

        lblHabilidad.setText("Habilidad: ");

        txaHabilidad.setColumns(20);
        txaHabilidad.setRows(5);
        scpHabilidad.setViewportView(txaHabilidad);

        lblSemanas.setText("Semanas:");

        btnAceptarHabilidadNueva.setText("Aceptar");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout panHabilidadLayout = new javax.swing.GroupLayout(panHabilidad);
        panHabilidad.setLayout(panHabilidadLayout);
        panHabilidadLayout.setHorizontalGroup(
            panHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHabilidadLayout.createSequentialGroup()
                .addGroup(panHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpHabilidad)
                    .addGroup(panHabilidadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHabilidad)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panHabilidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSemanas, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addGroup(panHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panHabilidadLayout.createSequentialGroup()
                        .addComponent(btnAceptarHabilidadNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addGap(13, 13, 13))
        );
        panHabilidadLayout.setVerticalGroup(
            panHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHabilidadLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblHabilidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemanas))
                .addGap(55, 55, 55)
                .addGroup(panHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptarHabilidadNueva))
                .addGap(40, 40, 40))
        );

        btnGuardarHabilidades.setText("Guardar");

        javax.swing.GroupLayout panAgregarHabilidadLayout = new javax.swing.GroupLayout(panAgregarHabilidad);
        panAgregarHabilidad.setLayout(panAgregarHabilidadLayout);
        panAgregarHabilidadLayout.setHorizontalGroup(
            panAgregarHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregarHabilidadLayout.createSequentialGroup()
                .addComponent(panHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panListadoHabilidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgregarHabilidadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarHabilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panAgregarHabilidadLayout.setVerticalGroup(
            panAgregarHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregarHabilidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAgregarHabilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListadoHabilidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(btnGuardarHabilidades)
                .addGap(39, 39, 39))
        );

        btnConfigurarHabilidades.setText("Configurar habilidades");

        javax.swing.GroupLayout panRegistroDeHabilidadesLayout = new javax.swing.GroupLayout(panRegistroDeHabilidades);
        panRegistroDeHabilidades.setLayout(panRegistroDeHabilidadesLayout);
        panRegistroDeHabilidadesLayout.setHorizontalGroup(
            panRegistroDeHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroDeHabilidadesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panRegistroDeHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistroDeHabilidadesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpDesempeñoEsperado))
                    .addGroup(panRegistroDeHabilidadesLayout.createSequentialGroup()
                        .addComponent(lblUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbUnidad, 0, 652, Short.MAX_VALUE))
                    .addComponent(btnConfigurarHabilidades, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panAgregarHabilidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panRegistroDeHabilidadesLayout.setVerticalGroup(
            panRegistroDeHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroDeHabilidadesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panRegistroDeHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidad))
                .addGap(18, 18, 18)
                .addGroup(panRegistroDeHabilidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(scpDesempeñoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panAgregarHabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfigurarHabilidades)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAcepetarEditar)
                        .addGap(41, 41, 41)
                        .addComponent(bntCancelar)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panRegistroDeHabilidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panRegistroDeHabilidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntCancelar)
                    .addComponent(btnAcepetarEditar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUnidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnAcepetarEditar;
    private javax.swing.JButton btnAceptarHabilidadNueva;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfigurarHabilidades;
    private javax.swing.JButton btnConfigurarSemana;
    private javax.swing.JButton btnGuardarHabilidades;
    private javax.swing.JButton btnGuardarSemana;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbUnidad;
    private javax.swing.JComboBox<String> cmbUnidad1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblConocimiento;
    private javax.swing.JLabel lblEvidencia;
    private javax.swing.JLabel lblEvidenciaAprendizaje;
    private javax.swing.JLabel lblHabilidad;
    private javax.swing.JLabel lblInstrumentoEvaluación;
    private javax.swing.JLabel lblNombreHabilidad;
    private javax.swing.JLabel lblSemanas;
    private javax.swing.JLabel lblTipoEvidencia;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JLabel lblUnidad1;
    private javax.swing.JPanel panAgregarHabilidad;
    private javax.swing.JPanel panHabilidad;
    private javax.swing.JPanel panListadoHabilidades;
    private javax.swing.JPanel panRegistroDeHabilidades;
    private javax.swing.JPanel panSemana;
    private javax.swing.JScrollPane scpActividadesAprendizaje;
    private javax.swing.JScrollPane scpConocimiento;
    private javax.swing.JScrollPane scpDesempeñoEsperado;
    private javax.swing.JScrollPane scpEvidencia;
    private javax.swing.JScrollPane scpHabilidad;
    private javax.swing.JScrollPane scpInstrumentoEvaluación;
    private javax.swing.JScrollPane scpTablaListado;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextArea txaActividadesDeAprendizaje;
    private javax.swing.JTextArea txaConocimiento;
    private javax.swing.JTextArea txaDesempeñoEsperado;
    private javax.swing.JTextArea txaEvidencia;
    private javax.swing.JTextArea txaHabilidad;
    private javax.swing.JTextArea txaInstrumentoEvaluación;
    // End of variables declaration//GEN-END:variables
}
