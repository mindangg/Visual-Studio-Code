

public class QuanLyPhongTro {
    public abstract class PhongTro{
        protected int maSoPhong;
        protected int soNguoiO;
        protected int soDien;
        protected int soNuocSuDung;
    
        public PhongTro(){
            
        }
        
        public PhongTro(int maSoPhong, int soNguoiO, int soDien, int soNuocSuDung) {
            this.maSoPhong = maSoPhong;
            this.soNguoiO = soNguoiO;
            this.soDien = soDien;
            this.soNuocSuDung = soNuocSuDung;
        } 

        public abstract int tinhTienPhong();
    }

    public class LoaiA extends PhongTro{
        private int soNguoiThan;

        public LoaiA() {

        }

        public LoaiA(int maSoPhong, int soNguoiO, int soDien, int soNuocSuDung, int soNguoiThan) {
            super(maSoPhong, soNguoiO, soDien, soNuocSuDung);
            this.soNguoiThan = soNguoiThan;
        }

        @Override
        public int tinhTienPhong(){
            return (1400 + 2 * soDien + 8 * soNuocSuDung + 50 * soNguoiThan);
        }
    
    }
    
    public class LoaiB extends PhongTro{
        private int giatUi;
        private int soMay;

        public LoaiB() {

        }

        public LoaiB(int giatUi, int soMay, int maSoPhong, int soNguoiO, int soDien, int soNuocSuDung) {
            super(maSoPhong, soNguoiO, soDien, soNuocSuDung);
            this.giatUi = giatUi;
            this.soMay = soMay;
        }

        @Override
        public int tinhTienPhong(){
            return (2000 + 2 * soDien + 8 * soNuocSuDung + giatUi * 5 + soMay * 100);
        }
    }

    public static void main(String[] args) {
        QuanLyPhongTro ql = new QuanLyPhongTro();
        PhongTro loaiA = ql.new LoaiA(1, 2, 40, 20, 3);
    }
}


