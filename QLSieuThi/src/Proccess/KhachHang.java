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
public class KhachHang {
    private String MaKH,TenKH,SDTKH,DiaChiKH;
    
     public KhachHang(String MaKH) {
        this.MaKH = MaKH;
    }
    public String getMaKH() {
        return MaKH;
    }
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }
    public String getTenKH() {
        return TenKH;
    }
    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }
    public String getSDTKH() {
        return SDTKH;
    }
    public void setSDTKH(String SDTKH) {
        this.SDTKH = SDTKH;
    }
    public String getDiaChiKH() {
        return DiaChiKH;
    }
    public void setDiaChiKH(String DiaChiKH) {
        this.DiaChiKH = DiaChiKH;
    }
    public KhachHang(String MaKH, String TenKH, String SDTKH, String DiaChiKH) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SDTKH = SDTKH;
        this.DiaChiKH = DiaChiKH;
    }
    public KhachHang() {
    }
    @Override
public String toString(){
        return getMaKH();
    }
}
