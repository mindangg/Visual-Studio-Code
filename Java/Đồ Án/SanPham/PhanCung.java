package SanPham;

public abstract class PhanCung extends SanPham{
    protected String loaiLinhKien;
    protected String nhaSanXuat;
    protected String model;

    public PhanCung() 
    {

    }





    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap loai linh kien: ");
        SetLoaiLinhKien(sc.nextLine());
        System.out.println("Nhap nha san xuat: ");
        SetNhaSanXuat(sc.nextLine());
        System.out.println("Nhap model san pham: ");
        SetModel(sc.nextLine());
    }

    public void Nhap1()
    {
        System.out.println("Nhap loai linh kien: ");
        SetLoaiLinhKien(sc.nextLine());
        System.out.println("Nhap nha san xuat: ");
        SetNhaSanXuat(sc.nextLine());
        System.out.println("Nhap model san pham: ");
        SetModel(sc.nextLine());
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "PhanCung [nhaSanXuat=" + nhaSanXuat + ", loaiSP=" + loaiLinhKien + "]";
    }

    public String ToString1()
    {
        return "PhanCung [nhaSanXuat=" + nhaSanXuat + ", loaiSP=" + loaiLinhKien + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

    public void Xuat1()
    {
        System.out.println(ToString1());
    }
}
