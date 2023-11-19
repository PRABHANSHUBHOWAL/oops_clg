public class StringError {
	public static void main(String[] args) {
		try {
			String s = "Prabhanshu";
			for (int i = 0; i <= s.length(); i++) {
				System.out.println(s.charAt(i));
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("No letters left in the string");
		}
	}
}
