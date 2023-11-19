class DivByZeroErr {
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			int res = num1 / num2;
			System.out.println(" The result is " + res);
		} catch (ArithmeticException e) {
			System.out.println(" Can't divide by 0 !!");
		}
	}
}
