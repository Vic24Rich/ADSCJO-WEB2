
public class BankAccount {
	// Declaração de Atributos
	int id;
	String clientName;
	double balance;
	
	// Construtor da classe
	public BankAccount(int id, String clientName, double balance) {
		this.id = id;
		this.clientName = clientName;
		this.balance = balance;
	}
	
	// Método para efetuar saque
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
	}
	
	// Metodo para deposito
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	// Apresentação dos dados
	public void displayDetails() {
		System.out.println("Dados da Conta: ");
		System.out.println("Código: " + id);
		System.out.println("Nome do Cliente: " + clientName);
		System.out.println("Saldo: R$" + balance);
		
	}
	
	

}
