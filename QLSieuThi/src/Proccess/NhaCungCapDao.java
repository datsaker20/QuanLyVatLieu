/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tran dat
 */
public class NhaCungCapDao {

    public boolean InSert(NhaCungCap NCC) throws Exception {
        String sql = "insert into NHACC(MaNCC,TenNCC,DiaChiNCC,SDTNCC) values (?,?,?,?)";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, NCC.getMaNCC());
            ps.setString(2, NCC.getTenNCC());
            ps.setString(3, NCC.getDiaChiNCC());
            ps.setString(4, NCC.getSDTNCC());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean UpDate(NhaCungCap NCC) throws Exception {
        String sql = "Update NHACC set TenNCC=?,DiaChiNCC=?,SDTNCC=? where MaNCC=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(4, NCC.getMaNCC());
            ps.setString(1, NCC.getTenNCC());
            ps.setString(2, NCC.getDiaChiNCC());
            ps.setString(3, NCC.getSDTNCC());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean Delete(String MaNCC) throws Exception {
        String sql = "Delete from NHACC where MaNCC=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MaNCC);
            return ps.executeUpdate() > 0;
        }
    }

    public List<NhaCungCap> getAll() {
        List<NhaCungCap> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement st = null;
        try {
            String sql = "select * from NHACC";
            Connection conn = DataNhanVien.openConnetion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                NhaCungCap NCC = new NhaCungCap();
                NCC.setMaNCC(rs.getString(1));
                NCC.setTenNCC(rs.getString(2));
                NCC.setDiaChiNCC(rs.getString(3));
                NCC.setSDTNCC(rs.getString(4));
                ls.add(NCC);
            }
        } catch (Exception ex) {
            System.out.print("loi" + ex.toString());
        } finally {
            try {
                rs.close();
                st.close();

            } catch (Exception ex) {

            }
        }
        return ls;
    }

    public NhaCungCap getByName(String MaNCC) {

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sql = "select * from NHACC where MaNCC='"+MaNCC+"'";
           Connection  conn = DataNhanVien.openConnetion();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                NhaCungCap NCC = new NhaCungCap();
                NCC.setMaNCC(rs.getString(1));
                NCC.setTenNCC(rs.getString(2));
                NCC.setDiaChiNCC(rs.getString(3));
                NCC.setSDTNCC(rs.getString(4));
                return NCC;
            }
        } catch (Exception ex) {
            System.out.print("loi 7 ncc:" + ex.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
             

            } catch (Exception ex) {

            }
        }
        return null;
    }
}
