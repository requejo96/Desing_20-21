/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Requejo
 */
public class calculadoraPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form calculadoraPrincipal
     */
    public calculadoraPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNum1 = new javax.swing.JLabel();
        jLabelNum2 = new javax.swing.JLabel();
        jTextFieldNum1 = new javax.swing.JTextField();
        jTextFieldNum2 = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jButtonSumar = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonPosNeg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNum1.setText("Numero:");

        jLabelNum2.setText("Numero:");

        jTextFieldResultado.setEditable(false);

        jLabelResultado.setText("Resultado:");

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setText("Multiplicar");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonRestar.setText("Restar");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });

        jButtonDividir.setText("Dividir");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Borrar Num.");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonPosNeg.setText("POS/NEG");
        jButtonPosNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPosNegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNum1)
                                .addComponent(jLabelNum2))
                            .addComponent(jLabelResultado))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNum1)
                            .addComponent(jTextFieldNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jTextFieldResultado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPosNeg, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(jButtonDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNum1)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNum2)
                    .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSumar)
                    .addComponent(jButtonRestar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMultiplicar)
                    .addComponent(jButtonDividir))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonPosNeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResultado))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        // TODO add your handling code here:
        
        double resultado= 0;
        
        double num1 = Double.parseDouble(jTextFieldNum1.getText());
        double num2 = Double.parseDouble(jTextFieldNum2.getText());
        
        jTextFieldResultado.setText("");
        
        resultado = num1 + num2;
        
        jTextFieldResultado.setText(String.valueOf(resultado));
        
        
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        // TODO add your handling code here:
        double resultado= 0;
        
        double num1 = Double.parseDouble(jTextFieldNum1.getText());
        double num2 = Double.parseDouble(jTextFieldNum2.getText());
        
        jTextFieldResultado.setText("");
        
        resultado = num1 - num2;
        
        jTextFieldResultado.setText(String.valueOf(resultado));

        
    }//GEN-LAST:event_jButtonRestarActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        // TODO add your handling code here:
        
        double resultado= 0;
        
        double num1 = Double.parseDouble(jTextFieldNum1.getText());
        double num2 = Double.parseDouble(jTextFieldNum2.getText());
        
        jTextFieldResultado.setText("");
        
        resultado = num1 * num2;
        
        jTextFieldResultado.setText(String.valueOf(resultado));

        
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        // TODO add your handling code here:
        
        double resultado= 0;
        
        double num1 = Double.parseDouble(jTextFieldNum1.getText());
        double num2 = Double.parseDouble(jTextFieldNum2.getText());
        
        jTextFieldResultado.setText("");
        
        resultado = num1 / num2;
        
        jTextFieldResultado.setText(String.valueOf(resultado));

        
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        
        jTextFieldNum2.setText("");
        jTextFieldNum1.setText("");
        jTextFieldResultado.setText("");
        jButtonPosNeg.setEnabled(true);
        
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonPosNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPosNegActionPerformed
        // TODO add your handling code here:
        
        double cambio = Double.parseDouble(jTextFieldResultado.getText());
        double result = 0;
        
        if (cambio < 0) {
            
            result = cambio - cambio - cambio;
            
        } 
        if (cambio > 0) {
            
            result = cambio - cambio - cambio;
            
        }
        if (cambio == 0) {
            
            result = 0;
            
        }
        
        jTextFieldResultado.setText("");
        jTextFieldResultado.setText(String.valueOf(result));
        jButtonPosNeg.setEnabled(false);

        
    }//GEN-LAST:event_jButtonPosNegActionPerformed

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
            java.util.logging.Logger.getLogger(calculadoraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonPosNeg;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabelNum1;
    private javax.swing.JLabel jLabelNum2;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JTextField jTextFieldNum1;
    private javax.swing.JTextField jTextFieldNum2;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
