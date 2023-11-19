public class DivError {
	public static void main(String[] args) {
		try {
			int x = 7 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
	}
}
