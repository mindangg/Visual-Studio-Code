package SanPham;

public class CPU extends PhanCung{
    private int soNhan;
    private int soLuongLoi;
    private int tocDoXungNhip;

    public CPU() 
    {

    } 

    public CPU(int soLuongLoi, int soNhan, int tocDoXungNhip) 
    {
        this.soLuongLoi = soLuongLoi;
        this.soNhan = soNhan;
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public CPU(int soLuongLoi, int soNhan, int tocDoXungNhip, String loaiLinhKien, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiLinhKien, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.soLuongLoi = soLuongLoi;
        this.soNhan = soNhan;
        this.tocDoXungNhip = tocDoXungNhip;
    }





    public int GetSoNhan() 
    {
        return soNhan;
    }

    public void SetSoNhan(int soNhan) 
    {
        this.soNhan = soNhan;
    }

    public int GetSoLuongLoi() 
    {
        return soLuongLoi;
    }

    public void SetSoLuongLoi(int soLuongLoi) 
    {
        this.soLuongLoi = soLuongLoi;
    }

    public int GetTocDoXungNhip() 
    {
        return tocDoXungNhip;
    }

    public void SetTocDoXungNhip(int tocDoXungNhip) 
    {
        this.tocDoXungNhip = tocDoXungNhip;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap so nhan: ");
        SetSoNhan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so luong loi: ");
        SetSoLuongLoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap toc do xung nhip: ");
        SetTocDoXungNhip(Integer.parseInt(sc.nextLine()));
    }  
    
    @Override
    public void Nhap1()
    {
        super.Nhap1();
        System.out.println("Nhap so nhan: ");
        SetSoNhan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so luong loi: ");
        SetSoLuongLoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap toc do xung nhip: ");
        SetTocDoXungNhip(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "CPU [soNhan=" + soNhan + ", soLuong=" + soLuongLoi + ", tocDoXungNhip=" + tocDoXungNhip + "]";
    }

    @Override
    public String ToString1() 
    {
        return super.ToString1() + "CPU [soNhan=" + soNhan + ", soLuong=" + soLuongLoi + ", tocDoXungNhip=" + tocDoXungNhip + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

    @Override
    public void Xuat1()
    {
        System.out.println(ToString1());
    }

}
