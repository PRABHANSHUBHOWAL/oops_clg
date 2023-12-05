package Employee;
public class Emppay {
	public static void main(String[] args) {
		Emp obj = new Emp("ANU", "23", "Female", 12000.0);
		System.out.println("HRA " + obj.calc_hra());
		System.out.println("DA " + obj.calc_da());
		System.out.println("NPAY: " + obj.calc_npay());
		System.out.println("PF " + obj.calc_pf());
		System.out.println("Gross pay " + obj.calc_grosspay());
		System.out.println("Income tax " + obj.calc_incometax());
		System.out.println("Allowance " + obj.calc_allowance());
	}
}
