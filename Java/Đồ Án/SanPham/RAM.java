package SanPham;

public class RAM extends PhanCung{
    private int dungLuong;
    private String loaiRAM;

    public RAM() 
    {

    }

    public RAM(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP,
            int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP, String loaiSP,
            String nhaSanXuat, int dungLuong, String loaiRAM) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP,
                phuKienDiKemSP, loaiSP, nhaSanXuat);
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

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap dung luong RAM: ");
        SetDungLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai RAM: ");
        SetLoaiRAM(sc.nextLine());
    }            

    @Override
    public String ToString() {
        return super.ToString() + "RAM [dungLuong=" + dungLuong + ", loaiRAM=" + loaiRAM + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }
}
