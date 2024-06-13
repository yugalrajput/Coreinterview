package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDOperation {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "root");

        Statement s = con.createStatement();

        //insert
        int i = s.executeUpdate("insert into student values(4,'aman','rajput','gwalior','aman@gmail.com')");
        System.out.println(i + " record inserted");

        //update
        // int i = s.executeUpdate("update student set lname='kumar' where id=3");
        // System.out.println(i + " record updated");

        //delete
        // int i = s.executeUpdate("delete from student where id=4");
        // System.out.println(i + " record deleted");

        //search
      //  ResultSet rs = s.executeQuery("select * from student where id=1");
      //  while (rs.next()) {
       //     System.out.println(rs.getInt(1) + " " + rs.getString(2));
      //  }

    }
}
