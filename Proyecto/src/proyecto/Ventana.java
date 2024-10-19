
package proyecto;
import org.graphstream.ui.view.Viewer;
//import org.graphstream.ui.swingViewer.ViewPanel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import proyecto.Menu.java;



public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setLocation(400,150);
        setSize(500,500);
        setResizable(false);
        //this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cobertura de Sucursales");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cargararchivos = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargararchivos.setText("Cargar Archivos");
        cargararchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargararchivosActionPerformed(evt);
            }
        });
        getContentPane().add(cargararchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, 30));

        EXIT.setText("X");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 50, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setText("BIENVENIDOS ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel3.setText("     A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("COBERTURA DE SUCURSALES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jButton1.setText("Otra ventana");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

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
        
    }//GEN-LAST:event_cargararchivosActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
       this.dispose();
    }//GEN-LAST:event_EXITActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
       // JFrame ventana2 = new Jframe();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton EXIT;
    private javax.swing.JButton cargararchivos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
