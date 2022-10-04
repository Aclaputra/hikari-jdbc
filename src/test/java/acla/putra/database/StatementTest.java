package acla.putra.database;

import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class StatementTest
{
  @Test
  void testCreateStatement() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();

    Statement statement = connection.createStatement();

    statement.close();
    connection.close();
  }
  
  @Test
  void testExecuteUpdate() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();

    Statement statement = connection.createStatement();

    String sql = """
      INSERT INTO customers(id, name, email)
      VALUES ('acla', 'Acla', 'acla@test.com')
      """;
    int update = statement.executeUpdate(sql);
    System.out.println(update);

    statement.close();
    connection.close();
  }
}
