public class Cliente {
    
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
