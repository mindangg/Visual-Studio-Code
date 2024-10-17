package QuanLyChungCu;

import java.util.Arrays;
import java.util.Scanner;

public class DSHoGiaDinh{
    private HoGiaDinh[] ds = new HoGiaDinh[0];
    Scanner sc = new Scanner(System.in);

    public DSHoGiaDinh() {
    }

    public DSHoGiaDinh(HoGiaDinh[] ds) {
        this.ds = ds;
    }

    public void ThemHoGiaDinh(HoGiaDinh gd){
        HoGiaDinh[] newDs = Arrays.copyOf(ds, ds.length + 1);
        newDs[this.ds.length] = gd;
        this.ds = newDs;
    }

    public void XuatThongTin(HoGiaDinh[] ds){
        for(var i:ds)
            i.Xuat();
    }

    public HoGiaDinh ThanhToanCaoNhat(){
        HoGiaDinh max = ds[0];
        for(var i:ds)
            if(i.TinhTienNuoc() > max.TinhTienNuoc())
                max = i;
        return max;
    }

    public void SapXepTangDanDS(){
        int n = ds.length;
        for(int i = 0; i < n - 1; i++)
            for(int j = i + 1; j < n; j++)
                if(ds[i].TinhTienNuoc() > ds[j].TinhTienNuoc())
                    return;
    }

    public float TinhTienNuocCanHoLoaiC(){
        int tong = 0;
        for(var i:ds)
            if(i instanceof LoaiC)
                tong += i.TinhTienNuoc();
        return tong;
    }

    public void menu(){
        int luachon = 1;
        while(luachon != 0){
            System.out.println("1. Nhap danh sach cac ho gia dinh: ");
            System.out.println("2. Xem thong tin cac ho gia dinh: ");
            System.out.println("3. Xuat thong tin cac ho gia dinh co so tien can thanh toan cao nhat: ");
            System.out.println("4. Sap xep danh sach theo thu tu tang dan cua so tien can thanh toan: ");
            System.out.println("5. Tinh tong tien nuoc cac can ho loai C: ");
            System.out.println("0. Thoat");

            System.out.println("Nhap lua chon: ");
            luachon = Integer.parseInt(sc.nextLine());

            switch (luachon) {
                case 1:
                    System.out.println("Nhap so ho gia dinh muon nhap: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i = 0; i < n; i++){
                        System.out.println("a. Nhap danh sach cac ho gia dinh loai A: ");
                        System.out.println("b. Nhap danh sach cac ho gia dinh loai B: ");
                        System.out.println("c. Nhap danh sach cac ho gia dinh loai C: ");
                        String lc = sc.nextLine();
                        switch (lc) {
                            case "a":
                                LoaiA x = new LoaiA();
                                x.Nhap();
                                ThemHoGiaDinh(x);
                                break;
                            case "b":
                                LoaiB y = new LoaiB();
                                y.Nhap();
                                ThemHoGiaDinh(y);
                                break;
                            case "c":
                                LoaiC z = new LoaiC();
                                z.Nhap();
                                ThemHoGiaDinh(z);
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    break;
                case 2:
                    XuatThongTin(this.ds);
                    break;
                case 3:
                    ThanhToanCaoNhat().Xuat();
                    break;
                case 4:
                    SapXepTangDanDS();
                    break;
                case 5:
                    System.out.println("Tong tien nuoc cua cac can ho loai C la: " + TinhTienNuocCanHoLoaiC());
                    break;
                case 0:
                    System.out.println("Chao tam biet: ");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }


}