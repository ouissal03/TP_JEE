package dao;
import java.sql.*;

public class DBInscription {
public static int insert(Inscription insc) {
 Connection con = DBUtil.dbConnect("sallesport", "ouissal", "mypassword");
 PreparedStatement ps = null;
 String query
 = "INSERT INTO Inscription(email, designation) "
 + "VALUES (?, ?)";
 try {
 ps = con.prepareStatement(query);
 ps.setString(1, insc.getEmail());
 ps.setString(2, insc.getDesignation()); 
 return ps.executeUpdate();
 } catch (SQLException e) { System.out.println(e); return 0;
 } finally { DBUtil.closePreparedStatement(ps); }
 }
}
