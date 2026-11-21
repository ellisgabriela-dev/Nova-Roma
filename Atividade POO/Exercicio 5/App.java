public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", 3000.00);
        Gerente gerente = new Gerente("Carlos", 5000.00, 1500.00);

        System.out.println("FICHA DO FUNCIONARIO");
        funcionario.imprimirFicha();

        System.out.println("-------------------");

        System.out.println("FICHA DO GERENTE");
        gerente.imprimirFicha();
    }
}
