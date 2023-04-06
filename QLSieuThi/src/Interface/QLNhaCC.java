/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Proccess.NhaCungCapDao;
import Proccess.NhaCungCap;
import Proccess.DataNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author tran dat
 */
public class QLNhaCC extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    private void iniCungCap() {
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Địa Chỉ", "Số Điện Thoại"});
        jTNCC.setModel(tableModel);
    }

    private void BangNhaCungCap() {
        try {
            String userName = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSieuThi;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = java.sql.DriverManager.getConnection(url, userName, password);
            String sql = "select * from NHACC";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            tableModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString("MaNCC"), rs.getString("TenNCC"), rs.getString("DiaChiNCC"), rs.getString("SDTNCC")
                };
                tableModel.addRow(row);

            }
            tableModel.fireTableDataChanged();
            rs.close();
            ps.close();
            conn.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi:" + ex.getMessage());
        }
    }

    /**
     * Creates new form QLNhaCC
     */
    public QLNhaCC() {
        initComponents();
        iniCungCap();
        BangNhaCungCap();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        txtTenNCC = new javax.swing.JTextField();
        txtDCNCC = new javax.swing.JTextField();
        txtSDTNCC = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNCC = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Nhà Cung Cấp");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã Nhà Cung Cấp");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên Nhà Cung Cấp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Địa Chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số Điện Thoại");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnThemMoi.setText("Làm Mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        jTNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "Địa Chỉ", "Số Điện Thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTNCC);
        if (jTNCC.getColumnModel().getColumnCount() > 0) {
            jTNCC.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setText("Quay Lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDCNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDTNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 335, Short.MAX_VALUE)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemMoi)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDCNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDTNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThemMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaNCC.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã nhà cung cấp không được để trống");
        } else {
            txtMaNCC.setBackground(Color.white);
            if (sb.length() > 0) {
                JOptionPane.showInputDialog(this, sb);
            }
            try {
                NhaCungCap NCC = new NhaCungCap();
                NCC.setMaNCC(txtMaNCC.getText());
                NCC.setTenNCC(txtTenNCC.getText());
                NCC.setDiaChiNCC(txtDCNCC.getText());
                NCC.setSDTNCC(txtSDTNCC.getText());
                NhaCungCapDao dao = new NhaCungCapDao();
                dao.InSert(NCC);
                JOptionPane.showMessageDialog(this, "lưu thành công!");
                dao.UpDate(NCC);
                BangNhaCungCap();
                txtMaNCC.setText("");
                txtTenNCC.setText("");
                txtSDTNCC.setText("");
                txtDCNCC.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi:" + ex.getMessage());
            }

        }


    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtMaNCC.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chọn đối tượng để sửa");

        } else {
            txtMaNCC.setBackground(Color.white);
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb);
            }
            try {
                NhaCungCap NCC = new NhaCungCap();
                NCC.setMaNCC(txtMaNCC.getText());
                NCC.setTenNCC(txtTenNCC.getText());
                NCC.setSDTNCC(txtSDTNCC.getText());
                //SDTNCC,DiaChiNCC;
                NCC.setDiaChiNCC(txtDCNCC.getText());
                NhaCungCapDao dao = new NhaCungCapDao();
                dao.UpDate(NCC);
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                BangNhaCungCap();
                txtMaNCC.setText("");
                txtTenNCC.setText("");
                txtSDTNCC.setText("");
                txtDCNCC.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi:" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         StringBuilder sb = new StringBuilder();
        if (txtMaNCC.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đối tượng để xóa");

        } else {
            txtMaNCC.setBackground(Color.white);
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb);
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Xác Nhận Xóa Nhà Cung Cấp") == JOptionPane.NO_OPTION) {
                return;
            }
            try {
                ;
                NhaCungCapDao dao = new NhaCungCapDao();
                dao.Delete(txtMaNCC.getText());
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtDCNCC.setText("");
        txtSDTNCC.setText("");
                BangNhaCungCap();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi:" + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        // TODO add your handling code here:
        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtDCNCC.setText("");
        txtSDTNCC.setText("");
        BangNhaCungCap();
        
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void jTNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNCCMouseClicked
        // TODO add your handling code here:
                int row = jTNCC.getSelectedRow();
        if (row >= 0) {
            txtMaNCC.setText(jTNCC.getValueAt(row,0).toString());
            txtTenNCC.setText(jTNCC.getValueAt(row,1).toString());
            txtDCNCC.setText(jTNCC.getValueAt(row, 2).toString());
            txtSDTNCC.setText(jTNCC.getValueAt(row, 3).toString());
        }
    }//GEN-LAST:event_jTNCCMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmMain frm = new frmMain();
        frm.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhaCC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTNCC;
    private javax.swing.JTextField txtDCNCC;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSDTNCC;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
}