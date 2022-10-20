package acla.putra.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import org.junit.jupiter.api.Test;

public class MetaDataTest {

  @Test
  void testDatabaseMetaData() throws SQLException {
    Connection connection = ConnectionUtil.getDataSource().getConnection();
    DatabaseMetaData databaseMetaData = connection.getMetaData();

    System.out.println(databaseMetaData.getDatabaseProductName());
    System.out.println(databaseMetaData.getDatabaseProductVersion());

    ResultSet resultSet = databaseMetaData.getTables("belajar_java_database", null, null, null);
    while (resultSet.next()) {
      String tableName = resultSet.getString("TABLE_NAME");
      System.out.println("Table : " + tableName);
    }

    connection.close();
  }
}
