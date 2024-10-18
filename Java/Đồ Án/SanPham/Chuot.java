package SanPham;

public class Chuot extends ThietBiNgoaiVi{
    private int dPI;
    private int soLanBam;
    private String denLED;
    private boolean coDay;

    public Chuot()
    {

    }

    public Chuot(int dPI, String denLED, int soLanBam, boolean coDay, String loaiThietBi, String phuongThucKetNoi) {
        super(loaiThietBi, phuongThucKetNoi);
        this.dPI = dPI;
        this.denLED = denLED;
        this.soLanBam = soLanBam;
        this.coDay = coDay;
    }

    public int GetdPI() 
    {
        return dPI;
    }

    public void SetdPI(int dPI) 
    {
        this.dPI = dPI;
    }

    public int GetSoLanBam() 
    {
        return soLanBam;
    }

    public void SetSoLanBam(int soLanBam) 
    {
        this.soLanBam = soLanBam;
    }

    public String GetDenLED() 
    {
        return denLED;
    }

    public void SetDenLED(String denLED) 
    {
        this.denLED = denLED;
    }

    public boolean IsCoDay() 
    {
        return coDay;
    }

    public void SetCoDay(boolean coDay) 
    {
        this.coDay = coDay;
    }
}
