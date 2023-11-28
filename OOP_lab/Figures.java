public class Figures{
	public static void main(String[] args){
		Triangle tri = new Triangle(10, 20, 30);
		System.out.println("perimeter of Triangle is " + tri.perimeter());
		
		Rect rec = new Rect(10, 20);
		System.out.println("perimeter of rectangle is " + rec.perimeter());
		
		Square sq = new Square(10);
		System.out.println("perimeter of sqaure is " + sq.perimeter());
		
	}
}
