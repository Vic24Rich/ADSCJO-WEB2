public class ProdutoAtv1 {
    private int codigo;
    private String nome;
    private double preco;

    public ProdutoAtv1(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = 0.0;
    }

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

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }

public static void main(String[] args) {
        ProdutoAtv1 produto = new ProdutoAtv1(101, "Caderno");

        System.out.println("Dados iniciais do produto:");
        produto.imprimirDados();

        produto.setNome("Caderno Universitário");
        produto.setPreco(25.90);

        System.out.println("\nDados atualizados do produto:");
        produto.imprimirDados();
    }
}
