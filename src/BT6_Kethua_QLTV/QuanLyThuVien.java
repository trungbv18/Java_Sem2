/*
3.	Xây dựng chương trình quản lý thư viện: QLThuVien
-	Tạo lớp tài liệu tên class TaiLieu gồm các thông tin mã tài liệu, tên tài liệu, tên nhà xuất bản, số bản phát hành và có phương thức nhập tạo 1 tài liệu
-	Tạo các lớp sách (Sach), tạp chí (TapChi), báo (Bao) kế thừa class TaiLieu, trong đó chi tiết:
+ lớp sách có thêm các thông tin tên tác giả, số trang, và có phương thức nhập 1 sách
+ tạo lớp tạp chí có thêm các thông tin số phát hành, tháng phát hành, và có phương thức nhập 1 tạp chí
+ lớp báo có thêm các thông tin ngày phát hành, và có phương thức nhập 1 báo
( sử dụng new SimpleDateFormat("dd/MM/yyyy").format( ))
-	Tạo class QuanLyThuVien để định nghĩa các phương thức nhằm cung cấp các chức năng cho hệ thống, gồm các thông tin danh sách tài liệu ( Tài liệu, sách, tạp chí, báo ) và tạo các hàm:
+ Nhập tài liệu, báo, sách, tạp chí và thêm vào danh sách tài liệu theo menu:
1: Thêm 1 tài liệu
2: Thêm 1 sách
3: thêm 1 tạp chí
4: thêm 1 báo
5: Xem danh sách
Khác (1,2,3,4,5): Thoát
+ Tạo hàm xuất (hiển thị thông tin tài liệu) từ 1 đối tượng tài liệu đầu vào
+ Xóa tài liệu, báo, sách, tạp chí khỏi danh sách tài liệu
+ Tìm danh sách đối tượng theo loại, nhập vào tên loại ( tailieu, sach, tapchi, bao ) và hiển thị kết quả tìm kiếm
+ Tìm kiếm sách từ tên sách và hiển thị thông tin

*/

package BT6_Kethua_QLTV;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLyThuVien {
    private String database [];

    public String[] getDatabase() {
        return database;
    }

    public void setDatabase(String[] database) {
        this.database = database;
    }
    public static void main(String[] args) {
        //tao du lieu cho database
        ArrayList<String> database = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choose, check;
            String search;
            System.out.println();
            System.out.println("---------------Thêm dữ liệu vào thư viện---------------");
            System.out.println("1: Thêm 1 tài liệu");
            System.out.println("2: Thêm 1 sách");
            System.out.println("3: Thêm 1 tạp chí");
            System.out.println("4: Thêm 1 báo");
            System.out.println("5: Xem danh sách");
            System.out.println("6: Xóa tài liệu");
            System.out.println("7: Tìm tài liệu");
            System.out.println("8: Tìm kiếm sách (Tên sách)");
            System.out.println("Nhập tùy chọn của bạn :");
            choose = sc.nextInt();

            switch (choose) {
                case 1 :
                    System.out.println("------------------Nhập Tài Liệu------------------");
                    // Create TaiLieu
                    // TaiLieu CreateTaiLieu = new TaiLieu();
                    TaiLieu createTaiLieu = new TaiLieu();
                    createTaiLieu.nhapTL();
                    System.out.println("Đã thêm tài liệu");
                    database.add(createTaiLieu.toString());
                    break;
                case 2: 
                    System.out.println("------------------Nhập Sách------------------");
                    Sach createSach = new Sach();
                    createSach.nhapSach();
                    System.out.println("Da them sach");
                    database.add(createSach.toString());
                    break;
                case 3:
                System.out.println("------------------Nhập Tạp Chí------------------");
                    TapChi CreateTapChi = new TapChi();
                    CreateTapChi.nhapTapChi();
                    System.out.println("Đã thêm Tạp Chí");
                    database.add(CreateTapChi.toString());
                    break;
                case 4:
                     System.out.println("------------------Nhập Báo------------------");
                     Bao CreateBao = new Bao();
                     CreateBao.nhapBao();
                     System.out.println("Đã thêm Báo");
                    database.add(CreateBao.toString());    
                    break;
                case 5:
                    //hien thi ds
                    for (int j = 0; j < database.size(); j++) {
                        System.out.println(database.get(j).toString());
                    }
                    break;
                case 6:
                    // xoa du lieu database
                    database.clear();
                    System.out.println("Xoa du lieu thanh cong!");
                    break;
                    // System.out.print("Nhap loai tai lieu (sach, bao, tap chi): ");  
                    // String type = sc.nextLine(); 
                    // if (type.equals("sach")){
                    //     for(String db : database){
                    //         if (db.toString() == "sach"){
                    //             db.toString();

                    //         }

                    //     }
                    // } 

                    //     break;
                case 7 :
                    // search database
                    System.out.println("------------------Search------------------");
                    sc.nextLine();
                    System.out.println("nhập vào ten sach/bao/tapchi/tailieu :");
                    search = sc.nextLine();

                    for (int i = 0; i < database.size(); i++) {
                        if (database.get(i).contains(search)) {
                            System.out.println(database.get(i).toString());
                        }
                        else{
                            System.out.println("Khong tim thay du lieu");
                        }
                    } 
                    break;            
        }
        System.out.println("Ban co muon tiep tuc chuong trinh khong?(1=yes or 2=No)");
        check = sc.nextInt();
        if(check != 1){
            break;
        }
    }

    }
}