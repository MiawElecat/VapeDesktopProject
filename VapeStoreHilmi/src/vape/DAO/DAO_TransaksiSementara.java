/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vape.config.Koneksi;
import vape.model.ModelDetailTransaksi;
import vape.model.ModelProduk;
import vape.model.ModelTransaksiSementara;
import vape.service.ServiceTransaksiSementara;

/**
 *
 * @author Lenovo
 */
public class DAO_TransaksiSementara implements ServiceTransaksiSementara{
    
    private Connection connection;
    
    public DAO_TransaksiSementara(){
        connection = Koneksi.getConnection();
    }

    @Override
    public void tambahDataSementara(ModelTransaksiSementara mod_transaksi_sem) {
        PreparedStatement st = null;
        String sql = "INSERT INTO transaksi_sementara (id_data_produk, barcode, nama_produk, harga_jual, stok, jumlah_barang, subtotal_harga) VALUES (?,?,?,?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_transaksi_sem.getMod_dataproduk().getId_data_produk());
            st.setString(2, mod_transaksi_sem.getMod_dataproduk().getBarcode());
            st.setString(3, mod_transaksi_sem.getMod_dataproduk().getNama_produk());
            st.setDouble(4, mod_transaksi_sem.getMod_dataproduk().getHarga_jual());
            st.setInt   (5, mod_transaksi_sem.getMod_dataproduk().getJumlah_stok());
            st.setInt   (6, mod_transaksi_sem.getMod_dettransaksi().getJumlah_barang());
            st.setDouble(7, mod_transaksi_sem.getMod_dettransaksi().getSubtotal_harga());

            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
    }
    }

    @Override
    public void perbaruiDataSementara(ModelTransaksiSementara mod_transaksi_sem) {
        PreparedStatement st = null;
        String sql = "UPDATE transaksi_sementara SET nama_produk=?, harga_jual_helm=?, jumlah_barang_transaksi=?, subtotalharga_transaksi=? WHERE iddata_produk='"+mod_transaksi_sem.getMod_dataproduk().getId_data_produk()+"'";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_transaksi_sem.getMod_dataproduk().getNama_produk());
            st.setDouble(2, mod_transaksi_sem.getMod_dataproduk().getHarga_jual());
            st.setInt   (3, mod_transaksi_sem.getMod_dettransaksi().getJumlah_barang());
            st.setDouble(4, mod_transaksi_sem.getMod_dettransaksi().getSubtotal_harga());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusDataSementara(ModelTransaksiSementara mod_transaksi_sem) {
        PreparedStatement st = null;
        String query = "DElETE FROM transaksi_sementara WHERE id_data_produk='"+mod_transaksi_sem.getMod_dataproduk().getId_data_produk()+"'";
        
        try{
            st = connection.prepareStatement(query);
            
            st.executeUpdate();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public boolean validasiTambah(ModelTransaksiSementara mod_transaksi_sem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ModelTransaksiSementara getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelTransaksiSementara> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM transaksi_sementara";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelTransaksiSementara mod_transaksi_sem = new ModelTransaksiSementara();
                ModelProduk mod_data_produk = new ModelProduk();
                ModelDetailTransaksi mod_det_transaksi = new ModelDetailTransaksi();
                
                mod_data_produk.setBarcode(rs.getString("barcode"));
                mod_data_produk.setId_data_produk(rs.getString("id_data_produk"));
                mod_data_produk.setNama_produk(rs.getString("nama_produk"));
                mod_data_produk.setHarga_jual(rs.getDouble("harga_jual"));
                mod_data_produk.setJumlah_stok(rs.getInt("stok"));
                mod_det_transaksi.setJumlah_barang(rs.getInt("jumlah_barang"));
                mod_det_transaksi.setSubtotal_harga(rs.getDouble("subtotal_harga"));
                
                mod_transaksi_sem.setMod_dataproduk(mod_data_produk);
                mod_transaksi_sem.setMod_dettransaksi(mod_det_transaksi);
                
                list.add(mod_transaksi_sem);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_TransaksiSementara.class.getName()).log(Level.SEVERE,null,ex);
                }
            }  
        }
    }
    
}
