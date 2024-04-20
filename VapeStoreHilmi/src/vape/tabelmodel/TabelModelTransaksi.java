/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelTransaksi;

/**
 *
 * @author JUL
 */
public class TabelModelTransaksi extends AbstractTableModel {
    
    private List<ModelTransaksi> list = new ArrayList<>();
    
     public void tambahData (ModelTransaksi mod_transaksi){
        list.add( mod_transaksi);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Transaksi berhasil ditambahkan");
    }
    public void perbaruiData (int row, ModelTransaksi mod_transaksi){
        list.add( row,mod_transaksi);
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
    public void setData(List<ModelTransaksi>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelTransaksi mod_transaksi){
        list.set(index, mod_transaksi);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelTransaksi getData(int index){
        return list.get(index);
    }
    

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","Kode Transaksi","ID Pengguna","Tanggal","Total Harga"};

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
        case 0:return list.get(rowIndex).getId_transaksi();
        case 1:return list.get(rowIndex).getMod_id_pengguna().getNama_pengguna();
        case 2:return list.get(rowIndex).getTanggal_transaksi();
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
