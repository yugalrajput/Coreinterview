package JDBC;

import java.sql.*;

public class Transaction_Handling {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con = null;
        Statement s = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "root");
            con.setAutoCommit(false);
            s = con.createStatement();
            s.executeUpdate("update student set salary=50000 where id=3");
            s.executeUpdate("update student set salary=salary+5500 where id=2");

            con.commit();
            System.out.println("running..........");
            System.out.println("updated successfully");

        } catch (SQLException e) {
            con.rollback();
            e.printStackTrace();
        } finally {
            s.close();
            con.close();
        }

    }
}
