package Assignment1.Member;

public class Teacher{
    public String name, dept, uniName;
    public int salary;
    public String degree;
    public Teacher(String name, String dept, int salary, String degree, String uniName){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.degree = degree;
        this.uniName = uniName;
    }
    
    public void display(){
        System.out.println("Teacher details:-");
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Degree: "+degree);
        System.out.println("Salary: "+salary);
        System.out.println("Affiliated University: "+uniName+"\n");
    }
}