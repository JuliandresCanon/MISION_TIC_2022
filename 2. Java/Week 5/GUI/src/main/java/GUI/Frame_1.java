/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.security.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author JuliandresCanon
 */
public class Frame_1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame_1
     */
    public Frame_1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnBoton1 = new javax.swing.JButton();
        cbOpcion1 = new javax.swing.JCheckBox();
        cbOpcion2 = new javax.swing.JCheckBox();
        cbOpcion3 = new javax.swing.JCheckBox();
        cbOpcion4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BtnSeleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnBoton1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        BtnBoton1.setText("BOTON 1");
        BtnBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBoton1ActionPerformed(evt);
            }
        });

        cbOpcion1.setText("Opcion 1");
        cbOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcion1ActionPerformed(evt);
            }
        });

        cbOpcion2.setText("Opcion 2");
        cbOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcion2ActionPerformed(evt);
            }
        });

        cbOpcion3.setText("Opcion 3");
        cbOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcion3ActionPerformed(evt);
            }
        });

        cbOpcion4.setText("Opcion 4");
        cbOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcion4ActionPerformed(evt);
            }
        });

        jLabel1.setText("USO DEL CHECKBOX");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        BtnSeleccion.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        BtnSeleccion.setText("Seleccion");
        BtnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbOpcion1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbOpcion2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbOpcion3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbOpcion4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(BtnBoton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(BtnSeleccion)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbOpcion1)
                .addGap(18, 18, 18)
                .addComponent(cbOpcion2)
                .addGap(18, 18, 18)
                .addComponent(cbOpcion3)
                .addGap(18, 18, 18)
                .addComponent(cbOpcion4)
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBoton1ActionPerformed
        
        
        
        if (cbOpcion1.isSelected()) {
            
            jTextField1.setText("Selecciono la opción 1");
        }
        
        if (cbOpcion2.isSelected()) {
            
            jTextField1.setText("Selecciono la opción 2");
        }
        
        if (cbOpcion3.isSelected()) {
            
            jTextField1.setText("Selecciono la opción 3");
        }
        
        if (cbOpcion4.isSelected()) {
            
            jTextField1.setText("Selecciono la opción 4");
        }
    }//GEN-LAST:event_BtnBoton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BtnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionActionPerformed

        if (cbOpcion1.isSelected()) {
            
            JOptionPane.showMessageDialog(rootPane, "Selecciono la opción 1" , "Seleccion", JOptionPane.ERROR_MESSAGE );
        }
        if (cbOpcion2.isSelected()) {
            
            JOptionPane.showMessageDialog(rootPane, "Selecciono la opción 2" , "Seleccion", JOptionPane.ERROR_MESSAGE );
        }
        if (cbOpcion3.isSelected()) {
            
            JOptionPane.showMessageDialog(rootPane, "Selecciono la opción 3" , "Seleccion", JOptionPane.ERROR_MESSAGE );
        }
        if (cbOpcion4.isSelected()) {
            
            JOptionPane.showMessageDialog(rootPane, "Selecciono la opción 4" , "Seleccion", JOptionPane.ERROR_MESSAGE );
        }
        
        
    }//GEN-LAST:event_BtnSeleccionActionPerformed

    private void cbOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcion1ActionPerformed

    private void cbOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcion2ActionPerformed

    private void cbOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcion3ActionPerformed

    private void cbOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcion4ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBoton1;
    private javax.swing.JButton BtnSeleccion;
    private javax.swing.JCheckBox cbOpcion1;
    private javax.swing.JCheckBox cbOpcion2;
    private javax.swing.JCheckBox cbOpcion3;
    private javax.swing.JCheckBox cbOpcion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
