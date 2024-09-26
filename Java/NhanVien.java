public import java.util.Scanner;
public class NhanVien 
{
    String maNV;
    String hoTen;
    int soNgayCong;
    char xepLoai;
    int luongNgay = 200000;
    Scanner sc = new Scanner(System.in);

    public NhanVien()
    {

    }

    public void NhanVien(String maNV, String hoTen, int soNgayCong)
    {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.soNgayCong = soNgayCong;
    }

    public void SetMaNV(String maNV)
    {
        System.out.println("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        this.maNV = maNV;
    }

    public void SetHoTen(String hoTen)
    {
        System.out.println("Nhap ho ten nhan vien: ");
        hoTen = sc.nextLine();
        this.hoTen = hoTen;
    }

    public int GetMaNV()
    {
        return maNV;
    }

    public String GetHoTen()
    {
        return hoTen;
    }



    public double DiemTB()
    {
        return 1;
    }


    public void nhap()
    {

    }

    public void xuat()
    {

    }

    public float TinhLuong()
    {

    }

    public float TinhThuong()
    {

    }

 {
    
}
