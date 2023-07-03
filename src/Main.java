import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        Check();
    }
    private static void Check()
    {
        SQLServerDataSource ds=new SQLServerDataSource();
        ds.setUser("sa");

        ds.setPassword("12345");
        ds.setServerName("DESKTOP-EQP5377\\TEXTDB");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Quan_ly_khach_san");
        ds.setEncrypt(false);

        try(Connection conn=ds.getConnection()){
            System.out.println("Connection success!");
            System.out.println(conn.getMetaData());
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

   
}