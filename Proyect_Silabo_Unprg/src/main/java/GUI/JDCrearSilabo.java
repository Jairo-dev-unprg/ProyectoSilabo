package GUI;

import GUI.modelos.DepartamentoComboModel;
import GUI.modelos.EscuelaComboModel;
import GUI.modelos.FacultadComboModel;
import com.mycompany.proyect_silabo_unprg.Proyect_Silabo_Unprg;
import entidades.DepartamentoAcademico;
import entidades.Escuela;
import entidades.Facultad;
import entidades.Silabo;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JDCrearSilabo extends javax.swing.JDialog {

    private Facultad facultadSeleccionada = null;
    private List<Facultad> facultadesVigentes = null;
    private FacultadComboModel modeloFacultad = new FacultadComboModel();

    private DepartamentoAcademico departamentoSeleccionado = null;
    private List<DepartamentoAcademico> departamentosVigentes = null;
    private DepartamentoComboModel modeloDepartemento = new DepartamentoComboModel();

    private Escuela escuelaSelecionada = null;
    private List<Escuela> escuelaVigente = null;
    private EscuelaComboModel modeloEscuela = new EscuelaComboModel();

    private static Silabo silabo;

    public JDCrearSilabo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cargarFacultades();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        lblFiltrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbFacultad = new javax.swing.JComboBox<>();
        cmbDepartamento = new javax.swing.JComboBox<>();
        cmbEscuela = new javax.swing.JComboBox<>();
        txtFiltrar = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Silabo");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lblFiltrar.setBackground(new java.awt.Color(0, 0, 0));
        lblFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblFiltrar.setText("Filtrar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setText("Facultad: ");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("Departamento : ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("Escuela: ");

        cmbFacultad.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cmbFacultad.setModel(this.modeloFacultad);
        cmbFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFacultadActionPerformed(evt);
            }
        });

        cmbDepartamento.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cmbDepartamento.setModel(this.modeloDepartemento);
        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });

        cmbEscuela.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        cmbEscuela.setModel(this.modeloEscuela);
        cmbEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscuelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbFacultad, 0, 495, Short.MAX_VALUE)
                    .addComponent(cmbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbEscuela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        txtFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.silabo = null;
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (validarDatos() == true) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void cmbFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFacultadActionPerformed
        this.departamentoSeleccionado = null;
        this.escuelaSelecionada = null;
        this.departamentosVigentes = null;
        this.escuelaVigente = null;
        int pos = this.cmbFacultad.getSelectedIndex();
        if (pos > -1) {
            this.facultadSeleccionada = this.facultadesVigentes.get(pos);
            cargarDepartamento();
            this.cmbDepartamento.setSelectedIndex(-1);
            this.cmbEscuela.setSelectedIndex(-1);

        }

    }//GEN-LAST:event_cmbFacultadActionPerformed

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed

        this.escuelaSelecionada = null;
        this.escuelaVigente = null;
        int pos = this.cmbDepartamento.getSelectedIndex();
        if (pos > -1) {
            this.departamentoSeleccionado = this.departamentosVigentes.get(pos);
            this.cmbEscuela.setSelectedIndex(-1);
            cargarEscuelas();
        }
    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void cmbEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscuelaActionPerformed
        int pos = this.cmbEscuela.getSelectedIndex();
        if (pos > -1) {
            this.escuelaSelecionada = this.escuelaVigente.get(pos);
        }
    }//GEN-LAST:event_cmbEscuelaActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(JDCrearSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCrearSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCrearSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCrearSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCrearSilabo dialog = new JDCrearSilabo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public Silabo agregar() {
        //this.cargarDatos();// aqui vamos a cargar los datos de las universidades Facultades, departamentos y escuelas comela justto
        this.setVisible(true);
        Silabo sil = new Silabo();
        sil.setFacultad(this.facultadSeleccionada);
        sil.setDepartamento(this.departamentoSeleccionado);
        sil.setEscuela(this.escuelaSelecionada);

        this.silabo = sil;
        return this.silabo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbEscuela;
    private javax.swing.JComboBox<String> cmbFacultad;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables

    private void cargarFacultades() {

        this.facultadesVigentes = new ArrayList<>();
        this.facultadesVigentes.clear();
        for (Facultad facultad : Proyect_Silabo_Unprg.facultad) {
            if (facultad.isVigente() == true) {
                this.facultadesVigentes.add(facultad);
            }
        }
        this.modeloFacultad.setFacultad(this.facultadesVigentes);
        this.cmbFacultad.setSelectedIndex(-1);
    }

    private void cargarDepartamento() {
        if (this.facultadSeleccionada != null) {
            this.departamentosVigentes = new ArrayList<>();
            this.departamentosVigentes.clear();
            for (DepartamentoAcademico depa : this.facultadSeleccionada.getDepartamentosAcademicos()) {
                if (depa.isVigente() == true) {
                    this.departamentosVigentes.add(depa);
                }
            }
            this.modeloDepartemento.setDepartamento(this.departamentosVigentes);
            this.cmbDepartamento.setSelectedIndex(-1);
            this.cmbEscuela.setSelectedIndex(-1);
        }
    }

    private void cargarEscuelas() {
        if (this.departamentoSeleccionado != null) {
            this.escuelaVigente = new ArrayList<>();
            this.escuelaVigente.clear();         
            for (Escuela escuelas : this.departamentoSeleccionado.getEscuelas()) {
                if (escuelas.isVigente() == true) {
                    this.escuelaVigente.add(escuelas);
                }
                this.modeloEscuela.setEscuela(this.escuelaVigente);
                this.cmbEscuela.setSelectedIndex(-1);
            }

        }

    }

    private boolean validarDatos() {
        String mensaje = "Selecione";
        if (this.facultadSeleccionada == null) {
            mensaje += " la facultad";
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            if (this.departamentoSeleccionado == null) {
                mensaje += " el departamento";
                JOptionPane.showMessageDialog(null, mensaje);
            } else {
                if (this.escuelaSelecionada == null) {
                    mensaje += " la escuela";
                    JOptionPane.showMessageDialog(null, mensaje);

                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
