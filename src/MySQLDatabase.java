import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/account_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
//=====================================================================================
    public static void salvarConta(conta conta) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO accounts (name, type, balance, debtor) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, conta.getNome());
            statement.setString(2, conta.getTipo());
            statement.setDouble(3, conta.getSaldo());
            statement.setString(4, conta.getDevedor());
            

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Conta salva com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao salvar conta: " + e.getMessage());
        }
    }
//=====================================================================================
    public static List<conta> carregarContas() {
        List<conta> contas = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "SELECT * FROM accounts";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                @SuppressWarnings("unused")
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("name");
                String tipo = resultSet.getString("type");
                double saldo = resultSet.getDouble("balance");
                String devedor = resultSet.getString("debtor");
                int numerodaconta = resultSet.getInt("account_number");
                conta conta = new conta(saldo, nome, tipo, devedor, numerodaconta);
                contas.add(conta);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar contas: " + e.getMessage());
        }
        return contas;
    }
    //=====================================================================================
    public static void corrigirConta(conta conta, int id) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "UPDATE accounts SET name = ?, type = ?, balance = ?, debtor = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, conta.getNome());
            statement.setString(2, conta.getTipo());
            statement.setDouble(3, conta.getSaldo());
            statement.setString(4, conta.getDevedor());
            statement.setInt(5, id);
    
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Conta corrigida com sucesso!");
            } else {
                System.out.println("Conta não encontrada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao corrigir conta: " + e.getMessage());
        }
    }
    
    
        
    
}




