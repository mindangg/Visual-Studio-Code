package SanPham;

public class RAM extends PhanCung{
    private int dungLuongRAM;
    private String loaiRAM;

    public RAM() 
    {

    }

    public RAM(int dungLuongRAM, String loaiRAM) 
    {
        this.dungLuongRAM = dungLuongRAM;
        this.loaiRAM = loaiRAM;
    }

    public RAM(int dungLuongRAM, String loaiRAM, String loaiLinhKien, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiLinhKien, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.dungLuongRAM = dungLuongRAM;
        this.loaiRAM = loaiRAM;
    }





    public int GetDungLuongRAM() 
    {
        return dungLuongRAM;
    }

    public void SetDungLuongRAM(int dungLuongRAM) 
    {
        this.dungLuongRAM = dungLuongRAM;
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
        SetDungLuongRAM(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai RAM: ");
        SetLoaiRAM(sc.nextLine());
    }            

    @Override
    public String ToString() {
        return super.ToString() + "RAM [dungLuong=" + dungLuongRAM + ", loaiRAM=" + loaiRAM + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }
}
