/**
 * Autor: Gonzalo Santiago García
 * Fecha de creación: 20 de junio del 2022
 * Fecha de actualización: 22 de junio del 2022
 * Descripción: En esta ventana presenta los datos que contendra los datos 
 * solicitados y que se han guardado
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Destino;
import pojo.Transporte;


public class Reservacion extends javax.swing.JFrame {
    //creación de los datos que se ocuparan dentro del programa
     private DefaultTableModel modelDestino;
     private DefaultTableModel modelTransporte;
     private Destino destino;
     private Transporte transporte;
    public Reservacion() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * 
     * @param destin: pasa los parámetros de la clase destino
     * @param transport pasa los parámetros de la clase transporte
     */
    public Reservacion(Destino destin, Transporte transport) {
        initComponents();
        this.destino=destin;
        this.transporte=transport;
        //se declara la tabla y se obtiene los datos de la tabla
        
        modelDestino=(DefaultTableModel)jTable1.getModel();
        modelTransporte=(DefaultTableModel)jTable2.getModel();
        //hace la llamada de la función mostrarSilicitudDestino
        mostrarSolicitudDestino();
        //hace la llamada de la función mostrarSolicitudTransporte
        mostrarSoliciudTransporte();
    }
    
    /**
     * Declaramos una función mostrarSolicitudDestino y le envia esos datos a la
     * tablay ademas se crea un objeto que obtendrá atributos de la clase destino
     */
       public void mostrarSolicitudDestino() {
        modelDestino.setRowCount(0);

        Object[] fila = new Object[5];
        fila[0] = destino.getIdlugar();
        fila[1] = destino.getNombre();
        fila[2] = destino.getCodigoPost();
        fila[3] = destino.getDireccion();
        fila[4] = destino.getTelefono();
        modelDestino.addRow(fila);
    }
    
       /**
        * Declara el métodoMostrarSolicitudTransporte y los añade a la tabla
        */
          public void mostrarSoliciudTransporte() {
        modelTransporte.setRowCount(0);
        //se crea un objeto de tipo fila que através de ello se puede obtener la 
        //la posición 
        Object[] fila = new Object[5];
        fila[0] = transporte.getIdTranspor();
        fila[1] = transporte.getNombreTransport();
        fila[2] = transporte.getNumAsiento();
        fila[3] = transporte.getPrecio();
        modelTransporte.addRow(fila);
    }
          public void confirmarSalida(){
        int valor= JOptionPane.showConfirmDialog(this, 
                "¿Está seguro cancelar la impresión "
                , "ADVERTENCIA",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
           this.hide();
        }
          }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanelReservacion = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jTextFielSolicitar = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelReservacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir.png"))); // NOI18N
        jButtonSalir.setToolTipText("Salir");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelReservacion.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 70, 40));

        jTextFielSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielSolicitarActionPerformed(evt);
            }
        });
        jPanelReservacion.add(jTextFielSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 220, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanelReservacion.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 220, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanelReservacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Apellidos:");
        jPanelReservacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Teléfono:");
        jPanelReservacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));
        jPanelReservacion.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Nombre fiscal\nAGENCIA DE VIAJES MIAHUATLÁN\nDE PORFIRIO DIÁZ\nTel. 951 237 66 45");
        jScrollPane1.setViewportView(jTextArea1);

        jPanelReservacion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 270, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Número de asientos", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanelReservacion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 670, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Destino", "Código Postal", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanelReservacion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 670, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imprimir.png"))); // NOI18N
        jButton1.setToolTipText("Imprimir");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelReservacion.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 70, 40));

        desktopPane.add(jPanelReservacion);
        jPanelReservacion.setBounds(0, 0, 760, 450);

        fileMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/curriculum.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Reservación");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        openMenuItem.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina-de-inicio.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Inicio");
        openMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transporte.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Transporte");
        saveMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
       /**
        * instancia la ventana Transporte y lo oculta
        */
        new TransporteView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
      /**
       * instancia la ventana Principal y lo oculta
       */
        new Principal().setVisible(true);
        this.hide();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jTextFielSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielSolicitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielSolicitarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       //hace la llamada al método confirmarSalida
        confirmarSalida();       
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
       jButtonSalir.setBackground(Color.red);
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
       jButtonSalir.setBackground(Color.white);
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

  // método pricipal
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelReservacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFielSolicitar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables


}
