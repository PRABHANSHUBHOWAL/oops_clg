public class ExceptionEgArgs{
	public static void main(String[] args){
	
	//System.out.println("A for division\nB for displaying array elements\nC for displaying string letter");
	
		try{
			int num1 = Integer.parseInt(args[1]);
			int num2 = Integer.parseInt(args[2]);
			int x = num1/num2;
			System.out.println("Quotient " + x);
			
			String s = args[3];
			for(int i = 0; i <=s.length(); i++){
				System.out.println(s.charAt(i));
			}
			}
		catch(ArithmeticException e){
			System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Two args not given");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("No letters left in the string");
		}
		
	}
}

		
