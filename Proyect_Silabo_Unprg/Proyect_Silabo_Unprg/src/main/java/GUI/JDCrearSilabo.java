package GUI;

import GUI.modelos.DepartamentoComboModel;
import GUI.modelos.EscuelaComboModel;
import GUI.modelos.FacultadComboModel;
import com.mycompany.proyect_silabo_unprg.Proyect_Silabo_Unprg;
import entidades.DepartamentoAcademico;
import entidades.Escuela;
import entidades.Facultad;
import entidades.Silabo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class JDCrearSilabo extends javax.swing.JDialog {

    private Facultad facultadSeleccionada;
    private List<Facultad> facultadesVigentes = new ArrayList<>();
    private FacultadComboModel modeloFacultad = new FacultadComboModel();

    private DepartamentoAcademico departamentoSeleccionado;
    private List<DepartamentoAcademico> departamentosVigentesFacultad = new ArrayList<>();
    private DepartamentoComboModel modeloDepartemento = new DepartamentoComboModel();

    private Escuela escuelaSelecionada;
    private List<Escuela> escuelaVigenteDepartamento = new ArrayList<>();
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

        txtFiltrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lisUniversidad = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblFiltrar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbFacultad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbEscuela = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Silabo");

        txtFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltrarActionPerformed(evt);
            }
        });

        lisUniversidad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pedro Ruiz Gallo", "...", "..", ".." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lisUniversidad);

        jLabel1.setText("Universidad:");

        lblFiltrar.setText("Filtrar");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Escuela"));

        jLabel2.setText("Facultad: ");

        cmbFacultad.setModel(this.modeloFacultad);
        cmbFacultad.setSelectedIndex(-1);
        cmbFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFacultadActionPerformed(evt);
            }
        });

        jLabel3.setText("Departamento : ");

        cmbDepartamento.setModel(this.modeloDepartemento);
        cmbDepartamento.setSelectedIndex(-1);
        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Escuela: ");

        cmbEscuela.setModel(this.modeloEscuela);
        cmbEscuela.setSelectedIndex(-1);
        cmbEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscuelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFacultad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)
                        .addGap(54, 54, 54)
                        .addComponent(btnCerrar)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnSiguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.silabo = null;
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void cmbFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFacultadActionPerformed
        this.escuelaSelecionada = null;
        int pos = this.cmbFacultad.getSelectedIndex();
        if (pos > -1) {
            this.facultadSeleccionada = this.facultadesVigentes.get(pos);
        }
        cargarDepartamento();
    }//GEN-LAST:event_cmbFacultadActionPerformed

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed
        int pos = this.cmbDepartamento.getSelectedIndex();
        if (pos > -1) {
            this.departamentoSeleccionado = this.departamentosVigentesFacultad.get(pos);
        }

        cargarEscuelas();

    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void cmbEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscuelaActionPerformed
        int pos = this.cmbEscuela.getSelectedIndex();
        if (pos > -1) {
            this.escuelaSelecionada = this.escuelaVigenteDepartamento.get(pos);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JList<String> lisUniversidad;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables

    private void cargarFacultades() {
        for (Facultad facultad : Proyect_Silabo_Unprg.facultad) {
            if (facultad.isVigente() == true) {
                this.facultadesVigentes.add(facultad);
            }
        }
        this.modeloFacultad.setFacul(this.facultadesVigentes);
        this.cmbFacultad.setSelectedIndex(-1);
    }

    private void cargarDepartamento() {

        if (this.facultadSeleccionada != null) {
            for (DepartamentoAcademico Departamento : this.facultadSeleccionada.getDepartamentosAcademicos()) {
                if (Departamento.isVigente() == true) {
                    this.departamentosVigentesFacultad.add(Departamento);
                }
            }
            this.modeloDepartemento.setDepa(this.departamentosVigentesFacultad);
            this.cmbDepartamento.setSelectedIndex(-1);
        }

    }

    private void cargarEscuelas() {

        if (this.departamentoSeleccionado != null) {
            for (Escuela escuelas : this.departamentoSeleccionado.getEscuelas()) {
                if (escuelas.isVigete() == true) {
                    this.escuelaVigenteDepartamento.add(escuelas);
                }
            }
            this.modeloEscuela.setEscuela(this.escuelaVigenteDepartamento);
            this.cmbEscuela.setSelectedIndex(-1);
        }

    }
}
