package Assignment_ADF1;

import java.util.Scanner;

public class MainQLBH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhomHangDao nhomHangDao = new NhomHangDao();
        SanPhamDao sanPhamDao = new SanPhamDao();
        DonHangDao donHangDao = new DonHangDao();
        while(true){
            int choose;
            while(true){
                System.out.println("\n1. Option of Nhom Hang");
                System.out.println("2. Option of San Pham");
                System.out.println("3. Option of Don Hang");
                System.out.println("4. Option of Bao Cao");
                System.out.print("Nhap lua chon(1-4): ");
                choose = sc.nextInt();
                if (choose >=1 && choose <=4){
                    break;
                }
            }
            switch (choose){
                //NHOM HANG
                case 1:
                    while(true){
                        System.out.println("---1.Them nhom hang moi");
                        System.out.println("---2.Hien thi danh sach nhom hang");
                        System.out.println("---3.Tim kiem");
                        System.out.print("---Nhap lua chon(1-3): ");
                        choose=sc.nextInt();
                        if (choose >=1 && choose <=3){
                            break;
                        }
                    }
                    switch (choose) {
                        case 1:
                            nhomHangDao.themNhomHang();
                            break;
                        case 2:
                            nhomHangDao.hienThiDsNhomHang();
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("Nhap vao ma nhom hang can tim kiem: ");
                            String maNhomHang = sc.nextLine();
                            nhomHangDao.timKiemNhomHang(maNhomHang);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                //SAN PHAM
                    while(true){
                        System.out.println("---1.Them san pham moi");
                        System.out.println("---2.Hien thi danh sach san pham");
                        System.out.println("---3.Tim kiem");
                        System.out.println("---4.Cap nhat thong tin san pham tu ma san pham");
                        System.out.print("---Nhap lua chon(1-4): ");
                        choose=sc.nextInt();
                        if (choose >=1 && choose <=4){
                            break;
                        }
                    }
                    switch (choose) {
                        case 1:
                            sanPhamDao.themSanPham();
                            break;
                        case 2:
                            sanPhamDao.hienThiDsSanPham();
                            break;
                //******************************CASE 3 CHƯA LÀM ĐƯỢC------
                        case 3:
                            sc.nextLine();
                            System.out.println("Nhap vao ma san pham: ");
                            String searchMsp = sc.nextLine();
                            sanPhamDao.timKiemTheoMaSanPham(searchMsp);
                            break;
                        case 4:
                            sc.nextLine();
                            System.out.println("Nhap vao ma san pham: ");
                            String maSanPham = sc.nextLine();
                            sanPhamDao.updateSanPhamTheoMa(maSanPham);
                            break;
                        default:
                            break;
                    }
                    break;

                    //DON HANG
                case 3:
                    while(true){
                        System.out.println("---1.Tao don hang moi");
                        System.out.println("---2.Hien thi danh sach don hang");
                        System.out.print("---Nhap lua chon(1-2): ");
                        choose=sc.nextInt();
                        if (choose >=1 && choose <=2){
                            break;
                        }
                    }
                    switch (choose) {
                        case 1:
                            sanPhamDao.hienThiDsTenSp();
                            donHangDao.nhapTT();
                            break;
                        case 2:
                            donHangDao.hienThiThongTinDonHang();
                    
                        default:
                            break;
                    }
                    break;
                    //BAO CAO
                case 4:
                while(true){
                    System.out.println("---1.Hien thi so luong va tong tien san pham");
                    System.out.println("---2.Top 3 san pham ban chay");
                    System.out.print("---Nhap lua chon(1-2): ");
                    choose=sc.nextInt();
                    if (choose >=1 && choose <=2){
                        break;
                    }
                }
                    switch (choose) {
                        case 1:
                            sanPhamDao.soLuongSP();
                            break;
                    
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Ban co muon tiep tuc chuong trinh khong?(1=yes or 2=No)");
            int check = sc.nextInt();
            if (check !=1 ){
                break;
            }
        }

    }
}
