package model;

/** Representa um cliente cadastrado no sistema. */
public class Cliente {
    private Integer id;
    private String nome;
    private String telefone;
    private String email;

    public Cliente(Integer id, String nome, String telefone, String email) {
        this.id = id;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
    }

    public String exibirDetalhes() {
        return String.format("[%d] %-25s | %-18s | %s", id, nome, telefone, email);
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do cliente é obrigatório.");
        }
        this.nome = nome;
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("O telefone do cliente é obrigatório.");
        }
        this.telefone = telefone;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email == null || email.isBlank() || !email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new IllegalArgumentException("Informe um e-mail válido.");
        }
        this.email = email;
    }
}
