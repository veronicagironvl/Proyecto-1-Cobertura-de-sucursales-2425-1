
package Interfaz;
//import org.graphstream.ui.swingViewer.ViewPanel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;



public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        //setLocationRelativeTo(null);
        setLocation(400,150);
        setSize(700,500);
        setResizable(false);
        //this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cobertura de Sucursales");
     
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cargararchivos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargararchivos.setText("Cargar Archivos");
        cargararchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargararchivosActionPerformed(evt);
            }
        });
        getContentPane().add(cargararchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 170, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel4.setText(" COBERTURA DE SUCURSALES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 510, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargararchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargararchivosActionPerformed
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
        Menu v2 = new Menu();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cargararchivosActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargararchivos;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
