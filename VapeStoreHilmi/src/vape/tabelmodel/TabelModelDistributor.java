/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelDistributor;

/**
 *
 * @author JUL
 */
public class TabelModelDistributor extends AbstractTableModel{
    
    private List<ModelDistributor> list = new ArrayList<>();
    
    public void tambahData (ModelDistributor mod_distributor){
        list.add( mod_distributor);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelDistributor mod_distributor){
        list.add( row,mod_distributor);
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
    public void setData(List<ModelDistributor>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelDistributor mod_distributor){
        list.set(index, mod_distributor);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelDistributor getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();    
    }
    
    private final String[] namaKolom = {"No","Kode Disributor","Nama Distributor","Alamat","No Telepon"};

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         if (columnIndex== 0){
            return"" + (rowIndex + 1);
        }else{
        switch (columnIndex -1){
        
        case 0:return list.get(rowIndex).getId_distributor();
        case 1:return list.get(rowIndex).getNama_distributor();
        case 2:return list.get(rowIndex).getAlamat_distributor();
        case 3:return list.get(rowIndex).getNo_tlp_distributor();
        
        default: return null;
        }
    }
    }
    public String getColumnName(int column){
         if (column == 0){
            return "" + namaKolom[column];
        }else{
            return namaKolom[column];
        }
    }    
}
