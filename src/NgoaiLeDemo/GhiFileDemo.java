package NgoaiLeDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GhiFileDemo {

    public static void main(String[] args) {
        // //try with resource
        // try(){

        // }catch(FileNotFoundException e){
        //     e.printStackTrace();
        // }
    }

    public static void main2(String[] args) {
        String product = "dt,ip13,iphone13 promax,35000000";
        File file_dssp = new File("danhsachsanpham.txt");
        PrintWriter pw = null;
        //neu file ko ton tai ctr se tuwj tao ra 1 file rong
        try {
            //b1:tao kenh ket noi
             pw = new PrintWriter(file_dssp);
             //b2:thuc thi
             pw.write(product);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            //b3:dong ket noi
            if (pw!=null){
                pw.close();
            }
        }
    }
}
