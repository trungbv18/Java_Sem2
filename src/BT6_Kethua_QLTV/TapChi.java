package BT6_Kethua_QLTV;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TapChi {
    private int soPhatHanh;
    private Date thangPhatHanh;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public int getSoPhatHanh() {
        return soPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
    public Date getThangPhatHanh() {
        return thangPhatHanh;
    }
    public void setThangPhatHanh(Date thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    Scanner sc =new Scanner(System.in);
    public void nhapTapChi(){
        System.out.println("Nhap so phat hanh tap chi: ");
        this.soPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập ngay phát hanh tap chi (dd/MM/yyyy): ");
        try {
            this.thangPhatHanh = (Date) sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
        }
    @Override
    public String toString() {
        return "TapChi [ soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]";
    }
        

    }

