package SanPham;

public class ManHinh extends ThietBiNgoaiVi{
    private String kieuManHinh;
    private String kichThuoc;
    private int tanSoQuet;
    private String tamNen;
    private int doPhanGiai;

    public ManHinh() 
    {
    
    }

    public ManHinh(String kieuManHinh, String kichThuoc, int tanSoQuet, String tamNen, int doPhanGiai, String loaiThietBi, String phuongThucKetNoi) 
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

    public String GetKichThuoc() 
    {
        return kichThuoc;
    }

    public void SetKichThuoc(String kichThuoc) 
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

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap kieu man hinh: ");
        SetKieuManHinh(sc.nextLine());
        System.out.println("Nhap kich thuoc man hinh: ");
        SetKichThuoc(sc.nextLine());
        System.out.println("Nhap tan so quet man hinh: ");
        SetTanSoQuet(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap tam nen man hinh: ");
        SetTamNen(sc.nextLine());
        System.out.println("Nhap do phan giai man hinh: ");
        SetDoPhanGiai(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String ToString() {
        return super.ToString() + "ManHinh [kieuManHinh=" + kieuManHinh + ", kichThuoc=" + kichThuoc + ", tanSoQuet=" + tanSoQuet
                + ", tamNen=" + tamNen + ", doPhanGiai=" + doPhanGiai + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }
}
