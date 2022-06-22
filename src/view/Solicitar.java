/*
Autor: Gonzalo Santiago Garcia
fecha de creación: 9 de junio del 2022
fecha de actualización: 13 de junio del 2022
Descripción: en esta parte presentoré los datos que el usuario seleccionó 
 */
package view;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import pojo.Destino;
import pojo.Transporte;

/**
 *
 * @author gonzalo
 */
public class Solicitar extends javax.swing.JFrame {

    /**
     * Creates new form Solicitar
     */
    private DefaultTableModel model;
    private DefaultTableModel modeloTransporte;
    private DefaultTableModel modeloDestino;
    private Destino destino;
    private Transporte transporte;

    public Solicitar() {
        initComponents();
        setLocation(50, 200);
        this.setSize(975, 580);
    }

    public Solicitar(Destino destino) {
        initComponents();
        setLocation(50, 200);
         this.setSize(906, 449);
        model = (DefaultTableModel) jTableDestino.getModel();
        mostrarSolicitudDestino(destino);
        
    }

    /**
     * metodo de solicitar transporte
     */
    public Solicitar(Transporte transporte) {
        initComponents();

        modeloTransporte = (DefaultTableModel) jTableTransport.getModel();
        mostrarSoliciudTransporte(transporte);
        
    }

    public void mostrarSolicitudDestino(Destino destino) {
        modeloDestino.setRowCount(0);

        Object[] fila = new Object[5];
        fila[0] = destino.getIdlugar();
        fila[1] = destino.getNombre();
        fila[2] = destino.getCodigoPost();
        fila[3] = destino.getDireccion();
        fila[4] = destino.getTelefono();
        modeloDestino.addRow(fila);

    }
    
    public Solicitar(Transporte transporte, Destino destino) {
        this.transporte=transporte;
        this.destino=destino;
        initComponents();
        
        modeloTransporte = (DefaultTableModel) jTableTransport.getModel();
        mostrarSoliciudTransporte(transporte);
        
        modeloDestino= (DefaultTableModel) jTableDestino.getModel();
        mostrarSolicitudDestino(destino);
        
    }

    /**
     * @param transporte Creamos el método que obtiene los datos del atributo
     * Transporte
     */
    public void mostrarSoliciudTransporte(Transporte transporte) {
        modeloTransporte.setRowCount(0);

        Object[] fila = new Object[5];
        fila[0] = transporte.getIdTranspor();
        fila[1] = transporte.getNombreTransport();
        fila[2] = transporte.getNumAsiento();
        fila[3] = transporte.getPrecio();
        modeloTransporte.addRow(fila);

    }
    
     public void mostrarSoliciudDestino(Destino destino){
         modeloDestino.setRowCount(0);
         
         Object[] fila = new Object[5];
         fila[0] = destino.getIdlugar();
         fila[1] = destino.getNombre();
         fila[2] = destino.getCodigoPost();
         fila[3] = destino.getDireccion();
         fila[4] = destino.getTelefono();
          modeloDestino.addRow(fila);
     }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDestino = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTransport = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonGuargar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDestino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Destino", "Código Postal", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDestino);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 850, 50));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos solicitados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 300, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESTINO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jTableTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Número de aciento", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableTransport);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 850, 70));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TRANSPORTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jButtonGuargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png.png"))); // NOI18N
        jButtonGuargar.setToolTipText("Guardar");
        jButtonGuargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGuargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGuargarMouseExited(evt);
            }
        });
        jButtonGuargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuargarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 70, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viaje.jpg"))); // NOI18N
        Fondo.setText("jLabel4");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 900, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuargarActionPerformed
        new Reservacion(destino,transporte).setVisible(true);
        // guarda los datos
        this.hide();

    }//GEN-LAST:event_jButtonGuargarActionPerformed

    private void jButtonGuargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuargarMouseEntered
       jButtonGuargar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonGuargarMouseEntered

    private void jButtonGuargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuargarMouseExited
        jButtonGuargar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonGuargarMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButtonGuargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDestino;
    private javax.swing.JTable jTableTransport;
    // End of variables declaration//GEN-END:variables
}
