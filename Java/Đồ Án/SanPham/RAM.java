package SanPham;

public class RAM extends PhanCung{
    private int dungLuong;
    private String loaiRAM;

    public RAM(int dungLuong) 
    {

    }

    public RAM(int dungLuong, String loaiRAM, String loaiSP, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiSP, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.dungLuong = dungLuong;
        this.loaiRAM = loaiRAM;
    }

    public int GetDungLuong() 
    {
        return dungLuong;
    }

    public void SetDungLuong(int dungLuong) 
    {
        this.dungLuong = dungLuong;
    }

    public String GetLoaiRAM() 
    {
        return loaiRAM;
    }

    public void SetLoaiRAM(String loaiRAM) 
    {
        this.loaiRAM = loaiRAM;
    }


}
