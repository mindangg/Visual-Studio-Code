package CtyABC;

public class NgoaiThanh extends ChuyenXe {
    protected String noiDen;
    protected int soNgayDi;

    public NgoaiThanh() {
    }

    public NgoaiThanh(String noiDen, int soNgayDi, double doanhThu, String masSoChuyen, int soXe, String tenTaiXe) {
        super(doanhThu, masSoChuyen, soXe, tenTaiXe);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public String GetNoiDen() {
        return noiDen;
    }

    public void SetNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int GetSoNgayDi() {
        return soNgayDi;
    }

    public void SetSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap noi den");
        SetNoiDen(sc.nextLine());
        System.out.println("Nhap so ngay di");
        SetSoNgayDi(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String ToString() {
        return super.ToString() + String.format("%-10s %-10d", noiDen, soNgayDi);
    }
}
