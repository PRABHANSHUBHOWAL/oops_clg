import java.util.*;
class nextPrime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.");
	int n = sc.nextInt();
	
	for(int i = n+1;; i++) {
	if(isPrime(i)){
	System.out.println(i);
	break;
	
	}
}
}
	
	
static boolean isPrime(int n) {
	for(int i = 2; i <= Math.sqrt(n); i++){
		if(n%i == 0)
		{
		return false;
		}
	}
	return true;
}
}
	

