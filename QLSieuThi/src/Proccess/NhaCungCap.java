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
public class NhaCungCap {
    private String MaNCC,TenNCC,SDTNCC,DiaChiNCC;

    public NhaCungCap(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getSDTNCC() {
        return SDTNCC;
    }

    public void setSDTNCC(String SDTNCC) {
        this.SDTNCC = SDTNCC;
    }

    public String getDiaChiNCC() {
        return DiaChiNCC;
    }

    public void setDiaChiNCC(String DiaChiNCC) {
        this.DiaChiNCC = DiaChiNCC;
    }

    public NhaCungCap(String MaNCC, String TenNCC, String SDTNCC, String DiaChiNCC) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.SDTNCC = SDTNCC;
        this.DiaChiNCC = DiaChiNCC;
    }

    public NhaCungCap() {
    }
    @Override
public String toString(){
        return getMaNCC();
    }
}
