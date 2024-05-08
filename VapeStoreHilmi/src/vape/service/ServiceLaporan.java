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
