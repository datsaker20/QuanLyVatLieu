/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

/**
 *
 * @author tran dat
 */
public class NhanVie {
     private String MaNV,TenNV,NamSinh, SDT,DiaChi;
    private String GioiTinh;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public NhanVie(String MaNV, String TenNV, String NamSinh, String SDT, String DiaChi, String GioiTinh) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.NamSinh = NamSinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public NhanVie(String MaNV) {
        this.MaNV = MaNV;
    }

    public NhanVie() {
    }
    @Override
public String toString(){
        return getMaNV();
    }
}
