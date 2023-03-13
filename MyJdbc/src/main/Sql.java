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
 * @Time: 15:28
 */
public abstract class Sql {
    String table;
    DataSource dataSource;
    Connection connection;
    PreparedStatement statement;

    public void setTable(String table) {
        this.table = table;
    }

    public void setSetings(String url,String user,String pass) {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(user);
        ((MysqlDataSource)dataSource).setPassword(pass);
        this.dataSource = dataSource;
    }

    public void linkDataSource() throws SQLException {
        Connection connection = this.dataSource.getConnection();
        this.connection = connection;
    }

    public abstract void createSql() throws SQLException;
}
