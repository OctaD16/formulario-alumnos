package com.mycompany.Frames;

import static com.mycompany.Frames.VentanaLogeado.nameUser;
import com.mycompany.metodosYObjetos.Validar;
import conexionDB.Conector;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtPassLog.setEchoChar((char) 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        heder = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreoLog = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassLog = new javax.swing.JPasswordField();
        ojo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        LBpass = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(31, 29, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo octavio3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel5)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        heder.setBackground(new java.awt.Color(51, 51, 51));
        heder.setForeground(new java.awt.Color(253, 253, 253));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout hederLayout = new javax.swing.GroupLayout(heder);
        heder.setLayout(hederLayout);
        hederLayout.setHorizontalGroup(
            hederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hederLayout.createSequentialGroup()
                .addGap(0, 518, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        hederLayout.setVerticalGroup(
            hederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(heder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 30));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(253, 253, 253));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 800));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Swis721 Ex BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 253, 253));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR SESION");

        txtCorreoLog.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreoLog.setFont(new java.awt.Font("Swis721 Ex BT", 1, 12)); // NOI18N
        txtCorreoLog.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreoLog.setText("CORREO");
        txtCorreoLog.setBorder(null);
        txtCorreoLog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoLogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoLogFocusLost(evt);
            }
        });
        txtCorreoLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorreoLogMouseEntered(evt);
            }
        });
        txtCorreoLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoLogActionPerformed(evt);
            }
        });
        txtCorreoLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoLogKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        txtPassLog.setBackground(new java.awt.Color(51, 51, 51));
        txtPassLog.setFont(new java.awt.Font("Swis721 Ex BT", 1, 12)); // NOI18N
        txtPassLog.setForeground(new java.awt.Color(204, 204, 204));
        txtPassLog.setText("CONTRASEÑA");
        txtPassLog.setBorder(null);
        txtPassLog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassLogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassLogFocusLost(evt);
            }
        });
        txtPassLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassLogActionPerformed(evt);
            }
        });

        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojo.png"))); // NOI18N
        ojo.setToolTipText("");

        btnVolver.setBackground(new java.awt.Color(31, 29, 30));
        btnVolver.setFont(new java.awt.Font("Swis721 Ex BT", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(253, 253, 253));
        btnVolver.setText("REGISTRATE");
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(31, 29, 30));
        btnEntrar.setFont(new java.awt.Font("Swis721 Ex BT", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(253, 253, 253));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEntrarMouseReleased(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnEntrarPropertyChange(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/en.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desbloquear.png"))); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        LBpass.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        LBpass.setForeground(new java.awt.Color(253, 253, 253));
        LBpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBpass.setText("Olvide mi contraseña");
        LBpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBpass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LBpassMouseMoved(evt);
            }
        });
        LBpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LBpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LBpassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(txtCorreoLog, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassLog, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LBpass)
                                        .addGap(24, 24, 24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ojo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCorreoLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPassLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ojo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LBpass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // Si la casilla está seleccionada, mostrar la contraseña
        if (jCheckBox1.isSelected()) {

            txtPassLog.setEchoChar((char) 0);
        } else {
            // Si no está seleccionada, ocultar la contraseña
            txtPassLog.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Conector cn = new Conector();
        //recuperamos la informacion de los campos del Jframe de venantaLogin
        try {

            Validar valid = new Validar();
            String cadenaEncriptada = valid.Encriptar(String.valueOf(txtPassLog.getPassword()));
            String correo = txtCorreoLog.getText();

            //iniciamos un statement para realizar consultas sobre la base de datos
            String query = "SELECT * FROM registro WHERE correo='" + correo + "' and contrasenia='" + cadenaEncriptada + "'";
            Statement st = cn.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                VentanaLogeado vLogeado = new VentanaLogeado();
                vLogeado.setVisible(true);
                nameUser.setText(rs.getString(2)); 
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "no existe el usuario");
            }
        } catch (Exception e) {
            System.out.println("algo salio mal en login" + e.toString());
        }

//        try {
//            String query = "SELECT * FROM registro WHERE correo=? and contraseña=?";
//            PreparedStatement preparedStatement = cn.conectar().prepareStatement(query);
//            preparedStatement.setString(1, txtCorreoLog.getText());
//            preparedStatement.setString(2, String.valueOf(txtPassLog.getPassword()));
//            ResultSet rs = preparedStatement.executeQuery(query);
//            if (rs.next()) {
//               
//            }
//            
//        } catch (Exception e) {
//
//        }

        //cadenaEncriptada=mtd.Encriptar(pass);

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();//cerramos la ventana actual de Login
        VentanaRegistro vR = new VentanaRegistro();
        vR.setVisible(true);//inicializamos la ventana de Registro
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPassLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassLogActionPerformed

    private void txtCorreoLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoLogActionPerformed

    }//GEN-LAST:event_txtCorreoLogActionPerformed

    private void txtCorreoLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoLogMouseEntered

    }//GEN-LAST:event_txtCorreoLogMouseEntered

    private void txtCorreoLogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoLogKeyTyped

    }//GEN-LAST:event_txtCorreoLogKeyTyped

    private void txtPassLogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassLogFocusLost
        if (txtPassLog.getPassword().length < 1) {
            txtPassLog.setEchoChar((char) 0);
            txtPassLog.setText("CONTRASEÑA");
        }
    }//GEN-LAST:event_txtPassLogFocusLost

    private void txtCorreoLogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoLogFocusGained
        if (txtCorreoLog.getText().equals("CORREO")) {
            txtCorreoLog.setText("");
        }
    }//GEN-LAST:event_txtCorreoLogFocusGained

    private void txtPassLogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassLogFocusGained
        if (String.valueOf(txtPassLog.getPassword()).equals("CONTRASEÑA")) {
            txtPassLog.setText("");
            txtPassLog.setEchoChar('*');
        }
    }//GEN-LAST:event_txtPassLogFocusGained

    private void txtCorreoLogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoLogFocusLost
        if (txtCorreoLog.getText().equals("")) {
            txtCorreoLog.setText("CORREO");
        }
    }//GEN-LAST:event_txtCorreoLogFocusLost

    private void btnEntrarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnEntrarPropertyChange
        btnEntrar.setBackground(new Color(31, 29, 30));

    }//GEN-LAST:event_btnEntrarPropertyChange

    private void btnEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMousePressed
        btnEntrar.setBackground(new Color(31, 29, 30));
        btnEntrar.setForeground(new Color(31, 29, 30));
    }//GEN-LAST:event_btnEntrarMousePressed

    private void btnEntrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseReleased
        btnEntrar.setForeground(new Color(253, 253, 253));
    }//GEN-LAST:event_btnEntrarMouseReleased

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(Color.red);
        jLabel2.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(Color.white);
        jLabel2.setBackground(Color.white);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LBpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBpassMouseExited
        LBpass.setForeground(Color.white);
    }//GEN-LAST:event_LBpassMouseExited

    private void LBpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBpassMouseEntered
        LBpass.setForeground(new Color(0, 255, 255));
    }//GEN-LAST:event_LBpassMouseEntered

    private void LBpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBpassMouseClicked
        VentanaEmail vEmail = new VentanaEmail();
        vEmail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LBpassMouseClicked

    private void LBpassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBpassMouseMoved
        LBpass.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_LBpassMouseMoved

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setForeground(new Color(0, 255, 255));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setForeground(new Color(253, 253, 253));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setForeground(new Color(0, 255, 255));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setForeground(new Color(253, 253, 253));
    }//GEN-LAST:event_btnVolverMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBpass;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel heder;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel ojo;
    private javax.swing.JTextField txtCorreoLog;
    private javax.swing.JPasswordField txtPassLog;
    // End of variables declaration//GEN-END:variables
}
