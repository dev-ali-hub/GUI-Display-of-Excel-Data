package handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHandler
{
    private static Connection connection;

    public static void createConnection(){
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Aviation;user=sa;password=sql");
            System.out.println("Connection Made = "+connection);
        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }

    }

    public static Connection getConnection()
    {
        return connection;
    }
}
