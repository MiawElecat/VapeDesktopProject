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

/**
 *
 * @author Asus
 */
public class DAO_Laporan implements ServiceLaporan {
    
    private Connection conn;
    
    public DAO_Laporan() {
        conn = Koneksi.getConnection();
    }
    
    /*
    @Override
    public void TransaksiPembelian(String no) {
        try {
            String reportPath = "src/laporan/TransaksiPembelian.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print,false);
            viewer.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }   
    }
    
    @Override
    public void lapPembelian(JPanel jp) {
     try {
            String reportPath = "src/laporan/lapPembelian.jasper";
            
            HashMap<String, Object> parameters = new HashMap<>();
       
            
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }   
    }
*/

    @Override
    public void lapPembelianPerPeriode(JPanel jp, String tgl1, String tgl2) {
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
    public void lapPenjualan(JPanel jp, String tglT1, String tglT2) {
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
