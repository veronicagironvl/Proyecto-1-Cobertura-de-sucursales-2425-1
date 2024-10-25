/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Lista.Parada;
import Lista.Conexion;
import Lista.Linea;
import Lista.ListaDobleEnlazada;
import Lista.ListaParada;
import Lista.Listalinea;
import java.awt.HeadlessException;
import java.io.File;
/**
 *
 * @author rtkn0_z8ls
 */
public class Subirarchivo extends javax.swing.JPanel {
      private File selectedFile;
    /**
     * Creates new form Subirfile
     */
    public Subirarchivo() {
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

        subirfile = new javax.swing.JButton();
        seleccionararchivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        separadorazul = new javax.swing.JLabel();
        nombrearchivo = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1032, 438));
        setMinimumSize(new java.awt.Dimension(1032, 438));
        setPreferredSize(new java.awt.Dimension(1032, 438));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subirfile.setBackground(new java.awt.Color(102, 255, 204));
        subirfile.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        subirfile.setForeground(new java.awt.Color(0, 0, 0));
        subirfile.setText("Subir");
        subirfile.setBorder(null);
        subirfile.setBorderPainted(false);
        subirfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subirfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirfileActionPerformed(evt);
            }
        });
        add(subirfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 120, 50));

        seleccionararchivo.setBackground(new java.awt.Color(102, 255, 204));
        seleccionararchivo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        seleccionararchivo.setForeground(new java.awt.Color(0, 0, 0));
        seleccionararchivo.setText("Seleccionar Archivo");
        seleccionararchivo.setBorder(null);
        seleccionararchivo.setBorderPainted(false);
        seleccionararchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionararchivoActionPerformed(evt);
            }
        });
        add(seleccionararchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 325, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Archivo cargado: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Solo archivos de tipo \"JSON\" ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 27, 14, 390));

        separadorazul.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        separadorazul.setForeground(new java.awt.Color(102, 255, 204));
        separadorazul.setText("_____________________________");
        add(separadorazul, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 270, 20));

        nombrearchivo.setForeground(new java.awt.Color(204, 204, 204));
        nombrearchivo.setText("Nombre del archivo seleccionado.");
        add(nombrearchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/map (1).png"))); // NOI18N
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1120, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionararchivoActionPerformed
          JFileChooser selarchivo = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(" Archivos JSON", "json");
        selarchivo.setFileFilter(filter);
        int val = selarchivo.showOpenDialog(null);
        if (val == JFileChooser.APPROVE_OPTION){
            if(selarchivo.getSelectedFile() != null){
            selectedFile = selarchivo.getSelectedFile();
            JOptionPane.showMessageDialog(null, "El archivo seleccionado es: " + selectedFile.getName());}
        else {
            JOptionPane.showMessageDialog(null,"Archivo no seleccionado");
        }}
    }//GEN-LAST:event_seleccionararchivoActionPerformed

    private void subirfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirfileActionPerformed
        if (isEmpty()){
            //SE MUESTRA UN MENSAJE DE ERROR EN CASO DE QUE NO SE HAYA SELECCIONADO NINGUN ARCHIVO
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo primero");}
        else{
            //Lectura del Json
            String filePath = selectedFile.getAbsolutePath();
            Listalinea listalinea = new Listalinea();
            ListaDobleEnlazada listaparada = new ListaDobleEnlazada();
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Procesa la línea en partes si es necesario
                    // Esto es solo un ejemplo, ajusta según la estructura de tu JSON
                    String jsonString = line.trim();
                    String[] linesection = jsonString.split("\\},\\{");

                    for (String linereader : linesection) {
                        if (linereader.contains("\"Linea") || linereader.contains("\"Av.") || linereader.contains("\"Calle") || linereader.contains("\"Carrera")) {
                            Linea addlinea = new Linea(linereader.replaceAll("[\\[\\]{}\"\\s]", ""));
                            listalinea.agregarAlFinal(addlinea);
                        } else {
                            String[] paradasentries = linereader.split(",");
                            for (String entry : paradasentries) {
                                entry = entry.replaceAll("[\\[\\]{}\"\\s]", "");
                                String[] parada = entry.split(":");
                                for (String paradanew : parada) {
                                    listaparada.agregarAlFinal(new Parada(paradanew.trim()));
                                }
                            }
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,"Los archivos se han cargado correctamente");
                nombrearchivo.setText(selectedFile.getName());
            } catch(HeadlessException | IOException e ){
                JOptionPane.showMessageDialog(null,"Error al leer el archivo: "+e.getMessage());
            }

        }

    }//GEN-LAST:event_subirfileActionPerformed
    private boolean isEmpty(){
        return selectedFile  == null;
    }
   
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombrearchivo;
    private javax.swing.JButton seleccionararchivo;
    private javax.swing.JLabel separadorazul;
    private javax.swing.JButton subirfile;
    // End of variables declaration//GEN-END:variables
}