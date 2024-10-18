package SanPham;

public class BoNho extends PhanCung{
    private int dungLuong;
    private String loaiBoNho;

    public BoNho() 
    {

    }

    public BoNho(int dungLuong, String loaiBoNho, String loaiSP, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiSP, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.dungLuong = dungLuong;
        this.loaiBoNho = loaiBoNho;
    }

    public int GetDungLuong() 
    {
        return dungLuong;
    }

    public void SetDungLuong(int dungLuong) 
    {
        this.dungLuong = dungLuong;
    }

    public String GetLoaiBoNho() 
    {
        return loaiBoNho;
    }

    public void SetLoaiBoNho(String loaiBoNho) 
    {
        this.loaiBoNho = loaiBoNho;
    }


}
