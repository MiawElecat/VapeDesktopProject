package vape.tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vape.model.ModelProduk;

public class TabelModelProduk extends AbstractTableModel {
    
    private List<ModelProduk> list = new ArrayList<>();
    
    private final String[] columnNames = {"id_data_produk", "nama_produk", "jumlah_stok", "harga_beli", "harga_jual", "status", "distributor_id_distributor"};

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
