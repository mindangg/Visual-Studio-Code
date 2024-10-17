package QuanLyChungCu;

public class LoaiB extends HoGiaDinh{
    @Override
    public float TinhTienNuoc(){
        if(super.KhoiNuocSuDung() > 20)
            return (float)(super.KhoiNuocSuDung() - 20) * 8000;
        return 0;
    }

}
