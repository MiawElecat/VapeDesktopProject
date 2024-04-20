/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelDetailRestok {

    public String getIddetail_restok() {
        return iddetail_restok;
    }

    public void setIddetail_restok(String iddetail_restok) {
        this.iddetail_restok = iddetail_restok;
    }

    public ModelRestok getMod_id_restok() {
        return mod_id_restok;
    }

    public void setMod_id_restok(ModelRestok mod_id_restok) {
        this.mod_id_restok = mod_id_restok;
    }

    public ModelProduk getMod_id_data_produk() {
        return mod_id_data_produk;
    }

    public void setMod_id_data_produk(ModelProduk mod_id_data_produk) {
        this.mod_id_data_produk = mod_id_data_produk;
    }

    public int getJumlah_restok() {
        return jumlah_restok;
    }

    public void setJumlah_restok(int jumlah_restok) {
        this.jumlah_restok = jumlah_restok;
    }

    public double getSubtotal_harga() {
        return subtotal_harga;
    }

    public void setSubtotal_harga(double subtotal_harga) {
        this.subtotal_harga = subtotal_harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String iddetail_restok;
    private ModelRestok mod_id_restok;
    private ModelProduk mod_id_data_produk;
    private int jumlah_restok;
    private double subtotal_harga;
    private String status;
}
