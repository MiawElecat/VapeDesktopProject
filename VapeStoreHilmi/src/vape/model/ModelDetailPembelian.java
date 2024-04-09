/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelDetailPembelian {

    public String getIddetail_pembelian() {
        return iddetail_pembelian;
    }

    public void setIddetail_pembelian(String iddetail_pembelian) {
        this.iddetail_pembelian = iddetail_pembelian;
    }

    public ModelPembelian getMod_id_pembelian() {
        return mod_id_pembelian;
    }

    public void setMod_id_pembelian(ModelPembelian mod_id_pembelian) {
        this.mod_id_pembelian = mod_id_pembelian;
    }

    public ModelProduk getMod_id_data_produk() {
        return mod_id_data_produk;
    }

    public void setMod_id_data_produk(ModelProduk mod_id_data_produk) {
        this.mod_id_data_produk = mod_id_data_produk;
    }

    public int getJumlah_pembelian() {
        return jumlah_pembelian;
    }

    public void setJumlah_pembelian(int jumlah_pembelian) {
        this.jumlah_pembelian = jumlah_pembelian;
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
    private String iddetail_pembelian;
    private ModelPembelian mod_id_pembelian;
    private ModelProduk mod_id_data_produk;
    private int jumlah_pembelian;
    private double subtotal_harga;
    private String status;
}
