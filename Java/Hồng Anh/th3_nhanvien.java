import java.util.Scanner;
public class th3_nhanvien 
{
    public class NhanVien
    {
        String maNV;
        String hoTen;
        int soNgayCong;
        char xepLoai;
        static int luongNgay = 200000;
        Scanner sc = new Scanner(System.in);

        public NhanVien()
        {

        }

        public void NhanVien(String maNV, String hoTen, int soNgayCong)
        {
            this.maNV = maNV;
            this.hoTen = hoTen;
            this.soNgayCong = soNgayCong;
            if(soNgayCong > 26)
                this.xepLoai = 'A';
            else if(soNgayCong >= 22 && soNgayCong <= 26)
                this.xepLoai = 'B';
           else if(soNgayCong < 22)
                this.xepLoai = 'C';
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

        public void SetSoNgayCong(int soNgayCong)
        {
            System.out.println("Nhap so ngay cong nhan vien: ");
            soNgayCong = sc.nextInt();
            this.soNgayCong = soNgayCong;
        }

        public void SetXepLoai()
        {
            if(soNgayCong > 26)
                this.xepLoai = 'A';
            else if(soNgayCong >= 22 && soNgayCong <= 26)
                this.xepLoai = 'B';
           else if(soNgayCong < 22)
                this.xepLoai = 'C';
        }

        public String GetMaNV()
        {
            return maNV;
        }

        public String GetHoTen()
        {
            return hoTen;
        }

        public int GetSoNgayCong()
        {
            return soNgayCong;
        }

        public char GetXepLoai()
        {
            return xepLoai;
        }

        public void Nhap(NhanVien nv)
        {
            SetMaNV(nv.maNV);
            SetHoTen(nv.hoTen);
            SetSoNgayCong(nv.soNgayCong);
            SetXepLoai();
        }

        public void Xuat(NhanVien nv)
        {
            System.out.println(nv.maNV);
            System.out.println(nv.hoTen);
            System.out.println(nv.soNgayCong);
            System.out.println(nv.xepLoai);
        }

        public float TinhLuong()
        {
            return soNgayCong * luongNgay;
        }

        public float TinhThuong()
        {
            if(xepLoai == 'A')
                return TinhThuong() * 0.05f;
            else if(xepLoai == 'B')
                return TinhThuong() * 0.02f;
            else
                return 0;
        }
    }

    public static void main(String[] args) 
    {
        
    }
}
