package acla.putra.database;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementTest 
{
  @Test
  void testPreparedStatement() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
    String username = "admin";
    String password = "admin";

    String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
    
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, username);
    preparedStatement.setString(2, password);

    ResultSet resultSet = preparedStatement.executeQuery();
    if (resultSet.next()) {
      // login success
      System.out.println("Login Success : " + resultSet.getString("username"));
    } else {
      // gagal login
      System.out.println("Login Failed");
    }

    preparedStatement.close();
    connection.close();
  }
}
