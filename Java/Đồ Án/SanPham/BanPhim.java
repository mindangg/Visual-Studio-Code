package SanPham;

public class BanPhim extends ThietBiNgoaiVi {
    protected float kichThuoc;
    protected String denLED;
    protected String switchBP;

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
}
