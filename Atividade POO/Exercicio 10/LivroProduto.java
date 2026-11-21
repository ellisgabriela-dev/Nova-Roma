public class LivroProduto extends Produto {
    private String autor;

    public LivroProduto(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Autor: " + autor);
        System.out.printf("Preco: R$ %.2f%n", getPreco());
    }
}
