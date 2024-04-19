/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelProduk;

/**
 *
 * @author JUL
 */
public class TabelModelProduk extends AbstractTableModel {
    
    private List<ModelProduk> list = new ArrayList<>();
    
    public void tambahData (ModelProduk mod_produk){
        list.add( mod_produk);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelProduk mod_produk){
        list.add( row,mod_produk);
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
    public void setData(List<ModelProduk>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelProduk mod_produk){
        list.set(index, mod_produk);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelProduk getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] namaKolom = {"No","Kode Barang","Kode Distributor","Kode Kategori","Kode Barcode","Nama Helm","Stok","Harga Beli","Harga Jual","Status"};

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
 if (columnIndex == 0){
            return"   " + (rowIndex + 1);
        }else{
        switch (columnIndex -1){
        case 0:return list.get(rowIndex).getId_data_produk();
        case 1:return list.get(rowIndex).getMod_id_distributor().getId_distributor();
        case 2:return list.get(rowIndex).getMod_idkategori().getIdkategori();
        case 3:return list.get(rowIndex).getBarcode();
        case 4:return list.get(rowIndex).getNama_produk();
        case 5:return list.get(rowIndex).getJumlah_stok();
        case 6:return list.get(rowIndex).getHarga_beli();
        case 7:return list.get(rowIndex).getHarga_jual();
        case 8:return list.get(rowIndex).getStatus();
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
