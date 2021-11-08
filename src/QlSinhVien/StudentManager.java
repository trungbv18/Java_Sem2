package QlSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager{
    Scanner sc = new Scanner(System.in);
    //  List<student> studentList = new ArrayList<>();
     ArrayList<student> studentList = new ArrayList<>();
    public StudentManager() {   
    }
    //them sv vao studentlist
    public void add(){
        int id = inputId();
        sc.nextLine();
        String name = inputName();
        byte age = inputAge();
        sc.nextLine();
        String address =inputAddress();
        float gpa = inputGpa();
        // this.id =sc.nextInt();
        // this.name =sc.nextLine();
        // age=sc.nextByte();
        // address=sc.nextLine();
        // gpa=sc.nextInt();
        student student = new student(id, name, age, address, gpa);
        studentList.add(student);
    }
    //hien thi ds sv
    public void show(){
        for(student student : studentList){
            System.out.printf("ID: %d  ", student.getId());
            System.out.printf("NAME: %s  ", student.getName());
            System.out.printf("AGE: %d  ", student.getAge());
            System.out.printf("ADDRESS: %s ", student.getAddress());
            System.out.printf("GPA: %f \n", student.getGpa());
        }
    }
    //xoa sv
    public void delete(int id) {
        student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
        } else {
            System.out.printf("id = %d khong dung.\n", id);
        }
    }
    
    //sx sv theo ten
    public void SxByName(){
        Collections.sort(studentList, new SxByName());
    }

    //edit sv
    public void edit(int id) {
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExisted = true;
                sc.nextLine();
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                sc.nextLine();
                studentList.get(i).setAddress(inputAddress());
                studentList.get(i).setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d khong ton tai\n", id);
        }
    }
 
 




    private String inputAddress() {
        System.out.println("Address: ");
        return sc.nextLine();
    }
    private float inputGpa() {
        System.out.println("gpa: ");
        return sc.nextFloat();
    }
    private byte inputAge() {
        System.out.println("age: ");
        return sc.nextByte();
    }
    protected int inputId() {
        System.out.println("id: ");
        return sc.nextInt();
    }
    private String inputName() {
        System.out.println("Name: ");
        return sc.nextLine();
    }
}
