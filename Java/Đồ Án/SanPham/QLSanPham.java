package SanPham;

import java.util.Arrays;
import java.util.Scanner;

public class QLSanPham{
    private SanPham[] ds;
    static Scanner sc = new Scanner(System.in);

    public QLSanPham()
    {

    }

    public QLSanPham(SanPham[] ds) 
    {
        this.ds = ds;
    }

    public void ThemSanPham(SanPham sp)
    {
        SanPham[] newDS = Arrays.copyOf(ds, ds.length + 1);
        newDS[this.ds.length] = sp;
        this.ds = newDS;
    }

    public void NhapDanhSach()
    {

        int choiceMenu = 1;

        while(choiceMenu != 0)
        {
            System.out.println("1. Nhap danh sach san pham.");
            System.out.println("2. Xuat danh sach san pham.");
            System.out.println("3. Doc du lieu tu file.");
            System.out.println("4. Nhap du lieu vao file.");
            System.out.println("5. Sua phan tu theo ma");
            System.out.println("6. Xoa phan tu theo ma.");
            System.out.println("7. Tim kiem san pham.");
            System.out.println("0. Thoat.");
            choiceMenu = sc.nextInt();

            switch (choiceMenu) 
            {
                case 1:
                    NhapDanhSach();
                    break;

                case 2:
                    XuatDanhSach();
                    break;

                case 3:
                    DocTuFile();
                    break;

                case 4:
                    NhapVaoFile();
                    break;

                case 5:
                    SuaPhanTuTheoMa();
                    break;

                case 6:
                    XoaPhanTuTheoMa();
                    break;

                case 7:
                    TimKiem();
                    break;

                default:
                    throw new AssertionError();
            }
        }



        System.out.println("Nhap so luong san pham: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            System.out.println("Ban muon nhap loai san pham nao: ");
            System.out.println("May Tinh - Phan Cung - Thiet Bi Ngoai Vi");
            String choiceSP = sc.nextLine();
            if(choiceSP.equalsIgnoreCase("May Tinh"))
            {
                System.out.println("Ban muon nhap loai may tinh nao: ");
                System.out.println("Desktop - PhLaptop");
                String choiceMT = sc.nextLine();
                if(choiceMT.equalsIgnoreCase("Desktop"))
                {

                }

                else if(choiceMT.equalsIgnoreCase("Laptop"))
                {

                }
                else
                {
                    System.out.println("San pham khong ton tai.");
                }
            }

            else if(choiceSP.equalsIgnoreCase("Phan Cung"))
            {
                System.out.println("Ban muon nhap loai linh kien nao: ");
                System.out.println("Main Board - CPU - GPU - RAM - Bo Nho");
                String choicePC = sc.nextLine();
            }

            else if(choiceSP.equalsIgnoreCase("Thiet Bi Ngoai Vi"))
            {
                System.out.println("Ban muon nhap thiet bi nao: ");
                System.out.println("Chuot - Man Hinh - Ban Phim");
                String choiceTB = sc.nextLine();
            }

            else
            {
                System.out.println("San pham khong ton tai.");
            }
        }
    }

    public void XuatDanhSach()
    {
        for(var i:ds)
            i.Xuat();
    }

    public void DocTuFile()
    {

    }

    public void NhapVaoFile()
    {

    }

    public void SuaPhanTuTheoMa()
    {

    }

    public void XoaPhanTuTheoMa()
    {
        
    }

    public void TimKiem()
    {

    }
}
