/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelRestokSementara {

    public ModelProduk getMod_produk() {
        return mod_produk;
    }

    public void setMod_produk(ModelProduk mod_produk) {
        this.mod_produk = mod_produk;
    }

    public ModelDetailRestok getMod_detrestok() {
        return mod_detrestok;
    }

    public void setMod_detrestok(ModelDetailRestok mod_detrestok) {
        this.mod_detrestok = mod_detrestok;
    }
    
    private ModelProduk mod_produk;
    private ModelDetailRestok mod_detrestok;
    
}
