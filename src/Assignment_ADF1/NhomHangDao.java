package Assignment_ADF1;

import java.util.ArrayList;
import java.util.Scanner;

public class NhomHangDao extends NhomHang {
    Scanner sc =new Scanner(System.in);
    ArrayList<NhomHang> listNhomHang = new ArrayList<>();
    public NhomHangDao() {
    }
    public void themNhomHang(){
        while(true){
            int count =0;
            char space;
            System.out.println("Nhap ma nhom hang(4 ky tu lien tiep): ");
            this.maNhomHang = sc.nextLine();
            for (int i=0 ;i<maNhomHang.length();i++){
                space = this.maNhomHang.charAt(i);
                if(Character.isSpace(space)){
                    count++;
                }
            }
            for (NhomHang nhomHang : listNhomHang){
                if (nhomHang.getMaNhomHang().equalsIgnoreCase(this.maNhomHang)){
                    System.out.printf("Ma nhom hang %s da co trong danh sach\n",this.maNhomHang);
                    count =2;
                }
            }
            if(count ==0 && maNhomHang.length()==4){
                break;
            }
        }
        System.out.println("Nhap ten nhom hang: ");
        this.tenNhomHang = sc.nextLine();
        while(true){
            System.out.println("Nhap Vat (Vat >0 va Vat <1): ");
            this.vat = sc.nextFloat();
            sc.nextLine();
            if(this.vat > 0 && this.vat <1){
                break;
            }
        }
        NhomHang nhomHang = new NhomHang(maNhomHang, tenNhomHang, vat);
        listNhomHang.add(nhomHang);
        System.out.println("THEM NHOM HANG THANH CONG");
    }
    public void hienThiDsNhomHang(){
        for (NhomHang nhomHang : listNhomHang){
            System.out.printf("Ma nhom hang: %s   ",nhomHang.getMaNhomHang());
            System.out.printf("Ten nhom hang: %s   ",nhomHang.getTenNhomHang());
            System.out.printf("VAT: %f   \n",nhomHang.getVat());
        }
}
    public void timKiemNhomHang(String maNhomHang){
        NhomHang nhomHang = null;
        int size = listNhomHang.size();
        for (int i= 0 ; i<size; i++){
            if(listNhomHang.get(i).getMaNhomHang().equals(maNhomHang)){
                nhomHang = listNhomHang.get(i);
                break;
            }
        }
        if (nhomHang != null){
            System.out.println("---THONG TIN MA NHOM HANG---");
            System.out.printf("Ma nhom hang: %s   ",nhomHang.getMaNhomHang());
            System.out.printf("Ten nhom hang: %s   ",nhomHang.getTenNhomHang());
            System.out.printf("VAT: %f   \n",nhomHang.getVat());
        }else{
            System.out.printf("Ma nhom hang %s khong tim thay\n",maNhomHang);
        }
        
    }
    
}
