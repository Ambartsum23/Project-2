package utils;

import org.junit.Assert;
import java.sql.*;
import java.util.ArrayList;

public class DataConection {

    // ("SQL ბაზასთან დაკავშირება")//
    public static Connection ConnectToSQLDatabase() {
        Connection connection = null;
        try {
            String dbUrl = "jdbc:sqlserver://sql.test.loc\\SQL2020";
            String user = "USR_Automation";
            String password = "123";
            connection = DriverManager.getConnection(dbUrl, user, password);
        } catch (SQLException e) {
            Assert.fail(e.getMessage());
        }
        return connection;
    }
    public String GetSelectResult(String SelectQuery) {
        String Result = null;
        try (Connection connection = DataConection.ConnectToSQLDatabase();
             Statement _Statement = connection.createStatement();
             ResultSet _Resultset = _Statement.executeQuery(SelectQuery);
        ) {
            _Resultset.next();
            Result = _Resultset.getString(1);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        return Result;
    }
    public ArrayList<String> GetSelectResultArray(String SelectQuery) {
        ArrayList<String> Result = new ArrayList<String>();
        try (
                Connection _Connection = DataConection.ConnectToSQLDatabase();
                Statement _Statement = _Connection.createStatement();
                ResultSet _Resultset = _Statement.executeQuery(SelectQuery);
        ) {
            while (_Resultset.next()) {
                Result.add(_Resultset.getString(1));
            }
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
        return Result;
    }
}