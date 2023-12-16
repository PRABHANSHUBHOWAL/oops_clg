// package University;
// import Member.*;
public class Viewer{
	public static void main(String[] args){
		Admin ad = new Admin("ABC", 123);
		System.out.println("Admin details :");
		ad.display();
		
		Details det = new Details("makaut", "kalyani", 10000);
		System.out.println("University details");
		det.display();
		
	}
}
