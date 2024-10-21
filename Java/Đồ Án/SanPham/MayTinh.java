package SanPham;

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

    



    public MayTinh(String maSP, String tenSP, float giaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP,
            String mauSacSP, String nhaSanXuat, String model, String loaiMayTinh, String heDieuHanh, boolean coCardRoi,
            PhanCung[] cacLinhKien) {
        super(maSP, tenSP, giaSP, khuyenMaiSP, thoiGianBaoHanhSP, trongLuongSP, mauSacSP);
        this.nhaSanXuat = nhaSanXuat;
        this.model = model;
        this.loaiMayTinh = loaiMayTinh;
        this.heDieuHanh = heDieuHanh;
        this.coCardRoi = coCardRoi;
        this.cacLinhKien = new PhanCung[5];
        this.soLuongLinhKien = 0;

    }


    

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }





    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }





    public String getModel() {
        return model;
    }





    public void setModel(String model) {
        this.model = model;
    }





    public String getLoaiMayTinh() {
        return loaiMayTinh;
    }





    public void setLoaiMayTinh(String loaiMayTinh) {
        this.loaiMayTinh = loaiMayTinh;
    }





    public String getHeDieuHanh() {
        return heDieuHanh;
    }





    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }





    public boolean isCoCardRoi() {
        return coCardRoi;
    }





    public void setCoCardRoi(boolean coCardRoi) {
        this.coCardRoi = coCardRoi;
    }





    public PhanCung[] getCacLinhKien() {
        return cacLinhKien;
    }





    public void setCacLinhKien(PhanCung[] cacLinhKien) {
        this.cacLinhKien = cacLinhKien;
    }





    public int getSoLuongLinhKien() {
        return soLuongLinhKien;
    }





    public void setSoLuongLinhKien(int soLuongLinhKien) {
        this.soLuongLinhKien = soLuongLinhKien;
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
        String xuat = "";
        for(var i:cacLinhKien)
        {
            xuat += i.toString();
        }
        return "MayTinh [nhaSanXuat=" + nhaSanXuat + ", model=" + model + ", loaiMayTinh=" + loaiMayTinh
                + ", heDieuHanh=" + heDieuHanh + ", coCardRoi=" + coCardRoi + ", cacLinhKien="
                + xuat + "]";
    }


    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }







}
