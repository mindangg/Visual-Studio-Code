package SanPham;

import java.util.Scanner;

public abstract class SanPham{      
    protected String maSP;
    protected String tenSP;
    protected float giaSP;
    protected int soLuongSP;
    protected String moTaSP;
    protected float khuyenMaiSP;
    protected int thoiGianBaoHanhSP;
    protected float trongLuongSP;
    protected String mauSacSP;
    protected String phuKienDiKemSP;
    static Scanner sc = new Scanner(System.in);

    public SanPham()
    {

    }

    public SanPham(String maSP, String tenSP, float giaSP, int soLuongSP, String moTaSP, float khuyenMaiSP, int thoiGianBaoHanhSP, float trongLuongSP, String mauSacSP, String phuKienDiKemSP) 
    {
        this.giaSP = giaSP;
        this.khuyenMaiSP = khuyenMaiSP;
        this.maSP = maSP;
        this.mauSacSP = mauSacSP;
        this.moTaSP = moTaSP;
        this.phuKienDiKemSP = phuKienDiKemSP;
        this.soLuongSP = soLuongSP;
        this.tenSP = tenSP;
        this.thoiGianBaoHanhSP = thoiGianBaoHanhSP;
        this.trongLuongSP = trongLuongSP;
    }

    public String GetMaSP() {
        return maSP;
    }

    public void SetMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String GetTenSP() {
        return tenSP;
    }

    public void SetTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float GetGiaSP() {
        return giaSP;
    }

    public void SetGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public int GetSoLuongSP() {
        return soLuongSP;
    }

    public void SetSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String GetMoTaSP() {
        return moTaSP;
    }

    public void SetMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    public float GetKhuyenMaiSP() {
        return khuyenMaiSP;
    }

    public void SetKhuyenMaiSP(float khuyenMaiSP) {
        this.khuyenMaiSP = khuyenMaiSP;
    }

    public int GetThoiGianBaoHanhSP() {
        return thoiGianBaoHanhSP;
    }

    public void SetThoiGianBaoHanhSP(int thoiGianBaoHanhSP) {
        this.thoiGianBaoHanhSP = thoiGianBaoHanhSP;
    }

    public float GetTrongLuongSP() {
        return trongLuongSP;
    }

    public void SetTrongLuongSP(float trongLuongSP) {
        this.trongLuongSP = trongLuongSP;
    }

    public String GetMauSacSP() {
        return mauSacSP;
    }

    public void SetMauSacSP(String mauSacSP) {
        this.mauSacSP = mauSacSP;
    }

    public String GetPhuKienDiKemSP() {
        return phuKienDiKemSP;
    }

    public void SetPhuKienDiKemSP(String phuKienDiKemSP) {
        this.phuKienDiKemSP = phuKienDiKemSP;
    }

    
    
}