package GUI;

import com.mycompany.proyect_silabo_unprg.Proyect_Silabo_Unprg;
import entidades.DepartamentoAcademico;
import entidades.Escuela;
import entidades.Facultad;
import entidades.Silabo;
import entidades.Usuario;
import java.util.List;

public class JFSilabo extends javax.swing.JFrame {

    private Escuela escuela = null;
    private Facultad facultad = null;
    private DepartamentoAcademico depa = null;

    private static Usuario userLogged;
    private static JICrearSilabo frmCrear;
    private static JDCrearSilabo frm1;

    Usuario usuario;

    public JFSilabo(Usuario usuario) {
        this.userLogged = usuario;
        initComponents();
        mostrarBienvenida();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpSilabo = new javax.swing.JDesktopPane();
        pnLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        lblBienvenida = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        dpSilabo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dpSilaboLayout = new javax.swing.GroupLayout(dpSilabo);
        dpSilabo.setLayout(dpSilaboLayout);
        dpSilaboLayout.setHorizontalGroup(
            dpSilaboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        dpSilaboLayout.setVerticalGroup(
            dpSilaboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnLateral.setBackground(new java.awt.Color(0, 86, 163));

        btnInicio.setBackground(new java.awt.Color(25, 118, 210));
        btnInicio.setText("Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(25, 118, 210));
        btnCrear.setText("Crear");
        btnCrear.setBorderPainted(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnImportar.setBackground(new java.awt.Color(25, 118, 210));
        btnImportar.setText("Abrir");
        btnImportar.setBorderPainted(false);
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(25, 118, 210));
        jButton1.setText("Cuenta");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExportar.setBackground(new java.awt.Color(25, 118, 210));
        btnExportar.setText("Exportar");
        btnExportar.setBorderPainted(false);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        lblBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido {grade} {fullname}");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenUsuario.png"))); // NOI18N

        javax.swing.GroupLayout pnLateralLayout = new javax.swing.GroupLayout(pnLateral);
        pnLateral.setLayout(pnLateralLayout);
        pnLateralLayout.setHorizontalGroup(
            pnLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnImportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblLogo)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        pnLateralLayout.setVerticalGroup(
            pnLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLateralLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblLogo)
                .addGap(31, 31, 31)
                .addComponent(lblBienvenida)
                .addGap(37, 37, 37)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpSilabo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dpSilabo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        JIIncio frm = JIIncio.crear(this.dpSilabo);
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        if (this.frm1 == null) {
            this.frm1 = new JDCrearSilabo(null, true);
            Silabo silabo = frm1.agregar();
            if (silabo.getEscuela() != null) {
                this.frmCrear = JICrearSilabo.crear(dpSilabo, silabo, userLogged);
                frmCrear.setVisible(true);
                try {
                    frmCrear.setMaximum(true);
                } catch (Exception e) {
                }

            }
        } else {
            frmCrear.setVisible(true);
            try {
                frmCrear.setMaximum(true);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        JIExportar frm = JIExportar.crear(this.dpSilabo);
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JICuenta frm = JICuenta.crear(this.dpSilabo);
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSilabo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new JFSilabo(userLogged).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JDesktopPane dpSilabo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnLateral;
    // End of variables declaration//GEN-END:variables

    private void mostrarBienvenida() {
//        if (usuarioActivo != null && usuarioActivo.getDocente() != null) {
//            Docente d = usuarioActivo.getDocente();
//            String saludo = "Bienvenido " + d.getGradoAcademico() + " " + d.getFullName();
//            lblBienvenida.setText(saludo);
//        } else {
//            lblBienvenida.setText("Bienvenido usuario");
//        }
    }

}
