package Member;

public class Teacher {
	public String name;
	public String dept;
	int salary;
	String degree;

	public Teacher(String name, String dept, int salary, String degree) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.degree = degree;
	}

	public void display() {
		System.out.println(" name is " + this.name);
		System.out.println(" dept is " + this.dept);
		System.out.println(" salary is " + this.salary);
		System.out.println(" degree is " + this.degree);
	}
}
