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

    private Facultad facultadSeleccionada;
    private List<Facultad> facultadesVigentes;
    private FacultadComboModel modeloFacultad = new FacultadComboModel();

    private DepartamentoAcademico departamentoSeleccionado;
    private List<DepartamentoAcademico> departamentosVigentes;
    private DepartamentoComboModel modeloDepartemento = new DepartamentoComboModel();

    private Escuela escuelaSelecionada;
    private List<Escuela> escuelaVigente;
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
        jLabel1 = new javax.swing.JLabel();
        lblFiltrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cmbFacultad = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        cmbEscuela = new javax.swing.JComboBox<>();
        txtFiltrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lisUniversidad = new javax.swing.JList<>();
        btnCerrar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        separadorUsuario = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Silabo");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Universidad:");

        lblFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFiltrar.setText("Filtrar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Escuela", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed Medium", 0, 14))); // NOI18N

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Facultad: ");

        cmbFacultad.setBackground(new java.awt.Color(255, 255, 255));
        cmbFacultad.setForeground(new java.awt.Color(0, 0, 0));
        cmbFacultad.setModel(this.modeloFacultad);
        cmbFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFacultadActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Departamento : ");

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Escuela: ");

        cmbDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        cmbDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        cmbDepartamento.setModel(this.modeloDepartemento);
        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });

        cmbEscuela.setBackground(new java.awt.Color(255, 255, 255));
        cmbEscuela.setForeground(new java.awt.Color(0, 0, 0));
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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFacultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDepartamento, 0, 514, Short.MAX_VALUE)
                            .addComponent(cmbEscuela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cmbFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        txtFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        txtFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltrarActionPerformed(evt);
            }
        });

        lisUniversidad.setBackground(new java.awt.Color(255, 255, 255));
        lisUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        lisUniversidad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pedro Ruiz Gallo", "...", "..", ".." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lisUniversidad);

        btnCerrar.setBackground(new java.awt.Color(25, 118, 210));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(25, 118, 210));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        separadorUsuario.setBackground(new java.awt.Color(255, 255, 255));
        separadorUsuario.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separadorUsuario)
                            .addComponent(txtFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                        .addGap(359, 359, 359))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(54, 54, 54)
                .addComponent(btnCerrar)
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnSiguiente))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltrarActionPerformed

    }//GEN-LAST:event_txtFiltrarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JList<String> lisUniversidad;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables

    private void cargarFacultades() {
        this.facultadesVigentes = new ArrayList<>();
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
