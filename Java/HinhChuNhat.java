import java.util.Scanner;

public class HinhChuNhat
{

    public static class HinhChuNhat
    {
        int chieudai;
        int chieurong;
        Scanner sc = new Scanner(System.in);

        public HinhChuNhat()
        {

        }

        public HinhChuNhat(int chieudai, int chieurong)
        {
            this.chieudai = chieudai;
            this.chieudai = chieurong;
        }

        public void SetChieuDai(int chieudai)
        {
            while(chieudai <= 0)
            {
                System.out.println("Nhap chieu dai: ");
                chieudai = sc.nextInt();
            }
            this.chieudai = chieudai;
        }

        public void SetChieuRong(int chieurong)
        {
            while(chieurong >= this.chieudai)
            {
                System.out.println("Nhap chieu rong: ");
                chieurong = sc.nextInt();
            }
            this.chieurong = chieurong;
        }

        public int GetChieuDai()
        {
            return chieudai;
        }

        public int GetChieuRong()
        {
            return chieurong;
        }

        public int chuvi()
        {
            return (chieudai + chieurong) * 2;
        }

        public int dientich()
        {
            return chieudai * chieurong;
        }

        public String toString()
        {
            return "Chieu dai la: " + chieudai + "%nChieu rong la: " + chieurong + "%nChu vi la: " + chuvi() + "%nDien tich la: " + dientich();
        }

        public void nhap()
        {
            SetChieuDai(0);
            SetChieuRong(Integer.MAX_VALUE);
        }
    }

    public static void main(String[] args) 
    {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
    }
}
