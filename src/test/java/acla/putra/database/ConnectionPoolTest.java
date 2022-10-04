package acla.putra.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionPoolTest 
{
  @Test
  void testHikariCP()
  {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("com.mysql.cj.jdbc.Driver");
    config.setJdbcUrl("jdbc:mysql://localhost:3306/belajar_java_database");
    config.setUsername("root");
    config.setPassword("");

    config.setMaximumPoolSize(10);
    config.setMinimumIdle(5);
    config.setIdleTimeout(60_000);
    config.setMaxLifetime(10 * 60_000);

    try 
    {
      HikariDataSource dataSource = new HikariDataSource(config);
      Connection connection = dataSource.getConnection();
      connection.close();
      dataSource.close();
    }
    catch(SQLException exception)
    {
      Assertions.fail(exception);
    }
  }

  @Test
  void testUtil() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
  }
}
