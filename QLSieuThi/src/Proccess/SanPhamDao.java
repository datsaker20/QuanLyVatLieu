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
public class SanPhamDao {
    Connection conn=null;
    PreparedStatement sttm =null;
    public int add(SanPham sp){
        try{
            String sql="insert into HANGHOA (MaHH,TenHH,GiaBan,DonViTinh,MaNCC) Values (?,?,?,?,?)";
             conn=DataNhanVien.openConnetion();
             sttm=conn.prepareStatement(sql);
             sttm.setString(1, sp.getMaHH());
             sttm.setString(2, sp.getTenHH());
             sttm.setInt(3, sp.getGiaBan());
             sttm.setString(4, sp.getDVT());
             sttm.setString(5, sp.getMaNCC().getMaNCC());
             if(sttm.executeUpdate()>0){
                 System.out.println("Them Thanh Cong!");
                 return 1;
             }
        }
        catch(Exception ex){
                System.out.println("Loi 1: "+ex.toString());
        }
        return -1;
    }
     public int UpDate(SanPham sp){
        try{
            String sql="update HANGHOA set TenHH=?,GiaBan=?,DonViTinh=?,MaNCC=? where MaHH=?";
             conn=DataNhanVien.openConnetion();
             sttm=conn.prepareStatement(sql);
             sttm.setString(5, sp.getMaHH());
             sttm.setString(1, sp.getTenHH());
             sttm.setInt(2, sp.getGiaBan());
             sttm.setString(3, sp.getDVT());
             sttm.setString(4, sp.getMaNCC().getMaNCC());
             if(sttm.executeUpdate()>0){
                 System.out.println("UpDate Thanh Cong!");
                 return 1;
             }
        }
        catch(Exception ex){
                System.out.println("Loi 2: "+ex.toString());
        }
        return -1;
    }
     public int Delete(String MaHH){
        try{
            String sql="Delete HANGHOA where MaHH= ?";
             conn=DataNhanVien.openConnetion();
             sttm=conn.prepareStatement(sql);
              sttm.setString(1, MaHH);
             if(sttm.executeUpdate()>0){
                 System.out.println("Xoa Thanh Cong!");
                 return 1;
             }
        }
        catch(Exception ex){
                System.out.println("Loi 3: "+ex.toString());
        }
        return -1;
    }
     public boolean delete(String MaHH) throws Exception {
        String sql = "Delete from HANGHOA where MaHH=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MaHH);
            return ps.executeUpdate() > 0;
        }
    }
     public List<SanPham> getAll(){
         List<SanPham> ls=new ArrayList<>();
         ResultSet rs=null;
         Statement sttm=null;
         try{
             String sql="select MaHH,TenHH,GiaBan,DonViTinh,Hanghoa.MaNCC from HANGHOA inner join NHACC on NHACC.MaNCC=HANGHOA.MaNCC";
              conn = DataNhanVien.openConnetion();  
             sttm = conn.createStatement();
             rs=sttm.executeQuery(sql);
             while(rs.next()){
                 SanPham sp=new SanPham();
                 sp.setMaHH(rs.getString(1));
                 sp.setTenHH(rs.getString(2));
                 sp.setGiaBan(rs.getInt(3));
                 sp.setDVT(rs.getString(4));
                 sp.setMaNCC(new NhaCungCap(rs.getString(5)));
                 
                 ls.add(sp);
             }
         }
         catch(Exception ex){
             System.out.print("loi 4: "+ex.toString());
         }
         finally{
             try{
                 rs.close();
                 sttm.close();
                 conn.close();
                 
             }
             catch(Exception ex){
                 
             }
         }
        return ls;
     }
     
            
}
