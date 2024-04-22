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
import vape.service.ServiceDistributor;

/**
 *
 * @author JUL
 */
public class DAO_Distributor implements ServiceDistributor {
    
    private Connection connection;
    
    public DAO_Distributor(){
        connection = Koneksi.getConnection();
    }

    @Override
    public void tambahData(ModelDistributor mod_distributor) {
        PreparedStatement st = null;
        String sql = "INSERT INTO  distributor (id_distributor, nama_distributor, alamat_distributor, no_tlp_distributor) VALUES (?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_distributor.getId_distributor());
            st.setString(2, mod_distributor.getNama_distributor());
            st.setString(3, mod_distributor.getAlamat_distributor());
            st.setString(4, mod_distributor.getNo_tlp_distributor());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
    }    }

    @Override
    public void perbaruiData(ModelDistributor mod_distributor) {
        PreparedStatement st = null;
        String sql = "UPDATE distributor SET nama_distributor=?, alamat_distributor=?, no_tlp_distributor=? WHERE id_distributor='"+mod_distributor.getId_distributor()+"'";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_distributor.getNama_distributor());
            st.setString(2, mod_distributor.getAlamat_distributor());
            st.setString(3, mod_distributor.getNo_tlp_distributor());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }    }

    @Override
    public void hapusData(ModelDistributor mod_distributor) {
        PreparedStatement st = null;
        String sql ="DELETE FROM distributor WHERE id_distributor=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_distributor.getId_distributor());
            
            st.executeUpdate();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public ModelDistributor getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelDistributor> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM distributor";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelDistributor mod_distributor = new ModelDistributor();
                
                mod_distributor.setId_distributor(rs.getString("id_distributor"));
                mod_distributor.setNama_distributor(rs.getString("nama_distributor"));
                mod_distributor.setAlamat_distributor(rs.getString("alamat_distributor"));
                mod_distributor.setNo_tlp_distributor(rs.getString("no_tlp_distributor"));
                
                
                list.add(mod_distributor);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public List<ModelDistributor> search(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM distributor WHERE id_distributor LIKE '%"+id+"%' OR nama_distributor LIKE '%"+id+"%' OR alamat_distributor LIKE '%"+id+"%' OR no_tlp_distributor LIKE '%"+id+"%'";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelDistributor mod_distributor = new ModelDistributor();
                
                mod_distributor.setId_distributor(rs.getString("id_distributor"));
                mod_distributor.setNama_distributor(rs.getString("nama_distributor"));
                mod_distributor.setAlamat_distributor(rs.getString("alamat_distributor"));
                mod_distributor.setNo_tlp_distributor(rs.getString("no_tlp_distributor"));

                
                
                list.add(mod_distributor);
            }
            return list;
        }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if (st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
            }
        }  
    }
    }

    @Override
    public String nomor() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat noformat = new SimpleDateFormat("MMyy");
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT(id_distributor, 3) AS Nomor " +
                     "FROM distributor "+
                     "WHERE id_distributor LIKE 'D" + no + "%' "+
                     "ORDER BY id_distributor DESC"+
                     " LIMIT 1";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "D"+no+String.format("%03d", nomor);
            }else{
                urutan = "D"+no+"001";
            }
        }catch(SQLException ex) {
            java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_Distributor.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        return urutan;
    }
    
}
