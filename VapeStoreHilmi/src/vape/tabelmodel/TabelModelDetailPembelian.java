/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelDetailPembelian;

/**
 *
 * @author JUL
 */
public class TabelModelDetailPembelian extends AbstractTableModel {
    
    private List<ModelDetailPembelian> list = new ArrayList<>();
    
    public void tambahData (ModelDetailPembelian mod_detpembelian){
        list.add( mod_detpembelian);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelDetailPembelian mod_detpembelian){
        list.add( row,mod_detpembelian);
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
    public void setData(List<ModelDetailPembelian>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelDetailPembelian mod_detpembelian){
        list.set(index, mod_detpembelian);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelDetailPembelian getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","Kode Detail Pembelian","Kode Pembelian","Nama Produk","Jumlah","Subtotal Harga"};

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
        case 0:return list.get(rowIndex).getIddetail_pembelian();
        case 1:return list.get(rowIndex).getMod_id_pembelian().getId_pembelian();
        case 2:return list.get(rowIndex).getMod_id_data_produk().getNama_produk();
        case 3:return list.get(rowIndex).getJumlah_pembelian();
        case 4:return list.get(rowIndex).getSubtotal_harga();
        
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
