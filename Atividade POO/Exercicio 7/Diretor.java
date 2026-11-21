public class Diretor implements Autenticavel {
    private String token = "DIRETOR123";

    @Override
    public boolean autenticar(String credencial) {
        return token.equals(credencial);
    }
}
