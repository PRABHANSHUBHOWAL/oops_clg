public class Shipment extends BoxWeight{
	static double cost;
	
	
	Shipment(int weight, int a, int b, int c, double cost){
		super(a, b, c, weight);
		this.cost = cost;
	}
	
	 int volume(){
		return super.a * super.b * super.c;
	}
	
	 int weight(){
		return super.weight;
	}
	
	
	public static void main(String[] args){
		Shipment obj = new Shipment(100, 20, 30, 22, 12000);
		
		
		
		System.out.println("All dimensions are different");
		System.out.println("Volume is " + obj.volume());
		
		
		System.out.println("weight is " + obj.weight());
		System.out.println("cost is " + obj.cost);
		
		Shipment obj1 = new Shipment(100, 20, 20, 20, 12000);
		
		
		
		System.out.println("All dimensions are same");
		System.out.println("Volume is " + obj1.volume());
		
		
		System.out.println("weight is " + obj1.weight());
		System.out.println("cost is " + obj1.cost);
		
		
		
	}
}

		
