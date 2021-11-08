package NgoaiLeDemo;

public class ThrowsDemo {
    //stack error : main->validateProduct
    public static void main(String[] args) {
        String product = "dt,ip13,iphone13,35000000";
        validateProduct(product);
    }

    //ddaaayr tung đối tượng ngoại lệ nếu phát sinh đi
    //throws:khai báo->khai báo hàm
    //throw : tung 1 đối tượng

    public static void validateProduct(String productStr){
        //đẩy hoặc tung ngoại lệ đi nếu phát sinh
        //b1: validate tham so
        if(productStr ==null || "".equals(productStr)){
            throw new RuntimeException("tham so dau vao rong");
            // System.out.println("tham so dau vao rong");
        }else if (productStr.indexOf(",") < 0){
            System.out.println("tham so dau vao ko dung");
        }else{
            //chuyen 1 chuoi->1 mang
            String[] ar_product = productStr.split(",");
            if (ar_product.length !=5){
                System.out.println("dau vao ko la 1 sp");
            }else{
                System.out.println("dau vao tuong ung la 1 sp");
            }
        }
    }
}
