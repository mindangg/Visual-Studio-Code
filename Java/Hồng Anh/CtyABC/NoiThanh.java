package CtyABC;

public class NoiThanh extends ChuyenXe{
    protected int soTuyen;
    protected double soKM;

    public NoiThanh() {
    }
    public NoiThanh(double doanhThu, String masSoChuyen, int soXe, String tenTaiXe, int soTuyen, double soKM) {
        super(doanhThu, masSoChuyen, soXe, tenTaiXe);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public int GetSoTuyen() {
        return soTuyen;
    }

    public void SetSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double GetSoKM() {
        return soKM;
    }

    public void SetSoKM(double soKM) {
        this.soKM = soKM;
    }

    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap so tuyen");
        SetSoTuyen(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so km di duoc");
        SetSoKM(Double.parseDouble(sc.nextLine()));
    }    

    @Override
    public String ToString() {
        return super.ToString() + String.format("%-10d %-10f", soTuyen, soKM);
    }

    
    
}
