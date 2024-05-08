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
import javax.swing.JOptionPane;
import vape.config.Koneksi;
import vape.model.ModelDistributor;
import vape.model.ModelKategori;
import vape.model.ModelProduk;
import vape.service.ServiceProduk;

/**
 *
 * @author JUL
 */
public class DAO_DataProduk implements ServiceProduk{
    
    private Connection connection;
    
    public DAO_DataProduk(){
        connection = Koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelProduk mod_produk) {
        PreparedStatement st = null;
        String sql = "INSERT INTO data_produk "
                + "(id_data_produk, id_distributor, idkategori, barcode, nama_produk, jumlah_stok, harga_beli, harga_jual, status) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_produk.getId_data_produk());
            st.setString(2, mod_produk.getMod_distributor().getId_distributor());
            st.setString(3, mod_produk.getMod_kategori().getIdkategori());
            st.setString(4, mod_produk.getBarcode());
            st.setString(5, mod_produk.getNama_produk());
            st.setInt   (6, mod_produk.getJumlah_stok());
            st.setDouble(7, mod_produk.getHarga_beli());
            st.setDouble(8, mod_produk.getHarga_jual());
            st.setString(9, mod_produk.getStatus());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
    }
    }

    @Override
    public void perbaruiData(ModelProduk mod_produk) {
        PreparedStatement st = null; 
        String sql = "UPDATE data_produk SET id_distributor=?, idkategori=?, barcode=?, nama_produk=?, jumlah_stok=?, harga_beli=?, harga_jual=? "
                + "WHERE id_data_produk='"+mod_produk.getId_data_produk()+"'";
        System.out.println(sql);
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_produk.getMod_distributor().getId_distributor());
            st.setString(2, mod_produk.getMod_kategori().getIdkategori());
            st.setString(3, mod_produk.getBarcode());
            st.setString(4, mod_produk.getNama_produk());
            st.setInt   (5, mod_produk.getJumlah_stok());
            st.setDouble(6, mod_produk.getHarga_beli());
            st.setDouble(7, mod_produk.getHarga_jual());
            
            st.executeUpdate();
            System.out.println(st);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }    
    }

    @Override
    public void hapusData(ModelProduk mod_produk) {
        PreparedStatement st = null;
        String sql ="DELETE FROM data_produk WHERE id_data_produk=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_produk.getId_data_produk());
            
            st.executeUpdate();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<ModelProduk> getDataByID() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelProduk> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT pd.id_data_produk, pd.id_distributor, pd.idkategori, pd.barcode, pd.nama_produk, pd.jumlah_stok, pd.harga_beli, pd.harga_jual, pd.status FROM data_produk pd "
                + "INNER JOIN distributor ds ON ds.id_distributor=pd.id_distributor "
                + "INNER JOIN kategori ktg ON ktg.idkategori=pd.idkategori";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProduk mod_produk = new ModelProduk();
                ModelDistributor mod_distributor = new ModelDistributor();
                ModelKategori mod_kategori = new ModelKategori();
                
                mod_produk.setId_data_produk(rs.getString("id_data_produk"));
                mod_distributor.setId_distributor(rs.getString("id_distributor"));
                mod_kategori.setIdkategori(rs.getString("idkategori"));
                mod_produk.setBarcode(rs.getString("barcode"));
                mod_produk.setNama_produk(rs.getString("nama_produk"));
                mod_produk.setJumlah_stok(rs.getInt("jumlah_stok"));
                mod_produk.setHarga_beli(rs.getDouble("harga_beli"));
                mod_produk.setHarga_jual(rs.getDouble("harga_jual"));
                mod_produk.setStatus(rs.getString("status"));
                
                mod_produk.setMod_distributor(mod_distributor);
                mod_produk.setMod_kategori(mod_kategori);
                
                list.add(mod_produk);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelProduk> getDataID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelProduk> search(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM data_produk WHERE id_data_produk LIKE '%"+id+"%' OR id_distributor LIKE '%"+id+"%' OR idkategori LIKE '%"+id+"%' OR nama_produk LIKE '%"+id+"%' OR jumlah_stok LIKE '%"+id+"%' OR harga_beli LIKE '%"+id+"%' OR harga_jual LIKE '%"+id+"%' OR status LIKE '%"+id+"%'";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProduk mod_produk = new ModelProduk();
                ModelDistributor mod_distributor = new ModelDistributor();
                ModelKategori mod_kategori = new ModelKategori();
                
                mod_produk.setId_data_produk(rs.getString("id_data_produk"));
                mod_distributor.setId_distributor(rs.getString("id_distributor"));
                mod_kategori.setIdkategori(rs.getString("idkategori"));
                mod_produk.setBarcode(rs.getString("barcode"));
                mod_produk.setNama_produk(rs.getString("nama_produk"));
                mod_produk.setJumlah_stok(rs.getInt("jumlah_stok"));
                mod_produk.setHarga_beli(rs.getDouble("harga_beli"));
                mod_produk.setHarga_jual(rs.getDouble("harga_jual"));
                mod_produk.setStatus(rs.getString("status"));
                
                mod_produk.setMod_distributor(mod_distributor);
                mod_produk.setMod_kategori(mod_kategori);
                
                list.add(mod_produk);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelProduk> search2(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat noformat = new SimpleDateFormat("MMyy");
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT(id_data_produk, 3) AS Nomor FROM data_produk WHERE id_data_produk LIKE '"+id+"-" + no + "%' ORDER BY id_data_produk DESC";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = id + "-" +no+ "-" +String.format("%03d", nomor);
            }else{
                urutan = id+"-"+no+"-001";
            }
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_DataProduk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }

    @Override
    public String nomor2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelProduk> SearchDataByBArcode(String id) {
        PreparedStatement st = null;
        List<ModelProduk> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT * FROM data_produk WHERE barcode = ?";
        try{
            st = connection.prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if(rs.next()){
                ModelProduk mod_produk = new ModelProduk();
                
                mod_produk.setBarcode(rs.getString("barcode"));
                mod_produk.setId_data_produk(rs.getString("id_data_produk"));
                mod_produk.setNama_produk(rs.getString("nama_produk"));
                mod_produk.setJumlah_stok(rs.getInt("jumlah_stok"));
                mod_produk.setHarga_beli(rs.getDouble("harga_beli"));
                mod_produk.setHarga_jual(rs.getDouble("harga_jual"));
                mod_produk.setStatus(rs.getString("status"));
                
                
                list.add(mod_produk);
            }
            rs.close();
            st.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
