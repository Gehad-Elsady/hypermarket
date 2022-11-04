/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hyper.market;

/**
 *
 * @author hp
 */
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class home extends javax.swing.JFrame {

    /** Creates new form home */
//    Statement stmt;
    public home() {
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adminButton1 = new javax.swing.JButton();
        customerButton2 = new javax.swing.JButton();
        employeeButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("home");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("    Login as");

        adminButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminButton1.setForeground(new java.awt.Color(255, 102, 51));
        adminButton1.setText("admin");
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        customerButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerButton2.setForeground(new java.awt.Color(204, 0, 204));
        customerButton2.setText("customer");
        customerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButton2ActionPerformed(evt);
            }
        });

        employeeButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeButton3.setForeground(new java.awt.Color(0, 204, 0));
        employeeButton3.setText("employee");
        employeeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/blue-home-icon (1).png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/left-arrow (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(48, 48, 48)
                .add(adminButton1)
                .add(82, 82, 82)
                .add(customerButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 69, Short.MAX_VALUE)
                .add(employeeButton3)
                .add(39, 39, 39))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(150, 150, 150)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2)))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1)
                .add(43, 43, 43)
                .add(jLabel1)
                .add(30, 30, 30)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(adminButton1)
                    .add(customerButton2)
                    .add(employeeButton3))
                .add(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButton2ActionPerformed
        // TODO add your handling code here:
        customer_login j = new customer_login();
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerButton2ActionPerformed

    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        // TODO add your handling code here:
        admin_login ad = new admin_login();
        ad.setLocationRelativeTo(null);
        ad.show();
        this.dispose();
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void employeeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButton3ActionPerformed
        // TODO add your handling code here:
        employee z =new employee();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        start_page pp = new start_page();
        pp.setVisible(true);
        pp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton1;
    private javax.swing.JButton customerButton2;
    private javax.swing.JButton employeeButton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
