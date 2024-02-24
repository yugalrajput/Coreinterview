package junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserModel {
    public static Integer nextPK() throws Exception {

        int pk = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junit", "root", "root");

        PreparedStatement ps = con.prepareStatement("select max(id) from user");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            pk = rs.getInt(1);
        }

        return pk + 1;

    }

    public static UserBean findByPk(int id) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junit", "root", "root");

        PreparedStatement ps = con.prepareStatement("select * from user where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        UserBean user = null;

        while (rs.next()) {
            user = new UserBean();
            user.setId(rs.getInt(1));
            user.setName(rs.getString(2));
            user.setSalary(rs.getLong(3));
        }

        return user;

    }

    public static UserBean findByLogin(String name) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junit", "root", "root");
        PreparedStatement ps = con.prepareStatement("select * from user where name = ?");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        UserBean user = null;

        while (rs.next()) {
            user = new UserBean();
            user.setId(rs.getInt(1));
            user.setName(rs.getString(2));
            user.setSalary(rs.getLong(3));
        }

        return user;

    }


    public static void add(UserBean user) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junit", "root", "root");
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?)");
        ps.setInt(1, user.getId());
        ps.setString(2, user.getName());
        ps.setLong(3, user.getSalary());
        ps.executeUpdate();
        System.out.println("Data Inserted Successfully");


    }

    public static void update(UserBean user) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/junit", "root", "root");
        PreparedStatement ps = con.prepareStatement("update user set name = ?, salary = ? where id = ?");
        ps.setString(1, user.getName());
        ps.setLong(2, user.getSalary());
        ps.setInt(3, user.getId());
        ps.executeUpdate();
        System.out.println("Data Updated Successfully");
    }


}
