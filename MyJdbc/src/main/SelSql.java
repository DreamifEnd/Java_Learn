package main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-03-07
 * @Time: 16:48
 */
public class SelSql extends Sql{
    ResultSet resultSet;
    @Override
    public void createSql() throws SQLException {
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        //statement.setString(1,this.table);
        this.statement = statement;
    }
    public void selSqlRun() throws SQLException {
        this.resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("id = " + id + ", name = " + name);
        }
    }
    public void close() throws SQLException {
        resultSet.close();
        this.connection.close();
        this.statement.close();
    }
}
