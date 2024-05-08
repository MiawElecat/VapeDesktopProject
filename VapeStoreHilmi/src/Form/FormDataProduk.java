package Form;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import vape.DAO.DAO_DataProduk;
import vape.DAO.DAO_Distributor;
import vape.DAO.DAO_Kategori;
import vape.model.ModelDistributor;
import vape.model.ModelKategori;
import vape.model.ModelProduk;
import vape.service.ServiceDistributor;
import vape.service.ServiceKategori;
import vape.service.ServiceProduk;
import vape.tabelmodel.TabelModelProduk;

public class FormDataProduk extends javax.swing.JPanel {
    
    private final ServiceProduk service = new DAO_DataProduk();
    private final TabelModelProduk tabel = new TabelModelProduk();
    private ServiceKategori ktg = new DAO_Kategori();
    private ServiceDistributor dst = new DAO_Distributor();
    private String idkategori;
    private String id_distributor;
    private final Map<String, String> kategoriMap;
    private final Map<String, String> distributorMap;
    private ModelProduk produk;
    List<ActionListener> savedListeners = new ArrayList<>();


    public FormDataProduk() {
        initComponents();
        kategoriMap = new HashMap<>();
        distributorMap = new HashMap<>();
        tabelproduk.setModel(tabel);
        loadData();
        btnBatal.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pnTabelProduk = new javax.swing.JScrollPane();
        pnUtama = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnTambah = new javax.swing.JButton();
        txtPencarian = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelproduk = new javax.swing.JTable();
        btnBatal = new javax.swing.JButton();
        pnTambah = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtIdProduk = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        txtProduk = new javax.swing.JTextField();
        txtBeli = new javax.swing.JTextField();
        txtJual = new javax.swing.JTextField();
        txtJumlahStok = new javax.swing.JTextField();
        btnSimpan4 = new javax.swing.JButton();
        btnBatal4 = new javax.swing.JButton();
        pnHeaderTambah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        cbxDistributor = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data Produk");

        btnTambah.setBackground(new java.awt.Color(72, 63, 139));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah Produk");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        txtPencarian.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPencarian.setText("Pencarian");
        txtPencarian.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPencarianFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPencarianFocusLost(evt);
            }
        });
        txtPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianActionPerformed(evt);
            }
        });
        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        tabelproduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabelproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelprodukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelproduk);

        btnBatal.setBackground(new java.awt.Color(72, 63, 139));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed1(evt);
            }
        });

        javax.swing.GroupLayout pnUtamaLayout = new javax.swing.GroupLayout(pnUtama);
        pnUtama.setLayout(pnUtamaLayout);
        pnUtamaLayout.setHorizontalGroup(
            pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUtamaLayout.createSequentialGroup()
                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(pnUtamaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnUtamaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUtamaLayout.createSequentialGroup()
                                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnUtamaLayout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBatal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE))
                                .addGap(20, 20, 20)))))
                .addContainerGap())
        );
        pnUtamaLayout.setVerticalGroup(
            pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUtamaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pnTabelProduk.setViewportView(pnUtama);

        mainPanel.add(pnTabelProduk, "card2");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("ID Produk");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Barcode");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Distributor");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Nama Produk");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Harga Beli");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Harga Jual");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Jumlah Stok");

        txtIdProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtBarcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtBeli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtJual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtJumlahStok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnSimpan4.setBackground(new java.awt.Color(72, 63, 139));
        btnSimpan4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan4.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan4.setText("Simpan");
        btnSimpan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal4.setBackground(new java.awt.Color(72, 63, 139));
        btnBatal4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal4.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal4.setText("Batal");
        btnBatal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        pnHeaderTambah.setBackground(new java.awt.Color(72, 63, 139));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tambah Produk");

        javax.swing.GroupLayout pnHeaderTambahLayout = new javax.swing.GroupLayout(pnHeaderTambah);
        pnHeaderTambah.setLayout(pnHeaderTambahLayout);
        pnHeaderTambahLayout.setHorizontalGroup(
            pnHeaderTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHeaderTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnHeaderTambahLayout.setVerticalGroup(
            pnHeaderTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderTambahLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Coil", "Kapas" }));
        cbxKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxKategoriMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxKategoriMouseReleased(evt);
            }
        });
        cbxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKategoriActionPerformed(evt);
            }
        });

        cbxDistributor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Coil", "Kapas" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeaderTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel43)
                                .addComponent(jLabel44)
                                .addComponent(jLabel45))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel42)
                            .addGap(38, 38, 38)
                            .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtJual, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnSimpan4)
                        .addGap(30, 30, 30)
                        .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(cbxDistributor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(573, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnHeaderTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(cbxDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtJumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(338, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnTambahLayout = new javax.swing.GroupLayout(pnTambah);
        pnTambah.setLayout(pnTambahLayout);
        pnTambahLayout.setHorizontalGroup(
            pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTambahLayout.setVerticalGroup(
            pnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTambahLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(pnTambah, "card3");

        add(mainPanel, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
//        List<ActionListener> savedListeners = new ArrayList<>();
        if(btnTambah.getText().equals("Tambah Produk")){
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            mainPanel.add(pnTambah);
            mainPanel.repaint();
            mainPanel.revalidate();
             for (ActionListener listener : savedListeners) {
                cbxKategori.addActionListener(listener);
            }
    // Bersihkan daftar action listener yang tersimpan
                savedListeners.clear();
            getKategori();
            getDistributor();
//            nomorOtomatis();
//            txtIdProduk.setText(service.nomor()); 
        }else if(btnTambah.getText().equals("Ubah")){
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            mainPanel.add(pnTambah);
            mainPanel.repaint();
            mainPanel.revalidate();
            // Simpan action listener ComboBox sebelum dihapus

            // Hapus semua action listener dari ComboBox
             for (ActionListener listener : cbxKategori.getActionListeners()) {
                savedListeners.add(listener);
                cbxKategori.removeActionListener(listener);
            }

            // Lakukan operasi lain yang memerlukan penonaktifan tindakan ComboBox
            // ...
            getKategori();
            getDistributor();
            dataTabel();
            // Setelah selesai, tambahkan kembali action listener yang disimpan sebelumnya
           



        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        List<ModelProduk> search = service.search(txtPencarian.getText());
        tabel.setData(search);
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(pnUtama);
        mainPanel.repaint();
        mainPanel.revalidate();
        loadData();
        resetForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(btnSimpan4.getText().equals("Perbarui")){
            perbaruiData();
            mainPanel.removeAll();
            mainPanel.add(pnUtama);
            mainPanel.repaint();
            mainPanel.revalidate();
            
        }else if(btnSimpan4.getText().equals("Simpan")){
            SimpanData();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed1
    loadData();
        btnBatal.setVisible(false);
        btnTambah.setText("Tambah Produk");
    }//GEN-LAST:event_btnBatalActionPerformed1

    private void tabelprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelprodukMouseClicked
        if(btnTambah.getText().equals("Tambah Produk"))
    {
        btnTambah.setText("Ubah");

    }   
    btnBatal.setVisible(true); 
    }//GEN-LAST:event_tabelprodukMouseClicked

    private void cbxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKategoriActionPerformed
        nomorOtomatis();
    }//GEN-LAST:event_cbxKategoriActionPerformed

    private void cbxKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxKategoriMouseClicked
//    nomorOtomatis();        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKategoriMouseClicked

    private void cbxKategoriMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxKategoriMouseReleased
//    nomorOtomatis();        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKategoriMouseReleased

    private void txtPencarianFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPencarianFocusGained
        String pencarian = txtPencarian.getText();
        if (pencarian.equals("Pencarian")) {
            txtPencarian.setText("");
        }
    }//GEN-LAST:event_txtPencarianFocusGained

    private void txtPencarianFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPencarianFocusLost
        String pencarian = txtPencarian.getText();
        if (pencarian.equals("") || pencarian.equals("Pencarian")) {
            txtPencarian.setText("Pencarian");
        }
    }//GEN-LAST:event_txtPencarianFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal4;
    private javax.swing.JButton btnSimpan4;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbxDistributor;
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnHeaderTambah;
    private javax.swing.JScrollPane pnTabelProduk;
    private javax.swing.JPanel pnTambah;
    private javax.swing.JPanel pnUtama;
    private javax.swing.JTable tabelproduk;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtBeli;
    private javax.swing.JTextField txtIdProduk;
    private javax.swing.JTextField txtJual;
    private javax.swing.JTextField txtJumlahStok;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JTextField txtProduk;
    // End of variables declaration//GEN-END:variables
    private void nomorOtomatis(){
        if(cbxKategori.getSelectedItem()!= null){
        String character = (String) cbxKategori.getSelectedItem();
        String character1 = character.substring(0,3).toUpperCase();
        String idProduk = service.nomor(character1);
        txtIdProduk.setText(idProduk);
        txtIdProduk.setEnabled(false);
        }
    }
    
    private void loadData() {
        btnTambah.setText("Tambah Produk");
        btnSimpan4.setText("Simpan");
        btnBatal.setVisible(false);
        getKategori();
        getDistributor();
        List<ModelProduk> list = service.getData();
        tabel.setData(list);
    }
    
    private void getKategoriID(String id){
        String namaKategori = ktg.getKategoriID(id);
        SwingUtilities.invokeLater(()->{
           cbxKategori.setSelectedItem(namaKategori);
        });
    }
    
    private void getDistributorID(String id){
        String namaDistributor = dst.getDistributorID(id);
        SwingUtilities.invokeLater(()->{
           cbxDistributor.setSelectedItem(namaDistributor);
        });
    }
    
    private void getKategori(){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Kategori");
        
        List<ModelKategori> list = ktg.getKategori();
        for(ModelKategori kategori : list){
            model.addElement(kategori.getNama_kategori());
            kategoriMap.put(kategori.getNama_kategori(), kategori.getIdkategori());
        }
        cbxKategori.setModel(model);
        cbxKategori.addActionListener(e -> {
            String namaKategori = cbxKategori.getSelectedItem().toString();
            if(!"Pilih Kategori".equals(namaKategori)){
                idkategori = kategoriMap.get(namaKategori);
            }
        });
    } 
    
        private void getDistributor(){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Distributor");
        
        List<ModelDistributor> list = dst.getDistributor();
        for(ModelDistributor distributor : list){
            model.addElement(distributor.getNama_distributor());
            distributorMap.put(distributor.getNama_distributor(), distributor.getId_distributor());
        }
        cbxDistributor.setModel(model);
        cbxDistributor.addActionListener(e -> {
            String namaDistributor = cbxDistributor.getSelectedItem().toString();
            if(!"Pilih Distributor".equals(namaDistributor)){
                id_distributor = distributorMap.get(namaDistributor);
            }
        });
    }

    private void SimpanData() {
        if(validasiInput()==true){
        
        String id_data_produk       = txtIdProduk.getText();
//        String id_distributor       = cbxDistributor.getItemAt(1);
//        String idkategori           = cbxKategori.getItemAt(1);
        String barcode              = txtBarcode.getText();
        String nama_produk          = txtProduk.getText();
        int jumlah_stok             = Integer.parseInt(txtJumlahStok.getText());
        double harga_beli           = Double.parseDouble(txtBeli.getText());
        double harga_jual           = Double.parseDouble(txtJual.getText());
        
        ModelProduk p = new ModelProduk();
        ModelKategori ktg = new ModelKategori();
        ModelDistributor dst = new ModelDistributor();
        
        p.setId_data_produk(id_data_produk);
        dst.setId_distributor(id_distributor);
        ktg.setIdkategori(idkategori);
        p.setBarcode(barcode);
        p.setNama_produk(nama_produk);
        p.setJumlah_stok(jumlah_stok);
        p.setHarga_beli(harga_beli);
        p.setHarga_jual(harga_jual);
        
        p.setMod_kategori(ktg);
        p.setMod_distributor(dst);
        
        service.tambahData(p);
        tabel.tambahData(p);
        resetForm();
        loadData();
        
        mainPanel.removeAll();
        mainPanel.add(pnUtama);
        mainPanel.repaint();
        mainPanel.revalidate();
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if(txtIdProduk.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ID Produk Tidak Boleh Kosong");
        }   else if(cbxKategori.getSelectedItem().equals("Pilih Kategori")){
                JOptionPane.showMessageDialog(null, "Harap Pilih Kategori");
        }   else if(txtBarcode.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Barcode Tidak Boleh Kosong");
        }   else if(cbxDistributor.getSelectedItem().equals("Pilih Distributor")){
                JOptionPane.showMessageDialog(null, "Harap Pilih Distributor");
        }   else if(txtProduk.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Nama Produk Tidak Boleh Kosong");
        }   else if(txtBeli.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Harga Beli Tidak Boleh Kosong");
        }   else if(txtJual.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Harga Jual Tidak Boleh Kosong");
        }   else if(txtJumlahStok.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Jumlah Stok Tidak Boleh Kosong");
            }else{
                valid=true;
            }
            return valid;
    }
    
//     private boolean validasiInputKode() {
//        boolean valid = false;
//        if(!txtIdDistributor.getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Telah Terisi Otomatis");
//        }else{
//                valid=true;
//            }
//            return valid;
//    }
     
//    private boolean validasiKlikTable() {
//        field_kode.setEnabled(false);
//        field_supplier.setEnabled(false);
//        field_nama.setEnabled(false);
//        field_alamat.setEnabled(false);
//        field_link.setEnabled(false);
//        field_tlp.setEnabled(false);
//        return true;
//    }
     

    private void resetForm() {

        txtIdProduk.setText("");
        txtBarcode.setText("");
        txtProduk.setText("");
        txtBeli.setText("");
        txtJual.setText("");
        txtJumlahStok.setText("");
    }

    private void dataTabel() {
        
        int row = tabelproduk.getSelectedRow();
        
//        txtIdDistributor.setEnabled(false);
        
        txtIdProduk.setText             (tabelproduk.getModel().getValueAt(row,1).toString());
        txtBarcode.setText              (tabelproduk.getModel().getValueAt(row,4).toString());
        txtProduk.setText               (tabelproduk.getModel().getValueAt(row,3).toString());
        txtBeli.setText                 (tabelproduk.getModel().getValueAt(row,6).toString());
        txtJual.setText                 (tabelproduk.getModel().getValueAt(row,7).toString());
        txtJumlahStok.setText           (tabelproduk.getModel().getValueAt(row,8).toString());
        idkategori                      = tabelproduk.getModel().getValueAt(row, 5).toString();
        id_distributor                  = tabelproduk.getModel().getValueAt(row, 2).toString();
        getKategoriID(idkategori);
        getDistributorID(id_distributor);

//        aktif();
        btnSimpan4.setText("Perbarui");
    }

//    private void aktif() {
//        field_nama.setEnabled(true);
//        field_alamat.setEnabled(true);
//        field_link.setEnabled(true);
//        field_tlp.setEnabled(true);
//    }

    private void perbaruiData() {
        int index = tabelproduk.getSelectedRow();
        if (index!=-1){
            
            if(validasiInput()==true){
            String id_data_produk       = txtIdProduk.getText();
//            String idkategori           = cbxKategori.getSelectedItem().toString();
//            String id_distributor       = cbxDistributor.getSelectedItem().toString();
            String barcode              = txtBarcode.getText();
            String nama_produk          = txtProduk.getText();
            double harga_beli           = Double.parseDouble(txtBeli.getText());
            double harga_jual           = Double.parseDouble(txtJual.getText());
            int jumlah_stok             = Integer.parseInt(txtJumlahStok.getText());
                
            ModelProduk p = new ModelProduk();
            ModelKategori ktg = new ModelKategori();
            ModelDistributor dst = new ModelDistributor();

            p.setId_data_produk(id_data_produk);
            ktg.setIdkategori(idkategori);
            dst.setId_distributor(id_distributor);
            p.setBarcode(barcode);
            p.setNama_produk(nama_produk);
            p.setJumlah_stok(jumlah_stok);
            p.setHarga_beli(harga_beli);
            p.setHarga_jual(harga_jual);

            p.setMod_kategori(ktg);
            p.setMod_distributor(dst);
                
                service.perbaruiData(p);
                tabel.perbaruiData(index,p);
                loadData();
                resetForm();
                btnSimpan4.setText("Simpan");
                
            }
        }
    }

    

    
}
