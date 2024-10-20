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





    public String GetCasePC() 
    {
        return casePC;
    }

    public void SetCasePC(String casePC) 
    {
        this.casePC = casePC;
    }

    public String GetTanNhiet() 
    {
        return tanNhiet;
    }

    public void SetTanNhiet(String tanNhiet) 
    {
        this.tanNhiet = tanNhiet;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap case PC: ");
        SetCasePC(sc.nextLine());
        System.out.println("Nhap tan nhiet: ");
        SetTanNhiet(sc.nextLine());
    }

    @Override
    public String ToString()
    {
        return super.ToString() + "Desktop [casePC=" + casePC + ", tanNhiet=" + tanNhiet + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

}
