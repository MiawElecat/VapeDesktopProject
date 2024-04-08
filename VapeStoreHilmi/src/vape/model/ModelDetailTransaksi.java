/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelDetailTransaksi {

    public String getIddetail_tranaksi() {
        return iddetail_tranaksi;
    }

    public void setIddetail_tranaksi(String iddetail_tranaksi) {
        this.iddetail_tranaksi = iddetail_tranaksi;
    }

    public ModelTransaksi getMod_id_transaksi() {
        return mod_id_transaksi;
    }

    public void setMod_id_transaksi(ModelTransaksi mod_id_transaksi) {
        this.mod_id_transaksi = mod_id_transaksi;
    }

    public ModelDataProduk getMod_id_data_produk() {
        return mod_id_data_produk;
    }

    public void setMod_id_data_produk(ModelDataProduk mod_id_data_produk) {
        this.mod_id_data_produk = mod_id_data_produk;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public double getSubtotal_harga() {
        return subtotal_harga;
    }

    public void setSubtotal_harga(double subtotal_harga) {
        this.subtotal_harga = subtotal_harga;
    }

    private String iddetail_tranaksi;
    private ModelTransaksi mod_id_transaksi;
    private ModelDataProduk mod_id_data_produk;
    private int jumlah_barang;
    private double subtotal_harga;
}
