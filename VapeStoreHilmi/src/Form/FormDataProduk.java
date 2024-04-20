package Form;

import com.formdev.flatlaf.FlatClientProperties;
import java.util.List;
import vape.model.ModelProduk;
import vape.service.ServiceProduk;
import vape.tabelmodel.TabelModelProduk;

public class FormDataProduk extends javax.swing.JPanel {
    
    private final TabelModelProduk tblModel = new TabelModelProduk();
    //private final ServiceProduk servis = new ProdukDAO();

    public FormDataProduk() {
        initComponents();
        setLayoutForm();
        //tblData.setModel(tblModel);
        //loadData();
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
        jTable1 = new javax.swing.JTable();
        pnTambah = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtIdProduk = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        txtDistributor = new javax.swing.JTextField();
        txtProduk = new javax.swing.JTextField();
        txtBeli = new javax.swing.JTextField();
        txtJual = new javax.swing.JTextField();
        txtJumlahStok = new javax.swing.JTextField();
        cbxStatus = new javax.swing.JComboBox<>();
        btnSimpan4 = new javax.swing.JButton();
        btnBatal4 = new javax.swing.JButton();
        pnHeaderTambah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
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

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowHeight(30);
        jScrollPane2.setViewportView(jTable1);

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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                            .addGroup(pnUtamaLayout.createSequentialGroup()
                                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnTambah))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
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

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Status");

        jLabel47.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Pastikan data produk terisi dengan benar.");

        txtIdProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtBarcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtDistributor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtBeli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtJual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtJumlahStok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cbxStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Ada", "Habis" }));

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

        jLabel11.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBarcode)
                                    .addComponent(txtDistributor)
                                    .addComponent(txtProduk)
                                    .addComponent(txtBeli)
                                    .addComponent(txtJual)
                                    .addComponent(txtJumlahStok)
                                    .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 527, Short.MAX_VALUE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(pnHeaderTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnHeaderTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtIdProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(76, 76, 76))
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
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(pnTambah);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        pencarianData();
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        mainPanel.removeAll();
        mainPanel.add(pnUtama);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal4;
    private javax.swing.JButton btnSimpan4;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnHeaderTambah;
    private javax.swing.JScrollPane pnTabelProduk;
    private javax.swing.JPanel pnTambah;
    private javax.swing.JPanel pnUtama;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtBeli;
    private javax.swing.JTextField txtDistributor;
    private javax.swing.JTextField txtIdProduk;
    private javax.swing.JTextField txtJual;
    private javax.swing.JTextField txtJumlahStok;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JTextField txtProduk;
    // End of variables declaration//GEN-END:variables

    private void setLayoutForm() {
        pnHeaderTambah.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:rgb(72,63,139);"
                + "arc:20;");
        txtIdProduk.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtBarcode.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtBeli.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtJual.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtDistributor.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtJumlahStok.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtPencarian.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtProduk.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        cbxStatus.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
    }
    
    private void pencarianData() {
        //List<ModelProduk> list = servis.pencarianData(txtPencarian.getText());
        //tblModel.setData(list);
    }
    
    private void loadData() {
        //List<ModelProduk> list = servis.tampilData();
        //tblModel.setData(list);
    }

    

    
}