package SanPham;

public abstract class PhanCung extends SanPham{
    protected String loaiLinhKien;
    protected String nhaSanXuat;
    protected String model;

    public PhanCung() 
    {

    }

    public PhanCung(String loaiLinhKien, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.loaiLinhKien = loaiLinhKien;
        this.model = model;
        this.nhaSanXuat = nhaSanXuat;
    }

    public String GetNhaSanXuat() 
    {
        return nhaSanXuat;
    }

    public void SetNhaSanXuat(String nhaSanXuat)
    {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String GetModel() 
    {
        return model;
    }

    public void SetModel(String model) 
    {
        this.model = model;
    }

    public String GetLoaiLinhKien() 
    {
        return loaiLinhKien;
    }

    public void SetLoaiLinhKien(String loaiLinhKien) 
    {
        this.loaiLinhKien = loaiLinhKien;
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
