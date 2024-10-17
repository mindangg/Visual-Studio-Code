package QuanLyChungCu;

import java.util.Scanner;

public class HoGiaDinh {
    protected String tenChuHo;
    protected String diaChi;
    protected int chiSoNuocCu;
    protected int chiSoNuocMoi;
    static Scanner sc = new Scanner(System.in);

    public HoGiaDinh(){

    }

    public HoGiaDinh(int chiSoNuocCu, int chiSoNuocMoi, String diaChi, String tenChuHo) {
        this.chiSoNuocCu = chiSoNuocCu;
        this.chiSoNuocMoi = chiSoNuocMoi;
        this.diaChi = diaChi;
        this.tenChuHo = tenChuHo;
    }

    public String GetTenChuHo() {
        return tenChuHo;
    }

    public void SetTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String GetDiaChi() {
        return diaChi;
    }

    public void SetDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int GetChiSoNuocCu() {
        return chiSoNuocCu;
    }

    public void SetChiSoNuocCu(int chiSoNuocCu) {
        this.chiSoNuocCu = chiSoNuocCu;
    }

    public int GetChiSoNuocMoi() {
        return chiSoNuocMoi;
    }

    public void SetChiSoNuocMoi(int chiSoNuocMoi) {
        this.chiSoNuocMoi = chiSoNuocMoi;
    }

    public int KhoiNuocSuDung(){
        return chiSoNuocMoi - chiSoNuocCu;
    }

    public int SoNuocPhaiTra(){
        return 0;
    }


    public float TinhTienNuoc(){
        return (float)SoNuocPhaiTra() * 8000;
    }

    public void Nhap(){
        System.out.println("Nhap ten chu ho: ");
        SetTenChuHo(sc.nextLine());
        System.out.println("Nhap dia chi ho: ");
        SetDiaChi(sc.nextLine());
        System.out.println("Nhap chi so nuoc cu: ");
        SetChiSoNuocCu(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap chi so nuoc moi: ");
        SetChiSoNuocMoi(Integer.parseInt(sc.nextLine()));
    }

    public String ToString() {
        return "HoGiaDinh [tenChuHo=" + tenChuHo + ", diaChi=" + diaChi + ", chiSoNuocCu=" + chiSoNuocCu
                + ", chiSoNuocMoi=" + chiSoNuocMoi + "]";
    }

    public void Xuat(){
        System.out.println(ToString());
    }

}
