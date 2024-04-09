/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelReStok;

/**
 *
 * @author JUL
 */
public interface ServiceRestok {
    void tambahData     (ModelReStok mod_restok);
    void perbaruiStatus (String mod_restok);
 
    ModelReStok getByid (String id);
    
    List<ModelReStok> getData();
    List<ModelReStok> search(String id);
    String nomor();
}
