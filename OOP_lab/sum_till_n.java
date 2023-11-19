import java.util.*;

class sum_till_n {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. ");
		int n = sc.nextInt();
		if(n < 1) {
			System.out.println("not a natural num");
			}
		int sum = n * (n+1)/2;
		System.out.println("Sum is "+ sum);
	}
}
