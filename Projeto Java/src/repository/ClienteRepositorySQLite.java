package repository;

import database.Conexao;
import model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/** Implementação do repositório de clientes usando SQLite e JDBC. */
public class ClienteRepositorySQLite implements ClienteRepositoryInterface {

    @Override
    public void salvar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes (nome, telefone, email) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) cliente.setId(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao salvar cliente: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Cliente> listar() throws SQLException {
        String sql = "SELECT * FROM clientes ORDER BY id";
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientes.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("telefone"),
                        rs.getString("email")));
            }
            return clientes;
        } catch (SQLException e) {
            throw new SQLException("Erro ao listar clientes: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean deletar(int id) throws SQLException {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir cliente: " + e.getMessage(), e);
        }
    }
}
