package QuanLyChungCu;

public class LoaiC extends HoGiaDinh{
    private int soNhanKhauPhucVu;

    public LoaiC() {
    }

    public LoaiC(int soNhanKhauPhucVu, int chiSoNuocCu, int chiSoNuocMoi, String diaChi, String tenChuHo) {
        super(chiSoNuocCu, chiSoNuocMoi, diaChi, tenChuHo);
        this.soNhanKhauPhucVu = soNhanKhauPhucVu;
    }

    public int GetSoNhanKhauPhucVu() {
        return soNhanKhauPhucVu;
    }

    public void SetSoNhanKhauPhucVu(int soNhanKhauPhucVu) {
        this.soNhanKhauPhucVu = soNhanKhauPhucVu;
    }

    @Override
    public float TinhTienNuoc(){
        if(super.KhoiNuocSuDung() > soNhanKhauPhucVu * 10)
            return (float)(super.KhoiNuocSuDung() - soNhanKhauPhucVu * 10) * 8000;
        return 0;
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap so nhan khau phuc vu: ");
        SetSoNhanKhauPhucVu(Integer.parseInt(sc.nextLine()));
    }
}
