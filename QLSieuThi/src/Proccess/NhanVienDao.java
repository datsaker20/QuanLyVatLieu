/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import javax.swing.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tran dat
 */
public class NhanVienDao {

    public boolean InSert(NhanVie NV) throws Exception {
        String sql = "insert into NHANVIEN(MaNV,TenNV,GioiTinh,NamSinh,SDTNV,DiaChiNV) values (?,?,?,?,?,?)";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, NV.getMaNV());
            ps.setString(2, NV.getTenNV());
            ps.setString(3, NV.getGioiTinh());
            ps.setString(4, NV.getNamSinh());
            ps.setString(5, NV.getSDT());
            ps.setString(6, NV.getDiaChi());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean UpDate(NhanVie NV) throws Exception {
        String sql = "Update NHANVIEN set TenNV=?,GioiTinh=?,NamSinh=?,SDTNV=?,DiaChiNV=? where MaNV=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(6, NV.getMaNV());
            ps.setString(1, NV.getTenNV());
            ps.setString(2, NV.getGioiTinh());
            ps.setString(3, NV.getNamSinh());
            ps.setString(4, NV.getSDT());
            ps.setString(5, NV.getDiaChi());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean Delete(String MaNV) throws Exception {
        String sql = "Delete from NHANVIEN where MaNV=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MaNV);
            return ps.executeUpdate() > 0;
        }
    }

    public List<NhanVie> getAll() {
        List<NhanVie> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement st = null;
        try {
            String sql = "select * from NHANVIEN";
            Connection conn = DataNhanVien.openConnetion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                NhanVie NV = new NhanVie();
                NV.setMaNV(rs.getString(1));
                NV.setTenNV(rs.getString(2));
                NV.setGioiTinh(rs.getString(3));
                NV.setNamSinh(rs.getString(4));
                NV.setSDT(rs.getString(5));
                NV.setDiaChi(rs.getString(6));
                ls.add(NV);
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

    public NhanVie getByName(String MaNV) {

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sql = "select * from NHANVIEN where MaNV='" + MaNV + "'";
            Connection conn = DataNhanVien.openConnetion();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                NhanVie NV = new NhanVie();
                NV.setMaNV(rs.getString(1));
                NV.setTenNV(rs.getString(2));
                NV.setGioiTinh(rs.getString(3));
                NV.setNamSinh(rs.getString(4));
                NV.setSDT(rs.getString(5));
                NV.setDiaChi(rs.getString(6));
                return NV;
            }
        } catch (Exception ex) {
            System.out.print("loi 7 nv:" + ex.toString());
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
