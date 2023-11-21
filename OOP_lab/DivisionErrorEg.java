public class DivisionErrorEg{
	public static void main(String[] args){
		try{
			int x = 7/0;
			int[] arr={3,8,32,1};
			for(int i = 0; i <=arr.length; i++){
				System.out.println(arr[i]);
			}
			System.out.println(x);
			}
		catch(ArithmeticException e){
			System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No elements left in the array");
		}
		try{
			String s = "Sampoorna";
			for(int i = 0; i <=s.length(); i++){
				System.out.println(s.charAt(i));
			}
			
			
			}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("No letters left in the string");
		}
	}
}

		
