/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1EVAL.gui;

/**
 *
 * @author Javier
 */
public class JDialogAddCarrera extends javax.swing.JDialog
{

    /**
     * Creates new form JDialogAddCarrera
     */
    public JDialogAddCarrera(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombreCarrera = new javax.swing.JLabel();
        jTextFieldNombreCarrera = new javax.swing.JTextField();
        jLabelFechaCarrera = new javax.swing.JLabel();
        jSpinnerFechaCarrera = new javax.swing.JSpinner();
        jLabelLugarCarrera = new javax.swing.JLabel();
        jTextFieldLugarCarrera = new javax.swing.JTextField();
        jLabelNúmeroMáximoParticipantes = new javax.swing.JLabel();
        jTextFieldNúmeroMáximoParticipantes = new javax.swing.JTextField();
        jLabelListaCorredores = new javax.swing.JLabel();
        jTextFieldListaCorredores = new javax.swing.JTextField();
        jButtonAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombreCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelNombreCarrera.text")); // NOI18N

        jTextFieldNombreCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldNombreCarrera.text")); // NOI18N

        jLabelFechaCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelFechaCarrera.text")); // NOI18N

        jSpinnerFechaCarrera.setModel(new javax.swing.SpinnerDateModel());

        jLabelLugarCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelLugarCarrera.text")); // NOI18N

        jTextFieldLugarCarrera.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldLugarCarrera.text")); // NOI18N

        jLabelNúmeroMáximoParticipantes.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelNúmeroMáximoParticipantes.text")); // NOI18N

        jTextFieldNúmeroMáximoParticipantes.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldNúmeroMáximoParticipantes.text")); // NOI18N

        jLabelListaCorredores.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jLabelListaCorredores.text")); // NOI18N

        jTextFieldListaCorredores.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jTextFieldListaCorredores.text")); // NOI18N

        jButtonAlta.setText(org.openide.util.NbBundle.getMessage(JDialogAddCarrera.class, "JDialogAddCarrera.jButtonAlta.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombreCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombreCarrera))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerFechaCarrera))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLugarCarrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLugarCarrera))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNúmeroMáximoParticipantes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNúmeroMáximoParticipantes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelListaCorredores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldListaCorredores, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaCarrera)
                    .addComponent(jSpinnerFechaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLugarCarrera)
                    .addComponent(jTextFieldLugarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNúmeroMáximoParticipantes)
                    .addComponent(jTextFieldNúmeroMáximoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelListaCorredores)
                    .addComponent(jTextFieldListaCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JDialogAddCarrera dialog = new JDialogAddCarrera(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JLabel jLabelFechaCarrera;
    private javax.swing.JLabel jLabelListaCorredores;
    private javax.swing.JLabel jLabelLugarCarrera;
    private javax.swing.JLabel jLabelNombreCarrera;
    private javax.swing.JLabel jLabelNúmeroMáximoParticipantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerFechaCarrera;
    private javax.swing.JTextField jTextFieldListaCorredores;
    private javax.swing.JTextField jTextFieldLugarCarrera;
    private javax.swing.JTextField jTextFieldNombreCarrera;
    private javax.swing.JTextField jTextFieldNúmeroMáximoParticipantes;
    // End of variables declaration//GEN-END:variables
}