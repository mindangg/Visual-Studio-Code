package QuanLyCanBo;

public class NhanVien extends CanBo{
    protected String nganhDaoTao;

    public NhanVien() {

    }

    public NhanVien(String nganhDaoTao, String diaChi, String gioiTinh, String hoTen, int namSinh) {
        super(diaChi, gioiTinh, hoTen, namSinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }


    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }


    @Override
    public String toString() {
        return "NhanVien [nganhDaoTao=" + nganhDaoTao + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh="
                + gioiTinh + ", diaChi=" + diaChi + "]";
    }

    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap bac: ");
        setNganhDaoTao(sc.nextLine());
    }

    public void Xuat() {
        System.out.println(toString());
    }


    
}
