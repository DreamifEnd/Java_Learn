package main;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-03-07
 * @Time: 15:07
 */
public class AddSql extends Sql{
    int id;
    String name;

    public void getValues(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void createSql() throws SQLException {
        String sql = "insert into student value (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //statement.setString(1,this.table);
        statement.setInt(1,this.id);
        statement.setString(2,this.name);
        this.statement = statement;
    }
    public boolean addSqlRun() throws SQLException {
        int ret = this.statement.executeUpdate();
        if (ret == 0) {
            return false;
        }
        return true;
    }
    public void close() throws SQLException {
        this.connection.close();
        this.statement.close();
    }

}
