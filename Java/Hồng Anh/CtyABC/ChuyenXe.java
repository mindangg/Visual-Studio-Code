package CtyABC;

import java.util.Scanner;

public class ChuyenXe{
    protected String maSoChuyen;
    protected String tenTaiXe;
    protected int soXe;
    protected double doanhThu;
    static Scanner sc = new Scanner(System.in);

    public ChuyenXe()
    {

    }

    public ChuyenXe(double doanhThu, String masSoChuyen, int soXe, String tenTaiXe) {
        this.doanhThu = doanhThu;
        this.maSoChuyen = masSoChuyen;
        this.soXe = soXe;
        this.tenTaiXe = tenTaiXe;
    }

    public String GetMasSoChuyen() {
        return maSoChuyen;
    }

    public String GetTenTaiXe() {
        return tenTaiXe;
    }

    public int GetSoXe() {
        return soXe;
    }

    public double GetDoanhThu() {
        return doanhThu;
    }

    public void SetMaSoChuyen(String masSoChuyen) {
        this.maSoChuyen = masSoChuyen;
    }

    public void SetTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public void SetSoXe(int soXe) {
        this.soXe = soXe;
    }

    public void SetDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String ToString() {
        return String.format("%-10s %-10s %-10d %-10f", maSoChuyen, tenTaiXe, soXe, doanhThu);
    }

    public void Nhap(){
        System.out.println("Nhap ma so chuyen: ");
        SetMaSoChuyen(sc.nextLine());
        System.out.println("Nhap ho ten tai xe");
        SetTenTaiXe(sc.nextLine());
        System.out.println("Nhap so xe");
        SetSoXe(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap doanh thu");
        SetDoanhThu(Float.parseFloat(sc.nextLine()));
    }

    public void Xuat(){
        System.out.println(ToString());
    }
}