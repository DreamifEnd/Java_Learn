package main;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-03-07
 * @Time: 15:59
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        Sql sql = new SelSql();
        sql.setTable("student");
        sql.setSetings("jdbc:mysql://127.0.0.1:3306/javatest?characterEncoding=utf8&useSSL=false","root","241138");
        sql.linkDataSource();

//        ((UpdSql)sql).getValues(1,"张三",2,"李四");
//        sql.createSql();
//        System.out.println(((UpdSql) sql).updSqlRun());
//        ((UpdSql)sql).close();
        ((SelSql)sql).createSql();
        ((SelSql)sql).selSqlRun();
        ((SelSql)sql).close();
    }
}
