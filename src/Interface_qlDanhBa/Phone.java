package Interface_qlDanhBa;

import java.util.Scanner;

public class Phone implements iThaoTac {
    protected String name;
    protected String phoneNumber;
    Scanner sc = new Scanner(System.in);

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void Nhap() {
        // TODO Auto-generated method stub
        System.out.println("nhap ten: ");
        this.name = sc.nextLine();
        // while(true){
            System.out.println("nhap so dien thoai: ");
            this.phoneNumber=sc.nextLine();
            // String sdt= sc.nextLine();
        //     if (sdt.length() != 10){
        //         System.out.println("sdt phair 10 so");
        //     }else if(!sdt.startsWith("0")){
        //         System.out.println("sdt bat dau bang 0");
        //     }else{
        //         phoneNumber =sdt;
        //     }
        //     if (this.phoneNumber !=null){
        //         break;
        //     }
        // }

        
        
    }

    @Override
    public void Xuat() {
        // TODO Auto-generated method stub        
    }
}
