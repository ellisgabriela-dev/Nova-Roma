public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salario base: R$ %.2f%n", salarioBase);
    }
}
