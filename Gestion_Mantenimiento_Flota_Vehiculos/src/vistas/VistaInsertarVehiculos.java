/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivimar
 */
public class VistaInsertarVehiculos extends javax.swing.JFrame {

    /**
     * Creates new form VistaVehiculos
     */
    public VistaInsertarVehiculos() {
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

        lblVehiculo_id = new javax.swing.JLabel();
        lblVehiculo_marca = new javax.swing.JLabel();
        lblVehiculo_matricula = new javax.swing.JLabel();
        lblVehiculo_kilometrosAlta = new javax.swing.JLabel();
        lblVehiculo_modelo = new javax.swing.JLabel();
        lblVehiculo_fechaAlta = new javax.swing.JLabel();
        lblVehiculo_fechaBaja = new javax.swing.JLabel();
        lblVehiculo_conductorId = new javax.swing.JLabel();
        lblVehiculo_empresaId = new javax.swing.JLabel();
        lblVehiculo_kilometrosActuales = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVehiculo_marca = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVehiculo_id = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVehiculo_modelo = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtVehiculo_matricula = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtVehiculo_kilometrosActuales = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtVehiculo_fechaAlta = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtVehiculo_fechaBaja = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtVehiculo_kilometrosActual = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtVehiculo_conductorId = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtVehiculo_empresaId = new javax.swing.JTextPane();
        btnVehiculo_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVehiculo_id.setText("Vehiculo_id");

        lblVehiculo_marca.setText("Marca");

        lblVehiculo_matricula.setText("Matricula");

        lblVehiculo_kilometrosAlta.setText("Kilometros de Alta");

        lblVehiculo_modelo.setText("Modelo");

        lblVehiculo_fechaAlta.setText("Fecha de Alta");

        lblVehiculo_fechaBaja.setText("Fecha de Baja");

        lblVehiculo_conductorId.setText("Id del Conductor");

        lblVehiculo_empresaId.setText("Id de Empresa");

        lblVehiculo_kilometrosActuales.setText("Kilometros Actuales");

        jScrollPane1.setViewportView(txtVehiculo_marca);

        jScrollPane2.setViewportView(txtVehiculo_id);

        jScrollPane3.setViewportView(txtVehiculo_modelo);

        jScrollPane4.setViewportView(txtVehiculo_matricula);

        jScrollPane5.setViewportView(txtVehiculo_kilometrosActuales);

        jScrollPane6.setViewportView(txtVehiculo_fechaAlta);

        jScrollPane7.setViewportView(txtVehiculo_fechaBaja);

        jScrollPane8.setViewportView(txtVehiculo_kilometrosActual);

        jScrollPane9.setViewportView(txtVehiculo_conductorId);

        jScrollPane10.setViewportView(txtVehiculo_empresaId);

        btnVehiculo_volver.setText("Volver");
        btnVehiculo_volver.setActionCommand("");
        btnVehiculo_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculo_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVehiculo_kilometrosActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVehiculo_empresaId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVehiculo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_kilometrosAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_conductorId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_fechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehiculo_fechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVehiculo_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehiculo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehiculo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVehiculo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblVehiculo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVehiculo_kilometrosAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVehiculo_fechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVehiculo_fechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVehiculo_conductorId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVehiculo_empresaId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVehiculo_kilometrosActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(btnVehiculo_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVehiculo_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculo_volverActionPerformed
        try {
            this.setVisible(false);
        } catch (Throwable ex) {
            Logger.getLogger(VistaInsertarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnVehiculo_volverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInsertarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInsertarVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInsertarVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVehiculo_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblVehiculo_conductorId;
    private javax.swing.JLabel lblVehiculo_empresaId;
    private javax.swing.JLabel lblVehiculo_fechaAlta;
    private javax.swing.JLabel lblVehiculo_fechaBaja;
    private javax.swing.JLabel lblVehiculo_id;
    private javax.swing.JLabel lblVehiculo_kilometrosActuales;
    private javax.swing.JLabel lblVehiculo_kilometrosAlta;
    private javax.swing.JLabel lblVehiculo_marca;
    private javax.swing.JLabel lblVehiculo_matricula;
    private javax.swing.JLabel lblVehiculo_modelo;
    private javax.swing.JTextPane txtVehiculo_conductorId;
    private javax.swing.JTextPane txtVehiculo_empresaId;
    private javax.swing.JTextPane txtVehiculo_fechaAlta;
    private javax.swing.JTextPane txtVehiculo_fechaBaja;
    private javax.swing.JTextPane txtVehiculo_id;
    private javax.swing.JTextPane txtVehiculo_kilometrosActual;
    private javax.swing.JTextPane txtVehiculo_kilometrosActuales;
    private javax.swing.JTextPane txtVehiculo_marca;
    private javax.swing.JTextPane txtVehiculo_matricula;
    private javax.swing.JTextPane txtVehiculo_modelo;
    // End of variables declaration//GEN-END:variables
}