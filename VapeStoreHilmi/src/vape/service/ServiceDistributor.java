/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelDistributor;
/**
 *
 * @author JUL
 */
public interface ServiceDistributor {
    void tambahData     (ModelDistributor mod_distributor);
    void perbaruiData   (ModelDistributor mod_distributor);
    void hapusData      (ModelDistributor mod_distributor);
    
    ModelDistributor getByid (String id);
    
    List<ModelDistributor>getData();
    List<ModelDistributor>search(String id);
    
    String nomor();  
    List<ModelDistributor> getDistributor();
    String getDistributorID(String id);
}
