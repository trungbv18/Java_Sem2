package BT6_Kethua_QLTV;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String tenTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;
    Scanner sc = new Scanner(System.in);
    public String getMaTaiLieu() {
        return maTaiLieu;
    }
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
    public String getTenTaiLieu() {
        return tenTaiLieu;
    }
    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }
    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }
    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }
    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public TaiLieu() {
    }
    public TaiLieu(String maTaiLieu, String tenTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public void nhapTL(){
        System.out.println("Nhập Mã tài liệu :");
        this.maTaiLieu = sc.nextLine();
        System.out.println("Nhập tên tài liệu :");
        this.tenTaiLieu = sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản :");
        this.tenNhaXuatBan = sc.nextLine();
        System.out.println("Nhập số bản phát hành");
        this.soBanPhatHanh = sc.nextInt();
 
    }
    @Override
    public String toString() {
        return "TaiLieu [maTaiLieu=" + maTaiLieu + ", soBanPhatHanh=" + soBanPhatHanh + ", tenNhaXuatBan="
                + tenNhaXuatBan + ", tenTaiLieu=" + tenTaiLieu + "]";
    }
    
    

}
