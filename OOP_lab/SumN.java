import java.util.*;

class SumN {
	public static void main(String  args[]) {
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
