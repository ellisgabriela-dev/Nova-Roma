public class Cliente implements Autenticavel {
    private String senha = "123456";

    @Override
    public boolean autenticar(String credencial) {
        return senha.equals(credencial);
    }
}
