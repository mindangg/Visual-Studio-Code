package QuanLyChungCu;

public class LoaiA extends HoGiaDinh{
    private int soNhanKhau;

    public LoaiA(){
    }

    public LoaiA(int soNhanKhau, int chiSoNuocCu, int chiSoNuocMoi, String diaChi, String tenChuHo) {
        super(chiSoNuocCu, chiSoNuocMoi, diaChi, tenChuHo);
        this.soNhanKhau = soNhanKhau;
    }

    public int GetSoNhanKhau() {
        return soNhanKhau;
    }

    public void SetSoNhanKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
    }

    @Override
    public float TinhTienNuoc(){
        if(super.KhoiNuocSuDung() > 5)
            return (float)(super.KhoiNuocSuDung() - 5 * soNhanKhau) * 8000;
        return 0;
    }

    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap so nhan khau: ");
        SetSoNhanKhau(Integer.parseInt(sc.nextLine()));
    }
}
