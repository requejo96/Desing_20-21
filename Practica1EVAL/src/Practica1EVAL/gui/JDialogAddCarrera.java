/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1EVAL.gui;

import Practica1EVAL.dto.Carreras;
import Practica1EVAL.dto.Corredor;
import Practica1EVAL.logica.LogicaNegocio;
import java.util.Date;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author Usuario
 */
public class JDialogAddCarrera extends javax.swing.JDialog {
    private PantallaPrincipal pantallaPrincipal;

    /**
     * Creates new form JDialogAddCarrera
     */
    public JDialogAddCarrera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal=(PantallaPrincipal)parent;
        initComponents();
        
         jButtonValidar.setEnabled(false);
        
        ValidationGroup group = validationPanelCarrera.getValidationGroup();
        group.add(jTextFieldNombreCarrera, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldLugar, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldParticipantes, StringValidators.REQUIRE_NON_EMPTY_STRING);
         group.add(jTextFieldParticipantes, StringValidators.REQUIRE_VALID_INTEGER);
        
        validationPanelCarrera.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                if (validationPanelCarrera.getProblem() == null) {
                    jButtonValidar.setEnabled(true);
                } else {
                    jButtonValidar.setEnabled(false);
                    
                }
                
            }
        });
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombreCarrera = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelLugar = new javax.swing.JLabel();
        jLabelParticipantes = new javax.swing.JLabel();
        jTextFieldNombreCarrera = new javax.swing.JTextField();
        jTextFieldLugar = new javax.swing.JTextField();
        jTextFieldParticipantes = new javax.swing.JTextField();
        jSpinnerFecha = new javax.swing.JSpinner();
        jButtonValidar = new javax.swing.JButton();
        validationPanelCarrera = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombreCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelNombreCarrera.text")); // NOI18N

        jLabelFecha.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelFecha.text")); // NOI18N

        jLabelLugar.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelLugar.text")); // NOI18N

        jLabelParticipantes.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelParticipantes.text")); // NOI18N

        jTextFieldNombreCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldNombreCarrera.text")); // NOI18N

        jTextFieldLugar.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldLugar.text")); // NOI18N

        jTextFieldParticipantes.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldParticipantes.text")); // NOI18N
        jTextFieldParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParticipantesActionPerformed(evt);
            }
        });

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        jButtonValidar.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jButtonValidar.text")); // NOI18N
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreCarrera)
                            .addComponent(jLabelFecha)
                            .addComponent(jLabelParticipantes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jSpinnerFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldParticipantes)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validationPanelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLugar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonValidar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCarrera)
                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelLugar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParticipantes)
                    .addComponent(jTextFieldParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonValidar)
                    .addComponent(validationPanelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParticipantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParticipantesActionPerformed

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        String nombre = jTextFieldNombreCarrera.getText();
        String Lugar = jTextFieldLugar.getText();
        Date Fecha = (Date)jSpinnerFecha.getValue();
        String Participantes = jTextFieldParticipantes.getText();
        Carreras carrera = new Carreras(nombre, Fecha, Lugar, Participantes);
        
        LogicaNegocio.addCarrera(carrera);
        
        setVisible(false);
    }//GEN-LAST:event_jButtonValidarActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogAddCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAddCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAddCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAddCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAddCarrera dialog = new JDialogAddCarrera(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JLabel jLabelParticipantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldNombreCarrera;
    private javax.swing.JTextField jTextFieldParticipantes;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelCarrera;
    // End of variables declaration//GEN-END:variables
}
