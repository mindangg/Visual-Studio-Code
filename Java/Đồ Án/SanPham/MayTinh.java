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

    public MayTinh(PhanCung[] cacLinhKien, boolean coCardRoi, String heDieuHanh, String loaiMayTinh, String model, String nhaSanXuat, int soLuongLinhKien, String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) {
        super(maSP, tenSP, giaSP, soLuongSP, moTaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP, phuKienDiKemSP);

        this.coCardRoi = coCardRoi;
        this.heDieuHanh = heDieuHanh;
        this.loaiMayTinh = loaiMayTinh;
        this.model = model;
        this.nhaSanXuat = nhaSanXuat;

        this.cacLinhKien = new PhanCung[5];
        this.soLuongLinhKien = 0;
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

    public void ThemPhanCung(PhanCung phanCung) 
    {
        // soLuongLinhKien = 0;
        // PhanCung[] newCacLinhKien = Arrays.copyOf(cacLinhKien, cacLinhKien.length + 1);
        // newCacLinhKien[this.cacLinhKien.length] = phanCung;
        // this.cacLinhKien = newCacLinhKien;
        // cacLinhKien[soLuongLinhKien] = phanCung;
        if(soLuongLinhKien <= cacLinhKien.length)
        {
            cacLinhKien[soLuongLinhKien] = phanCung;
            soLuongLinhKien++;
        }

        else
            System.out.println("Het cho");
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

        System.out.println("Nhap phan cung may tinh: ");

        this.cacLinhKien = new PhanCung[5];
            
        System.out.println("MainBoard: ");
        MainBoard mainBoard = new MainBoard();
        mainBoard.Nhap1();
        ThemPhanCung(mainBoard);

        System.out.println("CPU: ");
        CPU cpu = new CPU();
        cpu.Nhap1();
        ThemPhanCung(cpu);

        System.out.println("GPU: ");
        GPU gpu = new GPU();
        gpu.Nhap1();
        ThemPhanCung(gpu);

        System.out.println("RAM: ");
        RAM ram = new RAM();
        ram.Nhap1();
        ThemPhanCung(ram);
    
        System.out.println("Bo Nho: ");
        BoNho boNho = new BoNho();
        boNho.Nhap1();
        ThemPhanCung(boNho);
    }
    

    
    @Override
    public String ToString() {
        return "MayTinh [nhaSanXuat=" + nhaSanXuat + ", model=" + model + ", loaiMayTinh=" + loaiMayTinh
                + ", heDieuHanh=" + heDieuHanh + ", coCardRoi=" + coCardRoi + ", cacLinhKien="
                + Arrays.toString(cacLinhKien) + "]";
    }


    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }







}
