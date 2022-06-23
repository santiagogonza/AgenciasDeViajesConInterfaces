/*
@uthor: Gonzalo Santiago Garcia 
Fecha de Creación: 1 de junio del 2022
Fecha de actualización: 22 de junio del 2022
Descripción: en está parte creo el jFrame de transporte en la cual desarrolle
 los métodos que creí que se acuparán para la ejecución del programa

 */
package view;

import controller.TransporteContoller;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Destino;
import pojo.Transporte;

public class TransporteView extends javax.swing.JFrame {
/**
 * Declaración de los tipos de datos
 */
    private DefaultTableModel model;
    private List<Transporte> listaTransporte;
    private TransporteContoller TrasnporteControler;
    private Destino solic;
    private int xMouse;
    private int yMouse;
    Transporte trans = new Transporte();
    private int caseVentana =0; 
    private int id;

    /**
     * Inicializa el método transporte 
     */
    public TransporteView() {
        initComponents();
        setLocationRelativeTo(null);
        listaTransporte = new ArrayList<>();
        model = (DefaultTableModel) jTableTransporte.getModel();
        TrasnporteControler = new TransporteContoller();
        //Hace la llamada del método agregar transporte y mostrarTransporte
        agregarTransportes();
        mostrarTransporte();

    }

    /**
     * Destino: pasa los parámetros de la clase Destino
     * caseVentana: pasa los parámetros de la clase principal
     */
    public TransporteView(Destino destino, int caseVentana) {
        initComponents();
        this.caseVentana=caseVentana;
        setLocationRelativeTo(null);
        listaTransporte = new ArrayList<>();
        model = (DefaultTableModel) jTableTransporte.getModel();
        TrasnporteControler = new TransporteContoller();
        //Hace la llamada del método agregarTransporte y muestra los datos del
        // transporte
        agregarTransportes();
        mostrarTransporte();
        this.solic = destino;

    }
    
    /**
     * caseVentana : declaramos el método Transporte con el parámetro de la 
     * caseVentana
     */
    public TransporteView(int caseVentana) {
        this.caseVentana=caseVentana;
        initComponents();
        
        setLocationRelativeTo(null);
        listaTransporte = new ArrayList<>();
        model = (DefaultTableModel) jTableTransporte.getModel();
        //Instancia la el método transportec
        TrasnporteControler = new TransporteContoller();
        agregarTransportes();
        mostrarTransporte();

    }
    /**
     * se declara el constructor vacío
     */
    public void Transporte() {

    }

    /*
    Función de mostrarTransporte obtiene los datos de la clase transporte y los 
    agrega en la tabla
    */
    public void mostrarTransporte() {
        model.setRowCount(0);
        for (int i = 0; i < listaTransporte.size(); i++) {
            Object[] fila = new Object[4];
            fila[0] = listaTransporte.get(i).getIdTranspor();
            fila[1] = listaTransporte.get(i).getNombreTransport();
            fila[2] = listaTransporte.get(i).getNumAsiento();
            fila[3] = listaTransporte.get(i).getPrecio();
            model.addRow(fila);
        }
    }

   /**
    * Función de agregarTransporte envia los datos de que son necesario de la
    * clase transporte con sus respectivos tipos datos
    */
        public void agregarTransportes() {
        Transporte transporte1 = new Transporte();
        transporte1.setIdTranspor(1);
        transporte1.setNombreTransport("Motocicletas");
        transporte1.setNumAsiento(2);
        transporte1.setPrecio(30);
        listaTransporte.add(transporte1);

        Transporte transporte2 = new Transporte();
        transporte2.setIdTranspor(2);
        transporte2.setNombreTransport("Bicicletas");
        transporte2.setNumAsiento(1);
        transporte2.setPrecio(15);
        listaTransporte.add(transporte2);

        Transporte transporte3 = new Transporte();
        transporte3.setIdTranspor(3);
        transporte3.setNombreTransport("Subburban");
        transporte3.setNumAsiento(7);
        transporte3.setPrecio(45);
        listaTransporte.add(transporte3);

        Transporte transporte4 = new Transporte();
        transporte4.setIdTranspor(4);
        transporte4.setNombreTransport("Taxi");
        transporte4.setNumAsiento(5);
        transporte4.setPrecio(35);
        listaTransporte.add(transporte4);

        Transporte transporte5 = new Transporte();
        transporte5.setIdTranspor(5);
        transporte5.setNombreTransport("Mototaxi");
        transporte5.setNumAsiento(3);
        transporte5.setPrecio(25);
        listaTransporte.add(transporte5);
    }

        /**
         * Método limpiarTransporte limpia los jtexfield de los cuadros de texto
         */
    public void limpiarTransporte() {
        jTextFielNombre.setText("");
        jTextFielAsiento.setText("");
        jTextFielPrecio.setText("");
    }
    
    /**
     * creamos una función confirmarSalida hace una comparación si es que el
     * usuario desea cerrar el programa si no le manda una advertencia
     */
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonElimiminar = new javax.swing.JButton();
        jButtonSolicitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFielNombre = new javax.swing.JTextField();
        jTextFielPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransporte = new javax.swing.JTable();
        jTextFielAsiento = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 80, 40));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
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
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 80, -1));

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/actualizar.png"))); // NOI18N
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
        jPanel1.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 80, -1));

        jButtonElimiminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        jButtonElimiminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonElimiminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonElimiminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonElimiminarMouseExited(evt);
            }
        });
        jButtonElimiminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElimiminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonElimiminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 80, 40));

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
        jPanel1.add(jButtonSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 80, -1));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setText("Número de Asientos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel3.setText("Nombre del Transporte:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel2.setText("Precio:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel4.setText("Seleccione el Transporte");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jTextFielNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFielNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 190, 30));

        jTextFielPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielPrecioActionPerformed(evt);
            }
        });
        jTextFielPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFielPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 190, 30));

        jTableTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
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
        jTableTransporte.setOpaque(false);
        jTableTransporte.setSelectionBackground(new java.awt.Color(227, 226, 226));
        jTableTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTransporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 890, 130));

        jTextFielAsiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielAsientoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFielAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 190, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fon.jpg"))); // NOI18N
        fondo.setDisabledIcon(null);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-810, 10, 1760, 500));

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transporte.png"))); // NOI18N
        jMenu1.setText("Transporte");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina-de-inicio.png"))); // NOI18N
        jMenuItem1.setText("Inicio");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/curriculum.png"))); // NOI18N
        jMenuItem2.setText("Reservación");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// se declaran los botones que contiene el ménu 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Hace instancia a la ventana Principal 
        new Principal().setVisible(true);
        // Método que oculta la venta  principal
        this.hide();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      //Hace la instancia a la ventana Reservación y lo oculta
        new Reservacion().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        //this.hide();
        confirmarSalida();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        /**Boton agregar
         * Hace la comparación de los datos obtenidos si es que están iguales 
         * si no manda un mensaje de rellenar los cuadros de textos
         */
        if (jTextFielAsiento.getText().equals("") 
                || jTextFielNombre.getText().equals("") 
                || jTextFielPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Debe estar rellenado todos los cuadros de texto");
        } else {
            /**
             * Agregar Transporte realiza la intancia a la clase Transporte y
             * envia
            */
            Transporte trasnporte = new Transporte();
            trasnporte.setIdTranspor(listaTransporte.size() + 1);
            trasnporte.setNombreTransport(jTextFielNombre.getText());
            trasnporte.setNumAsiento(Integer.parseInt(jTextFielAsiento.getText()));
            //Hace la llamada al método limpiarTransporte
            limpiarTransporte();
           /**
            * Hace la llamada al método crearTransporte con sus parámetros
            * y el método mostrarTransporte con su parámetro 
            */
            TrasnporteControler.crearTransporte(listaTransporte, trasnporte);
            TrasnporteControler.mostrarTransporte(listaTransporte, model);
        }


    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTableTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransporteMouseClicked
       /**
        * Envia los datos a la tabla transporte y los comparamos, de ahí con los
        * datos correctos se puede seleccionar un dato de la tabla y mostrarlo 
        * en la tabla jtexfiel 
        */
        id=Integer.parseInt(jTableTransporte.getValueAt(jTableTransporte.getSelectedRow(), 0).toString());
        jTextFielNombre.setText(jTableTransporte.getValueAt(jTableTransporte.getSelectedRow(), 1).toString());
        jTextFielAsiento.setText(jTableTransporte.getValueAt(jTableTransporte.getSelectedRow(), 2).toString());
        jTextFielPrecio.setText(jTableTransporte.getValueAt(jTableTransporte.getSelectedRow(), 3).toString());
        //editar
        jTextFielAsiento.setEditable(true);

    }//GEN-LAST:event_jTableTransporteMouseClicked

    private void jButtonElimiminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElimiminarActionPerformed

        /**
         *Botton eliminar: compara los datos jtexfiel obtenidos si seleccionan
         * un compo vacio les manda un mensaje que no está seleccionando un 
         * dato de la tabla
         */
        if (jTextFielNombre.getText().equals("")
                || jTextFielAsiento.getText().equals("")
                || jTextFielPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            /**
             * Se declara un dato de tipo String y asignandole jTableTransporte
             * por ultimo llamamos al método elimar y mostrar transporte
             */
            String nombre = jTableTransporte.getValueAt(
                   jTableTransporte.getSelectedRow(), 1).toString();
                   TrasnporteControler.eliminarTransorte(listaTransporte, nombre);
                   TrasnporteControler.mostrarTransporte(listaTransporte, model);
        }
        limpiarTransporte();
    }//GEN-LAST:event_jButtonElimiminarActionPerformed

    private void jButtonElimiminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonElimiminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonElimiminarMouseClicked

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        /*
        Boton actualizar: Hace la comparación los datos si es que está 
        seleccionado un campo vacio le manda un mensaje de error si no realiza el 
        proceso de la ejecución del programa
        */
       
        if (jTextFielNombre.getText().equals("")
                || jTextFielAsiento.getText().equals("")
                || jTextFielPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            /**
             Hace la instancia Transporte creando un nuevo objeto que enviará
             * los datos a jTexfiel
             */
            Transporte transporteActualizar = new Transporte();
            transporteActualizar.setIdTranspor(id);
            transporteActualizar.setNombreTransport(jTextFielNombre.getText());
            transporteActualizar.setNumAsiento
            (Integer.parseInt(jTextFielAsiento.getText()));
            transporteActualizar.setPrecio(Integer.parseInt
            (jTextFielPrecio.getText()));
            TrasnporteControler.actualizarTransporte
            (listaTransporte, transporteActualizar);
            TrasnporteControler.mostrarTransporte(listaTransporte, model);
            //Hace la llamada al método limpiar que limpia los datos de jTexfiel
            limpiarTransporte();
            //se obtiene los datos para al final lo configura para actualizar 
            //los datos
            jTextFielNombre.setEditable(true);
            jTextFielAsiento.setEditable(true);
            jTextFielPrecio.setEditable(true);
            //mostrarTransporte();
        }

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolicitarActionPerformed
        /**
         * se utiliza un case para la opción de la ventana si de sea diriguirse
         *  a la ventana destino o la de transporte
         */
        switch (caseVentana) {
            case 1:
                if (jTextFielNombre.getText().equals("")
                || jTextFielAsiento.getText().equals("")
                || jTextFielPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            //botton solicitar

            Transporte solicitarTransporte = new Transporte();
            solicitarTransporte.setNombreTransport(jTextFielNombre.getText());
            solicitarTransporte.setNumAsiento(Integer.parseInt(
                    jTextFielAsiento.getText()));
            solicitarTransporte.setPrecio(Integer.parseInt(
                    jTextFielPrecio.getText()));

            new Solicitar(solicitarTransporte, this.solic).setVisible(true);
        }
                break;
            case 2:
                
                if (jTextFielNombre.getText().equals("")
                || jTextFielAsiento.getText().equals("")
                || jTextFielPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            //botton solicitar
            /**
             * se declarán el dato silicitarTransporte
             */
            Transporte solicitarTransporte = new Transporte();
            solicitarTransporte.setNombreTransport(jTextFielNombre.getText());
            solicitarTransporte.setNumAsiento(Integer.parseInt(
                    jTextFielAsiento.getText()));
            solicitarTransporte.setPrecio(Integer.parseInt(
                    jTextFielPrecio.getText()));
            //instanciamos la ventana principal y mandando los parámetros de 
            //solicitar transporte
            new Principal(2,solicitarTransporte).setVisible(true);
            }
                break;
            default:
        }

    }//GEN-LAST:event_jButtonSolicitarActionPerformed

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        // TODO add your handling code here:
        jButtonSalir.setBackground(Color.red);
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        // TODO add your handling code here:
        jButtonSalir.setBackground(Color.white);
    }//GEN-LAST:event_jButtonSalirMouseExited

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

    private void jButtonElimiminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonElimiminarMouseEntered
        jButtonElimiminar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonElimiminarMouseEntered

    private void jButtonElimiminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonElimiminarMouseExited
        jButtonElimiminar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonElimiminarMouseExited

    private void jButtonSolicitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSolicitarMouseEntered
        jButtonSolicitar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonSolicitarMouseEntered

    private void jButtonSolicitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSolicitarMouseExited
        jButtonSolicitar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonSolicitarMouseExited

    private void jTextFielNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielNombreKeyTyped
        /**
         * método que válida nombre de transporte para que solo ingrese letras
         */
        char letra = evt.getKeyChar();
        if (Character.isDigit(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite letras en este campo",
                    "ADVERTEMCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielNombreKeyTyped

    private void jTextFielAsientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielAsientoKeyTyped
        /**
         * método que válida número de acientos para que solo se ingrese digitos
         */
        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite digitos en este campo",
                    "ADVERTEMCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielAsientoKeyTyped

    private void jTextFielPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielPrecioActionPerformed

    private void jTextFielPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielPrecioKeyTyped
        /**
         * válida el cuadro de precio para que solo se ingrese dígitos en el 
         * campo
         */
        char letra = evt.getKeyChar();
        if (Character.isLetter(letra)) {
            evt.consume();
            JOptionPane.showMessageDialog(this,
                    "solo se permite digitos en este campo",
                    "ADVERTEMCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextFielPrecioKeyTyped

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y- yMouse);
        
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransporteView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonElimiminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSolicitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTransporte;
    private javax.swing.JTextField jTextFielAsiento;
    private javax.swing.JTextField jTextFielNombre;
    private javax.swing.JTextField jTextFielPrecio;
    // End of variables declaration//GEN-END:variables
}
