/*
autor: Gonzalo Santiago Garcia
fecha de creación: 1 de junio del 2022
fecha de actualización: 22 de junio del 2022 
descripción: creo la ventana principal donde presento la lista de los 
 lugares que tengo de recomendocion de Miahuatlán 
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
     * Declaración de algunos de los datos que se ocupara dentro del programa
     */
    private DefaultTableModel modelo;
    Login log = new Login();
    private List<Destino> listaDestino;
    private DestinoController DestinoControler;
    private Transporte transporte;
    private int xMuase;
    private int yMouse;
    private int caseVentana=1;

    /**
     * inicializa el método initcomponet
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        modelo = (DefaultTableModel) jTable1.getModel();
        log.setVisible(false);
        listaDestino = new ArrayList<>();
        DestinoControler = new DestinoController();
        agregarDatos();
        mostrarDestino();

    }
/**
 * @param caseVentana recive los parámetros de la vantana destino
 * @param transporte recive los parámetros clase transporte
 */
    Principal(int caseVentana, Transporte transporte) {
        this.caseVentana = caseVentana;
        this.transporte = transporte;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        modelo = (DefaultTableModel) jTable1.getModel();
        log.setVisible(false);
        listaDestino = new ArrayList<>();
        DestinoControler = new DestinoController();
        agregarDatos();
        mostrarDestino();
    }

    /**
     * Método mostrarDestino obtiene los datos de la clase Destino
     */
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
/**
 * Método que limpia los jtfield de la clase destino que se muestra en los 
 * cuadros de jtexfield 
 */
    public void limpiarDestino() {
        jTextFielNombre.setText("");
        jTextFielCódido_postal.setText("");
        jTextFielDirección.setText("");
        jTextFielTeléfono.setText("");

    }

    /**
     * Método que declara los datos que se mostrarán en la tabla Destino
     */
    public void agregarDatos() {
        Destino destino1 = new Destino();
        destino1.setIdlugar(1);
        destino1.setNombre("Santa Cruz Xitla");
        destino1.setCodigoPost(70823);
        destino1.setDireccion("Precidencia Municipal de Xitla");
        destino1.setTelefono("951 512 0300");
        listaDestino.add(destino1);

        Destino destino2 = new Destino();
        destino2.setIdlugar(2);
        destino2.setNombre("San Idelfonso Amatlán");
        destino2.setCodigoPost(70828);
        destino2.setDireccion("Precidencia Municipal Idelfonso");
        destino2.setTelefono("957 572 0438");
        listaDestino.add(destino2);

        Destino destino3 = new Destino();
        destino3.setIdlugar(3);
        destino3.setNombre("Monjas");
        destino3.setCodigoPost(70826);
        destino3.setDireccion("Municipio de Monjas");
        destino3.setTelefono("951 105 3048");
        listaDestino.add(destino3);

        Destino destino4 = new Destino();
        destino4.setIdlugar(4);
        destino4.setNombre("Santo Tomás Tamazulapan");
        destino4.setCodigoPost(70866);
        destino4.setDireccion("Municipio de Tamazulapan");
        destino4.setTelefono("951 510 5089");
        listaDestino.add(destino4);

        Destino destino5 = new Destino();
        destino5.setIdlugar(5);
        destino5.setNombre("Santa Catarina Cuixtla");
        destino5.setCodigoPost(70830);
        destino5.setDireccion("Municipio de Cuixtla");
        destino5.setTelefono("951 533 0052");
        listaDestino.add(destino5);

        Destino destino6 = new Destino();
        destino6.setIdlugar(6);
        destino6.setNombre("San Andrés Paxtlán");
        destino6.setCodigoPost(70868);
        destino6.setDireccion("Municipio de San Andrés");
        destino6.setTelefono("951 488 3200");
        listaDestino.add(destino6);
    }
    
    public void confirmarSalida(){
        int valor= JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar "
                + "El programa?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if(valor==JOptionPane.YES_OPTION){
            System.exit(0);
        }
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
        jTextFielNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextFielDirección = new javax.swing.JTextField();
        jTextFielCódido_postal = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jTextFielTeléfono = new javax.swing.JTextField();
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
        jPanelPrincipal.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 70, 40));

        jLabel1.setFont(new java.awt.Font("Lato Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agencias de viajes Miahuatlán");
        jPanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 500, -1));

        jTextFielNombre.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFielNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielNombreActionPerformed(evt);
            }
        });
        jTextFielNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielNombreKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, 20));

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

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
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

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/actualizar.png"))); // NOI18N
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

        jTextFielDirección.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielDirección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielDirecciónActionPerformed(evt);
            }
        });
        jTextFielDirección.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielDirecciónKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielDirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 210, 20));

        jTextFielCódido_postal.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielCódido_postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielCódido_postalActionPerformed(evt);
            }
        });
        jTextFielCódido_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielCódido_postalKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielCódido_postal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 20));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
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

        jTextFielTeléfono.setBackground(new java.awt.Color(255, 255, 204));
        jTextFielTeléfono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielTeléfonoActionPerformed(evt);
            }
        });
        jTextFielTeléfono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielTeléfonoKeyTyped(evt);
            }
        });
        jPanelPrincipal.add(jTextFielTeléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 210, 20));

        jButtonSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/solicitar.png"))); // NOI18N
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
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naturaleza.jpg"))); // NOI18N
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
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menú.png"))); // NOI18N
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
        // boton salir cierra el programa 
       // System.exit(0);
       confirmarSalida();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void saveMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuItemMouseClicked
        /*
        Hace una instancia a la ventana Transporte y lo culta 
        */
        new TransporteView(2).setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemMouseClicked

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fileMenuActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        //Hace una instancia a la ventana transporte y lo oculta
        new TransporteView(2).setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed

        // Hace una instancia a la ventana Reservacion y lo oculta
        new Reservacion().setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        //Boton agregar
        /**
         * método que agrega los datos y hace la comparación si es que no están
         * rellenados los campos, ya que a traves del método obtenerUnDestino 
         * obtiene los datos y los campara
         */
        if (jTextFielCódido_postal.getText().equals("") || 
                jTextFielDirección.getText().equals("") 
                || jTextFielNombre.getText().equals("") 
                || jTextFielTeléfono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, 
                    "Debe estar rellenado todos los cuadros de texto");
        } else {
            Destino dest = DestinoControler.obtenerUnDestino(listaDestino,
                    Integer.parseInt(jTextFielCódido_postal.getText()));

            if (dest == null) {
                Destino destino = new Destino();
                if (jTextFielNombre.getText().equals("")
                        || jTextFielCódido_postal.getText().equals("")
                        || jTextFielDirección.getText().equals("")
                        || jTextFielTeléfono.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Rellena todos los campos",
                            "ADVERTETNCIA", JOptionPane.WARNING_MESSAGE);
                }
                destino.setIdlugar(listaDestino.size() + 1);
                destino.setNombre(jTextFielNombre.getText());
                destino.setCodigoPost(Integer.parseInt
                (jTextFielCódido_postal.getText()));
                destino.setDireccion(jTextFielDirección.getText());
                destino.setTelefono(jTextFielTeléfono.getText());
                // crea un destino y le pasa los parámetros de destino
                DestinoControler.crearDestino(listaDestino, destino);
                DestinoControler.mostrarDestino(listaDestino, modelo);
            } else {
                JOptionPane.showMessageDialog(null,"El destino ya existe");
            }
        }


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTextFielNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielNombreActionPerformed

    private void jTextFielDirecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielDirecciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielDirecciónActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed

        /**
         * Boton actualizar: hace la comparación si es que los campos de 
         * jtexfield están rellenados si no manda una mensaje de advertencia que 
         * los campos no están rellenados
         * */
        if (jTextFielCódido_postal.getText().equals("")
                || jTextFielNombre.getText().equals("")
                || jTextFielDirección.getText().equals("")
                || jTextFielTeléfono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");

        } else {
            Destino des = new Destino();
            des.setIdlugar(des.getIdlugar());

            des.setNombre(jTextFielNombre.getText());
            des.setDireccion(jTextFielDirección.getText());
            des.setCodigoPost(Integer.parseInt(jTextFielCódido_postal.getText()));
            des.setTelefono(jTextFielTeléfono.getText());
            DestinoControler.actualizarDestino(listaDestino, des);
            DestinoControler.mostrarDestino(listaDestino, modelo);
            //se encarga de que dentro de la tabla se pueda editar 
            jTextFielNombre.setEditable(true);
            jTextFielCódido_postal.setEditable(false);
            jTextFielDirección.setEditable(true);
            jTextFielTeléfono.setEditable(true);
            //método que llama mostrar destino se encarga de mostrar los datos
            mostrarDestino();
        }

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        //botton eliminar
        if (jTextFielNombre.getText().equals("")
                || jTextFielCódido_postal.getText().equals("")
                || jTextFielDirección.getText().equals("")
                || jTextFielTeléfono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            //Realiza la comparación de los datos 
            String nombre = jTextFielNombre.getText();
            //Hace la llamada del método eliminarDestino y mostrar el destino
            DestinoControler.eliminarDestino(listaDestino, nombre);
            DestinoControler.mostrarDestino(listaDestino, modelo);
        }
        //hace la llamada al método limpiarDestino
        limpiarDestino();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /*Actualizar: con método setEditable se puede seleccionar los datos de
        la tabla para obtener los atributos de la clase Destino
        */
        jTextFielCódido_postal.setEditable(false);
        jTextFielNombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextFielCódido_postal.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextFielDirección.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextFielTeléfono.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarActionPerformed
        /*
        se usa un switch case para que si una de las opciones es correcto hace 
        lo que corresponde de cada caso
        */
        switch (caseVentana) {
            case 1:
                if (jTextFielNombre.getText().equals("")
                || jTextFielCódido_postal.getText().equals("")
                || jTextFielDirección.getText().equals("")
                || jTextFielTeléfono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "seleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            // solicitar
            Destino solic = new Destino();
            solic.setNombre(jTextFielNombre.getText());
            solic.setDireccion(jTextFielDirección.getText());
            solic.setCodigoPost(Integer.parseInt(jTextFielCódido_postal.getText()));
            solic.setTelefono(jTextFielTeléfono.getText());
            new TransporteView(solic,1).setVisible(true);
            this.hide();
        }
                break;
            case 2:
                 if (jTextFielNombre.getText().equals("")
                || jTextFielCódido_postal.getText().equals("")
                || jTextFielDirección.getText().equals("")
                || jTextFielTeléfono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, 
                    "eleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            /*
            solicitar envía los los datos la clase Destino
            */
            Destino solic = new Destino();
            solic.setNombre(jTextFielNombre.getText());
            solic.setDireccion(jTextFielDirección.getText());
            solic.setCodigoPost(Integer.parseInt(jTextFielCódido_postal.getText()));
            solic.setTelefono(jTextFielTeléfono.getText());
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

    private void jTextFielNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielNombreKeyTyped
        /**
         * método que válida Nombre para que solo ingrese letras
         */
        char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite letras en este campo",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielNombreKeyTyped

    private void jTextFielDirecciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielDirecciónKeyTyped
       
    }//GEN-LAST:event_jTextFielDirecciónKeyTyped

    private void jTextFielTeléfonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielTeléfonoKeyTyped
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
    }//GEN-LAST:event_jTextFielTeléfonoKeyTyped

    private void jTextFielTeléfonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielTeléfonoActionPerformed


    }//GEN-LAST:event_jTextFielTeléfonoActionPerformed

    private void jTextFielCódido_postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielCódido_postalActionPerformed

    }//GEN-LAST:event_jTextFielCódido_postalActionPerformed

    private void jTextFielCódido_postalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielCódido_postalKeyTyped
        /* válida el jtexfieldCódigo postal para que solo se ingrese digitos
        */
        
        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite digitos en este campo",
                    "ADVERTEMCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielCódido_postalKeyTyped

    private void menuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMouseDragged
        /**
         * método para obtener el eje de las x y y
         */
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMuase, y- yMouse);
    }//GEN-LAST:event_menuBarMouseDragged

    private void menuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarMousePressed
        /*
        método que obtiene la posicipon de las x y y del mause
        */
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
    private javax.swing.JTextField jTextFielCódido_postal;
    private javax.swing.JTextField jTextFielDirección;
    private javax.swing.JTextField jTextFielNombre;
    private javax.swing.JTextField jTextFielTeléfono;
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
