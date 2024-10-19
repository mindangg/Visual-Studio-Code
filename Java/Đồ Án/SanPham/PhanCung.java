package SanPham;

public abstract class PhanCung extends SanPham{
    protected String nhaSanXuat;
    protected String loaiLinhKien;

    public PhanCung() 
    {

    }

    public PhanCung(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, 
                int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP, String loaiLinhKien, 
                String nhaSanXuat) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.loaiLinhKien = loaiLinhKien;
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
        System.out.println("Nhap nha san xuat: ");
        SetNhaSanXuat(sc.nextLine());
        System.out.println("Nhap loai linh kien: ");
        SetLoaiLinhKien(sc.nextLine());
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "PhanCung [nhaSanXuat=" + nhaSanXuat + ", loaiSP=" + loaiLinhKien + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

}
