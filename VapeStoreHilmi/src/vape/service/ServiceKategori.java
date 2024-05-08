/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;

import java.util.List;
import vape.model.ModelKategori;

/**
 *
 * @author JUL
 */
public interface ServiceKategori {
    void tambahData     (ModelKategori mod_kategori);
    void perbaruiData   (ModelKategori mod_kategori);
    
    ModelKategori getByid (String id);
    
    List<ModelKategori>getData();
    List<ModelKategori>search(String id);
    
    List<ModelKategori> getKategori();
    String getKategoriID(String id);
    
}
