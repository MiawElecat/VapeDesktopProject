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
import vape.model.ModelKategori;
import vape.service.ServiceKategori;

/**
 *
 * @author JUL
 */
public class DAO_Kategori implements ServiceKategori{
    
    private Connection connection;
    
    public DAO_Kategori(){
        connection = Koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelKategori mod_kategori) {
        PreparedStatement st = null;
        String sql = "INSERT INTO kategori (idkategori, nama_kategori, deskripsi) VALUES (?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_kategori.getIdkategori());
            st.setString(2, mod_kategori.getNama_kategori());
            st.setString(3, mod_kategori.getDeskripsi());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Menambahkan Data Gagal");
            Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
    }    
    }

    @Override
    public void perbaruiData(ModelKategori mod_kategori) {
        PreparedStatement st = null;
        String sql = "UPDATE kategori SET nama_kategori=?, deskripsi=? WHERE idkategori='"+mod_kategori.getIdkategori()+"'";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_kategori.getNama_kategori());
            st.setString(2, mod_kategori.getDeskripsi());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }    
    }

    @Override
    public ModelKategori getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelKategori> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM kategori";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelKategori mod_kategori = new ModelKategori();
                
                mod_kategori.setIdkategori(rs.getString("idkategori"));
                mod_kategori.setNama_kategori(rs.getString("nama_kategori"));
                mod_kategori.setDeskripsi(rs.getString("deskripsi"));
                
                
                list.add(mod_kategori);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelKategori> search(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM kategori WHERE idkategori LIKE '%"+id+"%' OR nama_kategori LIKE '%"+id+"%' OR deskripsi LIKE '%"+id+"%'";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelKategori mod_kategori = new ModelKategori();
                
                mod_kategori.setIdkategori(rs.getString("idkategori"));
                mod_kategori.setNama_kategori(rs.getString("nama_kategori"));
                mod_kategori.setDeskripsi(rs.getString("deskripsi"));

                
                
                list.add(mod_kategori);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Kategori.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelKategori> getKategori() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT idkategori,nama_kategori FROM kategori";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelKategori mod_kategori = new ModelKategori();
                
                mod_kategori.setIdkategori(rs.getString("idkategori"));
                mod_kategori.setNama_kategori(rs.getString("nama_kategori"));
                
                list.add(mod_kategori);
            }
            return list;
        }catch (SQLException e) {
            e.printStackTrace();
    }
        return list;
    }

    @Override
    public String getKategoriID(String id) {
        String namaKategori = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT nama_kategori FROM kategori WHERE idkategori=?";
        try{
            st = connection.prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()){
                namaKategori = rs.getString("nama_kategori");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return namaKategori;
    }
}
    
