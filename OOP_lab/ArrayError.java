public class ArrayError{
	public static void main(String[] args){
		
		try{
			int[] arr={3,8,32,1};
			for(int i = 0; i <=arr.length; i++){
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No elements left in the array");
		}
	}
}
