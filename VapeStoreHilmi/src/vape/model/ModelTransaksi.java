/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelTransaksi {

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public ModelPengguna getMod_id_pengguna() {
        return mod_id_pengguna;
    }

    public void setMod_id_pengguna(ModelPengguna mod_id_pengguna) {
        this.mod_id_pengguna = mod_id_pengguna;
    }

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    public Double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Double total_harga) {
        this.total_harga = total_harga;
    }

    public Double getBayar() {
        return bayar;
    }

    public void setBayar(Double bayar) {
        this.bayar = bayar;
    }

    public Double getKembali() {
        return kembali;
    }

    public void setKembali(Double kembali) {
        this.kembali = kembali;
    }


    private String id_transaksi;
    private ModelPengguna mod_id_pengguna;
    private String tanggal_transaksi;
    private Double total_harga;
    private Double bayar;
    private Double kembali;
}
