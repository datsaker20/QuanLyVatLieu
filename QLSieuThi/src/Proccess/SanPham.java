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
public class SanPham {
    private String MaHH,TenHH,DVT;
    private int GiaBan;
    private NhaCungCap MaNCC;
    public SanPham(String MaHH, String TenHH, String DVT, int GiaBan, NhaCungCap MaNCC) {
        this.MaHH = MaHH;
        this.TenHH = TenHH;
        this.DVT = DVT;
        this.GiaBan = GiaBan;
        this.MaNCC = MaNCC;
    }

    public SanPham(String MaHH) {
        this.MaHH = MaHH;
    }

    public SanPham() {
    }

    

    public String getMaHH() {
        return MaHH;
    }

    public void setMaHH(String MaHH) {
        this.MaHH = MaHH;
    }

    public String getTenHH() {
        return TenHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public NhaCungCap getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(NhaCungCap MaNCC) {
        this.MaNCC = MaNCC;
    }

  
    @Override
    public String toString(){
         return getMaHH();
    }
    
   /* public String ga(){
        return getMaHH();
    }*/
    
}
