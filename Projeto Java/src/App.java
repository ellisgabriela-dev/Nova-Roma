import database.Conexao;
import view.Menu;
import java.sql.SQLException;

/** Ponto de entrada do sistema. */
public class App {
    public static void main(String[] args) {
        try {
            Conexao.criarTabela();
            new Menu().iniciar();
        } catch (SQLException e) {
            System.out.println("Não foi possível criar o banco de dados: " + e.getMessage());
        }
    }
}
