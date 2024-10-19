package SanPham;

public class PhanCung extends SanPham{
    protected String nhaSanXuat;
    protected String loaiSP;

    public PhanCung() 
    {

    }

    public PhanCung(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, 
                int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP, String loaiSP, 
                String nhaSanXuat) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.loaiSP = loaiSP;
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

    public String GetLoaiSP() 
    {
        return loaiSP;
    }

    public void SetLoaiSP(String loaiSP) 
    {
        this.loaiSP = loaiSP;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap nha san xuat: ");
        SetNhaSanXuat(sc.nextLine());
        System.out.println("Nhap loai san pham: ");
        SetLoaiSP(sc.nextLine());
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "PhanCung [nhaSanXuat=" + nhaSanXuat + ", loaiSP=" + loaiSP + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

}
