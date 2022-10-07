package acla.putra.database;

import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AutoIncrementTest 
{
  @Test
  void testAutoIncrement() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
    String sql = "INSERT INTO comments(email, comment) VALUES (?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    preparedStatement.setString(1, "acla@test.com");
    preparedStatement.setString(2, "hi");

    preparedStatement.executeUpdate();

    ResultSet resultSet = preparedStatement.getGeneratedKeys();
    if (resultSet.next()) {
      System.out.println("Id Comment : " + resultSet.getInt(1));
    }

    resultSet.close();
    preparedStatement.close();
    connection.close();

  }
}
