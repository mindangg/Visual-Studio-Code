package QuanLyNhanSu;

public class Main {
    public static void main(String[] args) {
        // NhanVien nv1 = new NhanVien("1", "Tran Minh Dang", 2020, 2, 1);
        // nv1.Xuat();

        CanBo cb1 = new CanBo("2", "Pham Thao Vy", 2017, 3, 2);
        cb1.Xuat();

        CanBo cb2 = new CanBo("3", "Le Minh Hieu", 1, "Pho Giam Doc", 10);
        cb2.Xuat();

        CanBo cb3 = new CanBo("4", "Tran Thuy Dung", 2022, 3, 4, "Giam Doc", 10);
        cb3.Xuat();
    }
}
