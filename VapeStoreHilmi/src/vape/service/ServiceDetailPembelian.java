/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;

import java.util.List;
import vape.model.ModelDetailPembelian;

/**
 *
 * @author JUL
 */
public interface ServiceDetailPembelian {
    void tambahData         (ModelDetailPembelian mod_det_pembelian);
    void jumTotal           (ModelDetailPembelian mod_det_pembelian);
    void hapusSementara     (ModelDetailPembelian mod_det_pembelian);
    void updateStatus       (ModelDetailPembelian mod_det_pembelian);
    boolean validasiStatus  (ModelDetailPembelian mod_det_pembelian);
    
    ModelDetailPembelian getByid (String id);
    
    List<ModelDetailPembelian>getData(String id);
    List<ModelDetailPembelian>search(String id);
}
