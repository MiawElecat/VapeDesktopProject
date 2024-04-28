package Main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import Form.Login;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import vape.model.ModelPengguna;

public class MenuUtama extends javax.swing.JFrame {
    
    private ModelPengguna mod_pegguna;

    private final Login FormLogin;
    private static MenuUtama app;
    private final Main mainForm;
    
    public MenuUtama(String Id, String Nama) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FormLogin = new Login();
        mainForm = new Main();
        setContentPane (FormLogin);
    }   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("Theme");
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            app = new MenuUtama("Id","Nama");
            app.setVisible(true);
        });
    }
    
    public static void showForm(Component component) {
        component.applyComponentOrientation(app.getComponentOrientation());
        app.mainForm.showForm(component);
    }
    
    
    public static void login(ModelPengguna model) {
        FlatAnimatedLafChange.showSnapshot();
        app.setContentPane(app.mainForm);
        app.mainForm.applyComponentOrientation(app.getComponentOrientation());
        setSelectedMenu(0,0);
        app.mainForm.hideMenu();
        SwingUtilities.updateComponentTreeUI(app.mainForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void logout() {
        FlatAnimatedLafChange.showSnapshot();
        app.setContentPane(app.FormLogin);
        app.FormLogin.applyComponentOrientation(app.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(app.FormLogin);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void setSelectedMenu(int index, int subMenu) {
        app.mainForm.setSelectedMenu(index,subMenu);
    }

    private void panelDalamPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
