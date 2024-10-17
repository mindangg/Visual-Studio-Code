package QuanLyCanBo;

import com.sun.jdi.IntegerType;
import java.time.LocalDate;
import java.util.Scanner;

public class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    static Scanner sc = new Scanner(System.in);

    public CanBo() {

    }

    public CanBo(String diaChi, String gioiTinh, String hoTen, int namSinh) {
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        while(LocalDate.now().getYear() - namSinh < 18){
            System.out.println("Can bo chua du tuoi");
            System.out.println("Vui long nhap lai");
            namSinh = Integer.parseInt(sc.nextLine());
        }
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        while(!gioiTinh.equalsIgnoreCase("Nam") && (!gioiTinh.equalsIgnoreCase("Nu"))){
            System.out.println("Can bo khong phai con nguoi");
            System.out.println("Vui long nhap lai");
            gioiTinh = sc.nextLine();
        }   
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CanBo [hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
    }

    public void Nhap() {
        System.out.println("Nhap ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap nam sinh: ");
        setNamSinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap gioi tinh: ");
        setGioiTinh(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
    }

    public void Xuat() {
        System.out.println(toString());
    }

    






}
