package QlSinhVien;

import java.util.Scanner;

public class student {
    Scanner sc= new Scanner(System.in);
    protected int id;
    protected String name;
    protected byte age;
    protected String address;
    protected float gpa;
    public student() {
    }
    public student(int id, String name, byte age, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    // public void Nhaptt(){
    //     this.id = sc.nextInt();
    //     this.name = sc.nextLine();
    //     this.address = sc.nextLine();
    //     this.gpa = sc.nextFloat();
    // }
    
}
