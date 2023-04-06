/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author tran dat
 */
public class KhachHangDao {
    public boolean InSert(KhachHang KH)throws Exception{
        String sql="insert into KHACHHANG(MaKH,TenKH,DiaChiKH,SDTKH) values (?,?,?,?)";
        try(
            
            Connection conn = DataNhanVien.openConnetion();
            PreparedStatement ps= conn.prepareStatement(sql);
                ){
            ps.setString(1,KH.getMaKH());
            ps.setString(2,KH.getTenKH());            
            ps.setString(3,KH.getDiaChiKH());       
            ps.setString(4,KH.getSDTKH());
            return ps.executeUpdate()>0;
        } 
    }
    public boolean UpDate (KhachHang KH)throws Exception{
        String sql="Update KHACHHANG set TenKH=?,DiaChiKH=?,SDTKH=? where MaKH=? ";
        try(
            
            Connection conn = DataNhanVien.openConnetion();
            PreparedStatement ps= conn.prepareStatement(sql);
                ){
            ps.setString(4,KH.getMaKH());
            ps.setString(1,KH.getTenKH());            
            ps.setString(2,KH.getDiaChiKH());       
            ps.setString(3,KH.getSDTKH());
            
            return ps.executeUpdate()>0;
        } 
    }
     public boolean Delete (String MaKH)throws Exception{
        String sql="Delete from KHACHHANG where MaKH=? ";
        try(
            
            Connection conn = DataNhanVien.openConnetion();
            PreparedStatement ps= conn.prepareStatement(sql);
                ){
            ps.setString(1,MaKH);
            return ps.executeUpdate()>0;
        } 
    }
     public List<KhachHang> getAll() {
        List<KhachHang> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement st = null;
        try {
            String sql = "select * from KHACHHANG";
            Connection conn = DataNhanVien.openConnetion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                KhachHang KH = new KhachHang();
                KH.setMaKH(rs.getString(1));
                KH.setTenKH(rs.getString(2));
                KH.setDiaChiKH(rs.getString(3));
                KH.setSDTKH(rs.getString(4));
                //ps.setString(1,KH.getMaKH());
           // ps.setString(2,KH.getTenKH());            
           // ps.setString(3,KH.getDiaChiKH());       
            //ps.setString(4,KH.getSDTKH());
                ls.add(KH);
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
     public KhachHang getByName(String MaKH) {

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sql = "select * from NHACC where MaNCC='"+MaKH+"'";
           Connection  conn = DataNhanVien.openConnetion();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                KhachHang KH = new KhachHang();
                KH.setMaKH(rs.getString(1));
                KH.setTenKH(rs.getString(2));
                KH.setDiaChiKH(rs.getString(3));
                KH.setSDTKH(rs.getString(4));
                return KH;
            }
        } catch (Exception ex) {
            System.out.print("loi 7 kh:" + ex.toString());
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
