/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelPengguna;

/**
 *
 * @author JUL
 */
public class TabelModelPengguna extends AbstractTableModel {
    
    private List<ModelPengguna> list = new ArrayList<>();
    
    public void tambahData (ModelPengguna mod_pengguna){
        list.add( mod_pengguna);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelPengguna mod_pengguna){
        list.add( row,mod_pengguna);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil diperbarui");
    }
    public void hapusData (int index){
        list.remove( index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
    }
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    public void setData(List<ModelPengguna>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelPengguna mod_pengguna){
        list.set(index, mod_pengguna);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelPengguna getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","ID Pengguna","Nama Pengguna","Level","Nomor Telepon","Email","Password"};

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0){
            return"   " + (rowIndex + 1);
        }else{
        switch (columnIndex-1){
        case 0:return list.get(rowIndex).getId_pengguna();
        case 1:return list.get(rowIndex).getNama_pengguna();
        case 2:return list.get(rowIndex).getLevel();
        case 3:return list.get(rowIndex).getNo_telepon();
        case 4:return list.get(rowIndex).getEmail();
        case 5:return list.get(rowIndex).getPassword();
        
        default: return null;
            }
        }
    }
    public String getColumnName(int column){
        if (column == 0){
            return "   " + namaKolom[column];
        }else{
            return namaKolom[column];
        }
    }
    
}
