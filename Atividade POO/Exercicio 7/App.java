public class App {
    public static void verificarAcesso(Autenticavel usuario, String credencial) {
        if (usuario.autenticar(credencial)) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }

    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Cliente cliente = new Cliente();

        verificarAcesso(diretor, "DIRETOR123");
        verificarAcesso(cliente, "123456");
        verificarAcesso(cliente, "senhaerrada");
    }
}
