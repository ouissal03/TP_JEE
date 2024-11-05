package dao;
import java.sql.*;
import java.util.ArrayList;
public class DBAdherent {
 public static int insert(Adherent adherent) {
 Connection con = DBUtil.dbConnect("sallesport", "ouissal", "mypassword");
 PreparedStatement ps = null;
 String query
 = "INSERT INTO Adherent(email, nom, prenom, adresse, genre, tel) "
 + "VALUES (?, ?, ?, ?, ?, ?)";
 try {
 ps = con.prepareStatement(query);
 ps.setString(1, adherent.getEmail());
 ps.setString(2, adherent.getNom());
 ps.setString(3, adherent.getPrenom());
 ps.setString(4, adherent.getAdresse());
 ps.setString(5, adherent.getGenre());
 ps.setString(6, adherent.getTel());
 
 return ps.executeUpdate();
 } catch (SQLException e) { System.out.println(e); return 0;
 } finally { DBUtil.closePreparedStatement(ps); }
 }
 
 
}