package QlSinhVien;

import java.util.Scanner;

public class Manager {
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while(true){
            showMenu();
            int choose = sc.nextInt();
            int studentID;
            switch (choose) {
                //them sv
                case 1:
                    studentManager.add();
                    System.out.println("them thanh cong");
                    break;
                //show sv
                case 2:
                studentManager.show();
                break;
                //xoa sv
                case 3:
                // studentID = studentManager.inputId();
                int studentID2= sc.nextInt();
                studentManager.delete(studentID2);
                // sx by name
                case 4:
                studentManager.SxByName();
                break;
                case 5:
                studentID = studentManager.inputId();
                studentManager.edit(studentID);
                default:
                    break;

            }
        System.out.println("Ban co muon tiep tuc chuong trinh khong?(1=yes or 2=No)");
        int check = sc.nextInt();
        if(check != 1){
            break;
        }
        }
       
    }
  
    
}
