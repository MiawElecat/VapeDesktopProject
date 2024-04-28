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
