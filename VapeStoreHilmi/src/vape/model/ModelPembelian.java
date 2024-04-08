/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelPembelian {

    public String getId_pembelian() {
        return id_pembelian;
    }

    public void setId_pembelian(String id_pembelian) {
        this.id_pembelian = id_pembelian;
    }

    public ModelPengguna getMod_id_pengguna() {
        return mod_id_pengguna;
    }

    public void setMod_id_pengguna(ModelPengguna mod_id_pengguna) {
        this.mod_id_pengguna = mod_id_pengguna;
    }

    public ModelDistributor getMod_id_distributor() {
        return mod_id_distributor;
    }

    public void setMod_id_distributor(ModelDistributor mod_id_distributor) {
        this.mod_id_distributor = mod_id_distributor;
    }

    public String getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(String tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }

    public double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }

    private String id_pembelian;
    private ModelPengguna mod_id_pengguna;
    private ModelDistributor mod_id_distributor;
    private String tanggal_pembelian;
    private double total_harga;
}
