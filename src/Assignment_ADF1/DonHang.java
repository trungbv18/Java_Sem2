package Assignment_ADF1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DonHang {
    protected String tenKhachHang;
    protected ArrayList<String> dsSanPham = new ArrayList<>();
    protected Date ngayMuaHang;
    protected String muaSanPham;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public DonHang() {
    }
    
    public DonHang(String tenKhachHang, Date ngayMuaHang) {
        this.tenKhachHang = tenKhachHang;
        this.ngayMuaHang = ngayMuaHang;
    }
    

    public DonHang(String tenKhachHang,Date ngayMuaHang,ArrayList<String> dsSanPham) {
        this.tenKhachHang = tenKhachHang;
        this.dsSanPham = dsSanPham;
        this.ngayMuaHang = ngayMuaHang;
    }
    

    public DonHang(String tenKhachHang, Date ngayMuaHang, String muaSanPham) {
        this.tenKhachHang = tenKhachHang;
        this.ngayMuaHang = ngayMuaHang;
        this.muaSanPham = muaSanPham;
    }

    public String getMuaSanPham() {
        return muaSanPham;
    }

    public void setMuaSanPham(String muaSanPham) {
        this.muaSanPham = muaSanPham;
    }

    public DonHang(String muaSanPham) {
        this.muaSanPham = muaSanPham;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public ArrayList<String> getDsSanPham() {
        return dsSanPham;
    }
    public void setDsSanPham(ArrayList<String> dsSanPham) {
        this.dsSanPham = dsSanPham;
    }
    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }
    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }
    
}
