package SanPham;

import java.util.Arrays;
import java.util.Scanner;

public class QLSanPham{
    private SanPham[] ds;
    static Scanner sc = new Scanner(System.in);

    public QLSanPham()
    {

    }

    public QLSanPham(SanPham[] ds) 
    {
        this.ds = ds;
    }

    public void ThemSanPham(SanPham sp)
    {
        SanPham[] newDS = Arrays.copyOf(ds, ds.length + 1);
        newDS[this.ds.length] = sp;
        this.ds = newDS;
    }

    public void NhapDanhSach()
    {
        System.out.println("Nhap so luong san pham: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {

        }
    }

    public void XuatDanhSach()
    {
        for(var i:ds)
            i.Xuat();
    }

    public void DocTuFile()
    {

    }

    public void NhapVaoFile()
    {

    }

    public void SuaPhanTuTheoMa()
    {

    }

    public void XoaPhanTuTheoMa()
    {
        
    }

    public void TimKiem()
    {

    }
}
