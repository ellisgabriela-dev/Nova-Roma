public class Contabancaria {
    private String numeroConta;
    private Double saldo;
    public Cliente cliente;

    public Contabancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    // Metodo
    
    public void depositar(double valor) {
        if (valor == 0 || valor > saldo) {
            System.out.println("Valor inválido ou saldo insuficiente para deposito");
        }
        else {
            saldo += valor;
            System.out.println("Deposito realizado de: "+ valor);
        }

    }

    public void sacar(double valor) {
        if (valor == 0 || valor > saldo) {
            System.out.println("Valor inválido ou saldo insuficiente para saque");
        }
        else {
            saldo -= valor;
            System.out.println("Saque realizado de: "+ valor);
        }
    }

    // Metodo 

   public void exibirSaldo() {
        System.out.println("Conta: " + numeroConta + " Saldo: " + saldo);

   }
    public void exibirDados(){
        System.out.println("Conta: " + numeroConta);
        exibirSaldo();
        cliente.exibir();
    }
}