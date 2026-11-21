public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro3 = new Livro(
            "O Pequeno Principe", "Antoine de Saint-Exupery", 39.90
        );

        livro1.exibirDados();
        livro2.exibirDados();
        livro3.exibirDados();
    }
}
