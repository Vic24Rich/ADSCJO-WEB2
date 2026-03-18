// Classe Produto
public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    // Construtor exige código e nome
    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = 0.0; // valor inicial padrão
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para imprimir os dados do produto
    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}