package SanPham;

public abstract class MayTinh extends SanPham{
    protected String nhaSanXuat;
    protected String model;
    protected String loaiSP;
    protected PhanCung phanCung;
    protected String heDieuHanh;
    protected boolean coCardRoi;

    public MayTinh()
    {

    }

    public MayTinh(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, 
                int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP, boolean coCardRoi, 
                String heDieuHanh, String loaiSP, String model, String nhaSanXuat, PhanCung phanCung) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.coCardRoi = coCardRoi;
        this.heDieuHanh = heDieuHanh;
        this.loaiSP = loaiSP;
        this.model = model;
        this.nhaSanXuat = nhaSanXuat;
        this.phanCung = phanCung;
    }

    public String GetNhaSanXuat() 
    {
        return nhaSanXuat;
    }

    public void SetNhaSanXuat(String nhaSanXuat) 
    {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String GetModel() 
    {
        return model;
    }

    public void SetModel(String model) 
    {
        this.model = model;
    }

    public String GetLoaiSP() 
    {
        return loaiSP;
    }

    public void SetLoaiSP(String loaiSP) 
    {
        this.loaiSP = loaiSP;
    }

    public PhanCung GetPhanCung() 
    {
        return phanCung;
    }

    public void SetPhanCung(PhanCung phanCung) 
    {
        this.phanCung = phanCung;
    }

    public String GetHeDieuHanh() 
    {
        return heDieuHanh;
    }

    public void SetHeDieuHanh(String heDieuHanh) 
    {
        this.heDieuHanh = heDieuHanh;
    }

    public boolean IsCoCardRoi() 
    {
        return coCardRoi;
    }

    public void SetCoCardRoi(boolean coCardRoi) 
    {
        this.coCardRoi = coCardRoi;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap nha san xuat: ");
        SetNhaSanXuat(sc.nextLine());
        System.out.println("Nhap model: ");
        SetModel(sc.nextLine());
        System.out.println("Nhap loai san pham: ");
        SetLoaiSP(sc.nextLine());
        System.out.println("Nhap phan cung may tinh: ");
        PhanCung phanCungMT = new PhanCung();
        phanCungMT.Nhap();
        SetPhanCung(phanCungMT);
        System.out.println("Nhap he dieu hanh: ");
        SetHeDieuHanh(sc.nextLine());
        System.out.println("Co card roi khong: ");
        SetCoCardRoi(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public String toString() {
        return super.ToString() + "MayTinh [nhaSanXuat=" + nhaSanXuat + ", model=" + model + ", loaiSP=" + loaiSP + ", phanCung="
                + phanCung + ", heDieuHanh=" + heDieuHanh + ", coCardRoi=" + coCardRoi + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

}
