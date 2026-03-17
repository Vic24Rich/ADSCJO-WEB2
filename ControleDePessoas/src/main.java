import java.util.Scanner;

public class main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static peopleManeger maneger = new peopleManeger();

	
	public static int menu() {
		System.out.println("========================================================================================================");
		System.out.println("================================== Sistema de Controle de Pessoas ======================================");
		System.out.println("========================================================================================================");
		System.out.println("========================================== Menu de Opções ==============================================");
		System.out.println("========================================================================================================");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar pelo CPF");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Remover");
		System.out.println("5 - Sair");
		System.out.println("========================================================================================================");
		System.out.println("Escolha uma opção: ");
		return scanner.nextInt();
	}
	
	public static void register() {
		System.out.print("Digite o nome: ");
		String name = scanner.nextLine();
		System.out.print("Digite o CPF: ");
		String cpf = scanner.nextLine();
		
		Person person = new Person(name, cpf);
		
		if (maneger.save(person)) {
			System.out.println("Pessoa cadastrada com sucesso!");
			System.out.println(maneger.getpeopleList());
		} else {
			System.out.println("Erro ao cadastrar a pessoa");
		}
	}
	
	private static void search() {
		System.out.print("Digite o CPF: ");
		String cpf = scanner.nextLine();
		Person person = maneger.search(cpf);
		if (person != null) {
			System.out.println("Pessoa econtrada. Dados: ");
			System.out.println(person);
		} else {
			System.out.println("Pessoa não encontrada. Tente novamente.");
		}
	}
	
	private static void update() {
		System.out.print("Digite o CPF: ");
		String cpf = scanner.nextLine();
		System.out.print("Digite o nome: ");
		String name = scanner.nextLine();
		if (maneger.update(cpf, name)) {
			System.out.println("Dados atualizados!");
		} else {
			System.out.println("Erro ao atualizar Dados!");
		}
		
	}
	
	private static void remove() {
		System.out.print("Digite o CPF: ");
		String cpf = scanner.nextLine();
		if (maneger.remove(cpf)) {
			System.out.println("Dados atualizados!");
		} else {
			System.out.println("Erro ao atualizar Dados!");
		}
	}


	public static void main(String[] args) {
		
		int opcao;
		do {
			opcao = menu();
			scanner.nextLine();
			switch (opcao) {
			case 1: {
				register();
				break;
			}
			case 2: {
				search();
				break;
			}
			case 3: {
				update();
				break;
			}
			case 4: {
				remove();
				break;
			}
			default:
				System.out.println("Opção inválida: Tente novamente");
			}
			System.out.println("Tecle ENTER para continuar...");
			scanner.nextLine();
		} while (opcao != 5);
	}
}
