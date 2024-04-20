/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelRestok;

/**
 *
 * @author JUL
 */
public class TabelModelRestok extends AbstractTableModel {
    
    private List<ModelRestok> list = new ArrayList<>();
    
     public void tambahData (ModelRestok mod_restok){
        list.add( mod_restok);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Transaksi berhasil ditambahkan");
    }
    public void perbaruiData (int row, ModelRestok mod_restok){
        list.add( row,mod_restok);
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
    public void setData(List<ModelRestok>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelRestok mod_restok){
        list.set(index, mod_restok);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelRestok getData(int index){
        return list.get(index);
    }
    

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","Kode Restok","ID Pengguna","Tanggal","Total Harga"};

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
        case 0:return list.get(rowIndex).getId_restok();
        case 1:return list.get(rowIndex).getMod_id_pengguna().getNama_pengguna();
        case 2:return list.get(rowIndex).getTanggal_restok();
        case 3:return list.get(rowIndex).getTotal_harga();
        
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
