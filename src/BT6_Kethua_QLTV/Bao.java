package BT6_Kethua_QLTV;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bao {
    private Date ngayPhatHanh;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    
    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }
    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void nhapBao(){
        System.out.println("Nhập ngay phát hanh to bao (dd/MM/yyyy): ");
        try {
            this.ngayPhatHanh = (Date) sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @Override
    public String toString() {
        return "Bao [ngayPhatHanh=" + ngayPhatHanh + "]";
    }
    
    
}
