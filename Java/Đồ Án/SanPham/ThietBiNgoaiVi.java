package SanPham;

public abstract class ThietBiNgoaiVi extends SanPham{
    protected String loaiThietBi;
    protected String phuongThucKetNoi;

    public ThietBiNgoaiVi()
    {

    }

    public ThietBiNgoaiVi(String loaiThietBi, String phuongThucKetNoi) 
    {
        this.loaiThietBi = loaiThietBi;
        this.phuongThucKetNoi = phuongThucKetNoi;
    }

    public String GetLoaiThietBi() 
    {
        return loaiThietBi;
    }

    public void SetLoaiThietBi(String loaiThietBi) 
    {
        this.loaiThietBi = loaiThietBi;
    }

    public String GetPhuongThucKetNoi() 
    {
        return phuongThucKetNoi;
    }

    public void SetPhuongThucKetNoi(String phuongThucKetNoi) 
    {
        this.phuongThucKetNoi = phuongThucKetNoi;
    }

    


}
