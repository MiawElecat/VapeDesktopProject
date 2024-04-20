/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;
import java.util.List;
import vape.model.ModelRestok;

/**
 *
 * @author JUL
 */
public interface ServiceRestok {
    void tambahData     (ModelRestok mod_restok);
    void perbaruiStatus (String mod_restok);
 
    ModelRestok getByid (String id);
    
    List<ModelRestok> getData();
    List<ModelRestok> search(String id);
    String nomor();
}
