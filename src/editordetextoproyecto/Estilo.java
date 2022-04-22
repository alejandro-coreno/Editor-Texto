
package editordetextoproyecto;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;


public class Estilo extends javax.swing.JDialog {

  
    public Estilo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dlm = new DefaultListModel();
        fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        initComponents();
        lstFuentes.setModel(dlm);
        fuentes();
        
    }
    
    private  void fuentes(){
        for(String fuente: fuentes ){
            dlm.addElement(fuente);
        }
    }
    public void setTextArea(JTextArea M){
        T = M;
    }
    private void cambiarTamaño(){
        lblPrueba.setFont(new Font(this.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(cmbTamaño.getSelectedItem()))));
        
    }
    private void cambiarTamañoFinal(){
       Font f = T.getFont();
       if ((lstFuentes.getSelectedIndex() == -1)){
           T.setFont(new Font(f.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(cmbTamaño.getSelectedItem()))));
       }else{
          T.setFont(new Font(f.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(cmbTamaño.getSelectedItem()))));
          T.setFont(new Font(String.valueOf(dlm.getElementAt(lstFuentes.getSelectedIndex())),Font.PLAIN,f.getSize()));
       }
       
    }
    private void cambiarFuente(){
       Font f = lblPrueba.getFont();
       lblPrueba.setFont(new Font(String.valueOf(dlm.getElementAt(lstFuentes.getSelectedIndex())),Font.PLAIN,f.getSize()));

    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnUno = new javax.swing.JPanel();
        lstListas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuentes = new javax.swing.JList<>();
        lblTamaño = new javax.swing.JLabel();
        cmbTamaño = new javax.swing.JComboBox<>();
        lblPrueba = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        lblFontImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstListas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lstListas.setForeground(new java.awt.Color(255, 255, 255));
        lstListas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lstListas.setText("Fuente");
        pnUno.add(lstListas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 190, -1));

        lstFuentes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFuentesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFuentes);

        pnUno.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 160));

        lblTamaño.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTamaño.setForeground(new java.awt.Color(255, 255, 255));
        lblTamaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTamaño.setText("Tamaño");
        pnUno.add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 120, -1));

        cmbTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "14", "16", "20", "24", "32" }));
        cmbTamaño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTamañoItemStateChanged(evt);
            }
        });
        pnUno.add(cmbTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, -1));

        lblPrueba.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPrueba.setForeground(new java.awt.Color(255, 255, 255));
        lblPrueba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrueba.setText("Es un texto de prueba ");
        pnUno.add(lblPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 470, 110));

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        pnUno.add(btnAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        lblFontImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fuente2.1.png"))); // NOI18N
        pnUno.add(lblFontImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstFuentesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFuentesValueChanged
        this.cambiarFuente();
    }//GEN-LAST:event_lstFuentesValueChanged

    private void cmbTamañoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTamañoItemStateChanged
        this.cambiarTamaño();
    }//GEN-LAST:event_cmbTamañoItemStateChanged

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        this.setVisible(false);
        this.cambiarTamañoFinal();
    }//GEN-LAST:event_btnAplicarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Estilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estilo dialog = new Estilo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAplicar;
    private javax.swing.JComboBox<String> cmbTamaño;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFontImage;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JList<String> lstFuentes;
    private javax.swing.JLabel lstListas;
    private javax.swing.JPanel pnUno;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTextArea T;
    private String fuentes[];
    private DefaultListModel dlm;
}
