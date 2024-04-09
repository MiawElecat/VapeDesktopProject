/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.service;

import java.util.List;
import vape.model.ModelDetailRestok;

/**
 *
 * @author JUL
 */
public interface ServiceDetailRestok {
    void tambahData (ModelDetailRestok mod_det_restok);
    void jumTotal (ModelDetailRestok mod_det_restok);
    void hapusSementara (ModelDetailRestok mod_det_restok);
    void updateStatus (ModelDetailRestok mod_det_restok);
    boolean validasiStatus(ModelDetailRestok mod_det_restok);
    
    ModelDetailRestok getByid (String id);
    
    List<ModelDetailRestok>getData(String id);
}
