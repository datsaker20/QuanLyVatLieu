/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tran dat
 */
public class HangHoaddd {
    Connection conn = null;
    PreparedStatement sttm =null;
     
     
     
     
     
     
     
     
     
     
     
    
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
    public List<SanPham> getAll1(){
         List<SanPham> ls=new ArrayList<>();
         ResultSet rs=null;
         Statement sttm=null;
         try{
             String sql="select GiaBan from HANGHOA inner join NHACC on NHACC.MaNCC=HANGHOA.MaNCC";
              conn = DataNhanVien.openConnetion();  
             sttm = conn.createStatement();
             rs=sttm.executeQuery(sql);
             while(rs.next()){
                 SanPham sp=new SanPham();
                 sp.setGiaBan(rs.getInt(1));

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
