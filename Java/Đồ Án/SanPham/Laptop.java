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

    public String getKichThuocManHinh() {
        return kichThuocManHinh;
    }

    public void setKichThuocManHinh(String kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public float getThoiLuongPin() {
        return thoiLuongPin;
    }

    public void setThoiLuongPin(float thoiLuongPin) {
        this.thoiLuongPin = thoiLuongPin;
    }

    public String getLoaiLaptop() {
        return loaiLaptop;
    }

    public void setLoaiLaptop(String loaiLaptop) {
        this.loaiLaptop = loaiLaptop;
    }

    @Override
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap kich thuoc man hinh laptop: ");
        setKichThuocManHinh(sc.nextLine());
        System.out.println("Nhap thoi luong pin laptop: ");
        setThoiLuongPin(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhap loai laptop: ");
        setLoaiLaptop(sc.nextLine());
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Laptop [kichThuocManHinh=" + kichThuocManHinh + ", thoiLuongPin=" + thoiLuongPin + ", loaiLaptop="
                + loaiLaptop + "]";
    }

    @Override
    public void xuat()
    {
        System.out.println(toString());
    }
    
}
