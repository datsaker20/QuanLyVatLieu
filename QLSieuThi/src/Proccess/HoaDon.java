/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.util.Date;
import java.sql.*;

/**
 *
 * @author tran dat
 */
public class HoaDon {

    private String MaHD;
    private Date NgayHD;
    private KhachHang KH;
    private NhanVie NV;

    public HoaDon() {
    }

    public HoaDon(Date NgayHD) {
        this.NgayHD = NgayHD;
    }

    public HoaDon(String MaHD, Date NgayHD, KhachHang KH, NhanVie NV) {
        this.MaHD = MaHD;
        this.KH = KH;
        this.NV = NV;
        this.NgayHD = NgayHD;

    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(Date NgayHD) {
        this.NgayHD = NgayHD;
    }

    public KhachHang getKH() {
        return KH;
    }

    public void setKH(KhachHang KH) {
        this.KH = KH;
    }

    public NhanVie getNV() {
        return NV;
    }

    public void setNV(NhanVie NV) {
        this.NV = NV;
    }

    public HoaDon(String MaHD) {
        this.MaHD = MaHD;
    }
    
    @Override
    public String toString(){
        return getMaHD();
    }

}
