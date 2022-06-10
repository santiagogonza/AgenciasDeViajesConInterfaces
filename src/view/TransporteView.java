/*
@uthor: Gonzalo Santiago Garcia 
Fecha de Creación: 1 de junio del 2022
Fecha de actualización: 6 de junio del 2022
Descripción: en está parte creo el jFrame de transporte en la cual desarrille
 los métodos que creí que se acuparan para la ejecución del programa

 */
package view;

import controller.TransporteContoller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pojo.Transporte;

public class TransporteView extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<Transporte> listaTransporte;
    private TransporteContoller TrasnporteC;
    Transporte trans = new Transporte();

    public TransporteView() {
        initComponents();
        setLocationRelativeTo(null);

        listaTransporte = new ArrayList<>();
        model = (DefaultTableModel) jTable1.getModel();
        TrasnporteC = new TransporteContoller();
        agregarTransportes();
        mostrarTransporte();

    }
    // funcion de mostrarTransporte
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
    
    // función de agregarTransporte
    public void agregarTransportes() {
        Transporte trans = new Transporte();
        trans.setIdTranspor(1);
        trans.setNombreTransport("Motocicletas");
        trans.setNumAsiento(2);
        trans.setPrecio(30);
        listaTransporte.add(trans);

        Transporte trans1 = new Transporte();
        trans1.setIdTranspor(2);
        trans1.setNombreTransport("Bicicletas");
        trans1.setNumAsiento(1);
        trans1.setPrecio(15);
        listaTransporte.add(trans1);

        Transporte trans2 = new Transporte();
        trans2.setIdTranspor(3);
        trans2.setNombreTransport("Subburban");
        trans2.setNumAsiento(7);
        trans2.setPrecio(45);
        listaTransporte.add(trans2);

        Transporte trans3 = new Transporte();
        trans3.setIdTranspor(4);
        trans3.setNombreTransport("Taxi");
        trans3.setNumAsiento(5);
        trans3.setPrecio(35);
        listaTransporte.add(trans3);

        Transporte trans4 = new Transporte();
        trans4.setIdTranspor(5);
        trans4.setNombreTransport("Mototaxi");
        trans4.setNumAsiento(3);
        trans4.setPrecio(25);
        listaTransporte.add(trans4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButton3Actu = new javax.swing.JButton();
        jButton2Elim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFielNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFielAcien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 80, 40));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agre.png"))); // NOI18N
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 80, -1));

        jButton3Actu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/actualizar.png"))); // NOI18N
        jButton3Actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActuActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3Actu, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 80, -1));

        jButton2Elim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura.png"))); // NOI18N
        jButton2Elim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2ElimMouseClicked(evt);
            }
        });
        jButton2Elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ElimActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2Elim, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 80, 40));

        jLabel1.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jLabel1.setText("Numero de Acientos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jLabel3.setText("Nombre del Transporte:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        jPanel1.add(jTextFielNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "N. Acientos", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 520, 190));
        jPanel1.add(jTextFielAcien, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descarga.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// se declaran los botones que contiene el ménu 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        new Principal().setVisible(true);
        // método que oculta la venta  principal
        this.hide();


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Reservacion().setVisible(true);
        this.hide();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        //agregar Transporte
        Transporte trasn = new Transporte();
        trasn.setIdTranspor(listaTransporte.size() + 1);
        trasn.setNombreTransport(jTextFielNom.getText());
        
        trasn.setNumAsiento(Integer.parseInt(jTextFielAcien.getText()));
        jTextFielNom.setText("");
        jTextFielAcien.setText("");

        TrasnporteC.crearTransporte(listaTransporte, trasn);
        TrasnporteC.mostrarTransporte(listaTransporte, model);

        //mostrarTransporte();

    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //editar
        jTextFielAcien.setEditable(true);

        jTextFielNom.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextFielAcien.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ElimActionPerformed
        // TODO add your handling code here:
        // botton eliminar
        jTextFielNom.setText("");
        jTextFielAcien.setText("");
        String nombre = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
      //  TrasnporteC.eliminarTransorte(listaTransporte, model);
        TrasnporteC.mostrarTransporte(listaTransporte, model);

    }//GEN-LAST:event_jButton2ElimActionPerformed

    private void jButton2ElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2ElimMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ElimMouseClicked

    private void jButton3ActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActuActionPerformed
      
    }//GEN-LAST:event_jButton3ActuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransporteView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2Elim;
    private javax.swing.JButton jButton3Actu;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFielAcien;
    private javax.swing.JTextField jTextFielNom;
    // End of variables declaration//GEN-END:variables
}
