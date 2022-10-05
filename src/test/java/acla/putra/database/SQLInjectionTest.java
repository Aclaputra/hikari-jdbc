package acla.putra.database;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLInjectionTest
{
  @Test
  void testSqlInjection() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
    Statement statement = connection.createStatement();

    /**
     * example of sql injection
     * String username = "admin'; #";
     **/
    String username = "admin";
    String password = "admin";

    String sql = "SELECT * FROM admin WHERE username = '" + username + 
      "' AND PASSWORD = '" + password + "'";

    System.out.println(sql);

    ResultSet resultSet = statement.executeQuery(sql);

    if (resultSet.next())
    {
      // Success login
      System.out.println("Sukses login : " + resultSet.getString("username"));
    } 
    else 
    {
      // gagal login
      System.out.println("Gagal login");
    }

    resultSet.close();
    statement.close();
    connection.close();
  }
}
