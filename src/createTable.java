import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args)  throws SQLException {

        //the code is in the other file

        Connection conexao = fabricaDeConexao.getConexao();
        //sql code
        String sql = """
                CREATE TABLE pessoas (
                    codigo INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(80) NOT NULL
                )
                """;
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);


        System.out.println("tabela criada com sucesso");
        conexao.close();

    }
}
