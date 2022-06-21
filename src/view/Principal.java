/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 9 de junio del 2022 
descripción: creo la ventana principal donde presento la lista de los 
 lugares que tengo de recomendocion de miahuatlán 
 */
package view;

import controller.DestinoController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Destino;
import pojo.Transporte;

public class Principal extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Principal
     */
    private DefaultTableModel modelo;
    Login log = new Login();
    private List<Destino> listaDestino;
    private DestinoController DestinoC;
    private Transporte transporte;
    private int xMuase;
    private int yMouse;
    private int caseVentana=1;

    // private DefaultTableModel mo;
    public Principal() {
        initComponents();
        // this.setSize(975, 580);
        setLocationRelativeTo(null);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        modelo = (DefaultTableModel) jTable1.getModel();

        log.setVisible(false);
        listaDestino = new ArrayList<>();
        DestinoC = new DestinoController();
        agregarDatos();
        mostrarDestino();

    }

    Principal(int caseVentana, Transporte transporte) {
        this.caseVentana = caseVentana;
        this.transporte = transporte;
        initComponents();
        // this.setSize(975, 580);
        setLocationRelativeTo(null);
        //setResizable(false);
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

    public void limpiarDestino() {
        jTextFielNom.setText("");
        jTextFielCp.setText("");
        jTextFielDir.setText("");
        jTextFielTel.setText("");

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

        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFielNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextFielDir = new javax.swing.JTextField();
        jTextFielCp = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jTextFielTel = new javax.swing.JTextField();
        jButtonSolicitar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanelPrincipal.setEnabled(false);
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(201, 234, 240));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 930, 140));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
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
        jPanelPrincipal.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 70, 40));

        jLabel1.setFont(new java.awt.Font("Lato Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agencias de viajes Miahuatlán");
        jPanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 500, -1));

        jTextFielNom.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielNom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFielNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielNomActionPerformed(evt);
            }
        });
        jTextFielNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielNomKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 200, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lugar de Destino: ");
        jPanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código Postal:");
        jPanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");
        jPanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");
        jPanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccione el destino");
        jPanelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agre.png"))); // NOI18N
        jButtonAgregar.setToolTipText("Agregar");
        jButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseExited(evt);
            }
        });
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 70, 40));

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actualizar.png"))); // NOI18N
        jButtonActualizar.setToolTipText("Actualizar");
        jButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseExited(evt);
            }
        });
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 70, 40));

        jTextFielDir.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielDirActionPerformed(evt);
            }
        });
        jTextFielDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielDirKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 210, -1));

        jTextFielCp.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielCpActionPerformed(evt);
            }
        });
        jTextFielCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielCpKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, -1));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura.png"))); // NOI18N
        jButtonEliminar.setToolTipText("Eliminar");
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseExited(evt);
            }
        });
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 70, 40));

        jTextFielTel.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielTelActionPerformed(evt);
            }
        });
        jTextFielTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielTelKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 210, -1));

        jButtonSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/solicitar.png"))); // NOI18N
        jButtonSolicitar.setToolTipText("Solicitar");
        jButtonSolicitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSolicitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSolicitarMouseExited(evt);
            }
        });
        jButtonSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolicitarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 70, 40));

        fondo.setForeground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nature-g2f407e47e_1920.jpg"))); // NOI18N
        fondo.setOpaque(true);
        jPanelPrincipal.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 970, 570));

        menuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuBarMouseDragged(evt);
            }
        });
        menuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBarMousePressed(evt);
            }
        });

        fileMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu1.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Ménu");
        fileMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fileMenuMouseEntered(evt);
            }
        });
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
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void saveMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuItemMouseClicked
        // TODO add your handling code here:
        new TransporteView(2).setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemMouseClicked

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fileMenuActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        new TransporteView(2).setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed

        // reservacion
        new Reservacion().setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        //agregar
        if (jTextFielCp.getText().equals("") || jTextFielDir.getText().equals("") || jTextFielNom.getText().equals("") || jTextFielTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe estar rellenado todos los cuadros de texto");
        } else {
            Destino dest = DestinoC.obtenerUnDestino(listaDestino, Integer.parseInt(jTextFielCp.getText()));

            if (dest == null) {
                Destino destino = new Destino();

                if (jTextFielNom.getText().equals("")
                        || jTextFielCp.getText().equals("")
                        || jTextFielDir.getText().equals("")
                        || jTextFielTel.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Rellena todos los campos",
                            "ADVERTETNCIA", JOptionPane.WARNING_MESSAGE);

                }
                destino.setIdlugar(listaDestino.size() + 1);
                destino.setNombre(jTextFielNom.getText());
                destino.setCodigoPost(Integer.parseInt(jTextFielCp.getText()));
                destino.setDireccion(jTextFielDir.getText());
                destino.setTelefono(jTextFielTel.getText());

                DestinoC.crearDestino(listaDestino, destino);
                DestinoC.mostrarDestino(listaDestino, modelo);
            } else {
                JOptionPane.showMessageDialog(null,"El destino ya existe");
            }
        }


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTextFielNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielNomActionPerformed

    private void jTextFielDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielDirActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        //actualizar
        if (jTextFielCp.getText().equals("")
                || jTextFielNom.getText().equals("")
                || jTextFielDir.getText().equals("")
                || jTextFielTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");

        } else {
            Destino des = new Destino();
            des.setIdlugar(des.getIdlugar());

            des.setNombre(jTextFielNom.getText());
            des.setDireccion(jTextFielDir.getText());
            des.setCodigoPost(Integer.parseInt(jTextFielCp.getText()));
            des.setTelefono(jTextFielTel.getText());
            DestinoC.actualizarDestino(listaDestino, des);
            DestinoC.mostrarDestino(listaDestino, modelo);

            jTextFielNom.setEditable(true);
            jTextFielCp.setEditable(false);
            jTextFielDir.setEditable(true);
            jTextFielTel.setEditable(true);
            mostrarDestino();
        }

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //botton eliminar
        if (jTextFielNom.getText().equals("")
                || jTextFielCp.getText().equals("")
                || jTextFielDir.getText().equals("")
                || jTextFielTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "seleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
           
            String nombre = jTextFielNom.getText();
            DestinoC.eliminarDestino(listaDestino, nombre);
            DestinoC.mostrarDestino(listaDestino, modelo);
        }
        limpiarDestino();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // editarTable;
        jTextFielCp.setEditable(false);

        jTextFielNom.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextFielCp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextFielDir.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextFielTel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarActionPerformed
        
        switch (caseVentana) {
            case 1:
                if (jTextFielNom.getText().equals("")
                || jTextFielCp.getText().equals("")
                || jTextFielDir.getText().equals("")
                || jTextFielTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "seleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            // solicitar
            Destino solic = new Destino();
            solic.setNombre(jTextFielNom.getText());
            solic.setDireccion(jTextFielDir.getText());
            solic.setCodigoPost(Integer.parseInt(jTextFielCp.getText()));
            solic.setTelefono(jTextFielTel.getText());
            //   JOptionPane.showMessageDialog(null, "solicitud exitosa");

            new TransporteView(solic,1).setVisible(true);
            this.hide();
        }
                break;
            case 2:
                 if (jTextFielNom.getText().equals("")
                || jTextFielCp.getText().equals("")
                || jTextFielDir.getText().equals("")
                || jTextFielTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "seleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            // solicitar
            Destino solic = new Destino();
            solic.setNombre(jTextFielNom.getText());
            solic.setDireccion(jTextFielDir.getText());
            solic.setCodigoPost(Integer.parseInt(jTextFielCp.getText()));
            solic.setTelefono(jTextFielTel.getText());
            //   JOptionPane.showMessageDialog(null, "solicitud exitosa");

            new Solicitar(transporte, solic).setVisible(true);
            this.hide();
        }
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_jButtonSolicitarActionPerformed

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        // TODO add your handling code here:
        jButtonSalir.setBackground(Color.red);
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        jButtonSalir.setBackground(Color.white);
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void fileMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseEntered
        openMenuItem.setBackground(Color.green);
    }//GEN-LAST:event_fileMenuMouseEntered

    private void jButtonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseEntered
        jButtonAgregar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonAgregarMouseEntered

    private void jButtonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseExited
        jButtonAgregar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonAgregarMouseExited

    private void jButtonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseEntered
        jButtonActualizar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonActualizarMouseEntered

    private void jButtonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseExited
        jButtonActualizar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonActualizarMouseExited

    private void jButtonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseEntered
        jButtonEliminar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonEliminarMouseEntered

    private void jButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseExited
        jButtonEliminar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonEliminarMouseExited

    private void jButtonSolicitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSolicitarMouseEntered
        jButtonSolicitar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonSolicitarMouseEntered

    private void jButtonSolicitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSolicitarMouseExited
        jButtonSolicitar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonSolicitarMouseExited

    private void jTextFielNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielNomKeyTyped
        /**
         * método que válida Nombre para que solo ingrese letras
         *
         */
        char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite letras en este campo",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielNomKeyTyped

    private void jTextFielDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielDirKeyTyped
        /**
         * método que válida la dirección para que ingrese letras
         
        char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite letras en este campo",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
*/
    }//GEN-LAST:event_jTextFielDirKeyTyped

    private void jTextFielTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielTelKeyTyped
        /**
         * válida el Jtexfild Nombre para que solo se ingrese numeros
         */
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite números en este campo", "ADVERTENCIA",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielTelKeyTyped

    private void jTextFielTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielTelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFielTelActionPerformed

    private void jTextFielCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielCpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielCpActionPerformed

    private void jTextFielCpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielCpKeyTyped

        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite digitos en este campo",
                    "ADVERTEMCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielCpKeyTyped

    private void menuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMuase, y- yMouse);
    }//GEN-LAST:event_menuBarMouseDragged

    private void menuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMousePressed
        // TODO add your handling code here:
        xMuase = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_menuBarMousePressed

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
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSolicitar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordField1;
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
