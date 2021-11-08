package BT6_Kethua_QLTV;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tacGia;
    private int soTrang;
    Scanner sc = new Scanner(System.in);
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getSoTrang() {
        return soTrang;
    }
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    public Sach (){
        super();
    }
    public Sach(String tacGia, int soTrang) {
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public void nhapSach(){
        System.out.println("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.println("Nhap so trang sach: ");
        this.soTrang = sc.nextInt();
    }
    @Override
    public String toString() {
        return "Sach [soTrang=" + soTrang + ", tacGia=" + tacGia + "]";
    }
    

    
}
