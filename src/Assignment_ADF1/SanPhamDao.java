package Assignment_ADF1;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPhamDao extends SanPham{
    Scanner sc =new Scanner(System.in);
    ArrayList<SanPham> listSanPham = new ArrayList<>();
    public SanPhamDao() {
    }
    public void themSanPham(){
        while(true){
            int count =0;
            char space;
            this.maNhomHang = inputMaNhomHang();
            for (int i=0 ;i<maNhomHang.length();i++){
                space = this.maNhomHang.charAt(i);
                if(Character.isSpace(space)){
                    count++;
                }
            }
            if(count ==0 && maNhomHang.length()==4){
                break;
            }
        }
        this.maSanPham = inputMaSanPham();
        // NhomHang nh = new NhomHang();
        // System.out.println(nh.getMaNhomHang()); 
        this.maVach = inputMaVach();
        this.tenHang = inputTenHang();
        this.moTa = inputMoTa();
        while(true){
            this.giaNhap = inputGiaNhap();
            if(this.giaNhap >0){
                break;
            }
        }
        while(true){
            this.giaBan = inputGiaBan();
            sc.nextLine();
            if(this.giaBan >0){
                break;
            }
        }
        SanPham sanPham = new SanPham(maNhomHang, maSanPham, maVach, tenHang, moTa, giaNhap, giaBan);
        listSanPham.add(sanPham);
        System.out.println("THEM SAN PHAM THANH CONG");
    }
  
    public void hienThiDsSanPham(){
        for (SanPham sanPham : listSanPham){
            System.out.printf("Ma nhom hang cua san pham: %s ",sanPham.getMaNhomHang());
            System.out.printf("\nMa san pham: %s",sanPham.getMaSanPham());
            System.out.printf("\nMa vach: %s",sanPham.getMaVach());
            System.out.printf("\nTen hang: %s   ",sanPham.getTenHang());
            System.out.printf("\nMo ta: %s ",sanPham.getMoTa());
            System.out.printf("\nGia nhap: %f  |  ",sanPham.getGiaNhap());
            System.out.printf("Gia ban: %f \n",sanPham.getGiaBan());
        }
    }

    public void timKiemTheoMaSanPham(String maSanPham){
        SanPham sanPham = null;
        int size = listSanPham.size();
        int i;
        for (i= 0 ; i<size; i++){
            if(listSanPham.get(i).getMaSanPham().equals(maSanPham)){
                sanPham = listSanPham.get(i);
                break;
            }
        }
        if (sanPham != null){
            // NhomHang nhomHang = new NhomHang();
                System.out.printf("---THONG TIN SAN PHAM TU MA SP= %s---\n",maSanPham);
                System.out.printf("Ma nhom hang cua san pham: %s ",sanPham.getMaNhomHang());
                System.out.printf("\nMa vach: %s",sanPham.getMaVach());
                System.out.printf("\nTen hang: %s   ",sanPham.getTenHang());
                System.out.printf("\nMo ta: %s ",sanPham.getMoTa());
                System.out.printf("\nGia nhap: %f  |  ",sanPham.getGiaNhap());
                System.out.printf("Gia ban: %f \n",sanPham.getGiaBan());
            // System.out.println("---THONG TIN SAN PHAM TU MA SAN PHAM---");
            // System.out.printf("Ma nhom hang: %s   ",nhomHang.getMaNhomHang());
            // System.out.printf("Ten nhom hang: %s   ",nhomHang.getTenNhomHang());
            // System.out.printf("VAT: %f   \n",nhomHang.getVat());
        }else{
            System.out.printf("Ma san pham %s khong tim thay\n",maSanPham);
        }
    }

    public void updateSanPhamTheoMa(String maSanPham){
        boolean isExisted = false;
        int size = listSanPham.size();
        for (int i = 0; i < size; i++) {
            if (listSanPham.get(i).getMaSanPham().equalsIgnoreCase(maSanPham)) {
                isExisted = true;
                System.out.println("---DA TIM THAY MA SAN PHAM VUA NHAP.TIEN HANH UPDATE THONG TIN SP---");
                listSanPham.get(i).setMaNhomHang(inputMaNhomHang());
                listSanPham.get(i).setMaVach(inputMaVach());
                listSanPham.get(i).setTenHang(inputTenHang());
                listSanPham.get(i).setMoTa(inputMoTa());
                listSanPham.get(i).setGiaNhap(inputGiaNhap());
                listSanPham.get(i).setGiaBan(inputGiaBan());
                System.out.println("UPDATE SAN PHAM THANH CONG");
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("Ma san pham %s khong ton tai\n", maSanPham);
        }
    }

    public void hienThiDsTenSp(){
        System.out.println("Cac san pham hien dang co:");
        int count=0;
        for (SanPham sanPham : listSanPham){
            for(int i=count; i<listSanPham.size();i++){
                System.out.printf("%d. %s\n",(i+1),sanPham.getTenHang());
                count++;
                break;
            }
        }
    }

    public void soLuongSP(){
        float total=0;
        System.out.printf("So luong san pham ban hang %d\n",listSanPham.size());
            for(int i=0; i<listSanPham.size();i++){
                total= total+listSanPham.get(i).getGiaBan();
            }
    System.out.printf("Tong tien san pham ban hang %f\n",total);

}
    private float inputGiaBan() {
        System.out.println("Nhap gia ban (>0): ");
        return sc.nextFloat();
    }
    private float inputGiaNhap() {
        System.out.println("Nhap gia nhap (>0): ");
        return sc.nextFloat();
    }
    private String inputMoTa() {
        System.out.println("Nhap mo ta: ");
        return sc.nextLine();
    }
    private String inputTenHang() {
        System.out.println("Nhap ten hang: ");
        return sc.nextLine();
    }
    private String inputMaVach() {
        System.out.println("Nhap ma vach: ");
        return sc.nextLine();
    }
    private String inputMaSanPham() {
        System.out.println("Nhap ma san pham: ");
        return sc.nextLine();
    }
    private String inputMaNhomHang() {
        System.out.println("Nhap ma nhom hang(4 ky tu lien tiep): ");
        return sc.nextLine();
    }
}
