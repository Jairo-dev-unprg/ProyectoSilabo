package GUI;

import com.mycompany.proyect_silabo_unprg.Proyect_Silabo_Unprg;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class JFLogeo extends javax.swing.JFrame {

    private int mouseX, mouseY;

    public JFLogeo() {
        setUndecorated(true); // eliminamos la barra del titulo 
        initComponents();
        Proyect_Silabo_Unprg.cargarDatos();
        setLocationRelativeTo(null); // posicion a nada
        setVisible(true);
     
        // para el evento para mover la ventana desde cualquier parte visible del JFrame
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnImagen2 = new javax.swing.JPanel();
        lblLogoLargo2 = new javax.swing.JLabel();
        lblIniciarSesion2 = new javax.swing.JLabel();
        lblTextto1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        txtUsuario1 = new javax.swing.JTextField();
        separatorCrear = new javax.swing.JSeparator();
        chkVerPassword = new javax.swing.JCheckBox();
        jPasswordField2 = new javax.swing.JPasswordField();
        separatorCrear3 = new javax.swing.JSeparator();
        separatorCrear4 = new javax.swing.JSeparator();
        lblLogoUnprg = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblBaner = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 204, 204));

        pnImagen2.setBackground(new java.awt.Color(255, 255, 255));
        pnImagen2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoLargo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isotipo_unprg(2).png"))); // NOI18N
        pnImagen2.add(lblLogoLargo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblIniciarSesion2.setFont(new java.awt.Font("Roboto ExtraBold", 1, 30)); // NOI18N
        lblIniciarSesion2.setForeground(new java.awt.Color(0, 0, 0));
        lblIniciarSesion2.setText("INICIAR SESION");
        pnImagen2.add(lblIniciarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblTextto1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTextto1.setForeground(new java.awt.Color(0, 0, 0));
        lblTextto1.setText("No tienes cuenta?");
        pnImagen2.add(lblTextto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("CREA UNA");
        pnImagen2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 70, -1));

        lblUsuario2.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 18)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(51, 51, 51));
        lblUsuario2.setText("USUARIO");
        pnImagen2.add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblUsuario3.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 18)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(51, 51, 51));
        lblUsuario3.setText("CONTRASEÑA");
        pnImagen2.add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(232, 201, 42));
        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        btnIniciar.setText("ENTRAR");
        btnIniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(210, 184, 35), new java.awt.Color(170, 170, 170)));
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        pnImagen2.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, 30));

        txtUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario1.setBorder(null);
        txtUsuario1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario1.setDisabledTextColor(new java.awt.Color(232, 201, 42));
        txtUsuario1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtUsuario1.setSelectionColor(new java.awt.Color(232, 201, 42));
        txtUsuario1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuario1FocusGained(evt);
            }
        });
        pnImagen2.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 430, 30));

        separatorCrear.setBorder(new javax.swing.border.MatteBorder(null));
        pnImagen2.add(separatorCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 430, 10));

        chkVerPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ver_contrasenia.png"))); // NOI18N
        chkVerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVerPasswordActionPerformed(evt);
            }
        });
        pnImagen2.add(chkVerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField2.setBorder(null);
        jPasswordField2.setDisabledTextColor(new java.awt.Color(232, 201, 42));
        jPasswordField2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jPasswordField2.setSelectionColor(new java.awt.Color(232, 201, 42));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        pnImagen2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 430, 30));

        separatorCrear3.setBorder(new javax.swing.border.MatteBorder(null));
        pnImagen2.add(separatorCrear3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 430, 10));

        separatorCrear4.setBorder(new javax.swing.border.MatteBorder(null));
        pnImagen2.add(separatorCrear4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 430, 10));

        lblLogoUnprg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_unprg_g(3)_Photoroom.png"))); // NOI18N
        pnImagen2.add(lblLogoUnprg, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        lblTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("PLANIFICA UNPRG");
        pnImagen2.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        lblBaner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panel_unprg.png"))); // NOI18N
        lblBaner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblBaner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnImagen2.add(lblBaner, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 250, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblX.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lblX.setForeground(new java.awt.Color(0, 0, 0));
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblX.setText("X");
        lblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblX)
                .addContainerGap(789, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnImagen2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(pnImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        JFSilabo frm = new JFSilabo();
        frm.setVisible(true);
        frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtUsuario1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuario1FocusGained
        this.txtUsuario1.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUsuario1FocusGained

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void chkVerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVerPasswordActionPerformed
        if (chkVerPassword.isSelected()) {
            jPasswordField2.setEchoChar((char) 0); // Muestra texto plano
        } else {
            jPasswordField2.setEchoChar('\u2022'); // Vuelve a ocultar la contraseña
        }
    }//GEN-LAST:event_chkVerPasswordActionPerformed

    private void lblXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMousePressed
        this.dispose();
    }//GEN-LAST:event_lblXMousePressed

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
            java.util.logging.Logger.getLogger(JFLogeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogeo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogeo().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JCheckBox chkVerPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel lblBaner;
    private javax.swing.JLabel lblIniciarSesion2;
    private javax.swing.JLabel lblLogoLargo2;
    private javax.swing.JLabel lblLogoUnprg;
    private javax.swing.JLabel lblTextto1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnImagen2;
    private javax.swing.JSeparator separatorCrear;
    private javax.swing.JSeparator separatorCrear3;
    private javax.swing.JSeparator separatorCrear4;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables

}
