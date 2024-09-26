import java.util.Scanner;
public class SinhVien 
{
    int maSV;
    String hoTen;
    float diemLT;
    float diemTH;
    Scanner sc = new Scanner(System.in);

    private  SinhVien()
    {

    }

    private void SinhVien(int maSV, String hoTen, float diemLT, float diemTH)
    {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    private void SetMaSV(int maSV)
    {
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
        this.maSV = maSV;
    }

    private void SetHoTen(String hoTen)
    {
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        this.hoTen = hoTen;
    }

    private void SetDiemLT(float diemLT)
    {
        System.out.println("Nhap diem ly thuyet sinh vien: ");
        diemLT = sc.nextFloat();
        this.diemLT = diemLT;
    }

    private void SetDiemTH(float diemTH)
    {
        System.out.println("Nhap diem thuc hanh sinh vien: ");
        diemTH = sc.nextFloat();
        this.diemTH = diemTH;
    }

    private int GetMaSV()
    {
        return maSV;
    }

    private String GetHoTen()
    {
        return hoTen;
    }

    private float GetDiemLT()
    {
        return diemLT;
    }

    private float GetDiemTH()
    {
        return diemTH;
    }

    private double DiemTB()
    {
        return (diemLT + diemTH) / 2;
    }

    private String toString()
    {
        return "Ma Sinh Vien la: " + maSV + "%nHo ten sinh vien la: " + hoTen + "%nDiem ly thuyet sinh vien la: " + diemLT + "%nDiem thuc hanh sinh vien la: " + diemTH + "%nDiem trung binh sinh vien la: " + DiemTB();
    }

    private void nhap()
    {

    }

}
