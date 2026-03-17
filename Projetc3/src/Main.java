import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciar um objeto da classe Scanner
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, soma;
		
		System.out.print("Insira o 1º numero: "); numero1 = input.nextInt();
		System.out.print("Insira o 2º numero: "); numero2 = input.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.print("A soma de " + numero1 + " e " + numero2 + " é " + soma);
		
		input.close();

	}

}
