package SanPham;

import java.util.Arrays;

public abstract class MayTinh extends SanPham{
    protected String nhaSanXuat;
    protected String model;
    protected String loaiMayTinh;
    protected String heDieuHanh;
    protected boolean coCardRoi;
    protected PhanCung[] cacLinhKien;
    protected int soLuongLinhKien;

    public MayTinh()
    {

    }

    public MayTinh(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, 
                int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP, String nhaSanXuat,
                String model, String loaiMayTinh , String heDieuHanh, boolean coCardRoi, int soLuongLinhKien) 
    {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);
        this.coCardRoi = coCardRoi;
        this.heDieuHanh = heDieuHanh;
        this.loaiMayTinh = loaiMayTinh;
        this.model = model;
        this.nhaSanXuat = nhaSanXuat;
        this.cacLinhKien = new PhanCung[soLuongLinhKien];
        this.soLuongLinhKien = soLuongLinhKien;
    }

    public String GetNhaSanXuat() 
    {
        return nhaSanXuat;
    }

    public void SetNhaSanXuat(String nhaSanXuat) 
    {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String GetModel() 
    {
        return model;
    }

    public void SetModel(String model) 
    {
        this.model = model;
    }

    public String GetLoaiMayTinh() 
    {
        return loaiMayTinh;
    }

    public void SetLoaiMayTinh(String loaiMayTinh) 
    {
        this.loaiMayTinh = loaiMayTinh;
    }

    public String GetHeDieuHanh() 
    {
        return heDieuHanh;
    }

    public void SetHeDieuHanh(String heDieuHanh) 
    {
        this.heDieuHanh = heDieuHanh;
    }

    public boolean IsCoCardRoi() 
    {
        return coCardRoi;
    }

    public void SetCoCardRoi(boolean coCardRoi) 
    {
        this.coCardRoi = coCardRoi;
    }

    public int GetSoLuongLinhKien() 
    {
        return soLuongLinhKien;
    }

    public void SetSoLuongLinhKien(int soLuongLinhKien) 
    {
        this.soLuongLinhKien = soLuongLinhKien;
    }

    public void ThemPhanCung(PhanCung phanCung) 
    {
        PhanCung[] newCacLinhKien = Arrays.copyOf(cacLinhKien, cacLinhKien.length + 1);
        newCacLinhKien[this.cacLinhKien.length] = phanCung;
        this.cacLinhKien = newCacLinhKien;
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap nha san xuat: ");
        SetNhaSanXuat(sc.nextLine());
        System.out.println("Nhap model san pham: ");
        SetModel(sc.nextLine());
        System.out.println("Nhap loai may tinh: ");
        SetLoaiMayTinh(sc.nextLine());
        System.out.println("Nhap he dieu hanh: ");
        SetHeDieuHanh(sc.nextLine());
        System.out.println("Co card roi khong: ");
        SetCoCardRoi(Boolean.parseBoolean(sc.nextLine()));

        System.out.println("Nhap so luong linh kien: ");
        SetSoLuongLinhKien(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhap phan cung may tinh: ");

        for(int i = 0; i < soLuongLinhKien; i++) 
        {
            System.out.println("Nhap loai linh kien: ");
            String loaiLinhKien = sc.nextLine();

            if(loaiLinhKien.equalsIgnoreCase("MainBoard")) 
            {
                MainBoard mainBoard = new MainBoard();
                mainBoard.Nhap();
                ThemPhanCung(mainBoard);
            }

            else if(loaiLinhKien.equalsIgnoreCase("CPU")) 
            {
                CPU cpu = new CPU();
                cpu.Nhap();
                ThemPhanCung(cpu);
            }

            else if(loaiLinhKien.equalsIgnoreCase("GPU")) 
            {
                GPU gpu = new GPU();
                gpu.Nhap();
                ThemPhanCung(gpu);
            }


            else if(loaiLinhKien.equalsIgnoreCase("RAM")) 
            {

                RAM ram = new RAM();
                ram.Nhap();
                ThemPhanCung(ram);
            }

            else
            {
                BoNho boNho = new BoNho();
                boNho.Nhap();
                ThemPhanCung(boNho);
            }

        }
    }

    // @Override
    // public String toString() {
    //     return super.ToString() + "MayTinh [nhaSanXuat=" + nhaSanXuat + ", model=" + model + ", loaiSP=" + loaiSP + ", phanCung="
    //             + phanCung + ", heDieuHanh=" + heDieuHanh + ", coCardRoi=" + coCardRoi + "]";
    // }



    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }



}
