# hikari cp jdbc
![](https://raw.githubusercontent.com/wiki/brettwooldridge/HikariCP/Hikari.png)

Learn Mysql CJ JDBC Driver for database, HikariCP for Connection Pool & JUnit Jupiter for testing purposes.

Requirements :
- OpenJDK or Amazon Corretto version 17 (minimum version 15).
- Apache maven 3.8.6 (3.6.3 tested & was not working).

execute All Test Method :
```bash
mvn test
```
execute specific Test Method :
```bash
mvn test -Dtest="StatementTest#testExecuteDelete"
```

References :
- javadoc java.sql.ResultSet => https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html
