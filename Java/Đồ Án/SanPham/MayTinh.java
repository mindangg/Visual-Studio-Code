package SanPham;

public abstract class MayTinh extends SanPham{
    protected String nhaSanXuat;
    protected String model;
    protected String loaiSP;
    protected PhanCung phanCung;
    protected String heDieuHanh;
    protected boolean coCardRoi;

    public MayTinh()
    {

    }

    public MayTinh(boolean coCardRoi, String heDieuHanh, String loaiSP, String model, String nhaSanXuat, PhanCung phanCung, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.coCardRoi = coCardRoi;
        this.heDieuHanh = heDieuHanh;
        this.loaiSP = loaiSP;
        this.model = model;
        this.nhaSanXuat = nhaSanXuat;
        this.phanCung = phanCung;
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

    public PhanCung GetPhanCung() 
    {
        return phanCung;
    }

    public void SetPhanCung(PhanCung phanCung) 
    {
        this.phanCung = phanCung;
    }

    public String GetHeDieuHanh() 
    {
        return heDieuHanh;
    }

    public void SetHeDieuHanh(String heDieuHanh) 
    {
        this.heDieuHanh = heDieuHanh;
    }

    public boolean IsCoCardRoi() 
    {
        return coCardRoi;
    }

    public void SetCoCardRoi(boolean coCardRoi) 
    {
        this.coCardRoi = coCardRoi;
    }

}
