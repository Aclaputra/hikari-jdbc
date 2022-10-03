pakcage acla.putra.database;

public class DriverTest
{

  @Test
  void testRegister() 
  {
    try
    {
      Driver mysqlDriver = new com.mysql.jc.jdbc.Driver();
      DriverManager.registerDriver(mysqlDriver); 
    } 
    catch (SQLException exception)
    {
      Assertions.fail(exception);
    }
}
