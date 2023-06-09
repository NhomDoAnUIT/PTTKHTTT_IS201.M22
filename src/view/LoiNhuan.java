/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ThongKeDAO;
import Model.LoiNhuanThang;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Thanh PC
 */
public class LoiNhuan extends javax.swing.JFrame {
    private String phanQuyen;
    private String tenTaiKhoan;
    /**
     * Creates new form LoiNhuan
     */
    public LoiNhuan(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.tenTaiKhoan = maNV;
        this.phanQuyen = phanQuyen;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel1 = new javax.swing.JPanel();
        ThoatBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LuongField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NhapHangField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        HoaDonField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LoiNhuanField = new javax.swing.JTextField();
        thangField = new com.toedter.calendar.JMonthChooser();
        namField = new com.toedter.calendar.JYearChooser();
        XemBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ThoatBtn.setBackground(new java.awt.Color(0, 204, 102));
        ThoatBtn.setForeground(new java.awt.Color(255, 255, 255));
        ThoatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/exit.png"))); // NOI18N
        ThoatBtn.setText("Thoát");
        ThoatBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThoatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lương nhân viên");

        LuongField.setBackground(new java.awt.Color(255, 255, 255));
        LuongField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LuongField.setForeground(new java.awt.Color(0, 51, 204));
        LuongField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LuongField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        LuongField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nhập hàng");

        NhapHangField.setBackground(new java.awt.Color(255, 255, 255));
        NhapHangField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        NhapHangField.setForeground(new java.awt.Color(0, 51, 204));
        NhapHangField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NhapHangField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hóa đơn");

        HoaDonField.setBackground(new java.awt.Color(255, 255, 255));
        HoaDonField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        HoaDonField.setForeground(new java.awt.Color(0, 51, 204));
        HoaDonField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HoaDonField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Lợi nhuận");

        LoiNhuanField.setBackground(new java.awt.Color(255, 255, 255));
        LoiNhuanField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LoiNhuanField.setForeground(new java.awt.Color(255, 0, 0));
        LoiNhuanField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LoiNhuanField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        XemBtn.setBackground(new java.awt.Color(0, 204, 102));
        XemBtn.setForeground(new java.awt.Color(255, 255, 255));
        XemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/eye.png"))); // NOI18N
        XemBtn.setText("Xem");
        XemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XemBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LỢI NHUẬN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(thangField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(XemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(ThoatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(LuongField)
                    .addComponent(NhapHangField)
                    .addComponent(HoaDonField)
                    .addComponent(LoiNhuanField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(thangField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LuongField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NhapHangField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoaDonField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoiNhuanField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThoatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatBtnActionPerformed
        // TODO add your handling code here:
         if("QL".equals(phanQuyen))
            new QuanLy_View(phanQuyen, tenTaiKhoan);
        else if("NVBH".equals(phanQuyen))
            new NhanVienBanHang_View(phanQuyen, tenTaiKhoan);
        else if("TK".equals(phanQuyen))
            new ThuKho_View(phanQuyen, tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_ThoatBtnActionPerformed
    public String DinhDangTienTe(double soTien) {
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        String str = en.format(soTien);
        return str;
    }
    private void XemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemBtnActionPerformed
        // TODO add your handling code here:
        int thang = thangField.getMonth() + 1;
        int nam = namField.getYear();
        LoiNhuanThang loiNhuan = ThongKeDAO.getInstance().getByLoiNhuanThang(thang, nam);
        String luong = DinhDangTienTe(loiNhuan.getTienLuong());
         String hoaDon = DinhDangTienTe(loiNhuan.getHoaDon());
          String nhapHang = DinhDangTienTe(loiNhuan.getNhapHang());
           String loi = DinhDangTienTe(loiNhuan.getLoi());
        LuongField.setText(luong);
        HoaDonField.setText(hoaDon);
        NhapHangField.setText(nhapHang);
        LoiNhuanField.setText(loi);
    }//GEN-LAST:event_XemBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HoaDonField;
    private javax.swing.JTextField LoiNhuanField;
    private javax.swing.JTextField LuongField;
    private javax.swing.JTextField NhapHangField;
    private javax.swing.JButton ThoatBtn;
    private javax.swing.JButton XemBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JYearChooser namField;
    private com.toedter.calendar.JMonthChooser thangField;
    // End of variables declaration//GEN-END:variables
}
