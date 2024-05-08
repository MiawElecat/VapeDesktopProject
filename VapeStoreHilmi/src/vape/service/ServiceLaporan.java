<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vape.service;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public interface ServiceLaporan {
    void lapPembelianPerPeriode (JPanel jp, Date tgl1, Date tgl2);
    
    void lapPenjualan (JPanel jp, Date tglT1, Date tglT2);
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vape.service;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public interface ServiceLaporan {
   // void TransaksiPembelian (String no);
    //void lapPembelian (JPanel jp);    
    void lapPembelianPerPeriode (JPanel jp, String tgl1, String tgl2);
    
    void lapPenjualan (JPanel jp, String tglT1, String tglT2);
    
}
>>>>>>> 23c2c291162e771ef776874d785569f48b9bf978
