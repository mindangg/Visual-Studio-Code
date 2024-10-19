package SanPham;

public class Chuot extends ThietBiNgoaiVi{
    private int dPI;
    private int soLanBam;
    private String denLED;
    private String loaiChuot;

    public Chuot()
    {

    }

    public Chuot(String loaiThietBi, String phuongThucKetNoi, int dPI, int soLanBam, String denLED, String loaiChuot) {
        super(loaiThietBi, phuongThucKetNoi);
        this.dPI = dPI;
        this.soLanBam = soLanBam;
        this.denLED = denLED;
        this.loaiChuot = loaiChuot;
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

    public String GetLoaiChuot() {
        return loaiChuot;
    }

    public void SetLoaiChuot(String loaiChuot) {
        this.loaiChuot = loaiChuot;
    }


    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap DPI chuot: ");
        SetdPI(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so lan bam chuot: ");
        SetSoLanBam(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap den LED chuot: ");
        SetDenLED(sc.nextLine());
        System.out.println("Nhap loai chuot: ");
        SetLoaiChuot(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.ToString() + "Chuot [dPI=" + dPI + ", soLanBam=" + soLanBam + ", denLED=" + denLED + ", loaiChuot=" + loaiChuot + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }
}
