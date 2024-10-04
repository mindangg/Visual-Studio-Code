package QuanLyNhanVien;

import java.util.Scanner;

public class Main 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // NhanVien nv = new NhanVien();
        DSNhanVien dsnv = new DSNhanVien();

        dsnv.NhapDSNhanVien();
        dsnv.SapXepTheoNamVaoLam();
        dsnv.XuatDSNhanVien();
        // System.out.println(dsnv.TongLuongNhanVien());
        // dsnv.NhanVienLuongCaoNhat();
    }
}
