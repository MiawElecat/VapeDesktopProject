/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelPembelian;

/**
 *
 * @author JUL
 */
public interface ServicePembelian {
    void tambahData     (ModelPembelian mod_pembelian);
    
    ModelPembelian getByid (String id);
    
    List<ModelPembelian>getData();
    List<ModelPembelian>search(String id);
    String nomor();
}
