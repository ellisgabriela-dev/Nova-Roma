package repository;

import java.sql.SQLException;
import java.util.List;
import model.Produto;


public interface ProdutoRepositoryInterface {

    void salvar(Produto produto) throws SQLException;

    List<Produto> listar() throws SQLException;

    /** Retorna true se excluiu, false se o id não existia. */
    boolean deletar(int id) throws SQLException;
}
