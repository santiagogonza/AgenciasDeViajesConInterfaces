/*
Autor: Gonzalo Santiago Garcia
fecha de creación: 9 de junio del 2022
fecha de actualización: 13 de junio del 2022
Descripción: en esta parte presentoré los datos que el usuario seleccionó 
 */
package view;

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
        model.setRowCount(0);

        Object[] fila = new Object[5];
        fila[0] = destino.getIdlugar();
        fila[1] = destino.getNombre();
        fila[2] = destino.getCodigoPost();
        fila[3] = destino.getDireccion();
        fila[4] = destino.getTelefono();
        model.addRow(fila);

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
        jButton1 = new javax.swing.JButton();
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
                "Id", "Destino", "C.P", "Dirección", "Telefono"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 850, 80));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos solicitados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESTINO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jTableTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "N.Aciento", "Precio"
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 840, 93));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TRANSPORTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // guarda los datos

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
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
