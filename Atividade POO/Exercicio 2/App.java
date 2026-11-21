public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Maria");
        conta.setSaldo(1000.00);
        conta.depositar(500.00);
        conta.sacar(200.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
    }
}
