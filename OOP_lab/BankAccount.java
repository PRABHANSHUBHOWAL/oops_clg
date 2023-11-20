class BankAccount {
	String DepositorName;
	long acc_no;
	String acc_type;
	double initial_balance;
	
	BankAccount(String name, long num, String type) {
		DepositorName=name;
		acc_no=num;
		acc_type=type;
		initial_balance=0.0;
	}
	
	void assign_inamnt(double amount) {
		initial_balance = amount;
		System.out.println("Initial amount Rs " + initial_balance);
	}
	
	void deposit(double amount) {
		initial_balance += amount;
		System.out.println("Deposited Rs" + amount);
		System.out.println("Current balance Rs" + initial_balance);
	}
	
	void withdraw(double amount) {
		if(amount > initial_balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			initial_balance -= amount;
			System.out.println("Withdrew Rs" + amount);
			System.out.println("Current balance Rs" + initial_balance);
	}
	}
	
	void display() {
		System.out.println("Account name " + DepositorName);
		System.out.println("Current balance  Rs" + initial_balance);
	}
	
	
	public static void main(String[] args) {
		BankAccount obj = new BankAccount("Sam", 12345, "Something");
		
		obj.assign_inamnt(1000.0);
		obj.deposit(2000.0);
		obj.withdraw(5000.0);
		
		obj.display();
	}
}
