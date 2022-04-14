package editordetextoproyecto;


import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

public class Fuent extends javax.swing.JDialog {

    
    public Fuent(java.awt.Frame parent, boolean modal) {
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

        pnUno = new javax.swing.JPanel();
        lblFuente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuentes = new javax.swing.JList<>();
        cmbTamaño = new javax.swing.JComboBox<>();
        lblPrueba = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        lblTamaño = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fuente Y Tamaño");
        setAlwaysOnTop(true);
        setName("Fuente"); // NOI18N
        setResizable(false);

        pnUno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFuente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFuente.setForeground(new java.awt.Color(255, 255, 255));
        lblFuente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuente.setText("Fuente");
        pnUno.add(lblFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, -1));

        lstFuentes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFuentesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFuentes);

        pnUno.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 160));

        cmbTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "16", "18", "20", "24", "32" }));
        cmbTamaño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTamañoItemStateChanged(evt);
            }
        });
        pnUno.add(cmbTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, -1));

        lblPrueba.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPrueba.setForeground(new java.awt.Color(255, 255, 255));
        lblPrueba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrueba.setText("Es un palabra de prueba");
        pnUno.add(lblPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 430, 80));

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        pnUno.add(btnAplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        lblTamaño.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTamaño.setForeground(new java.awt.Color(255, 255, 255));
        lblTamaño.setText("Tamaño");
        pnUno.add(lblTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fuente2.1.png"))); // NOI18N
        pnUno.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTamañoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTamañoItemStateChanged
        lblPrueba.setFont(new Font(this.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(cmbTamaño.getSelectedItem()))));
    }//GEN-LAST:event_cmbTamañoItemStateChanged

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        Font f = T.getFont();
        setVisible(false);
        T.setFont(new Font(String.valueOf(dlm.getElementAt(lstFuentes.getSelectedIndex())),Font.PLAIN,f.getSize()));
        T.setFont(new Font(this.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(cmbTamaño.getSelectedItem()))));
        
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void lstFuentesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFuentesValueChanged
       Font f = lblPrueba.getFont();
       lblPrueba.setFont(new Font(String.valueOf(dlm.getElementAt(lstFuentes.getSelectedIndex())),Font.PLAIN,f.getSize()));
    }//GEN-LAST:event_lstFuentesValueChanged

    public void setTextArea(JTextArea M){
        T = M;
    }
    
    private void fuentes(){
        for(String fuente: fuentes ){
            dlm.addElement(fuente);
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fuent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fuent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fuent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fuent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fuent dialog = new Fuent(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblFuente;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPrueba;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JList<String> lstFuentes;
    private javax.swing.JPanel pnUno;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JTextArea T;
    private String fuentes[];
    private DefaultListModel dlm;
}
