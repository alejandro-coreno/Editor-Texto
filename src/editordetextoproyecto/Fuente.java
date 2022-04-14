
package editordetextoproyecto;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;


public class Fuente extends javax.swing.JDialog {

   
    public Fuente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        dlm = new DefaultListModel();
        fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        initComponents();
        lstFuentes.setModel(dlm);
        fuentes();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFuente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuentes = new javax.swing.JList<>();
        lblTamaño = new javax.swing.JLabel();
        lblPrueba = new javax.swing.JLabel();
        btnaplicar = new javax.swing.JButton();
        cmbTamaño = new javax.swing.JComboBox<>();
        lblfontImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fuente y Tamaño");
        setAlwaysOnTop(true);
        setName("Fuente"); // NOI18N
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFuente.setBackground(new java.awt.Color(255, 255, 255));
        lblFuente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFuente.setForeground(new java.awt.Color(255, 255, 255));
        lblFuente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuente.setText("Fuente");
        jPanel1.add(lblFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, -1));

        lstFuentes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFuentesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFuentes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        lblTamaño.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTamaño.setForeground(new java.awt.Color(255, 255, 255));
        lblTamaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTamaño.setText("Tamaño");
        jPanel1.add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, -1));

        lblPrueba.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPrueba.setForeground(new java.awt.Color(255, 255, 255));
        lblPrueba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrueba.setText("Este es un texto de prueba");
        jPanel1.add(lblPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 440, 100));

        btnaplicar.setBackground(new java.awt.Color(102, 102, 102));
        btnaplicar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnaplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aplicar1.jpg"))); // NOI18N
        btnaplicar.setText("Aplicar");
        btnaplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btnaplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        cmbTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "20", "32" }));
        cmbTamaño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTamañoItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 70, -1));

        lblfontImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fuente2.1.png"))); // NOI18N
        jPanel1.add(lblfontImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaplicarActionPerformed
        this.setVisible(false);
        this.cambiarTamañoFinal();
    }//GEN-LAST:event_btnaplicarActionPerformed

    private void lstFuentesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFuentesValueChanged
        cambiarFuente();
    }//GEN-LAST:event_lstFuentesValueChanged

    private void cmbTamañoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTamañoItemStateChanged
       this.cambiarTamaño();
    }//GEN-LAST:event_cmbTamañoItemStateChanged
    
    public void setTextArea(JTextArea M){
        T = M;
    }
    private void fuentes(){
        for(String fuente: fuentes ){
            dlm.addElement(fuente);
        }
    }
    
    private void cambiarTamaño(){
        lblPrueba.setFont(new Font(this.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(cmbTamaño.getSelectedItem()))));
    }
    private void cambiarTamañoFinal(){
       Font f = T.getFont();
       if (lstFuentes.getSelectedIndex() == -1){
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
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fuente dialog = new Fuente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnaplicar;
    private javax.swing.JComboBox<String> cmbTamaño;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblfontImage;
    private javax.swing.JList<String> lstFuentes;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTextArea T;
    private String fuentes[];
    private DefaultListModel dlm;
}
