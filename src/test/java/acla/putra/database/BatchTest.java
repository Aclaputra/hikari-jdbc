package acla.putra.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class BatchTest
{
  @Test
  void testStatement()
  {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
  }
}
