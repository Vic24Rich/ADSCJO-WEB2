
public class main {

	public static void main(String[] args) {
		// Instanciar um objeto da classe BankAccount
		BankAccount account1 = new BankAccount(1, "Cliente 1", 1000);
		System.out.println(account1);
		
		account1.displayDetails();
		account1.deposit(1000);
		System.out.println("Saldo atualizado: " + account1.balance);
		account1.withdraw(25);
		System.out.println("Saldo atualizado: " + account1.balance);
		
		account1.displayDetails();

		
	}

}
