/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tran dat
 */
public class CTHoaDonDao {

    Connection conn = null;
    PreparedStatement ps = null;

    public List<CTHoaDon> getAll() {
        List<CTHoaDon> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sql = "select HOADON.MaHd,CThoadon.MaHh,hanghoa.tenhh,soluong,dongia from(( CTHOADON inner join HANGHOA  on HANGHOA.MaHH=CTHOADON.MaHH) inner join HOADON  on HOADON.MaHD=CTHOADON.MaHD)";
            conn = DataNhanVien.openConnetion();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                CTHoaDon ct = new CTHoaDon();
                ct.setHD(new HoaDon(rs.getString(1)));
                ct.setSP(new SanPham(rs.getString(2)));
                ct.setMa(new SanPham(rs.getString(3)));
                ct.setSoLuong(rs.getInt(4));
                ct.setDonGia(rs.getInt(5));
                ls.add(ct);
            }
        } catch (Exception ex) {
            System.out.print("loi 4: " + ex.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();

            } catch (Exception ex) {
                System.out.println("loi 4");
            }
        }
        return ls;
    }
    
     public boolean delete(String MaHD) throws Exception {
        String sql = "Delete from CTHOADON where MaHD=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MaHD);
            return ps.executeUpdate() > 0;
        }
    }

}
