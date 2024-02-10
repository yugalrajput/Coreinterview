package JDBC;

import java.sql.*;


public class StoredProcedureINOUT {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employetable", "root", "root");
        CallableStatement cs = con.prepareCall("{ call countemployeeinout(?, ?) }");
        cs.setInt(1, 1);
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.execute();
        System.out.println("hlo");
        String nm = cs.getString(2);
        System.out.println("Name = " + nm);
    }
}
