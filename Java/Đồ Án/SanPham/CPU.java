package SanPham;

public class CPU extends PhanCung{
    private int soNhan;
    private int soLuongLoi;
    private int tocDoXungNhip;

    public CPU() 
    {

    } 







    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap so nhan: ");
        SetSoNhan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so luong loi: ");
        SetSoLuongLoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap toc do xung nhip: ");
        SetTocDoXungNhip(Integer.parseInt(sc.nextLine()));
    }  
    
    @Override
    public void Nhap1()
    {
        super.Nhap1();
        System.out.println("Nhap so nhan: ");
        SetSoNhan(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap so luong loi: ");
        SetSoLuongLoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap toc do xung nhip: ");
        SetTocDoXungNhip(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String ToString() 
    {
        return super.ToString() + "CPU [soNhan=" + soNhan + ", soLuong=" + soLuongLoi + ", tocDoXungNhip=" + tocDoXungNhip + "]";
    }

    @Override
    public String ToString1() 
    {
        return super.ToString1() + "CPU [soNhan=" + soNhan + ", soLuong=" + soLuongLoi + ", tocDoXungNhip=" + tocDoXungNhip + "]";
    }

    @Override
    public void Xuat()
    {
        System.out.println(ToString());
    }

    @Override
    public void Xuat1()
    {
        System.out.println(ToString1());
    }

}
