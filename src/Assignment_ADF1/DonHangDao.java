package Assignment_ADF1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonHangDao extends DonHang {
    Scanner sc = new Scanner(System.in);
    ArrayList<DonHang> listDonHang = new ArrayList<>();
    public void nhapTT(){
        System.out.println("Nhap san pham can mua\n(Chon san pham cach nhau khoang trang.Enter de xac nhan chon xong): ");
        this.muaSanPham = sc.nextLine();
        // dsSanPham.add(muaSanPham);
        System.out.println("Nhap ten khach hang: ");
        this.tenKhachHang = sc.nextLine();
        System.out.println("Ngay mua hang: (dd/MM/yyyy): ");
        try {
            this.ngayMuaHang = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        DonHang donHang = new DonHang(tenKhachHang, ngayMuaHang,muaSanPham);
        listDonHang.add(donHang);
    }

    public void hienThiThongTinDonHang(){
        for (DonHang donHang : listDonHang){
            System.out.printf("Ten khach hang: %s \n",donHang.getTenKhachHang());
            System.out.printf("Ngay mua hang: %s \n",donHang.getNgayMuaHang());
            System.out.printf("Cac san pham khach hang chon: %s \n",donHang.getMuaSanPham());
        }
    }

}
