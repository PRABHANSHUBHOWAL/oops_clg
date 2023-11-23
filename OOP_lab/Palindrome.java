import java.util.*;
class Palindrome {
	public static void main(String  args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. ");
		int n = sc.nextInt();
		int rev = 0;
		
		for(int i = n;  i >0; i = i/10) {
		int x = i%10;
		rev = rev * 10 + x;
		}
		
		System.out.println(rev);
		if(rev == n) {
		System.out.println("Palindrome");
		}
		else {
		System.out.println("Not palindrome");
		
		}
		}
		}
