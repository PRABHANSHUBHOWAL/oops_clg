package Assignment1.Member;

public class Student{
    public String name, dept, address;
    public String uniName;
    protected int roll, age;
    public Student(String name, String dept, int roll, int age, String address, String uniName) {
        this.name = name;
        this.dept = dept;
        this.roll = roll;
        this.age = age;
        this.address = address;
        this.uniName = uniName;
    }
   
    public void display(){
        System.out.println("Student details:-");
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Roll Number: "+roll);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Affiliated University: "+uniName+"\n");
    }
}