public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", 3000.00);
        Gerente gerente = new Gerente("Carlos", 5000.00, 1000.00);

        System.out.printf("Vencimentos do funcionario: R$ %.2f%n",
                funcionario.calcularVencimentos());
        System.out.printf("Vencimentos do gerente: R$ %.2f%n",
                gerente.calcularVencimentos());
    }
}
