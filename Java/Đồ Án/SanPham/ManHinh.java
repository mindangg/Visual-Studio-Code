package SanPham;

public class ManHinh extends ThietBiNgoaiVi{
    private String kieuManHinh;
    private float kichThuoc;
    private int tanSoQuet;
    private String tamNen;
    private int doPhanGiai;

    public ManHinh() 
    {
    
    }

    public ManHinh(String kieuManHinh, float kichThuoc, int tanSoQuet, String tamNen, int doPhanGiai, String loaiThietBi, String phuongThucKetNoi) 
    {
        super(loaiThietBi, phuongThucKetNoi);
        this.kieuManHinh = kieuManHinh;
        this.kichThuoc = kichThuoc;
        this.tanSoQuet = tanSoQuet;
        this.tamNen = tamNen;
        this.doPhanGiai = doPhanGiai;
    }

    public String GetKieuManHinh() 
    {
        return kieuManHinh;
    }

    public void SetKieuManHinh(String kieuManHinh) 
    {
        this.kieuManHinh = kieuManHinh;
    }

    public float GetKichThuoc() 
    {
        return kichThuoc;
    }

    public void SetKichThuoc(float kichThuoc) 
    {
        this.kichThuoc = kichThuoc;
    }

    public int GetTanSoQuet() 
    {
        return tanSoQuet;
    }

    public void SetTanSoQuet(int tanSoQuet) 
    {
        this.tanSoQuet = tanSoQuet;
    }

    public String GetTamNen() 
    {
        return tamNen;
    }

    public void SetTamNen(String tamNen) 
    {
        this.tamNen = tamNen;
    }

    public int GetDoPhanGiai() 
    {
        return doPhanGiai;
    }

    public void SetDoPhanGiai(int doPhanGiai) 
    {
        this.doPhanGiai = doPhanGiai;
    }
}
