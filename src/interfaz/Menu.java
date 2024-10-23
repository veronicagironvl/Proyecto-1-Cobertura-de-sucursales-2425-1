/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;
import java.awt.BorderLayout;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 *
 * @author rtkn0_z8ls
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setDate();
        showprincipal();
        
        
    }
    public void showprincipal(){
        Bienvenida pl = new Bienvenida();
        pl.setVisible(true);
        pl.setSize(1037,448);
        pl.setLocation(0,0);
        
        principal.removeAll();
        principal.add(pl, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        subirarchivo = new javax.swing.JButton();
        nuevalinea = new javax.swing.JButton();
        sucursales = new javax.swing.JButton();
        principal1 = new javax.swing.JButton();
        principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(153, 255, 204));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        date.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(date)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(date)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(102, 255, 204));
        menu.setMaximumSize(new java.awt.Dimension(274, 648));
        menu.setMinimumSize(new java.awt.Dimension(274, 648));
        menu.setName(""); // NOI18N
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        titulo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setText("Cobertura de ");

        line.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        line.setForeground(new java.awt.Color(0, 0, 0));
        line.setText("___________");

        titulo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo2.setText("sucursales");

        subirarchivo.setBackground(new java.awt.Color(153, 255, 204));
        subirarchivo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        subirarchivo.setForeground(new java.awt.Color(0, 0, 0));
        subirarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/subir archivo icon.png"))); // NOI18N
        subirarchivo.setText("Subir Archivo");
        subirarchivo.setBorder(null);
        subirarchivo.setBorderPainted(false);
        subirarchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subirarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirarchivoActionPerformed(evt);
            }
        });

        nuevalinea.setBackground(new java.awt.Color(153, 255, 204));
        nuevalinea.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nuevalinea.setForeground(new java.awt.Color(0, 0, 0));
        nuevalinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add icon.png"))); // NOI18N
        nuevalinea.setText("Nueva Linea");
        nuevalinea.setBorder(null);
        nuevalinea.setBorderPainted(false);
        nuevalinea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevalinea.setMaximumSize(new java.awt.Dimension(95, 16));
        nuevalinea.setMinimumSize(new java.awt.Dimension(95, 16));
        nuevalinea.setPreferredSize(new java.awt.Dimension(95, 16));
        nuevalinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevalineaActionPerformed(evt);
            }
        });

        sucursales.setBackground(new java.awt.Color(153, 255, 204));
        sucursales.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sucursales.setForeground(new java.awt.Color(0, 0, 0));
        sucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sucursal icon.png"))); // NOI18N
        sucursales.setText("Cobertura de Sucursales");
        sucursales.setBorder(null);
        sucursales.setBorderPainted(false);
        sucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sucursales.setMaximumSize(new java.awt.Dimension(95, 24));
        sucursales.setMinimumSize(new java.awt.Dimension(95, 24));
        sucursales.setPreferredSize(new java.awt.Dimension(95, 16));
        sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalesActionPerformed(evt);
            }
        });

        principal1.setBackground(new java.awt.Color(153, 255, 204));
        principal1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        principal1.setForeground(new java.awt.Color(0, 0, 0));
        principal1.setText("Principal");
        principal1.setBorder(null);
        principal1.setBorderPainted(false);
        principal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(titulo2))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(titulo1)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(nuevalinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subirarchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(principal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sucursales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(titulo2))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(titulo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(principal1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subirarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nuevalinea, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        principal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nuevalineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevalineaActionPerformed
       Nuevalinea pl = new Nuevalinea();
        pl.setVisible(true);
        pl.setSize(1037,448);
        pl.setLocation(0,0);
        
        principal.removeAll();
        principal.add(pl, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_nuevalineaActionPerformed

    private void sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucursalesActionPerformed

    private void principal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principal1ActionPerformed
        Principal v1 = new Principal();
        v1.setVisible(true);
        v1.setSize(1032,438);
        v1.setLocation(0,0);
        
        principal.removeAll();
        principal.add(v1, BorderLayout.CENTER);
        principal.revalidate();
        principal.repaint();
    }//GEN-LAST:event_principal1ActionPerformed

    private void subirarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirarchivoActionPerformed
         JFileChooser selarchivo = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(" Archivos JSON", "json");
        selarchivo.setFileFilter(filter);
        int val = selarchivo.showOpenDialog(null);
        if (val == JFileChooser.APPROVE_OPTION){
            if(selarchivo.getSelectedFile() != null){
            JOptionPane.showMessageDialog(null,"El archvo seleccionado es: " +
            selarchivo.getSelectedFile().getName());}}
        else {
            JOptionPane.showMessageDialog(null,"Archivo no seleccionado");
        }
    }//GEN-LAST:event_subirarchivoActionPerformed
    private void setDate(){
        Calendar fechaActual = Calendar.getInstance();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        //int mes = fechaActual.get(Calendar.MONTH) + 1; // Los meses se indexan desde 0
        int anio = fechaActual.get(Calendar.YEAR);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        String mes = dateFormat.format(fechaActual.getTime());
        date.setText("Hoy es " +dia+ " de " +mes+ " del " +anio);
         
    }
   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel line;
    private javax.swing.JPanel menu;
    private javax.swing.JButton nuevalinea;
    private javax.swing.JPanel principal;
    private javax.swing.JButton principal1;
    private javax.swing.JButton subirarchivo;
    private javax.swing.JButton sucursales;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
