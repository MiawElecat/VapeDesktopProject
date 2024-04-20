/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelRestokSementara;


/**
 *
 * @author JUL
 */
public class TabelModelRestokSementara extends AbstractTableModel {
    
    private List<ModelRestokSementara> list = new ArrayList<>();
    
    public void tambahData (ModelRestokSementara mod_restoksem){
        list.add( mod_restoksem);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelRestokSementara mod_restoksem){
        list.add( row,mod_restoksem);
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
    public void setData(List<ModelRestokSementara>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelRestokSementara mod_restoksem){
        list.set(index, mod_restoksem);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelRestokSementara getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","Kode Produk","Nama Produk","Harga","Jumlah","Subtotal Harga"};


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
        case 0:return list.get(rowIndex).getMod_produk().getId_data_produk();
        case 1:return list.get(rowIndex).getMod_produk().getNama_produk();
        case 2:return list.get(rowIndex).getMod_produk().getHarga_jual();
        case 3:return list.get(rowIndex).getMod_detrestok().getJumlah_restok();
        case 4:return list.get(rowIndex).getMod_detrestok().getSubtotal_harga();
        
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
