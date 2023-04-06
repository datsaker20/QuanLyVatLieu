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
public class CTHoaDon {

    private HoaDon HD;
    private SanPham SP;
    private int SoLuong;
    private int DonGia;
    private SanPham Ma;

    public CTHoaDon(SanPham Ma) {
        this.Ma = Ma;
    }

    public CTHoaDon(HoaDon HD, SanPham SP, int SoLuong, int DonGia, SanPham Ma) {
        this.HD = HD;
        this.SP = SP;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.Ma = Ma;
    }

    public SanPham getMa() {
        return Ma;
    }

    public void setMa(SanPham Ma) {
        this.Ma = Ma;
    }

    public CTHoaDon() {
    }

    public CTHoaDon(HoaDon HD) {
        this.HD = HD;
    }


    public HoaDon getHD() {
        return HD;
    }

    public void setHD(HoaDon HD) {
        this.HD = HD;
    }

    public SanPham getSP() {
        return SP;
    }

    public void setSP(SanPham SP) {
        this.SP = SP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }


}
