package main;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-03-07
 * @Time: 16:37
 */
public class UpdSql extends Sql{
    int id;
    int aid;
    String name;
    String aname;

    public void getValues(int id, String name,int aid, String aname) {
        this.id = id;
        this.name = name;
        this.aname = aname;
        this.aid = aid;
    }

    @Override
    public void createSql() throws SQLException {
        String sql = "update student set id = ?,name = ? where id = ? or name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        //statement.setString(1,this.table);
        statement.setInt(3,this.id);
        statement.setString(4,this.name);
        statement.setInt(1,this.aid);
        statement.setString(2,this.aname);
        this.statement = statement;
    }
    public boolean updSqlRun() throws SQLException {
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
