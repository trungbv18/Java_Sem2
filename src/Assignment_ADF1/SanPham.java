package Assignment_ADF1;

public class SanPham extends NhomHang{
    protected String maSanPham;
    protected String maVach;
    protected String tenHang;
    protected String moTa;
    protected float giaNhap;
    protected float giaBan;
    public SanPham() {
    }
    public SanPham(String maNhomHang, String maSanPham, String maVach, String tenHang, String moTa, float giaNhap,
            float giaBan) {
        this.maNhomHang = maNhomHang;
        this.maSanPham = maSanPham;
        this.maVach = maVach;
        this.tenHang = tenHang;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }
    public String getMaNhomHang() {
        return maNhomHang;
    }
    public void setMaNhomHang(String maNhomHang) {
        this.maNhomHang = maNhomHang;
    }
    public String getMaSanPham() {
        return maSanPham;
    }
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }
    public String getMaVach() {
        return maVach;
    }
    public void setMaVach(String maVach) {
        this.maVach = maVach;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public float getGiaNhap() {
        return giaNhap;
    }
    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }
    public float getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    

    
}
