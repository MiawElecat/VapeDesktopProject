/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;

import java.util.List;
import vape.model.ModelTransaksi;

/**
 *
 * @author JUL
 */
public interface ServiceTransaksi {
    void tambahData (ModelTransaksi mod_transaksi);
    
    ModelTransaksi getByid (String id);
    List<ModelTransaksi> getData();
    List<ModelTransaksi> search(String id);
    String nomor();
}
