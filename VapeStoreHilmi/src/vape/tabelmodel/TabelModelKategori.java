/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelKategori;

/**
 *
 * @author JUL
 */
public class TabelModelKategori extends AbstractTableModel {
    
    private List<ModelKategori> list = new ArrayList();
    
    public void tambahData (ModelKategori mod_kategori){
        list.add( mod_kategori);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelKategori mod_kategori){
        list.add( row,mod_kategori);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil diperbarui");
    }
    
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    public void setData(List<ModelKategori>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelKategori mod_kategori){
        list.set(index, mod_kategori);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelKategori getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();    
    }
    
    private final String[] namaKolom = {"No","Kode Kategori","Nama Kategori","Deskripsi"};

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
        
        case 0:return list.get(rowIndex).getIdkategori();
        case 1:return list.get(rowIndex).getNama_kategori();
        case 2:return list.get(rowIndex).getDeskripsi();
        
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
