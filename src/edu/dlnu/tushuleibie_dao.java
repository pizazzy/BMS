package edu.dlnu;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class tushuleibie_dao {

    public List<tushuleibie> getALLtuhuleibie(){
        List<tushuleibie> list= new ArrayList<>();
        Connection connection=null;
        PreparedStatement st = null;
        ResultSet resultSet = null;
        try {
          connection= JdbcUtils.getConnection();
            st = connection.prepareStatement("select*from tushuleibie");
            resultSet =st.executeQuery();

            while (resultSet.next()){

                tushuleibie tushuleibie = new tushuleibie();
                tushuleibie.set序号(resultSet.getInt("序号"));
                tushuleibie.set图书类别(resultSet.getString("图书类别"));
                tushuleibie.set录入时间(resultSet.getTimestamp("录入时间"));
                tushuleibie.set删除(resultSet.getString("删除"));
                list.add(tushuleibie);

            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtils.release(connection,st,resultSet);
        }
        return list;


    }
}
