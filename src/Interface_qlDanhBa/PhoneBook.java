package Interface_qlDanhBa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.jar.Attributes.Name;

public class PhoneBook implements iPhone{
    ArrayList<Phone> book = new ArrayList<>();

    @Override
    public void addPhone() {
        // TODO Auto-generated method stub
        Phone phoneadd = new Phone();
        phoneadd.Nhap();
        book.add(phoneadd);
    }

    @Override
    public void removePhoneByName(String name) {
        // TODO Auto-generated method stub
        Phone phonename = null;
        int size = book.size();
        for(int i=0; i<size; i++){
            if(book.get(i).getName().equals(name)){
                phonename = book.get(i);
                break;      
        }
    }
        if (phonename != null){
            book.remove(phonename);
        }else{
            System.out.printf("%s khong dung.\n", name);
        }   
}
    

    @Override
    public void removePhoneByPhone(String phone) {
        // TODO Auto-generated method stub
        Phone phoneremove = null;
        int size= book.size();
        for (int i=0;i<size;i++){
            if(book.get(i).getPhoneNumber().equals(phone)){
                phoneremove = book.get(i);
                break;
            }
        }
        if (phoneremove != null){
            book.remove(phoneremove);
        }else{
            System.out.printf("%s khong ton tai \n",phone);
        }
        
    }

    @Override
    public void updatePhone(String name) {
        // TODO Auto-generated method stub
        boolean isExisted = false;
        int size = book.size();
        for (int i = 0; i < size; i++) {
            if (book.get(i).getName().equals(name)){
                isExisted = true;
                book.get(i).Nhap();
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("%s khong ton tai\n", name);
        }
        
    }

    @Override
    public void searchPhone(String name) {
        ArrayList<Phone>searchPhone = new ArrayList<>();
        // TODO Auto-generated method stub
        PhoneBook phonesearch = new PhoneBook();
        int size = book.size();
        int count=0;

        


        for (int i = 0; i < size; i++) {
            if (book.get(i).getName().equals(name)) {
                            count++;
                            searchPhone=book;
                        }

        for (Phone phone : searchPhone) {
            System.out.printf("Name: %s ",phone.getName());
            System.out.printf("PhoneNumber: %s \n",phone.getPhoneNumber());
            }

                    // System.out.printf("ten: %s",phone.getName());
                    // System.out.printf("sdt: %s",phone.getPhoneNumber()); 
                    // book=searchPhone;
                    // phonesearch.hienThiDs();

                // phoneremove = book.get(i);
            }
        if(count ==0){
            System.out.printf("%s khong tim thay",name);

        }
    }

        

    @Override
    public void sort() {
        // TODO Auto-generated method stub
        class sxbyname implements Comparator<Phone>{

            @Override
            public int compare(Phone o1, Phone o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        }
        Collections.sort(book,new sxbyname());
        
    }
    public void hienThiDs(){
        for (Phone phone : book) {
            System.out.printf("Name: %s ",phone.getName());
            System.out.printf("PhoneNumber: %s \n",phone.getPhoneNumber());
        }
        // Phone phone = new Phone();
        // phone.toString();
    }
}