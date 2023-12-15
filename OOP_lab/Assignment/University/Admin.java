// package University;
// package University;
import Member.Teacher;
import Member.Student;
public class Admin{
	public String name;
	private int id;
	
	public Admin(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public void display(){
		System.out.println(" name is " + name);
		System.out.println(" id is " + id);
	}
	public static void main(String[] args){
		Teacher teach = new Teacher("Ram", "CSE", 100000, "Phd");
		System.out.println("Teacher details");
		teach.display();
		
		Student stu = new Student("Sam", "CSE", "Kolkata", 12, 19);
		System.out.println("Student details");
		stu.display();
	}
}
