package Assignment_ADF1;

public class NhomHang {
    protected String maNhomHang;
    protected String tenNhomHang;
    protected float vat;
    public NhomHang() {
    }
    public NhomHang(String maNhomHang, String tenNhomHang, float vat) {
        this.maNhomHang = maNhomHang;
        this.tenNhomHang = tenNhomHang;
        this.vat = vat;
    }
    public String getMaNhomHang() {
        return maNhomHang;
    }
    public void setMaNhomHang(String maNhomHang) {
        this.maNhomHang = maNhomHang;
    }
    public String getTenNhomHang() {
        return tenNhomHang;
    }
    public void setTenNhomHang(String tenNhomHang) {
        this.tenNhomHang = tenNhomHang;
    }
    public float getVat() {
        return vat;
    }
    public void setVat(float vat) {
        this.vat = vat;
    }
    
   
}
