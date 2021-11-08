package NgoaiLeDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NgoaiLeDemo {
    public static void main(String[] args) {
        


        //bai toan doc file (file vat ly trong may tinh)
        // File file = new File("");
        //duong dan tương doi
        File file = new File("tailieu\\taitlieu.txt");
        //đối tượng file tương ứng với mot file vat ly trong may tính
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                //xu ly nghiep vu

                System.out.println(line);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try{
            //doan code co the phat sinh ngoai le
        }catch (Exception e){
            //bat doi tuong ngoai le phat sinh ở try va xu ly nó
        }
        finally{
            //cuoi cung lam gi: tong ket lai
            //
        }
    }
}
