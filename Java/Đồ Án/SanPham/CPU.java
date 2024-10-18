package SanPham;

public class CPU extends PhanCung{
    private int soNhan;
    private int soLuong;
    private int tocDoXungNhip;

    public CPU() 
    {

    }

    public CPU(int soLuong, int soNhan, int tocDoXungNhip, String loaiSP, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) 
    {
        super(loaiSP, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.soLuong = soLuong;
        this.soNhan = soNhan;
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public int GetSoNhan() 
    {
        return soNhan;
    }

    public void SetSoNhan(int soNhan) 
    {
        this.soNhan = soNhan;
    }

    public int GetSoLuong() 
    {
        return soLuong;
    }

    public void SetSoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }

    public int GetTocDoXungNhip() 
    {
        return tocDoXungNhip;
    }

    public void SetTocDoXungNhip(int tocDoXungNhip) 
    {
        this.tocDoXungNhip = tocDoXungNhip;
    }


}
