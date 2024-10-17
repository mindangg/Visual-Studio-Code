package QuanLyCanBo;

public class CongNhan extends CanBo{
    protected String bacCN;

    public CongNhan() {

    }

    public CongNhan(String bacCN, String diaChi, String gioiTinh, String hoTen, int namSinh) {
        super(diaChi, gioiTinh, hoTen, namSinh);
        this.bacCN = bacCN;
    }

    public String getBacCN() {
        return bacCN;
    }

    public void setBacCN(String bacCN) {
        this.bacCN = bacCN;
    }

    @Override
    public String toString() {
        return "CongNhan [bacCN=" + bacCN + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh
                + ", diaChi=" + diaChi + "]";
    }

    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap bac: ");
        setBacCN(sc.nextLine());
    }

    public void Xuat() {
        System.out.println(toString());
    }

    



}
