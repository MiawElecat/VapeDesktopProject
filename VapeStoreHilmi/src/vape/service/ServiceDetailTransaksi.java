/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;

import java.util.List;
import vape.model.ModelDetailTransaksi;

/**
 *
 * @author JUL
 */
public interface ServiceDetailTransaksi {
    void tambahData     (ModelDetailTransaksi mod_det_transaksi);
    void sumTotal       (ModelDetailTransaksi mod_det_transaksi);
    void hapusSementara (ModelDetailTransaksi mod_det_transaksi);
    void updateStok     (ModelDetailTransaksi mod_det_transaksi);
    
    ModelDetailTransaksi getByid (String id);
    
    List<ModelDetailTransaksi>getData(String id);
    List<ModelDetailTransaksi>search(String id);
    
    boolean validasistok (ModelDetailTransaksi mod_det_transaksi);
}
