/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelPembelianSementara;

/**
 *
 * @author JUL
 */
public interface ServicePembelianSementara {
    void tambahData         (ModelPembelianSementara mod_pembelian_sem);
    void perbaruiData       (ModelPembelianSementara mod_pembelian_sem);
    void hapusData          (ModelPembelianSementara mod_pembelian_sem);
    boolean validasiTambah  (ModelPembelianSementara mod_pembelian_sem);
    
    ModelPembelianSementara getByid (String id);
    
    List<ModelPembelianSementara>getData();
}
