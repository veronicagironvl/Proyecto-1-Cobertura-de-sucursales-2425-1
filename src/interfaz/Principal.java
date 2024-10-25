/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import Lista.Grafo;
import Lista.Parada;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.ViewPanel;
import org.graphstream.ui.view.Viewer;



public final class Principal extends javax.swing.JPanel {
    
    private Grafo grafo; 

    public Principal() {
        initComponents();
        grafo = new Grafo();
        inicializarEventos();
    }
        
    private void inicializarEventos() {
        mostrarGrafo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mostrarGrafoActionPerformed(evt);
            }
        });

        actualizarT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actualizarTActionPerformed(evt);
            }
        });

        colocarSucursal.addActionListener(new ActionListener() { // Botón seleccionar sucursal
            public void actionPerformed(ActionEvent evt) {
                colocarSucursalActionPerformed(evt);
            }
        });

        quitarSucursal.addActionListener(new ActionListener() { // Botón deseleccionar sucursal
            public void actionPerformed(ActionEvent evt) {
                quitarSucursalActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        quitarSucursal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        colocarSucursal = new javax.swing.JButton();
        comboParadas = new javax.swing.JComboBox<>();
        mostrarGrafo = new javax.swing.JButton();
        separadorazul = new javax.swing.JLabel();
        actualizarT = new javax.swing.JButton();
        verificarCoberturaTotal = new javax.swing.JButton();
        panelGrafVisual = new javax.swing.JPanel();

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

        quitarSucursal.setBackground(new java.awt.Color(153, 255, 204));
        quitarSucursal.setText("Quitar Sucursal");
        quitarSucursal.setBorder(null);
        quitarSucursal.setBorderPainted(false);
        quitarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarSucursalActionPerformed(evt);
            }
        });
        add(quitarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 140, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("____________________________________________");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Lista de paradas");
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

        colocarSucursal.setBackground(new java.awt.Color(153, 255, 204));
        colocarSucursal.setText("Colocar Sucursal");
        colocarSucursal.setBorder(null);
        colocarSucursal.setBorderPainted(false);
        colocarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colocarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocarSucursalActionPerformed(evt);
            }
        });
        add(colocarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 130, 40));

        comboParadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboParadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboParadas.setAutoscrolls(true);
        comboParadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParadasActionPerformed(evt);
            }
        });
        add(comboParadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 200, -1));

        mostrarGrafo.setBackground(new java.awt.Color(153, 255, 204));
        mostrarGrafo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mostrarGrafo.setText("Actualizar Grafo");
        mostrarGrafo.setBorder(null);
        mostrarGrafo.setBorderPainted(false);
        mostrarGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarGrafoActionPerformed(evt);
            }
        });
        add(mostrarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 140, 50));

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

        verificarCoberturaTotal.setText("Verificar Cobertura Total");
        add(verificarCoberturaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));
        add(panelGrafVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void quitarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarSucursalActionPerformed
        String nombreParada = comboParadas.getSelectedItem().toString();
        Parada parada = grafo.buscarParada(nombreParada);

        if (parada != null) {
            grafo.removerSucursal(parada);
            JOptionPane.showMessageDialog(this, "Sucursal removida de: " + nombreParada);
            mostrarGrafoActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Parada no encontrada en la red.");
        }
    }//GEN-LAST:event_quitarSucursalActionPerformed

    private void actualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarTActionPerformed
        try {
            int nuevoT = Integer.parseInt(jTextField1.getText().trim());
            grafo.setT(nuevoT);
            JOptionPane.showMessageDialog(this, "Valor de t actualizado a: " + nuevoT);
            mostrarGrafoActionPerformed(evt);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para t.");
        }
    }//GEN-LAST:event_actualizarTActionPerformed

    private void mostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarGrafoActionPerformed
        Graph grafoVisual = new SingleGraph("Grafo de Transporte");

        grafo.getNodos().forEach(parada -> {
            String nombreParada = parada.getNombre();
            if (grafoVisual.getNode(nombreParada) == null) {
                grafoVisual.addNode(nombreParada).setAttribute("ui.label", nombreParada);
            }

            parada.getConexiones().forEach(conexion -> {
                String nombreConexion = conexion.getDestino().getNombre();
                String idArista = nombreParada + "-" + nombreConexion;
                
                if (grafoVisual.getEdge(idArista) == null && grafoVisual.getEdge(nombreConexion + "-" + nombreParada) == null) {
                    grafoVisual.addEdge(idArista, nombreParada, nombreConexion);
                }
            });
        });

        Viewer viewer = new Viewer(grafoVisual, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = viewer.addDefaultView(false);

        panelGrafVisual.removeAll();
        panelGrafVisual.setLayout(new BorderLayout());
        panelGrafVisual.add(viewPanel, BorderLayout.CENTER);
        panelGrafVisual.revalidate();
        panelGrafVisual.repaint();
    }//GEN-LAST:event_mostrarGrafoActionPerformed

    private void comboParadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboParadasActionPerformed

    private void colocarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarSucursalActionPerformed
        String nombreParada = comboParadas.getSelectedItem().toString();
        Parada parada = grafo.buscarParada(nombreParada);

        if (parada != null) {
            grafo.colocarSucursal(parada);
            JOptionPane.showMessageDialog(this, "Sucursal colocada en: " + nombreParada);
            mostrarGrafoActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Parada no encontrada en la red.");
        }
    }//GEN-LAST:event_colocarSucursalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarT;
    private javax.swing.JButton colocarSucursal;
    private javax.swing.JComboBox<String> comboParadas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mostrarGrafo;
    private javax.swing.JPanel panelGrafVisual;
    private javax.swing.JButton quitarSucursal;
    private javax.swing.JLabel separadorazul;
    private javax.swing.JButton verificarCoberturaTotal;
    // End of variables declaration//GEN-END:variables
}
