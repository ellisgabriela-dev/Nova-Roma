public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        LivroProduto livro = new LivroProduto(
            "Java para Iniciantes", 59.90, "Joao Silva"
        );
        EletronicoProduto eletronico = new EletronicoProduto(
            "Mouse Gamer", 120.00, 12
        );

        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(eletronico);

        System.out.println("\nProdutos no carrinho:");
        carrinho.listarProdutos();

        System.out.printf("Total do pedido: R$ %.2f%n",
                carrinho.calcularTotalPedido());
    }
}
