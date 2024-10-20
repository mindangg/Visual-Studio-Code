package SanPham;

public class GPU extends PhanCung{
    private int dungLuongVRAM;
    private String loaiVRAM;
    private int tocDoXungNhip;
    private int soNhanCUDA;
    private boolean rayTracing;

    public GPU() 
    {

    }

    public GPU(int dungLuongVRAM, String loaiVRAM, boolean rayTracing, int soNhanCUDA, int tocDoXungNhip) 
    {
        this.dungLuongVRAM = dungLuongVRAM;
        this.loaiVRAM = loaiVRAM;
        this.rayTracing = rayTracing;
        this.soNhanCUDA = soNhanCUDA;
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public GPU(int dungLuongVRAM, String loaiVRAM, boolean rayTracing, int soNhanCUDA, int tocDoXungNhip, String loaiLinhKien, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiLinhKien, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.dungLuongVRAM = dungLuongVRAM;
        this.loaiVRAM = loaiVRAM;
        this.rayTracing = rayTracing;
        this.soNhanCUDA = soNhanCUDA;
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public int GetDungLuongVRAM() 
    {
        return dungLuongVRAM;
    }

    public void SetDungLuongVRAM(int dungLuongVRAM) 
    {
        this.dungLuongVRAM = dungLuongVRAM;
    }

    public String GetLoaiVRAM() 
    {
        return loaiVRAM;
    }

    public void SetLoaiVRAM(String loaiVRAM) 
    {
        this.loaiVRAM = loaiVRAM;
    }

    public int GetTocDoXungNhip() 
    {
        return tocDoXungNhip;
    }

    public void SetTocDoXungNhip(int tocDoXungNhip) 
    {
        this.tocDoXungNhip = tocDoXungNhip;
    }

    public int GetSoNhanCUDA() 
    {
        return soNhanCUDA;
    }

    public void SetSoNhanCUDA(int soNhanCUDA) 
    {
        this.soNhanCUDA = soNhanCUDA;
    }

    public boolean IsRayTracing() 
    {
        return rayTracing;
    }

    public void SetRayTracing(boolean rayTracing) 
    {
        this.rayTracing = rayTracing;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap dung luong VRAM: ");
        SetDungLuongVRAM(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai VRAM: ");
        SetLoaiVRAM(sc.nextLine());
        System.out.println("Nhap toc do xung nhip: ");
        SetTocDoXungNhip(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so nhan CUDA: ");
        SetSoNhanCUDA(Integer.parseInt(sc.nextLine()));
        System.out.println("Co Ray Tracing khong: ");
        System.out.println(Boolean.parseBoolean(sc.nextLine()));
    }     
    
    @Override
    public void Nhap1()
    {
        super.Nhap1();
        System.out.println("Nhap dung luong VRAM: ");
        SetDungLuongVRAM(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap loai VRAM: ");
        SetLoaiVRAM(sc.nextLine());
        System.out.println("Nhap toc do xung nhip: ");
        SetTocDoXungNhip(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so nhan CUDA: ");
        SetSoNhanCUDA(Integer.parseInt(sc.nextLine()));
        System.out.println("Co Ray Tracing khong: ");
        System.out.println(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public String ToString() {
        return super.ToString() + "GPU [dungLuongVRAM=" + dungLuongVRAM + ", loaiVRAM=" + loaiVRAM + ", tocDoXungNhip=" + tocDoXungNhip
                + ", soNhanCUDA=" + soNhanCUDA + ", rayTracing=" + rayTracing + "]";
    }

    @Override
    public String ToString1() {
        return super.ToString1() + "GPU [dungLuongVRAM=" + dungLuongVRAM + ", loaiVRAM=" + loaiVRAM + ", tocDoXungNhip=" + tocDoXungNhip
                + ", soNhanCUDA=" + soNhanCUDA + ", rayTracing=" + rayTracing + "]";
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
