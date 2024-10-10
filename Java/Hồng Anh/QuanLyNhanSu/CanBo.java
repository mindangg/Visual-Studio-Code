package QuanLyNhanSu;

import java.time.LocalDate;

public class CanBo extends NhanVien{
    protected String chucVu;
    protected float heSoPhuCap;

    public CanBo(){

    }

    public CanBo(String maNV, String tenNV, int namVaoLam, float heSoLuong, int soNgayNghi){
        super(maNV, tenNV, namVaoLam, heSoLuong, soNgayNghi);
        this.chucVu = "Truong Phong";
        this.heSoPhuCap = 5;
    }


    public CanBo(String maNV, String tenNV, float heSoLuong, String chucVu, float heSoPhuCap){
        super(maNV, tenNV, heSoLuong);
        this.chucVu = chucVu;
        this.heSoPhuCap = heSoPhuCap;
        this.soNgayNghi = 1;
        this.namVaoLam = LocalDate.now().getYear();
    }

    public CanBo(String maNV, String tenNV, int namVaoLam, float heSoLuong, int soNgayNghi, String chucVu, float heSoPhuCap){
        super(maNV, tenNV, namVaoLam, heSoLuong, soNgayNghi);
        this.chucVu = chucVu;
        this.heSoPhuCap = heSoPhuCap;
    }

    public char XetThiDua()
    {
        return super.XepLoai();
    }

    public float PhuCapLanhDao()
    {
        return (float)(heSoPhuCap * luongCoBan);
    }

    public float TinhLuongCanBo()
    {
        return (float)(TinhLuong() + PhuCapLanhDao());
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + String.format("%-10s %-10f %-10f", chucVu, heSoPhuCap, TinhLuongCanBo());
    }

    public void Xuat()
    {
        System.out.println(ToString());
    }


    

}
