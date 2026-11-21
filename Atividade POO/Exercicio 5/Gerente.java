public class Gerente extends Funcionario {
    private double bonusEscopo;

    public Gerente(String nome, double salarioBase, double bonusEscopo) {
        super(nome, salarioBase);
        this.bonusEscopo = bonusEscopo;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.printf("Bonus de escopo: R$ %.2f%n", bonusEscopo);
        System.out.println("Cargo: Gerente");
    }
}
