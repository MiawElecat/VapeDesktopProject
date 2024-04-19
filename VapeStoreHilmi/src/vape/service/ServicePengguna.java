/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelPengguna;
/**
 *
 * @author JUL
 */
public interface ServicePengguna {
    
    void prosesLogin    (ModelPengguna mod_login);
    
    void tambahData     (ModelPengguna mod_pengguna );
    void perbaruiData   (ModelPengguna mod_pengguna);
    void hapusData      (ModelPengguna mod_pengguna);
    void register       (ModelPengguna mod_pengguna);

    
    ModelPengguna getByid (String id);
    
    List<ModelPengguna>getData();
    List<ModelPengguna>search(String id);
    
    String nomor();

   
    boolean register (String username, String password, String hewan);
    boolean validateoldPassword (String username, String hewan);
    boolean changePassword(String username, String newPassword);
    boolean lupaPassword(String username, String namahewan);
}
