
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaDB {
    // atributo
    private Connection conexao;
    // construtor 
    public ConectaDB (){
        // credenciais da conexao com bd
        String url = "jdbc:mariadb://localhost:3306/Estrutura de Dados II";
        String user = "root";
        String pwd = "root";
        try {
            conexao = DriverManager.getConnection(url, user, pwd);
            System.out.println("ta na mao patrao (Y)");
        } catch (Exception e) {
            System.out.println(e.getMessage());            
        }
    }
}
