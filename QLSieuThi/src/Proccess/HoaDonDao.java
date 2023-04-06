/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;

/**
 *
 * @author tran dat
 */
public class HoaDonDao {

    SimpleDateFormat FDate = new SimpleDateFormat("yyyy-MM-dd");
     Connection conn=null;
    PreparedStatement sttm =null;
    KhachHang kh =  new KhachHang();
    NhanVie nv = new NhanVie();
    
    
    public int add(HoaDon hd){
        try{
            KhachHang kh =  new KhachHang();
            NhanVie nv = new NhanVie();
            String sql="insert into HoaDon (MaHD,makh,manv,ngaylaphd) Values (?,?,?,?)";
             conn=DataNhanVien.openConnetion();
             sttm=conn.prepareStatement(sql);
             sttm.setString(1, hd.getMaHD());
             sttm.setString(2, hd.getKH().getMaKH());
             sttm.setString(3, hd.getNV().getMaNV());
             sttm.setString(4, FDate.format(hd.getNgayHD()));
             //sttm.setString(5, hd.getMaNCC().getMaNCC());
             if(sttm.executeUpdate()>0){
                 System.out.println("Them Thanh Cong!");
                 return 1;
             }
        }
        catch(Exception ex){
                System.out.println("Loi 1 hđ : "+ex.toString());
        }
        return -1;
    }
    public int add1(HoaDon hd){
        try{
            KhachHang kh =  new KhachHang();
            NhanVie nv = new NhanVie();
            //string mancc = txtmancc.gettext(); 
            //ps.setstring(1, mancc);
            String sql="insert into HoaDon (MaHD,makh,manv,ngaylaphd) Values (?,?,?,?)";
             conn=DataNhanVien.openConnetion();
             sttm=conn.prepareStatement(sql);
             sttm.setString(1, hd.getMaHD());
             sttm.setString(2, hd.getKH().getMaKH());
             sttm.setString(3, hd.getNV().getMaNV());
             sttm.setString(4, FDate.format(hd.getNgayHD()));
             //sttm.setString(5, hd.getMaNCC().getMaNCC());
             if(sttm.executeUpdate()>0){
                 System.out.println("Them Thanh Cong!");
                 return 1;
             }
        }
        catch(Exception ex){
                System.out.println("Loi 1 hđ : "+ex.toString());
        }
        return -1;
    }
    
    
/*Connection conn =null;
    PreparedStatement sttm = null;

    public int add(HoaDon hd) {
        try {
            String sql = "insert into HOADON (MaHD,MaKH,MaNV,NgayLapHD) Values (?,?,?,?')";
             conn = DataNhanVien.openConnetion();
            PreparedStatement sttm = conn.prepareStatement(sql);
            sttm.setString(1, hd.getMaHD());
            sttm.setString(2, hd.getKH().getMaKH());
            sttm.setString(3, hd.getNV().getMaNV());
            sttm.setString(4, FDate.format(hd.getNgayHD()));
            //hd.setKH(new KhachHang(rs.getString(2)));
            if (sttm.executeUpdate() > 0) {
                System.out.println("Them Thanh Cong!");
                return 1;
            }
        } catch (Exception ex) {
            System.out.println("Loi 1 hd: " + ex.toString());
        }
        return -1;
    }
    //Connection conn=null;
    //PreparedStatement sttm =null;

    /*public int add(SanPham sp){
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
    }*/
    public int UpDate(HoaDon hd) {
        try {
            String sql = "update HOADON set MaKH=?,MaNV=?,NgayLapHD=? where MaHD=?";
   conn = DataNhanVien.openConnetion();
          PreparedStatement   sttm = conn.prepareStatement(sql);
            sttm.setString(4, hd.getMaHD());
            sttm.setString(1, hd.getKH().getMaKH());
            sttm.setString(2, hd.getNV().getMaNV());
            sttm.setString(3, FDate.format(hd.getNgayHD()));
            if (sttm.executeUpdate() > 0) {
                System.out.println("UpDate Thanh Cong!");
                return 1;
            }
        } catch (Exception ex) {
            System.out.println("Loi 2 : " + ex.toString());
        }
        return -1;
    }

    public boolean delete(String MaHD) throws Exception {
        String sql = "Delete from HOADON where MaHD=? ";
        try (
                Connection conn = DataNhanVien.openConnetion();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, MaHD);
            return ps.executeUpdate() > 0;
        }
    }

    public List<HoaDon> getAll() {
        List<HoaDon> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sql = "select MaHD,HOADON.MaKH,Hoadon.MaNV,NgayLapHD from(( HOADON inner join NHANVIEN  on NHANVIEN.MaNV=HOADON.MaNV) inner join KHACHHANG  on KHACHHANG.MaKH=HOADON.MaKH)";
      conn = DataNhanVien.openConnetion();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                //sp.setMaHH(rs.getString(1));
                hd.setMaHD(rs.getString(1));
                hd.setKH(new KhachHang(rs.getString(2)));
                hd.setNV(new NhanVie(rs.getString(3)));
                hd.setNgayHD(FDate.parse(rs.getString(4)));

                //sttm.setString(3, FDate.format(hd.getNgayHD()));
                //sp.setMaNCC(new NhaCungCap(rs.getString(5)));
                ls.add(hd);
            }
        } catch (Exception ex) {
            System.out.print("loi 4: " + ex.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();;

            } catch (Exception ex) {
                    System.out.print("loi 4.5 : " + ex.toString());
            }
        }
        return ls;
    }
}
