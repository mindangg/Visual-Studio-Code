package SanPham;

public class BanPhim extends ThietBiNgoaiVi {
    private float kichThuoc;
    private String denLED;
    private String switchBP;

    public BanPhim()
    {

    }

    public BanPhim(float kichThuoc, String denLED, String switchBP, String loaiThietBi, String phuongThucKetNoi) {
        super(loaiThietBi, phuongThucKetNoi);
        this.kichThuoc = kichThuoc;
        this.denLED = denLED;
        this.switchBP = switchBP;
    }

    public float GetKichThuoc() 
    {
        return kichThuoc;
    }

    public void SetKichThuoc(float kichThuoc) 
    {
        this.kichThuoc = kichThuoc;
    }

    public String GetDenLED() 
    {
        return denLED;
    }

    public void SetDenLED(String denLED) 
    {
        this.denLED = denLED;
    }

    public String GetSwitchBP() 
    {
        return switchBP;
    }

    public void SetSwitchBP(String switchBP) 
    {
        this.switchBP = switchBP;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap kich thuoc ban phim: ");
        SetKichThuoc(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap den LED ban phim: ");
        SetDenLED(sc.nextLine());
        System.out.println("Nhap switch BP ban phim: ");
        SetSwitchBP(sc.nextLine());
    }

    @Override
    public String ToString() {
        return super.ToString() + "BanPhim [kichThuoc=" + kichThuoc + ", denLED=" + denLED + ", switchBP=" + switchBP + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }
}
