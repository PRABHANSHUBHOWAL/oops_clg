package Member;

public class Student {

	int roll, age;
	String name, dept, address;

	public Student(String name, String dept, String address, int roll, int age) {
		this.name = name;
		this.dept = dept;
		this.address = address;
		this.roll = roll;
		this.age = age;
	}

	public void display() {
		System.out.println(" name is " + this.name);
		System.out.println(" dept is " + this.dept);
		System.out.println(" address is " + this.address);
		System.out.println(" roll is " + this.roll);
		System.out.println(" age is " + this.age);
	}
}
