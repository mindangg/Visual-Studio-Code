package QuanLyNhanVien;

import java.util.Arrays;
import java.util.Scanner;

public class DSNhanVien 
{
    NhanVien ds[] = new NhanVien[0];
    static Scanner sc = new Scanner(System.in);

    public void NhapDSNhanVien()
    {
        System.out.println("Nhap so luong nhan vien");
        int n = Integer.parseInt(sc.nextLine()); 
        for(int i = 0; i < n; i++)
        {
            NhanVien nv = new NhanVien();
            nv.Nhap();

            ds = Arrays.copyOf(ds, ds.length + 1);
            ds[ds.length - 1] = nv;
        }
    }

    public void XuatDSNhanVien()
    {
        for(var i : ds)
        {
            i.Xuat();
        }
    }

    public float TongLuongNhanVien()
    {
        float tong = 0;
        for(var i : ds)
        {
            tong += i.SoLuong();
        }
        return tong;
    }

    public void NhanVienLuongCaoNhat()
    {
        NhanVien max = new NhanVien();
        for(var i : ds)
                if(i.SoLuong() > max.SoLuong())
                    max = i;
        max.Xuat();
    }

    public static void swap(NhanVien array[], int a, int b)
    {
        NhanVien t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    public void SapXepTheoNamVaoLam()
    {
        for(int i = 0; i < ds.length - 1; i++)
            for(int j = i + 1; j < ds.length; j++)
                if(ds[i].namVaoLam > ds[j].namVaoLam)
                    swap(ds, i, j);
    } 
}
