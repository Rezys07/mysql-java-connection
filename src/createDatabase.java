import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createDatabase {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "mydb";

        Connection conexao = DriverManager.getConnection(url , user , password);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS jdbc_learn");
        System.out.println("banco criado com sucesso");

        conexao.close();

    }
}
