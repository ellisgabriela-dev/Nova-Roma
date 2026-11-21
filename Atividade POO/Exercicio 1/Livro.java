public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    // Construtor padrao
    public Livro() {
        this.titulo = "Titulo desconhecido";
        this.autor = "Autor desconhecido";
        this.preco = 0.0;
    }

    // Construtor intermediario
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
    }

    // Construtor completo
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.println("-------------------");
    }
}
