/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.DAO;

import Form.Login;
import Main.MenuUtama;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vape.config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vape.model.ModelPengguna;
import vape.service.ServicePengguna;

public class DAO_Pengguna implements ServicePengguna {
    
    private Connection conn;
    public DAO_Pengguna(){
        conn= Koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelPengguna mod_pengguna) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO pengguna (id_pengguna, nama_pengguna, level, no_telepon, email, password) VALUES (?,?,?,?,?,?);";
            
            st = conn.prepareStatement (sql);
            st.setString (1, mod_pengguna.getId_pengguna());
            st.setString (2, mod_pengguna.getNama_pengguna());
            st.setString (3, mod_pengguna.getLevel());
            st.setString (4, mod_pengguna.getNo_telepon());
            st.setString (5, mod_pengguna.getEmail());
            st.setString (6, generateMD5(mod_pengguna.getPassword()));
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    

    @Override
    public void perbaruiData(ModelPengguna mod_pengguna) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE pengguna SET nama_pengguna = ?, level = ?, no_telepon = ?, email = ?, WHERE id_pengguna = ?;";
            
            st = conn.prepareStatement (sql);
            st.setString (1, mod_pengguna.getId_pengguna());
            st.setString (2, mod_pengguna.getNama_pengguna());
            st.setString (3, mod_pengguna.getLevel());
            st.setString (4, mod_pengguna.getNo_telepon());
            st.setString (5, mod_pengguna.getEmail());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(ModelPengguna mod_pengguna) {
        PreparedStatement st = null;
        try {
            String sql = "DELETE FROM pengguna WHERE id_pengguna=?;";
            
            st = conn.prepareStatement (sql);
            st.setString (1, mod_pengguna.getId_pengguna());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void register(ModelPengguna mod_pengguna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ModelPengguna getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelPengguna> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT * FROM pengguna;";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                ModelPengguna model = new ModelPengguna ();
                model.setId_pengguna    (rs.getString("id_pengguna"));
                model.setNama_pengguna  (rs.getString("nama_pengguna"));
                model.setLevel          (rs.getString("level"));
                model.setNo_telepon     (rs.getString("no_telepon"));
                model.setEmail          (rs.getString("email"));
                
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }

    @Override
    public List<ModelPengguna> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT * FROM pengguna WHERE id_pengguna LIKE'%;"+id+"%' "
                + "OR nama_pengguna LIKE '%"+id+"%' "
                + "OR level LIKE '%"+id+"%' "
                + "OR no_telepon LIKE '%"+id+"%' "
                + "OR email LIKE '%"+id+"%' ";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                ModelPengguna model = new ModelPengguna ();
                model.setId_pengguna    (rs.getString("id_pengguna"));
                model.setNama_pengguna  (rs.getString("nama_pengguna"));
                model.setLevel          (rs.getString("level"));
                model.setNo_telepon     (rs.getString("no_telepon"));
                model.setEmail          (rs.getString("email"));
                
                list.add(model);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }

    public String generateMD5(String password) {
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder (2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b&0xff));
            }
            digest = sb.toString();
        } catch(UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return digest;
    }
    
    @Override
    public ModelPengguna prosesLogin(ModelPengguna model) {
        PreparedStatement st = null;
        ResultSet rs = null;
        ModelPengguna modelPengguna = null;
        String sql = "SELECT * FROM pengguna WHERE nama_pengguna=? AND password=?";
        System.out.println(sql);
        
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNama_pengguna());
            st.setString(2, generateMD5(model.getPassword()));
//          st.setString(2, generateSHA256(model.getPassword()));
            rs = st.executeQuery();
            
            if(rs.next()) {
                modelPengguna = new ModelPengguna();
                modelPengguna.setId_pengguna(rs.getString("id_pengguna"));
                modelPengguna.setNama_pengguna(rs.getString("nama_pengguna"));
                modelPengguna.setLevel(rs.getString("level"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(st!=null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return modelPengguna;
    }

    @Override
    public boolean register(String username, String password, String hewan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validateoldPassword(String username, String hewan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean changePassword(String username, String newPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean lupaPassword(String username, String namahewan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

