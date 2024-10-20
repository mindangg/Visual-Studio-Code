package SanPham;

public class BoNho extends PhanCung{
    private int dungLuongBoNho;
    private String loaiBoNho;

    public BoNho() 
    {

    }

    public BoNho(int dungLuongBoNho, String loaiBoNho) 
    {
        this.dungLuongBoNho = dungLuongBoNho;
        this.loaiBoNho = loaiBoNho;
    }

    public BoNho(int dungLuongBoNho, String loaiBoNho, String loaiLinhKien, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiLinhKien, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.dungLuongBoNho = dungLuongBoNho;
        this.loaiBoNho = loaiBoNho;
    }

    public int GetDungLuongBoNho() 
    {
        return dungLuongBoNho;
    }

    public void SetDungLuongBoNho(int dungLuongBoNho) 
    {
        this.dungLuongBoNho = dungLuongBoNho;
    }

    public String GetLoaiBoNho() 
    {
        return loaiBoNho;
    }

    public void SetLoaiBoNho(String loaiBoNho) 
    {
        this.loaiBoNho = loaiBoNho;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap dung luong: ");
        SetDungLuongBoNho(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai bo nho: ");
        SetLoaiBoNho(sc.nextLine());
    }  
    
    @Override
    public void Nhap1()
    {
        super.Nhap1();
        System.out.println("Nhap dung luong: ");
        SetDungLuongBoNho(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai bo nho: ");
        SetLoaiBoNho(sc.nextLine());
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "BoNho [dungLuong=" + dungLuongBoNho + ", loaiBoNho=" + loaiBoNho + "]";
    }

    @Override
    public String ToString1() 
    {
        return super.ToString1() + "BoNho [dungLuong=" + dungLuongBoNho + ", loaiBoNho=" + loaiBoNho + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

    @Override
    public void Xuat1()
    {
        System.out.println(ToString1());
    }

}
