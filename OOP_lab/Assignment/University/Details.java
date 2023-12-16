// package Assignment.University;

public class Details{
	public String name;
	public String loc;
	int funds; 
	
	public Details(String name, String loc, int funds){
		this.name = name;
		this.loc = loc;
		this.funds = funds;
	}
	
	public void display(){
		System.out.println(" name is " + this.name);
		System.out.println(" location is " + this.loc);
		System.out.println(" government funds are Rs." + this.funds);
	}
}
