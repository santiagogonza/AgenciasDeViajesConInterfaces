/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 9 de junio del 2022 
descripción: creo la ventana principal donde presento la lista de los 
 lugares que tengo de recomendocion de miahuatlán 
*/
package view;

import controller.DestinoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pojo.Destino;

public class Principal extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Principal
     */
    private DefaultTableModel modelo;
    Login log = new Login();
    private List<Destino> listaDestino;
    private DestinoController DestinoC;

    public Principal() {
        initComponents();
        this.setSize(975, 580);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        modelo = (DefaultTableModel) jTable1.getModel();

        log.setVisible(false);
        listaDestino = new ArrayList<>();
        DestinoC = new DestinoController();
        agregarDatos();
        mostrarDestino();

    }

    public void mostrarDestino() {
        modelo.setRowCount(0);
        for (int i = 0; i < listaDestino.size(); i++) {
            Object[] fila = new Object[5];
            fila[0] = listaDestino.get(i).getIdlugar();
            fila[1] = listaDestino.get(i).getNombre();
            fila[2] = listaDestino.get(i).getCodigoPost();
            fila[3] = listaDestino.get(i).getDireccion();
            fila[4] = listaDestino.get(i).getTelefono();
            modelo.addRow(fila);
        }
    }

    public void agregarDatos() {
        Destino destino1 = new Destino();
        destino1.setIdlugar(1);
        destino1.setNombre("Santa Cruz Xitla");
        destino1.setCodigoPost(70823);
        destino1.setDireccion("Precidencia Municipal de Xitla");
        destino1.setTelefono("+52 951 512 0300");
        listaDestino.add(destino1);

        Destino destino2 = new Destino();
        destino2.setIdlugar(2);
        destino2.setNombre("San Idelfonso Amatlán");
        destino2.setCodigoPost(70828);
        destino2.setDireccion("Precidencia Municipal Idelfonso");
        destino2.setTelefono("+52 957 572 0438");
        listaDestino.add(destino2);

        Destino destino3 = new Destino();
        destino3.setIdlugar(3);
        destino3.setNombre("Monjas");
        destino3.setCodigoPost(70826);
        destino3.setDireccion("Municipio de Monjas");
        destino3.setTelefono("+52 951 105 3048");
        listaDestino.add(destino3);

        Destino destino4 = new Destino();
        destino4.setIdlugar(4);
        destino4.setNombre("Santo Tomás Tamazulapan");
        destino4.setCodigoPost(70866);
        destino4.setDireccion("Municipio de Tamazulapan");
        destino4.setTelefono("+52 951 510 5089");
        listaDestino.add(destino4);

        Destino destino5 = new Destino();
        destino5.setIdlugar(5);
        destino5.setNombre("Santa Catarina Cuixtla");
        destino5.setCodigoPost(70830);
        destino5.setDireccion("Municipio de Cuixtla");
        destino5.setTelefono("+52 951 533 0052");
        listaDestino.add(destino5);

        Destino destino6 = new Destino();
        destino6.setIdlugar(6);
        destino6.setNombre("San Andrés Paxtlán");
        destino6.setCodigoPost(70868);
        destino6.setDireccion("Municipio de San Andrés");
        destino6.setTelefono("+52 951 488 3200");
        listaDestino.add(destino6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFielNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextFielDir = new javax.swing.JTextField();
        jTextFielCp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextFielTel = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelPrincipal.setEnabled(false);
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(201, 234, 240));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Destino", "Código Postal", "Dirección", "Télefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 930, 170));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 70, 40));

        jLabel1.setFont(new java.awt.Font("Lato Black", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Agencias de viajes Miahuatlán");
        jPanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 500, -1));

        jTextFielNom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFielNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielNomActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jTextFielNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 240, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jLabel2.setText("Destino: ");
        jPanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jLabel3.setText("Código Postal:");
        jPanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jLabel4.setText("Dirección:");
        jPanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jLabel5.setText("Télefono:");
        jPanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agre.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 70, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actualizar.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 70, 40));

        jTextFielDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielDirActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jTextFielDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 180, -1));
        jPanelPrincipal.add(jTextFielCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 170, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 70, 40));
        jPanelPrincipal.add(jTextFielTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descarga.jpg"))); // NOI18N
        jPanelPrincipal.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        fileMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu1.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Ménu");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

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
        saveMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMenuItemMouseClicked(evt);
            }
        });
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/curriculum.png"))); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Reservación");
        saveAsMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed


    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuItemMouseClicked
        // TODO add your handling code here:
        new TransporteView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemMouseClicked

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fileMenuActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        new TransporteView().setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed

        // reservacion

        new Reservacion().setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //agregar
       
        Destino dest = new Destino();
        dest.setIdlugar(listaDestino.size()+1);
        dest.setNombre(jTextFielNom.getText());
        dest.setCodigoPost(Integer.parseInt(jTextFielCp.getText()));
        dest.setDireccion(jTextFielDir.getText());
        dest.setTelefono(jTextFielTel.getText());
        
        jTextFielNom.setText("");
        jTextFielCp.setText("");
        jTextFielDir.setText("");
        jTextFielTel.setText("");

        DestinoC.crearDestino(listaDestino, dest);
        DestinoC.mostrarDestino(listaDestino, modelo);
  

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFielNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielNomActionPerformed

    private void jTextFielDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielDirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //actualizar
        Destino des3 = DestinoC.obtenerUnDestino(listaDestino, Integer.parseInt(jTextFielCp.getText()));
        Destino des=new Destino();
        des.setIdlugar(des3.getIdlugar());
        
        des.setNombre(jTextFielNom.getText());
        des.setDireccion(jTextFielDir.getText());
        des.setCodigoPost(Integer.parseInt(jTextFielCp.getText()));
        des.setTelefono(jTextFielTel.getText());
        DestinoC.actualizarDestino(listaDestino, des);
        DestinoC.mostrarDestino(listaDestino, modelo);
        
        jTextFielNom.setText("");
        jTextFielCp.setText("");
        jTextFielDir.setText("");
        jTextFielTel.setText("");
        
        jTextFielNom.setEditable(true);
        jTextFielCp.setEditable(true);
        jTextFielDir.setEditable(true);
        jTextFielTel.setEditable(true);
        mostrarDestino();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //botton eliminar
        jTextFielNom.setText("");
        jTextFielCp.setText("");
        jTextFielDir.setText("");
        jTextFielTel.setText("");
        String nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        DestinoC.eliminarDestino(listaDestino, nombre);
        DestinoC.mostrarDestino(listaDestino, modelo);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // editar
       // jTextFielNom.setEditable(false);
       jTextFielCp.setEditable(false);
       
       jTextFielNom.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
       jTextFielCp.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
       jTextFielDir.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
       jTextFielTel.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());   
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFielCp;
    private javax.swing.JTextField jTextFielDir;
    private javax.swing.JTextField jTextFielNom;
    private javax.swing.JTextField jTextFielTel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if (evt.equals(openMenuItem)) {
            jPanelPrincipal.setVisible(true);
            log.setVisible(false);

        }
    }

}
