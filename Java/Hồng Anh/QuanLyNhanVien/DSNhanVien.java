package QuanLyNhanVien;

import java.util.Scanner;

public class DSNhanVien 
{
    static Scanner sc = new Scanner(System.in);

    public void NhapDSNhanVien(NhanVien nv[], int n)
    {
        System.out.println("Nhap so luong nhan vien");
        n = sc.nextInt(); 
        for(int i = 0; i < n; i++)
        {
            nv[i].Nhap();
        }
    }

    public void XuatDSNhanVien(NhanVien nv[])
    {
        for(var i : nv)
        {
            i.Nhap();
        }
    }

    public float TongLuongNhanVien(NhanVien nv[])
    {
        float tong = 0;
        for(var i : nv)
        {
            tong += i.SoLuong();
        }
        return tong;
    }

    public NhanVien NhanVienLuongCaoNhat(NhanVien nv[])
    {
        float tong = 0;
        for(var i : nv)
        {
            tong += i.SoLuong();
        }
        return tong;
    }


}
