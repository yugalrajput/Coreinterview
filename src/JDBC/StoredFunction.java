package JDBC;

import java.sql.*;

public class StoredFunction {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employetable", "root", "root");

        CallableStatement cs = con.prepareCall("{?=CALL salary()}");
        cs.registerOutParameter(1, Types.INTEGER);
        cs.execute();
        System.out.println(cs.getInt(1));
    }
}
