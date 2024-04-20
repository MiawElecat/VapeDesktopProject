/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelPembelianSementara {

    public ModelProduk getMod_dataproduk() {
        return mod_dataproduk;
    }

    public void setMod_dataproduk(ModelProduk mod_dataproduk) {
        this.mod_dataproduk = mod_dataproduk;
    }

    public ModelDetailPembelian getMod_detpembelian() {
        return mod_detpembelian;
    }

    public void setMod_detpembelian(ModelDetailPembelian mod_detpembelian) {
        this.mod_detpembelian = mod_detpembelian;
    }

    private ModelProduk mod_dataproduk;
    private ModelDetailPembelian mod_detpembelian;
}
