package run;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-03-05
 * @Time: 22:56
 */
public class SqlTest {
    public static void main(String[] args) throws SQLException {
        sqlAdd();
        sqlSelect();

    }
    public static void sqlAdd() throws SQLException {
        //创建并初始化数据集
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/javatest?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("241138");

        //数据交互
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        //建立链接
        Connection connection = dataSource.getConnection();

        //构造SQL
        String sql = "insert into student value(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        statement.setString(2,name);

        //执行SQL
        int ret = statement.executeUpdate();
        System.out.println(ret);

        //释放资源
        connection.close();
        statement.close();
    }
    public static void sqlSelect() throws SQLException {
        //创建并初始化数据集
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/javatest?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("241138");

        //建立链接
        Connection connection = dataSource.getConnection();

        //构造SQL
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);

        //执行SQL
        ResultSet resultSet = statement.executeQuery();

        //遍历
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int id = resultSet.getInt("id");
            System.out.println("id = " + id +"name = " + name);
        }

        //释放资源
        connection.close();
        statement.close();
        resultSet.close();
    }
}
