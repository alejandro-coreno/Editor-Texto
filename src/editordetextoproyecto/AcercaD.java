
package editordetextoproyecto;


public class AcercaD extends javax.swing.JDialog {

    
    public AcercaD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnUNo = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        lblaplicacion = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        lblname2 = new javax.swing.JLabel();
        lblname3 = new javax.swing.JLabel();
        lblFontImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de...");
        setName("Acerca"); // NOI18N

        pnUNo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Berry Application 2022(versión 0.7.75)");
        pnUNo.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lblaplicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblaplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblaplicacion.setText("Aplicacion realizada por :");
        pnUNo.add(lblaplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        lblname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname1.setForeground(new java.awt.Color(255, 255, 255));
        lblname1.setText("Josue Alejandro Coreño Camacho");
        pnUNo.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        lblname2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname2.setForeground(new java.awt.Color(255, 255, 255));
        lblname2.setText("Diego Garcia Bautista");
        pnUNo.add(lblname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        lblname3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname3.setForeground(new java.awt.Color(255, 255, 255));
        lblname3.setText("Yael Aldair Hernandez Cruz");
        pnUNo.add(lblname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        lblFontImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fondo.png"))); // NOI18N
        pnUNo.add(lblFontImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(AcercaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AcercaD dialog = new AcercaD(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblFontImage;
    private javax.swing.JLabel lblaplicacion;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblname3;
    private javax.swing.JPanel pnUNo;
    // End of variables declaration//GEN-END:variables
}
