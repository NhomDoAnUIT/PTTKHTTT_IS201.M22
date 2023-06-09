/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.ChamCong;
import dao.NhanVienDAO;
import dao.ChamCongDAO;

/**
 *
 * @author Thanh PC
 */
public class NhanVienBanHang_View extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienBanHang_View
     */
    private String phanQuyen;
    private String tenTaiKhoan;
    
    public NhanVienBanHang_View(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
        MaNhanVienField.setText(maNV);
        TenNhanVienField.setText(NhanVienDAO.getInstance().getById(maNV).getTenNhanVien());
        SoNgayField.setText(String.valueOf(ChamCongDAO.getInstance().getSoNgayLamViecThang(maNV)));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DanhMucBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        KhachHangBtn = new javax.swing.JButton();
        HoaDonBtn = new javax.swing.JButton();
        SanPhamBtn = new javax.swing.JButton();
        SuKienBtn = new javax.swing.JButton();
        MatKhauBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MaNhanVienField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TenNhanVienField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SoNgayField = new javax.swing.JTextField();
        BaoCaoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        DanhMucBtn.setBackground(new java.awt.Color(0, 204, 102));
        DanhMucBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DanhMucBtn.setForeground(new java.awt.Color(255, 255, 255));
        DanhMucBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/categories.png"))); // NOI18N
        DanhMucBtn.setText("Tra cứu danh mục");
        DanhMucBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DanhMucBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanhMucBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NHÂN VIÊN BÁN HÀNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        KhachHangBtn.setBackground(new java.awt.Color(0, 204, 102));
        KhachHangBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        KhachHangBtn.setForeground(new java.awt.Color(255, 255, 255));
        KhachHangBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/rating.png"))); // NOI18N
        KhachHangBtn.setText("Quản lý khách hàng");
        KhachHangBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KhachHangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhachHangBtnActionPerformed(evt);
            }
        });

        HoaDonBtn.setBackground(new java.awt.Color(0, 204, 102));
        HoaDonBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        HoaDonBtn.setForeground(new java.awt.Color(255, 255, 255));
        HoaDonBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/invoice.png"))); // NOI18N
        HoaDonBtn.setText("Hóa đơn");
        HoaDonBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HoaDonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonBtnActionPerformed(evt);
            }
        });

        SanPhamBtn.setBackground(new java.awt.Color(0, 204, 102));
        SanPhamBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        SanPhamBtn.setForeground(new java.awt.Color(255, 255, 255));
        SanPhamBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/product.png"))); // NOI18N
        SanPhamBtn.setText("Tra cứu sản phẩm");
        SanPhamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SanPhamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SanPhamBtnActionPerformed(evt);
            }
        });

        SuKienBtn.setBackground(new java.awt.Color(0, 204, 102));
        SuKienBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        SuKienBtn.setForeground(new java.awt.Color(255, 255, 255));
        SuKienBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/event.png"))); // NOI18N
        SuKienBtn.setText("Tra cứu sự kiện");
        SuKienBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SuKienBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuKienBtnActionPerformed(evt);
            }
        });

        MatKhauBtn.setBackground(new java.awt.Color(0, 204, 102));
        MatKhauBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        MatKhauBtn.setForeground(new java.awt.Color(255, 255, 255));
        MatKhauBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/password.png"))); // NOI18N
        MatKhauBtn.setText("Đổi mật khẩu");
        MatKhauBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MatKhauBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatKhauBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã nhân viên");

        MaNhanVienField.setEditable(false);
        MaNhanVienField.setBackground(new java.awt.Color(255, 255, 255));
        MaNhanVienField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MaNhanVienField.setForeground(new java.awt.Color(102, 102, 102));
        MaNhanVienField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaNhanVienField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        MaNhanVienField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tên nhân viên");

        TenNhanVienField.setEditable(false);
        TenNhanVienField.setBackground(new java.awt.Color(255, 255, 255));
        TenNhanVienField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TenNhanVienField.setForeground(new java.awt.Color(102, 102, 102));
        TenNhanVienField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TenNhanVienField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        TenNhanVienField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Số ngày làm việc trong tháng");

        SoNgayField.setEditable(false);
        SoNgayField.setBackground(new java.awt.Color(255, 255, 255));
        SoNgayField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SoNgayField.setForeground(new java.awt.Color(102, 102, 102));
        SoNgayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SoNgayField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        SoNgayField.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaNhanVienField)
                    .addComponent(TenNhanVienField)
                    .addComponent(SoNgayField, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaNhanVienField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TenNhanVienField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoNgayField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        BaoCaoBtn.setBackground(new java.awt.Color(0, 204, 102));
        BaoCaoBtn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        BaoCaoBtn.setForeground(new java.awt.Color(255, 255, 255));
        BaoCaoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/graph.png"))); // NOI18N
        BaoCaoBtn.setText("Thống kê, Báo cáo");
        BaoCaoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BaoCaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaoCaoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BaoCaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SanPhamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(HoaDonBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DanhMucBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SuKienBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MatKhauBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhachHangBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 65, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HoaDonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KhachHangBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SanPhamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SuKienBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MatKhauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DanhMucBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BaoCaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DanhMucBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhMucBtnActionPerformed
        // TODO add your handling code here:
        new QuanLyDanhMuc(this.phanQuyen,this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_DanhMucBtnActionPerformed

    private void HoaDonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonBtnActionPerformed
        // TODO add your handling code here:
        new HoaDonBanHang(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_HoaDonBtnActionPerformed

    private void KhachHangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhachHangBtnActionPerformed
        // TODO add your handling code here:
        new QuanLyKhachHang(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_KhachHangBtnActionPerformed

    private void SanPhamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SanPhamBtnActionPerformed
        // TODO add your handling code here:
        new QuanLySanPham(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_SanPhamBtnActionPerformed

    private void SuKienBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuKienBtnActionPerformed
        // TODO add your handling code here:
        new QuanLySuKien(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_SuKienBtnActionPerformed

    private void BaoCaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaoCaoBtnActionPerformed
        // TODO add your handling code here:
        new BaoCaoThongKe(this.phanQuyen, this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_BaoCaoBtnActionPerformed

    private void MatKhauBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatKhauBtnActionPerformed
        // TODO add your handling code here:
        new DoiMatKhau(this.phanQuyen,this.tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_MatKhauBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaoCaoBtn;
    private javax.swing.JButton DanhMucBtn;
    private javax.swing.JButton HoaDonBtn;
    private javax.swing.JButton KhachHangBtn;
    private javax.swing.JTextField MaNhanVienField;
    private javax.swing.JButton MatKhauBtn;
    private javax.swing.JButton SanPhamBtn;
    private javax.swing.JTextField SoNgayField;
    private javax.swing.JButton SuKienBtn;
    private javax.swing.JTextField TenNhanVienField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
