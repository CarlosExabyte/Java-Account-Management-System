import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//=====================================================================================
//Teste de lógica básica para criar contas pelo terminal e enviar para um banco de dados.
// Você terá que alterar o username e o password para o programa funcionar. Além de ter que criar um banco de dados que possa receber os valores que serão enviados.
public class App {
    
    private static final String URL = "jdbc:mysql://localhost:3306/account_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
//=====================================================================================
    // Método para obter o próximo ID disponível
    private static int obterProximoID() {
        int maxID = 0;
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "SELECT MAX(id) AS max_id FROM accounts";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                maxID = resultSet.getInt("max_id");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter o próximo ID: " + e.getMessage());
        }
        return maxID + 1; 
    }
//=====================================================================================    
// Método Main
//=====================================================================================
public static void main(String[] args) throws Exception {
       List<conta> contas = MySQLDatabase.carregarContas(); 
       Scanner sc = new Scanner(System.in);
       int organizador = obterProximoID();
       while (true){
        System.out.println("============================");
       System.out.println("Oque deseja fazer");
       System.out.println("=====================");
       System.out.println("1 (Criar Uma Nova Conta) - 2 (Mostrar Todas As Contas) - 3 (Sacar) - 4 ( Depositar ) - 5 ( Corrigir ) - 6 ( Sair )");
       System.out.println("=====================");
       int alternativasmenugeral = (sc.nextInt());
       
       switch (alternativasmenugeral) {
        case 1:
            organizador++;

            System.out.println("Digite na ordem. ( Nome, Tipo, Situação Financeira)");
            System.out.print("Nome da Conta: ");
            String nome = sc.next();
            System.out.print("Tipo de Conta: ");
            String tipo = sc.next();
            System.out.print("Situação Financeira: ");
            String situacao = sc.next();
            conta conta = new conta(0.00, nome, tipo, situacao, organizador);
            System.out.println("============================");
            conta.dados(conta);
            System.out.println("============================");
            MySQLDatabase.salvarConta(conta);
            break;

        case 2:
        System.out.println(MySQLDatabase.carregarContas()); 
            
            break;
            case 3:
            System.out.println("Digite o ID da conta:");
            int idContaSaque = sc.nextInt();
            System.out.println("Digite o valor que deseja sacar:");
            double valorSaque = sc.nextDouble();
            for (conta c : contas) {
                if (c.getnumerodaconta() == idContaSaque) {
                    c.sacar(valorSaque);
                    break;
                }
            }
            break;
        
        case 4:
            System.out.println("Digite o ID da conta:");
            int idContaDeposito = sc.nextInt();
            System.out.println("Digite o valor que deseja depositar:");
            double valorDeposito = sc.nextDouble();
            for (conta c : contas) {
                if (c.getnumerodaconta() == idContaDeposito) {
                    c.adicionar(valorDeposito);
                    break;
                }
            }
            break;
        
        
        case 5:
            System.out.println("Digite o ID da conta que deseja corrigir:");
            int idContaCorrigir = sc.nextInt();
            System.out.println("Digite na ordem. ( Nome, Tipo, Saldo, Situação Financeira)");
            System.out.print("Nome da Conta: ");
            String nomeCorrigido = sc.next();
            System.out.print("Tipo de Conta: ");
            String tipoCorrigido = sc.next();
            System.out.print("Saldo da Conta: ");
            double saldoCorrigido = sc.nextDouble();
            System.out.print("Situação Financeira: ");
            String situacaoCorrigida = sc.next();
            conta contaCorrigida = new conta(saldoCorrigido, nomeCorrigido, tipoCorrigido, situacaoCorrigida, idContaCorrigir);
            MySQLDatabase.corrigirConta(contaCorrigida, idContaCorrigir);
            break;

        case 6:
        sc.close();
            System.exit(0);
            break;

        default:
            System.out.println("Opção inválida.");
    }
    
}
}
}

