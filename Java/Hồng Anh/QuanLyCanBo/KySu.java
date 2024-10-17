package QuanLyCanBo;

public class KySu extends CanBo{
    protected String congViec;

    public KySu() {

    }

    public KySu(String congViec, String diaChi, String gioiTinh, String hoTen, int namSinh) {
        super(diaChi, gioiTinh, hoTen, namSinh);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "KySu [congViec=" + congViec + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh
                + ", diaChi=" + diaChi + "]";
    }

    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap bac: ");
        setCongViec(sc.nextLine());
    }

    public void Xuat() {
        System.out.println(toString());
    }

}
