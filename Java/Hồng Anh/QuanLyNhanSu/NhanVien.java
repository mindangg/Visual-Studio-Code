package QuanLyNhanSu;

import java.time.LocalDate;
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

    public NhanVien(String maNV, String tenNV, float heSoLuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namVaoLam = LocalDate.now().getYear();
        this.soNgayNghi = 0;
        this.heSoLuong = heSoLuong;
    }

    public NhanVien(String maNV, String tenNV, int namVaoLam, float heSoLuong, int soNgayNghi) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namVaoLam = namVaoLam;
        this.soNgayNghi = soNgayNghi;
        this.heSoLuong = heSoLuong;
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

    public float PCTN()
    {
        if(LocalDate.now().getYear() - namVaoLam >= 5)
            return (float)((LocalDate.now().getYear() - namVaoLam) * luongCoBan / 100);  
        return 0;
    }

    public char XepLoai()
    {
        if(soNgayNghi <= 1)
            return 'A';
        else if(soNgayNghi <= 3)
            return 'B';
        else return 'C';
    }

    public float TinhLuong()
    {
        float heSoThiDua = 0;
        switch (XepLoai()){
            case 'A':   
                heSoThiDua = 1; 
                break;

            case 'B':    
                heSoThiDua = 0.75f;
                break;

            case 'C':    
                heSoThiDua = 0.5f;
                break;
        }

        return (float)(luongCoBan * heSoLuong * heSoThiDua + PCTN());
    }


    public String ToString() {
        return String.format("%-10s %-10s %-10d %-10f %-10d %-10s %-10f", maNV, tenNV, namVaoLam, heSoLuong, soNgayNghi, XepLoai(), TinhLuong());
    }

    public void Xuat(){
        System.out.println(ToString());
    }
    



    
}
