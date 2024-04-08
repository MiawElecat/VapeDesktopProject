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

    public ModelDataProduk getMod_id_data_produk() {
        return mod_id_data_produk;
    }

    public void setMod_id_data_produk(ModelDataProduk mod_id_data_produk) {
        this.mod_id_data_produk = mod_id_data_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public double getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(double harga_jual) {
        this.harga_jual = harga_jual;
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
    private ModelDataProduk mod_id_data_produk;
    private String nama_produk;
    private double harga_jual;
    private int jumlah_barang;
    private double subtotal_harga;
}
