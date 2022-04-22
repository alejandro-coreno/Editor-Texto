
package editordetextoproyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;



public class Main extends javax.swing.JFrame implements Printable {

    
    public Main() {
        initComponents();
        setIconImage(getIconImage());
    }

    @Override
    
    public Image getIconImage(){
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/icono1.png"));
        return retvalue;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooserOpen = new javax.swing.JFileChooser();
        FileChooserSave = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        btnnuevo = new javax.swing.JButton();
        JS1 = new javax.swing.JToolBar.Separator();
        btnOpen = new javax.swing.JButton();
        JS2 = new javax.swing.JToolBar.Separator();
        btnSave = new javax.swing.JButton();
        JS3 = new javax.swing.JToolBar.Separator();
        btnImprimir = new javax.swing.JButton();
        JS4 = new javax.swing.JToolBar.Separator();
        btnCortar = new javax.swing.JButton();
        JS5 = new javax.swing.JToolBar.Separator();
        btnCopy = new javax.swing.JButton();
        JS7 = new javax.swing.JToolBar.Separator();
        btnPaste = new javax.swing.JButton();
        JS8 = new javax.swing.JToolBar.Separator();
        btnDeshacer = new javax.swing.JButton();
        JS9 = new javax.swing.JToolBar.Separator();
        btnRehacer = new javax.swing.JButton();
        jS10 = new javax.swing.JToolBar.Separator();
        btnSeleccionarAll = new javax.swing.JButton();
        JS11 = new javax.swing.JToolBar.Separator();
        btnColor = new javax.swing.JButton();
        JS12 = new javax.swing.JToolBar.Separator();
        btnFuente = new javax.swing.JButton();
        JS13 = new javax.swing.JToolBar.Separator();
        btnAyuda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        mnArchivoNew = new javax.swing.JMenuItem();
        mnArchivoOpen = new javax.swing.JMenuItem();
        mnArchivoSave = new javax.swing.JMenuItem();
        mnArchivoImprimir = new javax.swing.JMenuItem();
        mnArchivoExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnEditDeshacer = new javax.swing.JMenuItem();
        mnEditRehacer = new javax.swing.JMenuItem();
        mnEditCut = new javax.swing.JMenuItem();
        mnEditCopy = new javax.swing.JMenuItem();
        mnEditPaste = new javax.swing.JMenuItem();
        mnEditSeleccionar = new javax.swing.JMenuItem();
        mnDiseño = new javax.swing.JMenu();
        mnDiseñoColor = new javax.swing.JMenuItem();
        mnDiseñoFuente = new javax.swing.JMenuItem();
        mnhelp = new javax.swing.JMenu();
        mnVerAyuda = new javax.swing.JMenuItem();
        mnAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de texto");
        setAlwaysOnTop(true);
        setBackground(java.awt.SystemColor.activeCaption);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setName("Principal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jToolBar1.setBackground(new java.awt.Color(5, 44, 72));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nuevo.png"))); // NOI18N
        btnnuevo.setToolTipText("Nuevo Ctrl+N");
        btnnuevo.setFocusable(false);
        btnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnuevo);
        jToolBar1.add(JS1);

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/abrir.png"))); // NOI18N
        btnOpen.setToolTipText("Abrir Ctrl+O");
        btnOpen.setFocusable(false);
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpen);
        jToolBar1.add(JS2);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Guardar.png"))); // NOI18N
        btnSave.setToolTipText("Guardar Ctrl+S");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);
        jToolBar1.add(JS3);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imprimir.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir Ctrl + P");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimir);
        jToolBar1.add(JS4);

        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cortar.png"))); // NOI18N
        btnCortar.setToolTipText("Cortar Ctrl+X");
        btnCortar.setFocusable(false);
        btnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCortar);
        jToolBar1.add(JS5);

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/copiar.png"))); // NOI18N
        btnCopy.setToolTipText("Copiar Ctrl+V");
        btnCopy.setFocusable(false);
        btnCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopy);
        jToolBar1.add(JS7);

        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pegar.png"))); // NOI18N
        btnPaste.setToolTipText("Pegar Ctrl+C");
        btnPaste.setFocusable(false);
        btnPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPaste);
        jToolBar1.add(JS8);

        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/deshacer .png"))); // NOI18N
        btnDeshacer.setToolTipText("Deshacer Ctrl+Z");
        btnDeshacer.setFocusable(false);
        btnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDeshacer);
        jToolBar1.add(JS9);

        btnRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rehacer .png"))); // NOI18N
        btnRehacer.setToolTipText("Rehacer Ctrl+Y");
        btnRehacer.setFocusable(false);
        btnRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnRehacer);
        jToolBar1.add(jS10);

        btnSeleccionarAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Seleccionar_todo.png"))); // NOI18N
        btnSeleccionarAll.setToolTipText("Seleccionar todo Ctrl+A");
        btnSeleccionarAll.setFocusable(false);
        btnSeleccionarAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeleccionarAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeleccionarAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarAllActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSeleccionarAll);
        jToolBar1.add(JS11);

        btnColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/color.jpg"))); // NOI18N
        btnColor.setToolTipText("Color Ctrl + J ");
        btnColor.setFocusable(false);
        btnColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnColor);
        jToolBar1.add(JS12);

        btnFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fuente_tamaño.png"))); // NOI18N
        btnFuente.setToolTipText("Fuente y tamaño Ctrl + F  ");
        btnFuente.setFocusable(false);
        btnFuente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuenteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFuente);
        jToolBar1.add(JS13);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ayuda.png"))); // NOI18N
        btnAyuda.setToolTipText("Accesos directos Ctrl + F1 ");
        btnAyuda.setFocusable(false);
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAyuda);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 0));

        mnArchivo.setText("Archivo");

        mnArchivoNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnArchivoNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nuevo.png"))); // NOI18N
        mnArchivoNew.setText("Nuevo");
        mnArchivoNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchivoNewActionPerformed(evt);
            }
        });
        mnArchivo.add(mnArchivoNew);

        mnArchivoOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnArchivoOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/abrir.png"))); // NOI18N
        mnArchivoOpen.setText("Abrir");
        mnArchivoOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchivoOpenActionPerformed(evt);
            }
        });
        mnArchivo.add(mnArchivoOpen);

        mnArchivoSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnArchivoSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Guardar.png"))); // NOI18N
        mnArchivoSave.setText("Guardar");
        mnArchivoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchivoSaveActionPerformed(evt);
            }
        });
        mnArchivo.add(mnArchivoSave);

        mnArchivoImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnArchivoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imprimir.png"))); // NOI18N
        mnArchivoImprimir.setText("Imprimir");
        mnArchivoImprimir.setToolTipText("");
        mnArchivoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchivoImprimirActionPerformed(evt);
            }
        });
        mnArchivo.add(mnArchivoImprimir);

        mnArchivoExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnArchivoExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Salir.png"))); // NOI18N
        mnArchivoExit.setText("Salir");
        mnArchivoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchivoExitActionPerformed(evt);
            }
        });
        mnArchivo.add(mnArchivoExit);

        jMenuBar1.add(mnArchivo);

        mnEdit.setText("Editar");

        mnEditDeshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/deshacer .png"))); // NOI18N
        mnEditDeshacer.setText("Deshacer");
        mnEditDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditDeshacerActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditDeshacer);

        mnEditRehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rehacer .png"))); // NOI18N
        mnEditRehacer.setText("Rehacer");
        mnEdit.add(mnEditRehacer);

        mnEditCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cortar.png"))); // NOI18N
        mnEditCut.setText("Cortar");
        mnEditCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditCutActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditCut);

        mnEditCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/copiar.png"))); // NOI18N
        mnEditCopy.setText("Copiar");
        mnEditCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditCopyActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditCopy);

        mnEditPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pegar.png"))); // NOI18N
        mnEditPaste.setText("Pegar");
        mnEditPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditPasteActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditPaste);

        mnEditSeleccionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Seleccionar_todo.png"))); // NOI18N
        mnEditSeleccionar.setText("Seleccionar todo");
        mnEditSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditSeleccionarActionPerformed(evt);
            }
        });
        mnEdit.add(mnEditSeleccionar);

        jMenuBar1.add(mnEdit);

        mnDiseño.setText("Diseño");

        mnDiseñoColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDiseñoColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/color.jpg"))); // NOI18N
        mnDiseñoColor.setText("Color");
        mnDiseñoColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiseñoColorActionPerformed(evt);
            }
        });
        mnDiseño.add(mnDiseñoColor);

        mnDiseñoFuente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDiseñoFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fuente_tamaño.png"))); // NOI18N
        mnDiseñoFuente.setText("Tamaño y fuente");
        mnDiseñoFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiseñoFuenteActionPerformed(evt);
            }
        });
        mnDiseño.add(mnDiseñoFuente);

        jMenuBar1.add(mnDiseño);

        mnhelp.setText("Ayuda");

        mnVerAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnVerAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ayuda.png"))); // NOI18N
        mnVerAyuda.setText("Accesos Directos");
        mnVerAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerAyudaActionPerformed(evt);
            }
        });
        mnhelp.add(mnVerAyuda);

        mnAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/acerca-de.png"))); // NOI18N
        mnAcerca.setText("Acerda de...");
        mnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAcercaActionPerformed(evt);
            }
        });
        mnhelp.add(mnAcerca);

        jMenuBar1.add(mnhelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnArchivoOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchivoOpenActionPerformed
        this.Openfile();
        nuevo = true;
    }//GEN-LAST:event_mnArchivoOpenActionPerformed

    private void mnArchivoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchivoSaveActionPerformed
        nuevo = true;
        this.saveFile();
        nuevo = true;
    }//GEN-LAST:event_mnArchivoSaveActionPerformed

    private void mnEditCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditCutActionPerformed
        jTextArea.cut(); // Cortar
    }//GEN-LAST:event_mnEditCutActionPerformed

    private void mnEditCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditCopyActionPerformed
        jTextArea.copy(); // Copiar
    }//GEN-LAST:event_mnEditCopyActionPerformed

    private void mnEditPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditPasteActionPerformed
        jTextArea.paste(); // Pegar
    }//GEN-LAST:event_mnEditPasteActionPerformed

    private void mnEditSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditSeleccionarActionPerformed
        jTextArea.selectAll(); // Seleccionar todo
    }//GEN-LAST:event_mnEditSeleccionarActionPerformed

    private void mnEditDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditDeshacerActionPerformed
        Stack pila = new Stack();
        String datospila = "";
        deshacer = true;
        contenidoCaja = jTextArea.getText();
        String arregloLLeno[] = contenidoCaja.split(" ");
        for (int i = 0; i<arregloLLeno.length; i++){
            pila.push(arregloLLeno[i]);
        }
      
        
        while((!pila.empty() && (deshacer == true))){
            pila.pop();
            deshacer = false;
        }
        
        for(Object elemento : pila){
            datospila += elemento+" ";
            jTextArea.setText(datospila + " "); 
            System.out.println(pila.size());
        }
         if(pila.size() == 1){
                jTextArea.setText(" ");
            }
    }//GEN-LAST:event_mnEditDeshacerActionPerformed

    private void mnArchivoNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchivoNewActionPerformed
        valor = jTextArea.getText();
        if((!valor.isEmpty())&& (!valor.isBlank())){
            if(nuevo == false){
                option  = JOptionPane.showConfirmDialog(this,
                                              "Desea guardar::",
                                              "Guardar",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
            if ((!valor.isEmpty()) && (!valor.isBlank()) && (nuevo == true)){
                jTextArea.setText("");
                nuevo = false;
                return;
            }
            
             
            if(option  == JOptionPane.YES_OPTION){
                this.saveFile();
                nuevo = false;
                this.jTextArea.setText("");
            }
            else if(option == JOptionPane.NO_OPTION){
                this.jTextArea.setText("");
            }
            
        }
      
    }//GEN-LAST:event_mnArchivoNewActionPerformed

    private void mnDiseñoColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiseñoColorActionPerformed
       this.color();
    }//GEN-LAST:event_mnDiseñoColorActionPerformed

    private void mnArchivoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchivoExitActionPerformed
        this.CloseWindow();
    }//GEN-LAST:event_mnArchivoExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.CloseWindow();
    }//GEN-LAST:event_formWindowClosing

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        valor = jTextArea.getText();
        if((!valor.isEmpty())&& (!valor.isBlank())){
            if(nuevo == false){
                option  = JOptionPane.showConfirmDialog(this,
                                              "Desea guardar::",
                                              "Guardar",
                                              JOptionPane.INFORMATION_MESSAGE);
            }
            if ((!valor.isEmpty()) && (!valor.isBlank()) && (nuevo == true)){
                jTextArea.setText("");
                nuevo = false;
                return;
            }
            
             
            if(option  == JOptionPane.YES_OPTION){
                this.saveFile();
                nuevo = false;
                this.jTextArea.setText("");
            }
            else if(option == JOptionPane.NO_OPTION){
                this.jTextArea.setText("");
            }
            
        }
    }//GEN-LAST:event_btnnuevoActionPerformed
    
    private void color(){
        java.awt.Color c = JColorChooser.showDialog(this, "Selecione un color ",this.getForeground());
        jTextArea.setForeground(c);
    }
    
    private void mnDiseñoFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiseñoFuenteActionPerformed
        Fuente F = new Fuente(this,true);
        F.setTextArea(jTextArea);
        F.setVisible(true);
    }//GEN-LAST:event_mnDiseñoFuenteActionPerformed

    private void mnVerAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerAyudaActionPerformed
        Ayuda A = new Ayuda(this, true);
        A.setVisible(true);
    }//GEN-LAST:event_mnVerAyudaActionPerformed

    private void mnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAcercaActionPerformed
        AcercaD D = new AcercaD(this,true);
        D.setVisible(true);
    }//GEN-LAST:event_mnAcercaActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        this.Openfile();
        nuevo = true;
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        nuevo = true;
        this.saveFile();
        nuevo = true;
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        jTextArea.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        jTextArea.copy();
    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        jTextArea.paste();
    }//GEN-LAST:event_btnPasteActionPerformed

    private void btnSeleccionarAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarAllActionPerformed
       jTextArea.selectAll();
    }//GEN-LAST:event_btnSeleccionarAllActionPerformed

    private void mnArchivoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchivoImprimirActionPerformed
        try {
            PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if (top) {
                gap.print();
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_mnArchivoImprimirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
            PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if (top) {
                gap.print();
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        this.color();
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuenteActionPerformed
        Fuente F = new Fuente(this,true);
        F.setTextArea(jTextArea);
        F.setVisible(true);
    }//GEN-LAST:event_btnFuenteActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        Ayuda A = new Ayuda(this,true);
        A.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed
    public void Openfile(){
        FileChooserOpen.setDialogTitle("Abrir documento");
        int opcion = this.FileChooserOpen.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            File Archivo = FileChooserOpen.getSelectedFile();
            Scanner s = null  ;
            try{
                s = new Scanner(Archivo);
            }catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(this,
                                              "El Archivo no se puede abrir para su modificacion",
                                              "Error :: Apertura del Archivo",
                                               JOptionPane.ERROR_MESSAGE);
            }
            String str = "";
            
            while(s.hasNextLine()){
                str += (s.nextLine() + "\n");
            }
            s.close();
            
            this.jTextArea.setText(str); 
            
            
        }
        
        
    }
    
    public void saveFile(){
       FileChooserSave.setDialogTitle("Guardar documento");
       int opcion = this.FileChooserSave.showSaveDialog(this);
       
       if(opcion == JFileChooser.APPROVE_OPTION){
           File Archivo = FileChooserSave.getSelectedFile();
           
           try{
              PrintWriter  write = new PrintWriter(Archivo.getAbsolutePath(), "UTF-8");
              write.println(jTextArea.getText());
              write.close();
              
           }catch(FileNotFoundException | UnsupportedEncodingException ex){
               JOptionPane.showMessageDialog(this,
                                            "El archivo no se puede guardar " +
                                            "en la dirrecion indicada.",
                                            "Error :: Apertura del archivo",
                                            JOptionPane.ERROR_MESSAGE);
           }
       }
      
    }
    private void CloseWindow(){
        int option = JOptionPane.showConfirmDialog(this,
                                                    "¿Desea cerrar la aplicacion",
                                                    "Cerrar ::",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION){
            this.dispose();
            System.exit(0);
        }
        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooserOpen;
    private javax.swing.JFileChooser FileChooserSave;
    private javax.swing.JToolBar.Separator JS1;
    private javax.swing.JToolBar.Separator JS11;
    private javax.swing.JToolBar.Separator JS12;
    private javax.swing.JToolBar.Separator JS13;
    private javax.swing.JToolBar.Separator JS2;
    private javax.swing.JToolBar.Separator JS3;
    private javax.swing.JToolBar.Separator JS4;
    private javax.swing.JToolBar.Separator JS5;
    private javax.swing.JToolBar.Separator JS7;
    private javax.swing.JToolBar.Separator JS8;
    private javax.swing.JToolBar.Separator JS9;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnFuente;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSeleccionarAll;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jS10;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnAcerca;
    public javax.swing.JMenu mnArchivo;
    private javax.swing.JMenuItem mnArchivoExit;
    private javax.swing.JMenuItem mnArchivoImprimir;
    private javax.swing.JMenuItem mnArchivoNew;
    private javax.swing.JMenuItem mnArchivoOpen;
    private javax.swing.JMenuItem mnArchivoSave;
    private javax.swing.JMenu mnDiseño;
    private javax.swing.JMenuItem mnDiseñoColor;
    private javax.swing.JMenuItem mnDiseñoFuente;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenuItem mnEditCopy;
    private javax.swing.JMenuItem mnEditCut;
    private javax.swing.JMenuItem mnEditDeshacer;
    private javax.swing.JMenuItem mnEditPaste;
    private javax.swing.JMenuItem mnEditRehacer;
    private javax.swing.JMenuItem mnEditSeleccionar;
    private javax.swing.JMenuItem mnVerAyuda;
    private javax.swing.JMenu mnhelp;
    // End of variables declaration//GEN-END:variables
    private String valor;
    private boolean nuevo = false;
    private int option;
    private String contenidoCaja;
    private boolean deshacer = false;
    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if (index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() + 30, pagfor.getImageableY() + 30);
        hub.scale(1.0, 1.0);

        jTextArea.printAll(graf);
        return PAGE_EXISTS;
    }
    
}
    



