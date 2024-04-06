package vape.model;

public class ModelProduk {
    private String id_data_produk;
    private String nama_produk;
    private int jumlah_stok;
    private double harga_beli;
    private double harga_jual;
    private String status;
    private String distributor_id_distributor;

    public String getId_data_produk() {
        return id_data_produk;
    }

    public void setId_data_produk(String id_data_produk) {
        this.id_data_produk = id_data_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getJumlah_stok() {
        return jumlah_stok;
    }

    public void setJumlah_stok(int jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }

    public double getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(double harga_beli) {
        this.harga_beli = harga_beli;
    }

    public double getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(double harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDistributor_id_distributor() {
        return distributor_id_distributor;
    }

    public void setDistributor_id_distributor(String distributor_id_distributor) {
        this.distributor_id_distributor = distributor_id_distributor;
    }
    
}
