package vape.service;

import vape.model.ModelProduk;
import java.util.List;

public interface ServiceProduk {
    void tambahData   (ModelProduk mod_produk);
    void perbaruiData (ModelProduk mod_produk);
    void hapusData    (ModelProduk mod_produk);
    
    List<ModelProduk>getDataByID();
    List<ModelProduk>getData();
    List<ModelProduk>getDataID(String id);
    List<ModelProduk>SearchDataByBArcode(String id);
    
    List<ModelProduk>search(String id);
    List<ModelProduk>search2(String id);
    
    String nomor(String id);
    String nomor2();
}
