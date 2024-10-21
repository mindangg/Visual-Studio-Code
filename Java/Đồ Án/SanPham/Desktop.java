package SanPham;

public class Desktop extends MayTinh{
    private String casePC;
    private String tanNhiet;

    public Desktop() 
    {

    }

    public Desktop(PhanCung[] cacLinhKien, boolean coCardRoi, String heDieuHanh, String loaiMayTinh, String model,
            String nhaSanXuat, int soLuongLinhKien, String maSP, String tenSP, float giaSP, int soLuongSP,
            String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP,
            String phuKienDiKemSP, String casePC, String tanNhiet) {
        super(cacLinhKien, coCardRoi, heDieuHanh, loaiMayTinh, model, nhaSanXuat, soLuongLinhKien, maSP, tenSP, giaSP,
                soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.casePC = casePC;
        this.tanNhiet = tanNhiet;
    }

    public String getCasePC() {
        return casePC;
    }

    public void setCasePC(String casePC) {
        this.casePC = casePC;
    }

    public String getTanNhiet() {
        return tanNhiet;
    }

    public void setTanNhiet(String tanNhiet) {
        this.tanNhiet = tanNhiet;
    }

    @Override
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap case PC: ");
        setCasePC(sc.nextLine());
        System.out.println("Nhap tan nhiet: ");
        setTanNhiet(sc.nextLine());
    }

    @Override
    public String toString()
    {
        return super.toString() + "Desktop [casePC=" + casePC + ", tanNhiet=" + tanNhiet + "]";
    }

    @Override
    public void xuat()
    {
        System.out.println(toString());
    }

}
