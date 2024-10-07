package QuanLyNhanSu;

import java.util.Scanner;

public class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected int namVaoLam;
    protected float heSoLuong;
    protected int soNgayNghi;
    protected int luongCoBan = 2340000;
    static Scanner sc = new Scanner(System.in);

    public NhanVien()
    {

    }

    public NhanVien(float heSoLuong, String maNV, int namVaoLam, int soNgayNghi, String tenNV) {
        this.heSoLuong = heSoLuong;
        this.maNV = maNV;
        this.namVaoLam = namVaoLam;
        this.soNgayNghi = soNgayNghi;
        this.tenNV = tenNV;
    }

    public String GetMaNV() {
        return maNV;
    }

    public void SetMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String GetTenNV() {
        return tenNV;
    }

    public void SetTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int GetNamVaoLam() {
        return namVaoLam;
    }

    public void SetNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public float GetHeSoLuong() {
        return heSoLuong;
    }

    public void SetHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int GetSoNgayNghi() {
        return soNgayNghi;
    }

    public void SetSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    public int GetLuongCoBan() {
        return luongCoBan;
    }

    public void SetLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }



    
}
