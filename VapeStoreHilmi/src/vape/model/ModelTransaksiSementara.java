/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelTransaksiSementara {

    public ModelProduk getMod_dataproduk() {
        return mod_dataproduk;
    }

    public void setMod_dataproduk(ModelProduk mod_dataproduk) {
        this.mod_dataproduk = mod_dataproduk;
    }

    public ModelDetailTransaksi getMod_dettransaksi() {
        return mod_dettransaksi;
    }

    public void setMod_dettransaksi(ModelDetailTransaksi mod_dettransaksi) {
        this.mod_dettransaksi = mod_dettransaksi;
    }

    private ModelProduk mod_dataproduk;
    private ModelDetailTransaksi mod_dettransaksi;

}
