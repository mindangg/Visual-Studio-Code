package SanPham;

public class MainBoard extends PhanCung{
    private String boXuLy;
    private String chipSet;
    private int soKheCamRAM;

    public MainBoard()
    {

    }

    public MainBoard(String boXuLy, String chipSet, int soKheCamRAM) 
    {
        this.boXuLy = boXuLy;
        this.chipSet = chipSet;
        this.soKheCamRAM = soKheCamRAM;
    }

    public MainBoard(String boXuLy, String chipSet, int soKheCamRAM, String loaiLinhKien, String model, String nhaSanXuat, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(loaiLinhKien, model, nhaSanXuat, maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.boXuLy = boXuLy;
        this.chipSet = chipSet;
        this.soKheCamRAM = soKheCamRAM;
    }



    public String GetBoXuLy() 
    {
        return boXuLy;
    }

    public void SetBoXuLy(String boXuLy) 
    {
        this.boXuLy = boXuLy;
    }

    public String GetChipSet() 
    {
        return chipSet;
    }

    public void SetChipSet(String chipSet) 
    {
        this.chipSet = chipSet;
    }

    public int GetSoKheCamRAM() 
    {
        return soKheCamRAM;
    }

    public void SetSoKheCamRAM(int soKheCamRAM) 
    {
        this.soKheCamRAM = soKheCamRAM;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap bo xu ly: ");
        SetBoXuLy(sc.nextLine());
        System.out.println("Nhap chip set: ");
        SetChipSet(sc.nextLine());
        System.out.println("Nhap so khe cam RAM: ");
        SetSoKheCamRAM(Integer.parseInt(sc.nextLine()));
    }    

    @Override
    public void Nhap1()
    {
        super.Nhap1();
        System.out.println("Nhap bo xu ly: ");
        SetBoXuLy(sc.nextLine());
        System.out.println("Nhap chip set: ");
        SetChipSet(sc.nextLine());
        System.out.println("Nhap so khe cam RAM: ");
        SetSoKheCamRAM(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "MainBoard [boXuLy=" + boXuLy + ", chipSet=" + chipSet + ", soKheCamRAM=" + soKheCamRAM + "]";
    }

    @Override
    public String ToString1() 
    {
        return super.ToString1() + "MainBoard [boXuLy=" + boXuLy + ", chipSet=" + chipSet + ", soKheCamRAM=" + soKheCamRAM + "]";
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
