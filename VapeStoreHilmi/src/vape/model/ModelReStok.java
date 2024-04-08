/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.model;

/**
 *
 * @author JUL
 */
public class ModelReStok {

    public String getId_restok() {
        return id_restok;
    }

    public void setId_restok(String id_restok) {
        this.id_restok = id_restok;
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

    public String getTanggal_restok() {
        return tanggal_restok;
    }

    public void setTanggal_restok(String tanggal_restok) {
        this.tanggal_restok = tanggal_restok;
    }

    public double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }
    private String id_restok;
    private ModelPengguna mod_id_pengguna;
    private ModelDistributor mod_id_distributor;
    private String tanggal_restok;
    private double total_harga;
}
