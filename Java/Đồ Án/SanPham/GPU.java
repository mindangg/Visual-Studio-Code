package SanPham;

public class GPU extends PhanCung{
    private int dungLuongVRAM;
    private String loaiVRAM;
    private int tocDoXungNhip;
    private int soNhanCUDA;
    private boolean rayTracing;

    public GPU() 
    {

    }

    public GPU(int dungLuongVRAM, String loaiVRAM, int tocDoXungNhip, int soNhanCUDA, boolean rayTracing, String loaiSP, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) 
    {
        super(loaiSP, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.dungLuongVRAM = dungLuongVRAM;
        this.loaiVRAM = loaiVRAM;
        this.rayTracing = rayTracing;
        this.soNhanCUDA = soNhanCUDA;
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public int GetDungLuongVRAM() 
    {
        return dungLuongVRAM;
    }

    public void SetDungLuongVRAM(int dungLuongVRAM) 
    {
        this.dungLuongVRAM = dungLuongVRAM;
    }

    public String GetLoaiVRAM() 
    {
        return loaiVRAM;
    }

    public void SetLoaiVRAM(String loaiVRAM) 
    {
        this.loaiVRAM = loaiVRAM;
    }

    public int GetTocDoXungNhip() 
    {
        return tocDoXungNhip;
    }

    public void SetTocDoXungNhip(int tocDoXungNhip) 
    {
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public int GetSoNhanCUDA() 
    {
        return soNhanCUDA;
    }

    public void SetSoNhanCUDA(int soNhanCUDA) 
    {
        this.soNhanCUDA = soNhanCUDA;
    }

    public boolean IsRayTracing() 
    {
        return rayTracing;
    }

    public void SetRayTracing(boolean rayTracing) 
    {
        this.rayTracing = rayTracing;
    }

}
