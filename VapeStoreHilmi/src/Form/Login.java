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

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                    .addComponent(lbLogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnLupaPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLupaPass)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLupaPass;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
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
