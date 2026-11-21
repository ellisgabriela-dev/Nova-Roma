public class App {
    public static void main(String[] args) throws Exception {
        Contabancaria conta = new Contabancaria("12345", 0);
        Cliente cliente = new Cliente("José", "(12)345678900");


        conta.cliente = cliente; 
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.exibirSaldo();
        conta.sacar(150);

        System.out.println("================");
        conta.exibirDados();
    }
}
