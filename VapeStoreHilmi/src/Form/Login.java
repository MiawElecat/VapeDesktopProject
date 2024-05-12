package Form;

import Main.MenuUtama;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vape.DAO.DAO_Pengguna;
import vape.menu.LightDarkMode;
import vape.model.ModelPengguna;
import vape.service.ServicePengguna;

public class Login extends javax.swing.JPanel {
    
    private LightDarkMode lightDarkMode;
    private ServicePengguna servis = new DAO_Pengguna();

    public Login() {
        initComponents();
        setLayoutForm();
        lightDarkMode = new LightDarkMode();
        add (lightDarkMode);
    }

    Login(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void resetForm() {
        txtUser.setText("");
        txtPass.setText("");
    }
    
    private boolean validasiInput() {
        boolean valid = false;
        if(txtUser.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        } else if (txtPass.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }
    
    private void prosesLogin() {
        if (validasiInput() == true) {
            String user = txtUser.getText();
            String pass = txtPass.getText();
            ModelPengguna model = new ModelPengguna();
            model.setNama_pengguna(user);
            model.setPassword(pass);
            
            ModelPengguna modelPengguna = servis.prosesLogin(model);
            if(modelPengguna != null) {
                MenuUtama.login(modelPengguna);
                resetForm();
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Username dan Password salah", "Pesan",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lbPass = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnLupaPass = new javax.swing.JButton();
        pnLupaPass = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnLogin1 = new javax.swing.JPanel();
        lbLogo1 = new javax.swing.JLabel();
        lbTitle1 = new javax.swing.JLabel();
        lbUser1 = new javax.swing.JLabel();
        txtUser1 = new javax.swing.JTextField();
        txtPass1 = new javax.swing.JPasswordField();
        lbPass1 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        btnLupaPass1 = new javax.swing.JButton();
        pnLupaPass1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("VapeR Store");

        lbUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("Username");

        lbPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 255, 255));
        lbPass.setText("Password");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin.setText("Masuk");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Buat Akun");
        btnRegister.setBorderPainted(false);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLupaPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLupaPass.setForeground(new java.awt.Color(255, 255, 255));
        btnLupaPass.setText("Lupa Password");
        btnLupaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnLoginLayout.createSequentialGroup()
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbUser)
                                    .addComponent(lbPass))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPass)
                            .addComponent(txtUser)
                            .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                            .addComponent(lbLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnLoginLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegister)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnLoginLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnLupaPass)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addGap(34, 34, 34)
                .addComponent(lbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addComponent(btnLupaPass)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        add(pnLogin, "card2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Tess Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnLupaPassLayout = new javax.swing.GroupLayout(pnLupaPass);
        pnLupaPass.setLayout(pnLupaPassLayout);
        pnLupaPassLayout.setHorizontalGroup(
            pnLupaPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLupaPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnLupaPassLayout.setVerticalGroup(
            pnLupaPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLupaPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnLupaPass, "card3");

        jPanel1.setLayout(new java.awt.CardLayout());

        lbLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N

        lbTitle1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle1.setText("VapeR Store");

        lbUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUser1.setForeground(new java.awt.Color(255, 255, 255));
        lbUser1.setText("Username");

        lbPass1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbPass1.setForeground(new java.awt.Color(255, 255, 255));
        lbPass1.setText("Password");

        btnLogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin1.setText("Masuk");
        btnLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogin1MouseClicked(evt);
            }
        });
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        btnRegister1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Buat Akun");
        btnRegister1.setBorderPainted(false);
        btnRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegister1MouseClicked(evt);
            }
        });
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        btnLupaPass1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLupaPass1.setForeground(new java.awt.Color(255, 255, 255));
        btnLupaPass1.setText("Lupa Password");
        btnLupaPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaPass1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLogin1Layout = new javax.swing.GroupLayout(pnLogin1);
        pnLogin1.setLayout(pnLogin1Layout);
        pnLogin1Layout.setHorizontalGroup(
            pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogin1Layout.createSequentialGroup()
                .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLogin1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnLogin1Layout.createSequentialGroup()
                                .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbUser1)
                                    .addComponent(lbPass1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPass1)
                            .addComponent(txtUser1)
                            .addComponent(lbTitle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                            .addComponent(lbLogo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnLogin1Layout.createSequentialGroup()
                        .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnLogin1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegister1)
                                    .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnLogin1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnLupaPass1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnLogin1Layout.setVerticalGroup(
            pnLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogin1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbLogo1)
                .addGap(18, 18, 18)
                .addComponent(lbTitle1)
                .addGap(34, 34, 34)
                .addComponent(lbUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPass1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnLogin1)
                .addGap(18, 18, 18)
                .addComponent(btnRegister1)
                .addGap(18, 18, 18)
                .addComponent(btnLupaPass1)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel1.add(pnLogin1, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Tess Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel2)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnLupaPass1Layout = new javax.swing.GroupLayout(pnLupaPass1);
        pnLupaPass1.setLayout(pnLupaPass1Layout);
        pnLupaPass1Layout.setHorizontalGroup(
            pnLupaPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLupaPass1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnLupaPass1Layout.setVerticalGroup(
            pnLupaPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLupaPass1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pnLupaPass1, "card3");

        add(jPanel1, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        buatAkun();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        MenuUtama home = new MenuUtama();
        home.setVisible(true);
        home.revalidate();
        
        dispose();
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLupaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaPassActionPerformed
        removeAll();
        repaint();
        revalidate();
        
        add(pnLupaPass);
        repaint();
        revalidate();
    }//GEN-LAST:event_btnLupaPassActionPerformed

    private void btnLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1MouseClicked

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister1MouseClicked

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnLupaPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLupaPass1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnLupaPass;
    private javax.swing.JButton btnLupaPass1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogo1;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPass1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUser1;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnLogin1;
    private javax.swing.JPanel pnLupaPass;
    private javax.swing.JPanel pnLupaPass1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser1;
    // End of variables declaration//GEN-END:variables

    private void setLayoutForm() {
        setLayout(new FormLoginLayout());
        pnLogin.setLayout (new LoginLayout());
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "font:$h1.font");
        pnLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:rgb(72,63,139);"
                + "arc:20;"
                + "border:30,40,50,30");
        txtUser.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:999;");
        txtPass.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;"
                + "arc:999;"
                + "showCapsLock:true");
        btnLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:999;"
                + "borderWidth:0;"
                + "focusWidth:0");
        btnRegister.putClientProperty(FlatClientProperties.STYLE, "" 
                + "background:null;"
                );
        btnLupaPass.putClientProperty(FlatClientProperties.STYLE, "" 
                + "background:null;"
                );
        txtUser.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        txtPass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        

    }

    private void buatAkun() {
        FormBuatAkun formRegister = new FormBuatAkun(null, true);
        formRegister.setVisible(true);
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    private class FormLoginLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0, 0);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0, 0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                int width = parent.getWidth();
                int height = parent.getHeight();
                int loginWidth = UIScale.scale(500);
                int loginHeight = UIScale.scale(435);
                int x = (width - loginWidth) / 2;
                int y = (height - loginHeight) / 2;
                pnLogin.setBounds(x, y, loginWidth, loginHeight);
                btnLogin.setBounds(x, y, width, btnLogin.getPreferredSize().height);
            }
        }
    }
    
    private class LoginLayout implements LayoutManager {

    private final int titleGap = 10;
    private final int textGap = 10;
    private final int labelGap = 10;
    private final int buttonGap = 9;

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            Insets insets = parent.getInsets();
            int height = insets.top + insets.bottom;

            height += lbLogo.getPreferredSize().height;
            height += UIScale.scale(titleGap);
            height += lbTitle.getPreferredSize().height;
            height += UIScale.scale(titleGap);
            height += lbUser.getPreferredSize().height;
            height += UIScale.scale(labelGap);
            height += txtUser.getPreferredSize().height;
            height += UIScale.scale(textGap);

            height += lbPass.getPreferredSize().height;
            height += UIScale.scale(labelGap);
            height += txtPass.getPreferredSize().height;
            height += UIScale.scale(buttonGap);
            height += btnLogin.getPreferredSize().height;
            height += btnRegister.getPreferredSize().height;
            height += btnLupaPass.getPreferredSize().height;
            return new Dimension(0, height);
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            return new Dimension(0, 0);
        }
    }

    @Override
public void layoutContainer(Container parent) {
    synchronized (parent.getTreeLock()) {
        Insets insets = parent.getInsets();
        int x = insets.left;
        int y = insets.top;
        int width = parent.getWidth() - (insets.left + insets.right);

        lbLogo.setBounds(x, y, width, lbLogo.getPreferredSize().height);
        y += lbLogo.getPreferredSize().height + UIScale.scale(titleGap);

        lbTitle.setBounds(x, y, width, lbTitle.getPreferredSize().height);
        y += lbTitle.getPreferredSize().height + UIScale.scale(titleGap);

        lbUser.setBounds(x, y, width, lbUser.getPreferredSize().height);
        y += lbUser.getPreferredSize().height + UIScale.scale(labelGap);
        txtUser.setBounds(x, y, width, txtUser.getPreferredSize().height);
        y += txtUser.getPreferredSize().height + UIScale.scale(textGap);

        lbPass.setBounds(x, y, width, lbPass.getPreferredSize().height);
        y += lbPass.getPreferredSize().height + UIScale.scale(labelGap);
        txtPass.setBounds(x, y, width, txtPass.getPreferredSize().height);
        y += txtPass.getPreferredSize().height + UIScale.scale(buttonGap);

        btnLogin.setBounds(x, 300, width, btnLogin.getPreferredSize().height);
        y += btnLogin.getPreferredSize().height + UIScale.scale(buttonGap);

        btnRegister.setBounds(x, 335, width, btnRegister.getPreferredSize().height);
        y += btnRegister.getPreferredSize().height + UIScale.scale(buttonGap);
       
        btnLupaPass.setBounds(x, 370, width, btnRegister.getPreferredSize().height);
        y += btnLupaPass.getPreferredSize().height + UIScale.scale(buttonGap);
        
        btnLupaPass.setOpaque(false);
        btnLupaPass.setContentAreaFilled(false);
        btnLupaPass.setBorderPainted(false);
        btnRegister.setOpaque(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        
    }
}

}

    
}
