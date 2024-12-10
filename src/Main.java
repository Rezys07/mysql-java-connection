import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
    //variables
        final String url = "jdbc:mysql://localhost:3306/banco?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "mydb";

        //connection
        Connection conexao  = DriverManager.getConnection(url , user , password);


        System.out.println("conexão efetuada com sucesso!");
        conexao.close();
    }
}