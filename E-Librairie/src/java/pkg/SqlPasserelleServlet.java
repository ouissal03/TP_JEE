package pkg;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.*;
import java.sql.*;
public class SqlPasserelleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        //Obtention de l'instruction SQL à partir de l'objet request
        String sqlStatement = request.getParameter("sqlStatement");
        String sqlResult = "";
        try {
            //Chargement du pilote JDBC pour MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            //URL de la base de données MySQL "elibrairie"
            String dbURL = "jdbc:mysql://localhost:3306/elibrairie";
            //Attention vous devez fournir le nom d'un utilisateur qui a les privilèges
            //d'exécuter les instruction LMD sur la base elibrairie
            String username = "ouissal";
            String password = "mypassword";
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            Statement statement = conn.createStatement();
            //Suppression des éventuels espaces du début et de la fin de l'instruction SQL
            sqlStatement = sqlStatement.trim();
            //Obtention du type de l'instruction : SELECT, INSERT, UPDATE ou DELETE
            if (sqlStatement.length() >= 6) {
                String sqlType = sqlStatement.substring(0, 6);
                if (sqlType.equalsIgnoreCase("select")) {//Instruction SELECT
                    // Exécuter l'instruction SELECT : Obtention d'un ResultSet
                    ResultSet resultSet = statement.executeQuery(sqlStatement);
                    //Passage du ResultSet à la méthode getHtmlTable de la classe SQLUtil
                    //En vue d'afficher ses lignes dans un tbleau HTML
                    sqlResult = SQLUtil.getHtmlTable(resultSet);
                    resultSet.close();//Fermeture du ResultSet
                } else {//Instruction autre que SELECT
                    int i = statement.executeUpdate(sqlStatement);
                    if (i == 0) { // Une instruction DDL (CREATE .....)
                        sqlResult = "<p>L'instruction a été exécutée avec succés.</p>";
                    } else { // Une instryction LMD : INSERT, UPDATE, ou DELETE
                        sqlResult = "<p>L'instruction a été exécutée avec succés" + i + " lignes affectées.</p>";
                    }
                }
            }
            statement.close();//Fermeture de l'objet Statement
            conn.close();//Fermeture de l'objet Connection
        } catch (ClassNotFoundException e) {//Pilote JDBC non trouvé
            sqlResult = "<p>Erreur de chargement du pilote JDBC : <br>"+ e.getMessage() + "</p>";
        } catch (SQLException e) {
            sqlResult = "<p>Erreur d'exécution de l'instruction SQL: <br>" + e.getMessage() + "</p>";
        }
        //Création de l'objet Session au cas où il n'a pas encore été créé auparavent
        HttpSession session = request.getSession(true);
        //Stockage du la chaine sqlResult comme attribut dans l'objet session
        session.setAttribute("sqlResult", sqlResult);
        //Stockage du l'instruction SQl comme attribut dans l'objet session
        session.setAttribute("sqlStatement", sqlStatement);
        //Appel de la servlet "InterfaceServlet" d'url "interface"
        String url = "/interface";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}