package vape.model;

public class ModelProduk {

    public String getId_data_produk() {
        return id_data_produk;
    }

    public void setId_data_produk(String id_data_produk) {
        this.id_data_produk = id_data_produk;
    }

    public ModelDistributor getMod_distributor() {
        return mod_distributor;
    }

    public void setMod_distributor(ModelDistributor mod_distributor) {
        this.mod_distributor = mod_distributor;
    }

    public ModelKategori getMod_kategori() {
        return mod_kategori;
    }

    public void setMod_kategori(ModelKategori mod_kategori) {
        this.mod_kategori = mod_kategori;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
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

    public Double getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(Double harga_beli) {
        this.harga_beli = harga_beli;
    }

    public Double getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(Double harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String id_data_produk;
    private ModelDistributor mod_distributor;
    private ModelKategori mod_kategori;
    private String barcode;
    private String nama_produk;
    private int jumlah_stok;
    private Double harga_beli;
    private Double harga_jual;
    private String status; 
}
