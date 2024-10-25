/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import Lista.Grafo;
import javax.swing.JOptionPane;



public final class Principal extends javax.swing.JPanel {
    
    private Grafo grafo; 

    public Principal() {
        initComponents();
        grafo = new Grafo();
        
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        mostrargrafo = new javax.swing.JButton();
        separadorazul = new javax.swing.JLabel();
        actualizarT = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1032, 438));
        setMinimumSize(new java.awt.Dimension(1032, 438));
        setPreferredSize(new java.awt.Dimension(1032, 438));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 50, 390));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor de \" T \" ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 100, 20));

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setText("Deseleccionar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 140, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("____________________________________________");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modificar Sucursales");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Introduzca un numero");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 140, 20));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Seleccionar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 130, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setAutoscrolls(true);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 200, -1));

        mostrargrafo.setBackground(new java.awt.Color(153, 255, 204));
        mostrargrafo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mostrargrafo.setText("MOSTRAR GRAFOS");
        mostrargrafo.setBorder(null);
        mostrargrafo.setBorderPainted(false);
        mostrargrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(mostrargrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 320, 50));

        separadorazul.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        separadorazul.setForeground(new java.awt.Color(102, 255, 204));
        separadorazul.setText("_____________________________");
        add(separadorazul, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 259, 270, 20));

        actualizarT.setText("Actualizar t");
        actualizarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarTActionPerformed(evt);
            }
        });
        add(actualizarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void actualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarTActionPerformed
       try {
            int nuevoT = Integer.parseInt(jTextField1.getText().trim());
            grafo.setT(nuevoT);  // Actualizar t en la instancia de Grafo
            JOptionPane.showMessageDialog(this, "Valor de t actualizado a: " + nuevoT);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para t.");
        } 
    }//GEN-LAST:event_actualizarTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mostrargrafo;
    private javax.swing.JLabel separadorazul;
    // End of variables declaration//GEN-END:variables
}
