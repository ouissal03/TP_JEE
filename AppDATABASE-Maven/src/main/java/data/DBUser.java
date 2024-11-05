/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author 21263
 */
import java.sql.*;
import business.User;
public class DBUser {
public static int insert(User user) {
Connection con = DBUtil.dbConnect("mohadb", "ouissal", "mypassword");
PreparedStatement ps = null;
String query
= "INSERT INTO user (Email, FirstName, LastName) "
+ "VALUES (?, ?, ?)";
try {
ps = con.prepareStatement(query);
ps.setString(1, user.getEmail());
ps.setString(2, user.getFirstName());
ps.setString(3, user.getLastName());
return ps.executeUpdate();
} catch (SQLException e) { System.out.println(e); return 0;
} finally { DBUtil.closePreparedStatement(ps); }
}
public static int update(User user) {
Connection con = DBUtil.dbConnect("mohadb", "ouissal", "mypassword");
PreparedStatement ps = null;
String query = "UPDATE User SET "
+ "FirstName = ?, "
+ "LastName = ? "
+ "WHERE Email = ?";
try {
ps = con.prepareStatement(query);
ps.setString(1, user.getFirstName());
ps.setString(2, user.getLastName());
ps.setString(3, user.getEmail());
return ps.executeUpdate();
} catch (SQLException e) { System.out.println(e); return 0; 
} finally { DBUtil.closePreparedStatement(ps);
}
}
public static int delete(User user) {
Connection con = DBUtil.dbConnect("mohadb", "ouissal", "mypassword");
PreparedStatement ps = null;
String query = "DELETE FROM User "
+ "WHERE Email = ?";
try {
ps = con.prepareStatement(query);
ps.setString(1, user.getEmail());
return ps.executeUpdate();
} catch (SQLException e) {
System.out.println(e);
return 0;
} finally {
DBUtil.closePreparedStatement(ps);
}
}
public static boolean emailExists(String email) {
Connection con = DBUtil.dbConnect("mohadb", "ouissal", "mypassword");
PreparedStatement ps = null;
ResultSet rs = null;
String query = "SELECT Email FROM User "
+ "WHERE Email = ?";
try {
ps = con.prepareStatement(query);
ps.setString(1, email);
rs = ps.executeQuery();
return rs.next(); 
} catch (SQLException e) {
System.out.println(e);
return false;
} finally {
DBUtil.closeResultSet(rs);
DBUtil.closePreparedStatement(ps);
}
}
public static User selectUser(String email) {
Connection con = DBUtil.dbConnect("mohadb", "ouissal", "mypassword");
PreparedStatement ps = null;
ResultSet rs = null;
String query = "SELECT * FROM User "
+ "WHERE Email = ?";
try {
ps = con.prepareStatement(query);
ps.setString(1, email);
rs = ps.executeQuery();
User user = null;
if (rs.next()) {
user = new User();
user.setFirstName(rs.getString("FirstName"));
user.setLastName(rs.getString("LastName"));
user.setEmail(rs.getString("Email"));
}
return user;
} catch (SQLException e) { System.out.println(e); return null;
} finally { DBUtil.closeResultSet(rs); DBUtil.closePreparedStatement(ps);
} }}
