import java.util.Scanner;

public class th3_sinhvien 
{
    private static class SinhVien
    {
        int maSV;
        String hoTen;
        float diemLT;
        float diemTH;
        Scanner sc = new Scanner(System.in);

        private SinhVien()
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
            maSV = Integer.parseInt(sc.nextLine());
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

        public  String toString()
        {
            return "Ma Sinh Vien la: " + maSV + "%nHo ten sinh vien la: " + hoTen + "%nDiem ly thuyet sinh vien la: " + diemLT + "%nDiem thuc hanh sinh vien la: " + diemTH + "%nDiem trung binh sinh vien la: " + DiemTB();
        }

        private void Nhap(SinhVien sv)
        {
            sv.SetMaSV(sv.maSV);
            sv.SetHoTen(sv.hoTen);
            sv.SetDiemLT(sv.diemLT);
            sv.SetDiemTH(sv.diemTH);
        }

        private void Xuat(SinhVien sv)
        {
            System.out.println(sv.maSV);
            System.out.println(sv.hoTen);
            System.out.println(sv.diemLT);
            System.out.println(sv.diemTH);
        }

        private void InDanhSach(SinhVien sv1, SinhVien sv2, SinhVien sv3)
        {
            sv1.Xuat(sv1);
            sv2.Xuat(sv2);
            sv3.Xuat(sv3);
        }
    }

    public static void main(String[] args) 
    {
        SinhVien sv1 = new SinhVien();
        sv1.SinhVien(01, "Tran Minh Dang", 10, 10);
        sv1.Xuat(sv1);

        SinhVien sv2 = new SinhVien();
        sv2.SinhVien(02, "Le Minh Hieu", 10, 10);
        sv2.Xuat(sv2);

        SinhVien sv3 = new SinhVien();
        sv3.Nhap(sv3);
        sv3.Xuat(sv3);

        SinhVien sv = new SinhVien();
        sv.InDanhSach(sv1, sv2, sv3);
    }

}
