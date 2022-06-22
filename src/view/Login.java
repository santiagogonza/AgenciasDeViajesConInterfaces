/*
Autor: Gonzalo Santiago García
Fecha de creación: 1 de junio del 2022
Fecha de actualización: 21 de junio del 2022 
Descripción:En está ventana Login muestra la ventana principal donde inicia el 
        programa de ejecución del programa
 */
package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame implements ActionListener {

    /**
     * se inicializa el programa a través del initcomponet
     */
    public Login() {
        initComponents();
        this.setSize(436, 436);
        setLocationRelativeTo(null);
    }
/**
 * método cerrar que se encarga de confirmar si desea cerrar el programa o 
 * manteniendo iniciada el programa 
 */
    public void cerrar(){
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter(){
               public void windowClosing(WindowEvent e){
                   confirmarSalida();
               }
        });
           this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  /**
   * Método que confirma si el usuario esté seguro de cerrar el programa 
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

        jPanelLogin = new javax.swing.JPanel();
        jLabel1Usuario = new javax.swing.JLabel();
        jLabel2Paword = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        pasword = new javax.swing.JPasswordField();
        jButtonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        jPanelLogin.setBackground(new java.awt.Color(51, 0, 51));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Usuario.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1Usuario.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Usuario.setText("Usuario:");
        jPanelLogin.add(jLabel1Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel2Paword.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2Paword.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Paword.setText("Contraseña:");
        jPanelLogin.add(jLabel2Paword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        usuario.setText("admi");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanelLogin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, -1));

        pasword.setText("123");
        pasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paswordActionPerformed(evt);
            }
        });
        jPanelLogin.add(pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 170, -1));

        jButtonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ingresar.png"))); // NOI18N
        jButtonIngresar.setToolTipText("Ingresar");
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseExited(evt);
            }
        });
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        jButtonSalir.setToolTipText("Salir");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
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
        jPanelLogin.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setRequestFocusEnabled(false);
        jPanelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paswordActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        /*
        en esta parte declaramos un usuario y una contraseña, ya que através de
         podemos acceder al programa
         */
        String usuario = "admi";
        String password = "123";
        Principal prin = new Principal();
        if (this.usuario.getText().equals(usuario)) {
            if (this.pasword.getText().equals(password)) {
                prin.setVisible(true);
                jPanelLogin.setVisible(false);
                // oculta la ventana del login
                this.hide();
            } else {
                JOptionPane.showMessageDialog(null, "La contreseña es incorrecta!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
/**
 * muestra el mensaje de error si el dato del usuario es incorrecto
 */
            JOptionPane.showMessageDialog(null, "El usuario es incorrecto!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
  /**
   * Hace la llamada de la función confirmar 
   */
      confirmarSalida();
     
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked

    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        jButtonSalir.setBackground(Color.red);
        
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        jButtonSalir.setBackground(Color.white);
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void jButtonIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseEntered
        jButtonIngresar.setBackground(Color.green);
    }//GEN-LAST:event_jButtonIngresarMouseEntered

    private void jButtonIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseExited
       jButtonIngresar.setBackground(Color.white);
    }//GEN-LAST:event_jButtonIngresarMouseExited

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Paword;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField pasword;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if (evt.equals(jButtonIngresar)) {
            jPanelLogin.setVisible(false);

        }
    }
}
