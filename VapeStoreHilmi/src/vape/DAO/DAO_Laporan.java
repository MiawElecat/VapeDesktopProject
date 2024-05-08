/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.DAO;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import vape.config.Koneksi;
import vape.service.ServiceLaporan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign; 
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.event.ListSelectionListener;



/**
 *
 * @author Asus
 */
public class DAO_Laporan implements ServiceLaporan {
    
    private Connection conn;
    
    public DAO_Laporan() {
        conn = Koneksi.getConnection();
    }
    
    @Override
    public void lapPembelianPerPeriode(JPanel jp, Date tgl1, Date tgl2) {
        try {
            String reportPath = "src/laporan/laporanPembelian.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tgl1",tgl1);
            parameters.put("tgl2", tgl2);
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
        
    }    

    @Override
    public void lapPenjualan(JPanel jp, Date tglT1, Date tglT2) {
       try {
            String reportPath = "src/laporan/laporanPenjualan.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tglT1",tglT1);
            parameters.put("tglT2", tglT2);
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
}
}
   

