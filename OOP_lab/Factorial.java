import java.util.*;
class Factorial {
	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. ");
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Can't find factorial");
			}
		if(n == 0) {
			System.out.println(1);
			}
			
		int fact=1;
		for(int i = 2; i <=n; i++) {
		fact *= i;
		}
		System.out.println("Factorial is "+ fact);
		}
		}
