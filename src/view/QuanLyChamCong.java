/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.ChamCong;
import com.toedter.calendar.JDateChooser;
import dao.ChamCongDAO;
import dao.NhanVienDAO;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh PC
 */
public class QuanLyChamCong extends javax.swing.JFrame {
    private String phanQuyen;
    private String tenTaiKhoan;
    private DefaultTableModel model;
        private JTextField TuKhoaField;
    private JDateChooser TuKhoaDate;
    /**
     * Creates new form QuanLyChamCong
     */
    public QuanLyChamCong(String phanQuyen, String maNV) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getAllChamCong();
        this.setTimKiemField();
        DanhSachChamCong.setRowHeight(25);
        this.phanQuyen = phanQuyen;
        this.tenTaiKhoan = maNV;
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TimKiemTheoLabel = new javax.swing.JLabel();
        TimKiemField = new javax.swing.JComboBox<>();
        TuKhoaLabel = new javax.swing.JLabel();
        TimKiemBtn = new javax.swing.JButton();
        TimKiemPanel = new javax.swing.JPanel();
        ThoatBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DanhSachChamCong = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TimKiemTheoLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TimKiemTheoLabel.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemTheoLabel.setText("Tìm kiếm theo");

        TimKiemField.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TimKiemField.setForeground(new java.awt.Color(0, 0, 0));
        TimKiemField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TimKiemFieldItemStateChanged(evt);
            }
        });

        TuKhoaLabel.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        TuKhoaLabel.setForeground(new java.awt.Color(0, 0, 0));
        TuKhoaLabel.setText("Từ khóa");

        TimKiemBtn.setBackground(new java.awt.Color(0, 204, 102));
        TimKiemBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimKiemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/search.png"))); // NOI18N
        TimKiemBtn.setText("Tìm kiếm");
        TimKiemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });

        TimKiemPanel.setBackground(new java.awt.Color(255, 255, 255));
        TimKiemPanel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout TimKiemPanelLayout = new javax.swing.GroupLayout(TimKiemPanel);
        TimKiemPanel.setLayout(TimKiemPanelLayout);
        TimKiemPanelLayout.setHorizontalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        TimKiemPanelLayout.setVerticalGroup(
            TimKiemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimKiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemTheoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TuKhoaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(TimKiemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimKiemTheoLabel)
                    .addComponent(TuKhoaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TimKiemField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(TimKiemBtn)
                .addContainerGap())
        );

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

        DanhSachChamCong.setBackground(new java.awt.Color(255, 255, 255));
        DanhSachChamCong.setForeground(new java.awt.Color(0, 0, 0));
        DanhSachChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ngày đi làm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DanhSachChamCong.setGridColor(new java.awt.Color(102, 102, 102));
        DanhSachChamCong.setSelectionBackground(new java.awt.Color(153, 255, 153));
        DanhSachChamCong.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(DanhSachChamCong);
        if (DanhSachChamCong.getColumnModel().getColumnCount() > 0) {
            DanhSachChamCong.getColumnModel().getColumn(0).setResizable(false);
            DanhSachChamCong.getColumnModel().getColumn(1).setResizable(false);
            DanhSachChamCong.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHẤM CÔNG");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(ThoatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThoatBtn)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatBtnActionPerformed
        new QuanLy_View(phanQuyen, tenTaiKhoan);
        this.dispose();
    }//GEN-LAST:event_ThoatBtnActionPerformed

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed

        String timKiemTheo = (String) TimKiemField.getSelectedItem();
        ArrayList<ChamCong> chamCong = null;
        if (!"".equals(TuKhoaField.getText()) || TuKhoaDate.getDate() != null) {
            if (null != timKiemTheo) switch (timKiemTheo) {
                case "Mã nhân viên" -> chamCong = ChamCongDAO.getInstance().getByMaNhanVien(TuKhoaField.getText());
                case "Tên nhân viên" -> chamCong = ChamCongDAO.getInstance().getByTenNhanVien(TuKhoaField.getText());
                case "Ngày làm việc" -> {
                    chamCong = ChamCongDAO.getInstance().getByNgayLamViec(new Date(TuKhoaDate.getDate().getTime()));
                }
                default -> {
                }
            }
            if (chamCong == null || TuKhoaField.getText().contains("%")) {
                JOptionPane.showMessageDialog(null,
                        "Không tìm thấy",
                        "",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                this.hienThi(chamCong);

            }
        } else
            this.getAllChamCong();
    }//GEN-LAST:event_TimKiemBtnActionPerformed

    private void TimKiemFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TimKiemFieldItemStateChanged
        // TODO add your handling code here:
        if("Ngày làm việc".equals((String)TimKiemField.getSelectedItem())){    
            TimKiemPanel.removeAll();
            TuKhoaDate = new JDateChooser();
            TuKhoaDate.setDateFormatString("dd/MM/yyyy");
            TuKhoaDate.setPreferredSize(new Dimension(TimKiemPanel.getWidth(), TimKiemPanel.getHeight()));
            TimKiemPanel.setLayout(new CardLayout());
            TimKiemPanel.add(TuKhoaDate);
            TimKiemPanel.validate();
            TimKiemPanel.repaint();
        }
        else{
            TimKiemPanel.removeAll();
            TuKhoaField = new JTextField();
            TuKhoaField.setPreferredSize(new Dimension(TimKiemPanel.getWidth(), TimKiemPanel.getHeight()));
            TimKiemPanel.setLayout(new CardLayout());
            TimKiemPanel.add(TuKhoaField);
            TimKiemPanel.validate();
            TimKiemPanel.repaint();
        }
    }//GEN-LAST:event_TimKiemFieldItemStateChanged
    private void hienThi(ArrayList<ChamCong> t) {
        model = (DefaultTableModel) DanhSachChamCong.getModel();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        model.setRowCount(0);
        for (ChamCong i : t) {
            String ngayLamViec = dateFormat.format(i.getNgayLamViec());
            String tenNhanVien = NhanVienDAO.getInstance().getById(i.getMaNhanVien()).getTenNhanVien();
            String[] dataRow = {i.getMaNhanVien(), tenNhanVien, ngayLamViec};
            model.addRow(dataRow);
        }
    }

    private void getAllChamCong() {
        ArrayList<ChamCong> chamCong = ChamCongDAO.getInstance().getAll();
        this.hienThi(chamCong);
    }
    
    private void setTimKiemField(){
        String [] tenCot ={"Mã nhân viên", "Tên nhân viên", "Ngày làm việc"}; 
        for(int i = 0; i < tenCot.length; i++)
            TimKiemField.addItem(tenCot[i]);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DanhSachChamCong;
    private javax.swing.JButton ThoatBtn;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JComboBox<String> TimKiemField;
    private javax.swing.JPanel TimKiemPanel;
    private javax.swing.JLabel TimKiemTheoLabel;
    private javax.swing.JLabel TuKhoaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
