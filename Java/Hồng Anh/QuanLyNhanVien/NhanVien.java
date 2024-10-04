package QuanLyNhanVien;

import java.time.LocalDate;
import java.util.Scanner;

public class NhanVien 
{
    public String maNV;
    public String hoTen;
    public float heSoLuong;
    public int namVaoLam;
    static int mucLuongToiThieu = 2340000;
    static Scanner sc = new Scanner(System.in);

    public NhanVien()
    {

    }

    public void Employee(String maNV, String hoTen, float heSoLuong, int namVaoLam) 
    {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        this.namVaoLam = namVaoLam;
    }

    public  String GetMaNV() 
    {
        return maNV;
    }

    public  String GetHoTen() 
    {
        return hoTen;
    }

    public float GetHeSoLuong() 
    {
        return heSoLuong;
    }

    public int GetNamVaoLam() 
    {
        return namVaoLam;
    }

    public void SetMaNV(String maNV) 
    {
        this.maNV = maNV;
    }

    public void SetHoTen(String hoTen) 
    {
        this.hoTen = hoTen;
    }

    public void SetHeSoLuong(float heSoLuong) 
    {
        this.heSoLuong = heSoLuong;
    }

    public void SetNamVaoLam(int namVaoLam) 
    {
        if(namVaoLam > 2024)
            this.namVaoLam = 2024;
        else
            this.namVaoLam = namVaoLam;
    }

    public void SetSoLuong(int heSoLuong) 
    {
        while(true)
        {
            if(heSoLuong <= 0)
            {
                System.out.println("He so luong > 0");
                SetHeSoLuong(heSoLuong);
            }
            else
                break;
        }
        this.heSoLuong = heSoLuong;
    }

    public float LuongCoBan() 
    {
        return heSoLuong * mucLuongToiThieu;
    }

    public float HSPCTN()
    {
        return (LocalDate.now().getYear() - GetNamVaoLam()) / 100f;
    }

    public float SoLuong()
    {
        return LuongCoBan() * (1 + HSPCTN());
    }

    public void Nhap()
    {
        System.out.println("Nhap ma nhan vien: ");
        SetMaNV(sc.nextLine());
        System.out.println("Nhap ho ten nhan vien: ");
        SetHoTen(sc.nextLine());
        System.out.println("Nhap he so luong nhan vien: ");
        SetHeSoLuong(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhap nam vao lam nhan vien: ");
        SetNamVaoLam(Integer.parseInt(sc.nextLine()));
    }

    public void Xuat()
    {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho ten nhan vien: " + hoTen);
        System.out.println("He so luong nhan vien: " + heSoLuong);
        System.out.println("Nam vao lam nhan vien: " + namVaoLam);
        System.out.println("Luong co ban nhan vien: " + LuongCoBan());
        System.out.println("Luong chinh thuc nhan vien: " + SoLuong());
        System.out.println("");
    }
}
