class Pattern {
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j ++) {
				if((i == 2 || i == 3) && (j==2 || j == 3)) {
					System.out.print("  ");
				}
				else {
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
		
