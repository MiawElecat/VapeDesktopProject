/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vape.config.Koneksi;
import vape.model.ModelPengguna;
import vape.model.ModelTransaksi;
import vape.service.ServiceTransaksi;

/**
 *
 * @author Lenovo
 */
public class DAO_TransaksiPenjualan implements ServiceTransaksi{
    
    private Connection connection;
    
    public DAO_TransaksiPenjualan(){
        connection = Koneksi.getConnection();
    }
    @Override
    public void tambahData(ModelTransaksi mod_transaksi) {
        PreparedStatement st = null;
        String sql = "INSERT INTO transaksi (id_transaksi, id_pengguna, tanggal_transaksi, total_harga, bayar, kembali) VALUES (?,?,?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_transaksi.getId_transaksi());
            st.setString(2, mod_transaksi.getMod_id_pengguna().getNama_pengguna());
            st.setString(3, mod_transaksi.getTanggal_transaksi());
            st.setDouble(4, mod_transaksi.getTotal_harga());
            st.setDouble(5, mod_transaksi.getBayar());
            st.setDouble(6, mod_transaksi.getKembali());

            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
    }    }

    @Override
    public ModelTransaksi getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelTransaksi> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT ts.id_transaksi,ts.id_pengguna,ts.tanggal_transaksi,ts.total_harga,ts.bayar,ts.kembali FROM transaksi ts INNER JOIN pengguna pgn ON pgn.id_pengguna=ts.id_pengguna";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelTransaksi mod_transaksi = new ModelTransaksi();
                ModelPengguna mod_pengguna = new ModelPengguna();
                
                mod_transaksi.setId_transaksi(rs.getString("id_transaksi"));
                mod_pengguna.setId_pengguna(rs.getString("id_pengguna"));
                mod_transaksi.setTanggal_transaksi(rs.getString("tanggal_transaksi"));
                mod_transaksi.setTotal_harga(rs.getDouble("total_harga"));
                mod_transaksi.setBayar(rs.getDouble("bayar"));
                mod_transaksi.setKembali(rs.getDouble("kembali"));
//                mod_data_produk.setStatus(rs.getString("status"));
                
                mod_transaksi.setMod_id_pengguna(mod_pengguna);
                
                list.add(mod_transaksi);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelTransaksi> search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT(id_transaksi, 3) AS Nomor " +
                     "FROM transaksi "+
                     "WHERE id_transaksi LIKE 'TS" + no + "%' "+
                     "ORDER BY id_transaksi DESC"+
                     " LIMIT 1";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "TS"+no+String.format("%03d", nomor);
            }else{
                urutan = "TS"+no+"001";
            }
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_TransaksiPenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;    }
    
}
