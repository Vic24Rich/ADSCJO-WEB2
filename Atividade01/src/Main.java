class Main {

	public static void main(String[] args) {

		// Classe principal com método main
		// a. Instanciar produto com valores predefinidos
		Produto produto = new Produto(101, "Caderno");
		// Exibir dados iniciais
		System.out.println("Dados iniciais do produto:");
		produto.imprimirDados();

		// b. Modificar nome e preço
		produto.setNome("Caderno Universitário");
		produto.setPreco(25.90);

		// Exibir dados atualizados
		System.out.println("\nDados atualizados do produto:");
		produto.imprimirDados();
		
		
		Datas data = new Datas(14,9,2006);
		
		System.out.println("Data abaixo: ");
		data.imprimirDados();
		
		data.setDia(25);
		data.setMes(12);
		data.setAno(2022);
		
		System.out.println("Nova data abaixo: ");
		data.imprimirDados();
	}
}