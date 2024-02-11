package JDBC;

import java.sql.*;

public class StoredProcedureIn {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employetable", "root", "root");
        CallableStatement cs = con.prepareCall("{ call countemployeein(?) }");
        cs.setInt(1, 1);

        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        System.out.println("hlo");
    }
}
