package SanPham;

public class Laptop extends MayTinh{
    private String kichThuocManHinh;
    private float thoiLuongPin;
    private String loaiLaptop;

    public Laptop()
    {

    }

    





    public Laptop(PhanCung[] cacLinhKien, boolean coCardRoi, String heDieuHanh, String loaiMayTinh, String model,
            String nhaSanXuat, int soLuongLinhKien, String maSP, String tenSP, float giaSP, int soLuongSP,
            String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP,
            String phuKienDiKemSP, String kichThuocManHinh, float thoiLuongPin, String loaiLaptop) {
        super(cacLinhKien, coCardRoi, heDieuHanh, loaiMayTinh, model, nhaSanXuat, soLuongLinhKien, maSP, tenSP, giaSP,
                soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.kichThuocManHinh = kichThuocManHinh;
        this.thoiLuongPin = thoiLuongPin;
        this.loaiLaptop = loaiLaptop;
    }







    public String GetKichThuocManHinh() 
    {
        return kichThuocManHinh;
    }

    public void SetKichThuocManHinh(String kichThuocManHinh) 
    {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public float GetThoiLuongPin() 
    {
        return thoiLuongPin;
    }

    public void SetThoiLuongPin(float thoiLuongPin) 
    {
        this.thoiLuongPin = thoiLuongPin;
    }

    public String GetLoaiLaptop() 
    {
        return loaiLaptop;
    }

    public void SetLoaiLaptop(String loaiLaptop)
    {
        this.loaiLaptop = loaiLaptop;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap kich thuoc man hinh laptop: ");
        SetKichThuocManHinh(sc.nextLine());
        System.out.println("Nhap thoi luong pin laptop: ");
        SetThoiLuongPin(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhap loai laptop: ");
        SetLoaiLaptop(sc.nextLine());
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "Laptop [kichThuocManHinh=" + kichThuocManHinh + ", thoiLuongPin=" + thoiLuongPin + ", loaiLaptop="
                + loaiLaptop + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }
    
}
