/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelTransaksiSementara;

/**
 *
 * @author JUL
 */
public interface ServiceTransaksiSementara {
    void tambahDataSementara    (ModelTransaksiSementara mod_transaksi_sem);
    void perbaruiDataSementara  (ModelTransaksiSementara mod_transaksi_sem);
    void hapusDataSementara     (ModelTransaksiSementara mod_transaksi_sem);
    boolean validasiTambah      (ModelTransaksiSementara mod_transaksi_sem);

    
    ModelTransaksiSementara getByid (String id);
    
    List<ModelTransaksiSementara>getData();
}
