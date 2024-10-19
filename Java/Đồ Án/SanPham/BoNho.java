package SanPham;

public class BoNho extends PhanCung{
    private int dungLuong;
    private String loaiBoNho;

    public BoNho() 
    {

    }

    public BoNho(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP,
            int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP, String loaiSP,
            String nhaSanXuat, int dungLuong, String loaiBoNho) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP,
                phuKienDiKemSP, loaiSP, nhaSanXuat);
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

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap dung luong: ");
        SetDungLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai bo nho: ");
        SetLoaiBoNho(sc.nextLine());
    }            

    @Override
    public String ToString() 
    {
        return super.ToString() + "BoNho [dungLuong=" + dungLuong + ", loaiBoNho=" + loaiBoNho + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

}
