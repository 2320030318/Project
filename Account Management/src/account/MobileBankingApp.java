package account;

public class MobileBankingApp {

	public static void main(String[] args) {
		
		        Account account = new Account("123456789", 1000.0);
		        System.out.println("Initial Balance: " + account.getBalance());

		        account.deposit(500.0);
		        System.out.println("Balance after deposit: " + account.getBalance());

		        boolean success = account.withdraw(200.0);
		        System.out.println("Withdrawal successful: " + success);
		        System.out.println("Balance after withdrawal: " + account.getBalance());

		        String hashedPassword = Security.hashPassword("mySecurePassword");
		        System.out.println("Hashed Password: " + hashedPassword);
		    }
		

		// TODO Auto-generated method stub

	}


