package Interface_qlDanhBa;

import java.util.Scanner;

public class QldbMain {
    public static void showMenu() {
        
        System.out.println("\n-----------menu------------");
        System.out.println("1.Thêm 1 Phone vào danh sách");
        System.out.println("2.Hiển thị danh sách danh bạ");
        System.out.println("3.Cập nhật danh bạ theo tên ( người dùng nhập tên và sđt để cập nhật)");
        System.out.println("4.Xóa phone theo tên ( tên nhập từ bàn phím ), nếu không tồn tại phone tìm kiếm theo tên thì hiển thị không tồn tại.");
        System.out.println("5.Xóa phone theo sđt ( stđ nhập từ bàn phím ), nếu không tồn tại phone tìm kiếm theo tên thì hiển thị không tồn tại.");
        System.out.println("6.Tìm kiếm theo tên ( nhập tên từ bàn phím và hiển thị các Phone thỏa mãn trùng tên không phân biệt hoa thường ).");
        System.out.println("7.Sắp xếp danh sách theo tên");
        System.out.println("8.Exit");
        System.out.print("Please choose: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phonebBook = new PhoneBook();
        while(true){
            showMenu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                phonebBook.addPhone();
                break;
                case 2:
                phonebBook.hienThiDs();
                break;
                case 3:
                System.out.println("nhap vao ten can sua: ");
                sc.nextLine();
                String nameedit = sc.nextLine();
                phonebBook.updatePhone(nameedit);
                break;
                case 4:
                System.out.println("nhap vao ten can xoa: ");
                sc.nextLine();
                String namedelete = sc.nextLine();
                phonebBook.removePhoneByName(namedelete);
                break;
                case 5:
                sc.nextLine();
                System.out.println("Nhap vao sdt: ");
                String phone = sc.nextLine();
                phonebBook.removePhoneByPhone(phone);
                break;  
                case 6:
                sc.nextLine();
                System.out.println("Nhap ten: ");
                String name = sc.nextLine();
                phonebBook.searchPhone(name);
                break;
                case 7:
                sc.nextLine();
                phonebBook.sort();
                System.out.println("sx thanh cong!");



                default:
                    break;
            }
            if(choose !=8){
                System.out.println("Ban co muon tiep tuc chuong trinh khong?(1=yes or 2=No)");
                int check = sc.nextInt();
                if(check != 1){
                    break;
                }
            }
            else if(choose==8){
                break;
            }
          
        }
    
        
    }
    
}
