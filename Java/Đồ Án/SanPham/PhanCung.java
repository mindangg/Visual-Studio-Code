package SanPham;

public abstract class PhanCung extends SanPham{
    protected String nhaSanXuat;
    protected String model;
    protected String loaiSP;

    public PhanCung() 
    {

    }

    public PhanCung(String loaiSP, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.loaiSP = loaiSP;
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

    public String GetLoaiSP() 
    {
        return loaiSP;
    }

    public void SetLoaiSP(String loaiSP) 
    {
        this.loaiSP = loaiSP;
    }




}
