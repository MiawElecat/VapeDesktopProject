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
import vape.config.Koneksi;
import vape.model.ModelDetailTransaksi;
import vape.model.ModelProduk;
import vape.model.ModelTransaksi;
import vape.service.ServiceDetailTransaksi;

/**
 *
 * @author Lenovo
 */
public class DAO_DetailTransaksi implements ServiceDetailTransaksi {
    
    private Connection connection;
    
    public DAO_DetailTransaksi(){
        connection = Koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelDetailTransaksi mod_det_transaksi) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_transaksi (id_transaksi, id_data_produk, jumlah_barang, subtotal_harga) SELECT '"+mod_det_transaksi.getMod_id_transaksi().getId_transaksi()+"', data_produk_iddata_produk, jumlah_barang_transaksi, subtotalharga_transaksi FROM transaksi_sementara";
        try{
            st = connection.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }    
    }

    @Override
    public void sumTotal(ModelDetailTransaksi mod_det_transaksi) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT SUM(subtotal_harga) FROM transaksi_sementara";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                mod_det_transaksi.setSubtotal_harga(rs.getDouble(1));
            }
        }catch (SQLException ex) {
            Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            }  
    }

    @Override
    public void hapusSementara(ModelDetailTransaksi mod_det_transaksi) {
        PreparedStatement st = null;
        String sql ="DELETE FROM transaksi_sementara";
        try{
            st = connection.prepareStatement(sql);
            st.executeUpdate();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void updateStok(ModelDetailTransaksi mod_det_transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ModelDetailTransaksi getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelDetailTransaksi> getData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT dt.id_transaksi, dt.id_data_produk, "
                + "pd.nama_produk, pd.harga_jual, "
                + "dt.jumlah_barang,dt.subtotal_harga "
                + "FROM detail_transaksi dt "
                + "INNER JOIN transaksi ts ON ts.id_transaksi=dt.id_transaksi "
                + "INNER JOIN data_produk pd ON pd.id_data_produk=dt.id_data_produk "
                + "WHERE dt.id_transaksi='"+id+"' ORDER BY id_transaksi ASC";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProduk pd = new ModelProduk();
                ModelTransaksi ts = new ModelTransaksi();
                ModelDetailTransaksi dt = new ModelDetailTransaksi();
                
                ts.setId_transaksi(String.valueOf(rs.getString("dt.id_transaksi")));
                dt.setMod_id_transaksi(ts);
                
                pd.setId_data_produk(rs.getString("id_data_produk"));
                pd.setNama_produk(rs.getString("nama_produk"));
                pd.setHarga_jual(rs.getDouble("harga_jual"));
                dt.setJumlah_barang(rs.getInt("jumlah_barang"));
                dt.setSubtotal_harga(rs.getDouble("subtotal_harga"));
                
                
                dt.setMod_id_data_produk(pd);
                
                list.add(dt);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DetailTransaksi.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelDetailTransaksi> search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validasistok(ModelDetailTransaksi mod_det_transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
