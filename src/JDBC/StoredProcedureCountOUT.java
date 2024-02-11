package JDBC;

import java.sql.*;

public class StoredProcedureCountOUT {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employetable", "root", "root");
            CallableStatement cs = con.prepareCall("{call countemployee(?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();

            int count = cs.getInt(1);
            System.out.println("success" + " " + count);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
