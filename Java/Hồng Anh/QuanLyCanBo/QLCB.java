package QuanLyCanBo;

import java.util.Arrays;
import java.util.Scanner;

public class QLCB{
    private CanBo ds[];
    static Scanner sc = new Scanner(System.in);

    public QLCB(){

    }

    public QLCB(CanBo[] ds){
        this.ds = ds;
    }

    public void ThemCanBo(CanBo cb){
        CanBo[] newDs = Arrays.copyOf(ds, ds.length + 1);
        newDs[this.ds.length] = cb;
        this.ds = newDs;
    }

    public void TimKiemHoTen(String ten){
        for(var i:ds){
            if(i.getHoTen().equalsIgnoreCase(ten)){
                i.Xuat();
                break;
            }     
        }
    }

    public void DemSoCanBoNu(){
        int dem = 0;
        for(var i:ds)
            if(i.getHoTen().equalsIgnoreCase("Nu"))
                dem++;
        System.out.println("So can bo nu la: " + dem);
    }

    public void XuatDanhSach(){
        if(this.ds.length == 0){
            System.out.println("Danh sach rong");
            return;
        }
        for(var i:ds)
            i.Xuat();
    }



    public void menu() {
        int luachon = 1;

        while(luachon != 0) {
            System.out.println("1. Nhap thong tin moi cho can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Dem so can bo la nu");
            System.out.println("4. Hien thi thong tin ve danh sach cac can bo");
            System.out.println("0. Thoat");

            System.out.println("Nhap lua chon: ");
            luachon = Integer.parseInt(sc.nextLine());

            switch(luachon){
                case 1:
                    System.out.println("a.Them cong nhan.");
                    System.out.println("b.Them ky su.");
                    System.out.println("c.Them nhan vien.");
                    System.out.println("Nhap lua chon: ");
                    String lc = sc.nextLine();
                    switch (lc) {
                        case "a":
                            CongNhan x = new CongNhan();
                            x.Nhap();
                            ThemCanBo(x);
                            break;
                        case "b":
                            NhanVien y = new NhanVien();
                            y.Nhap();
                            ThemCanBo(y);
                            break;
                        case "c":
                            KySu z = new KySu();
                            z.Nhap();
                            ThemCanBo(z);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    System.out.println("Nhap ten nguoi muon tim: ");
                    TimKiemHoTen(sc.nextLine());
                    break;
                case 3:
                    DemSoCanBoNu();
                    break;
                case 4:
                    XuatDanhSach();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Chao tam biet");
    }

}
