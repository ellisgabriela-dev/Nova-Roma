public class Gerente extends Funcionario {
    private double bonusEscopo;

    public Gerente(String nome, double salarioBase, double bonusEscopo) {
        super(nome, salarioBase);
        this.bonusEscopo = bonusEscopo;
    }

    @Override
    public double calcularVencimentos() {
        return salarioBase * 1.20 + bonusEscopo;
    }
}
