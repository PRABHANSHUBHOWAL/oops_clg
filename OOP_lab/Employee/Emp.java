package Employee;
class Emp{
	String name;
	String empid;
	String category;
	double bpay, hra, da, npay, pf, grosspay, incometax, allowance;
	
	Emp(String name, String empid, String category, double bpay){
		this.name = name;
		this.empid = empid;
		this.category = category;
		this.bpay = bpay;
		this.hra = 0.0;
		this.da = 0.0;
		this.npay = 0.0;
		this.pf = 0.0;
		this.grosspay = 0.0;
		this.incometax = 0.0;
		this.allowance = 0.0;
	}
	
	public double calc_hra(){
		return bpay * 0.10;
	}
	public double calc_da(){
		return bpay * 0.15;
	}
	public double calc_npay(){
		return bpay * 0.25;
	}
	public double calc_pf(){
		return bpay * 0.11;
	}
	public double calc_grosspay(){
		return bpay * 0.08;
	}
	public double calc_incometax(){
		return 0.75 * bpay * 0.11;
	}
	public double calc_allowance(){
		return bpay * 0.10;
	}
}
	
		
