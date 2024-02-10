package JDBC;

import java.sql.*;

public class Database_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employetable", "root", "root");
        PreparedStatement ps = con.prepareStatement("select * from employee");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

        }
        ps.close();
        con.close();

    }
}
