/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelDetailTransaksi;

/**
 *
 * @author JUL
 */
public class TabelModelDetailTransaksi extends AbstractTableModel {
    
    private List<ModelDetailTransaksi> list = new ArrayList<>();
    
    public void tambahData (ModelDetailTransaksi mod_dettransaksi){
        list.add( mod_dettransaksi);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }
    
    public void perbaruiData (int row, ModelDetailTransaksi mod_dettransaksi){
        list.add( row,mod_dettransaksi);
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
    public void setData(List<ModelDetailTransaksi>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
        
    }
    public void setData(int index, ModelDetailTransaksi mod_dettransaksi){
        list.set(index, mod_dettransaksi);
        fireTableRowsUpdated(index, index);
        
    }
    public ModelDetailTransaksi getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] namaKolom = {"No","Kode Detail Transaksi","Kode Transaksi","Nama Produk","Jumlah","Subtotal Harga"};

    
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
        case 0:return list.get(rowIndex).getIddetail_tranaksi();
        case 1:return list.get(rowIndex).getMod_id_transaksi().getId_transaksi();
        case 2:return list.get(rowIndex).getMod_id_data_produk().getNama_produk();
        case 3:return list.get(rowIndex).getJumlah_barang();
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
