/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author dina
 */
public class Registrasi extends javax.swing.JFrame {

    /**
     * Creates new form fRegis
     */
    public Registrasi() {
        initComponents();
    }
    Connection con = Koneksi.getKoneksi();
    ResultSet rs;
    Statement st;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jJudul = new javax.swing.JLabel();
        fUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fPass = new javax.swing.JPasswordField();
        bSIgnUp = new javax.swing.JButton();
        bSIgnIn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ftelepon = new javax.swing.JTextField();
        fNama = new javax.swing.JTextField();
        fEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jJudul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jJudul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/header registrasi1.png"))); // NOI18N
        jJudul.setText("Regitrasi");
        jPanel1.add(jJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 390, 60));

        fUser.setBackground(new java.awt.Color(255, 255, 255));
        fUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(97, 81, 242)));
        fUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fUserActionPerformed(evt);
            }
        });
        jPanel1.add(fUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 220, -1));

        jLabel1.setForeground(new java.awt.Color(97, 81, 242));
        jLabel1.setText("username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setForeground(new java.awt.Color(97, 81, 242));
        jLabel2.setText("Sudah punya akun? maka Login saja  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        fPass.setBackground(new java.awt.Color(255, 255, 255));
        fPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(97, 81, 242)));
        jPanel1.add(fPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, -1));

        bSIgnUp.setBackground(new java.awt.Color(97, 81, 242));
        bSIgnUp.setForeground(new java.awt.Color(255, 255, 255));
        bSIgnUp.setText("Sign Up");
        bSIgnUp.setBorder(null);
        bSIgnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSIgnUpActionPerformed(evt);
            }
        });
        jPanel1.add(bSIgnUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, 30));

        bSIgnIn1.setBackground(new java.awt.Color(97, 81, 242));
        bSIgnIn1.setForeground(new java.awt.Color(255, 255, 255));
        bSIgnIn1.setText("Sign In");
        bSIgnIn1.setBorder(null);
        bSIgnIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSIgnIn1ActionPerformed(evt);
            }
        });
        jPanel1.add(bSIgnIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, 30));

        jLabel3.setForeground(new java.awt.Color(97, 81, 242));
        jLabel3.setText("password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(97, 81, 242));
        jLabel4.setText("nama");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(97, 81, 242));
        jLabel5.setText("no. telp");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        ftelepon.setBackground(new java.awt.Color(255, 255, 255));
        ftelepon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(97, 81, 242)));
        ftelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fteleponActionPerformed(evt);
            }
        });
        jPanel1.add(ftelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, -1));

        fNama.setBackground(new java.awt.Color(255, 255, 255));
        fNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(97, 81, 242)));
        jPanel1.add(fNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, -1));

        fEmail.setBackground(new java.awt.Color(255, 255, 255));
        fEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(97, 81, 242)));
        jPanel1.add(fEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, -1));

        jLabel6.setForeground(new java.awt.Color(97, 81, 242));
        jLabel6.setText("email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(107, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(27, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSIgnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSIgnUpActionPerformed
        String username = fUser.getText();
        String password = fPass.getText();
        String nama = fNama.getText();
        String email = fEmail.getText();
        String telp = ftelepon.getText();
                
        try{
            con.createStatement().executeUpdate("insert into login value ('"+username+"','"+password+"')"); 
            con.createStatement().executeUpdate("insert into dlogin value ('"+nama+"','"+email+"','"+telp+"')");
             
             JOptionPane.showMessageDialog(null, "Daftar Berhasil!");
             this.setVisible(false);//menyembunyikan layar regis
             new Login().setVisible(true);//menampilkan layar menu
             dispose();

        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Registrasi Gagal!");
        }
    }//GEN-LAST:event_bSIgnUpActionPerformed

    private void bSIgnIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSIgnIn1ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);        
    }//GEN-LAST:event_bSIgnIn1ActionPerformed

    private void fteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fteleponActionPerformed

    private void fUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fUserActionPerformed

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
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSIgnIn1;
    private javax.swing.JButton bSIgnUp;
    private javax.swing.JTextField fEmail;
    private javax.swing.JTextField fNama;
    private javax.swing.JPasswordField fPass;
    private javax.swing.JTextField fUser;
    private javax.swing.JTextField ftelepon;
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
