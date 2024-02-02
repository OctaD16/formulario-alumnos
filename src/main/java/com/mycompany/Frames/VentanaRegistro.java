package com.mycompany.Frames;

import com.mycompany.metodosYObjetos.Metodos;
import com.mycompany.metodosYObjetos.Persona;
import com.mycompany.metodosYObjetos.Validar;
import conexionDB.Conector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class VentanaRegistro extends javax.swing.JFrame {

    Conector cone = new Conector();
    Connection conexion = cone.conectar();

    public VentanaRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        ojo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbSalirR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(200, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(31, 29, 30));

        jLabel2.setBackground(new java.awt.Color(31, 29, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo octavio3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        jLabel3.setFont(new java.awt.Font("Swis721 Ex BT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 229, 30));

        txtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 229, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CORREO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 229, 30));

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 229, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 229, 30));

        txtPass.setBackground(new java.awt.Color(51, 51, 51));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 229, 20));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 240, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, 10));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 240, 10));

        btnLogin.setBackground(new java.awt.Color(31, 29, 30));
        btnLogin.setFont(new java.awt.Font("Swis721 Ex BT", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(253, 253, 253));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 111, 40));

        btnRegistrar.setBackground(new java.awt.Color(31, 29, 30));
        btnRegistrar.setFont(new java.awt.Font("Swis721 Ex BT", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(253, 253, 253));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 110, 40));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Swis721 Ex BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 253, 253));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 340, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/en.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desbloquear.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 20, -1));

        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojo.png"))); // NOI18N
        ojo.setToolTipText("");
        jPanel1.add(ojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 316, 20, 20));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbSalirR.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        lbSalirR.setForeground(new java.awt.Color(255, 255, 255));
        lbSalirR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSalirR.setText("x");
        lbSalirR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSalirR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSalirRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSalirRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSalirRMouseExited(evt);
            }
        });
        jPanel1.add(lbSalirR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 470));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtUsuario.getText().isEmpty() && txtCorreo.getText().isEmpty() && txtPass.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Rellenar Campos");
        } else {
            if (txtUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Usuario Vacio");
            } else {
                if (txtCorreo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo Correo Vacio");
                } else {
                    if (txtPass.getPassword().length == 0) {
                        JOptionPane.showMessageDialog(null, "Campo Contraseña Vacio");
                    } else {
                        //valores para el metodo de encriptacion
                        Metodos mt = new Metodos();
                        Validar valid = new Validar();
                        String contraseñaEncriptada = valid.Encriptar(String.valueOf(txtPass.getPassword()));
                        String contraseñaDesencriptada = valid.Desencriptar(contraseñaEncriptada);

//creamos variables locales para extraer la información de los textField definidos en la ventana
                        String correoElectrónico = txtCorreo.getText();
                        Persona nuevaPersona = new Persona();
                        nuevaPersona.setUsuario(txtUsuario.getText());
                        nuevaPersona.setCorreo(txtCorreo.getText());
                        nuevaPersona.setContraseña(contraseñaEncriptada);

//metodo de validacion
                        try {
                            if (mt.buscarUsuario(correoElectrónico)) {
                                JOptionPane.showMessageDialog(null, "El usuario ya se encuentro registrado");
                            } else {
                                if (txtCorreo.getText().indexOf('@') == -1) {
                                    JOptionPane.showMessageDialog(null, "Formato de correo incorrecto");
                                } else {
                                    if (Validar.validarContraseña(contraseñaDesencriptada)) {
                                        mt.insertUser(nuevaPersona);
// Reseteo de campos
                                        txtUsuario.setText("");
                                        txtCorreo.setText("");
                                        txtPass.setText("");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "ALERTA"
                                                + "\n  Verifica que la contraseña tenga:"
                                                + "\n *Entre 1 y 8 caracteres"
                                                + "\n *Un caracter especial."
                                                + "\n *Una minúscula."
                                                + "\n *Una mayúscula."
                                                + "\n *Un número.");
                                    }
                                }
                            }

                        } catch (Exception e) {
                            System.out.println("Algo salió mal: " + e.getMessage());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        VentanaLogin vLogin = new VentanaLogin();
        vLogin.setVisible(true);//abrimos vetana nueva
        this.dispose();//cerramos la ventana actual
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        txtPass.transferFocus();
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        txtCorreo.transferFocus();
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtUsuario.transferFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setForeground(new Color(253, 253, 253));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setForeground(new Color(0, 255, 255));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setForeground(new Color(0, 255, 255));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setForeground(new Color(253, 253, 253));
    }//GEN-LAST:event_btnLoginMouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // Si la casilla está seleccionada, mostrar la contraseña
        if (jCheckBox1.isSelected()) {

            txtPass.setEchoChar((char) 0);
        } else {
            // Si no está seleccionada, ocultar la contraseña
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel2.setForeground(Color.red);
        jLabel2.setBackground(Color.red);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel2.setForeground(Color.white);
        jLabel2.setBackground(Color.white);
    }//GEN-LAST:event_jLabel9MouseExited

    private void lbSalirRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirRMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbSalirRMouseClicked

    private void lbSalirRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirRMouseEntered
        lbSalirR.setForeground(Color.red);
        lbSalirR.setBackground(Color.red);
    }//GEN-LAST:event_lbSalirRMouseEntered

    private void lbSalirRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSalirRMouseExited
        lbSalirR.setForeground(new Color(253, 253, 253));
        lbSalirR.setBackground(Color.white);
    }//GEN-LAST:event_lbSalirRMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbSalirR;
    private javax.swing.JLabel ojo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
