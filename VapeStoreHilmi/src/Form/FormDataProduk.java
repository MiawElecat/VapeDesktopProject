package Form;

import com.formdev.flatlaf.FlatClientProperties;
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


    public FormDataProduk() {
        initComponents();
<<<<<<< HEAD
        kategoriMap = new HashMap<>();
        distributorMap = new HashMap<>();
        tabelproduk.setModel(tabel);
        loadData();
        btnBatal.setVisible(false);
=======
<<<<<<< HEAD
        setLayoutForm();
=======
        //tblData.setModel(tblModel);
        //loadData();
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
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
<<<<<<< HEAD
        tabelproduk = new javax.swing.JTable();
=======
<<<<<<< HEAD
        tblDataProduk = new javax.swing.JTable();
=======
        jTable1 = new javax.swing.JTable();
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
        btnBatal = new javax.swing.JButton();
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
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
        txtNama = new javax.swing.JTextField();
        txtBeli = new javax.swing.JTextField();
        txtJual = new javax.swing.JTextField();
        txtJumlahStok = new javax.swing.JTextField();
<<<<<<< HEAD
        cbxStatus = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        pnHeaderTambah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnPencarianDistributor = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        txtDistributor = new javax.swing.JTextField();
        cbxKategori = new javax.swing.JComboBox<>();
=======
        btnSimpan4 = new javax.swing.JButton();
        btnBatal4 = new javax.swing.JButton();
        pnHeaderTambah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        cbxDistributor = new javax.swing.JComboBox<>();
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e

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

<<<<<<< HEAD
        tabelproduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabelproduk.setModel(new javax.swing.table.DefaultTableModel(
=======
        tblDataProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDataProduk.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
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
<<<<<<< HEAD
        tabelproduk.setRowHeight(30);
        tabelproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelprodukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelproduk);
=======
        tblDataProduk.setRowHeight(30);
        jScrollPane2.setViewportView(tblDataProduk);
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9

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
                .addGroup(pnUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
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

        txtNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtBeli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtJual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtJumlahStok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

<<<<<<< HEAD
        cbxStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Ada", "Habis" }));

        btnSimpan.setBackground(new java.awt.Color(72, 63, 139));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
=======
        btnSimpan4.setBackground(new java.awt.Color(72, 63, 139));
        btnSimpan4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan4.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan4.setText("Simpan");
        btnSimpan4.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(72, 63, 139));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
        btnPencarianDistributor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-alt-2-regular-24.png"))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Kategori");

        txtDistributor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Coil", "Kapas" }));
=======
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Kategori");

>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Coil", "Kapas" }));
        cbxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKategoriActionPerformed(evt);
            }
        });

        cbxDistributor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquid", "Coil", "Kapas" }));
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e

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
<<<<<<< HEAD
                        .addGap(185, 185, 185)
                        .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
=======
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel47))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                                    .addComponent(txtIdProduk, javax.swing.GroupLayout.Alignment.TRAILING)
<<<<<<< HEAD
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbxKategori, 0, 397, Short.MAX_VALUE)
                                            .addComponent(txtDistributor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addComponent(btnPencarianDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
=======
                                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
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
<<<<<<< HEAD
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel42)
                                        .addComponent(jLabel46))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
=======
                                    .addComponent(jLabel42)
                                    .addGap(38, 38, 38)
                                    .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
                                .addComponent(txtJual, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(533, Short.MAX_VALUE))
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
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
<<<<<<< HEAD
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnPencarianDistributor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))))
                .addGap(16, 16, 16)
=======
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(cbxDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
=======
                .addGap(27, 27, 27)
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
<<<<<<< HEAD
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
=======
                    .addComponent(btnSimpan4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addContainerGap(338, Short.MAX_VALUE))
=======
                .addContainerGap(289, Short.MAX_VALUE))
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
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
        if(btnTambah.getText().equals("Tambah Produk")){
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            mainPanel.add(pnTambah);
            mainPanel.repaint();
            mainPanel.revalidate();
            getKategori();
            getDistributor();
//            txtIdProduk.setText(service.nomor()); 
        }else if(btnTambah.getText().equals("Ubah")){
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            mainPanel.add(pnTambah);
            mainPanel.repaint();
            mainPanel.revalidate();
            getKategori();
            getDistributor();
            dataTabel();
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
        String character = (String) cbxKategori.getSelectedItem();
        String character1 = character.substring(0,3).toUpperCase();
        String idProduk = service.nomor(character1);
        txtIdProduk.setText(idProduk);
        txtIdProduk.setEnabled(false);
    }//GEN-LAST:event_cbxKategoriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
<<<<<<< HEAD
    private javax.swing.JButton btnPencarianDistributor;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JComboBox<String> cbxStatus;
=======
    private javax.swing.JButton btnBatal4;
    private javax.swing.JButton btnSimpan4;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbxDistributor;
    private javax.swing.JComboBox<String> cbxKategori;
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
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
<<<<<<< HEAD
    private javax.swing.JTable tabelproduk;
=======
    private javax.swing.JTable tblDataProduk;
>>>>>>> a8bfc3fe4f3a969c7641930632382f0089e965e9
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtBeli;
<<<<<<< HEAD
    private javax.swing.JTextField txtDistributor;
=======
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
    private javax.swing.JTextField txtIdProduk;
    private javax.swing.JTextField txtJual;
    private javax.swing.JTextField txtJumlahStok;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables

<<<<<<< HEAD
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
        txtJumlahStok.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtPencarian.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        txtNama.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
        cbxStatus.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;");
    }
=======
>>>>>>> af16e1bd744c7ce6e6547398b656ff337dc3c10e
    
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
        }else if(cbxKategori.getSelectedItem().equals("Pilih Kategori")){
            JOptionPane.showMessageDialog(null, "Harap Pilih Kategori");
        }else if(txtBarcode.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Barcode Tidak Boleh Kosong");
        }else if(cbxDistributor.getSelectedItem().equals("Pilih Distributor")){
            JOptionPane.showMessageDialog(null, "Harap Pilih Distributor");
        }else if(txtProduk.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Produk Tidak Boleh Kosong");
        }else if(txtBeli.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga Beli Tidak Boleh Kosong");
        }else if(txtJual.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga Jual Tidak Boleh Kosong");
        }else if(txtJumlahStok.getText().trim().isEmpty()){
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
