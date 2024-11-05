package pkg;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

@WebServlet(name = "SQLUtil", value = "/SQLUtil")
public class SQLUtil extends HttpServlet{
    public static String getHtmlTable(ResultSet results)
            throws SQLException {
        StringBuilder htmlTable = new StringBuilder();
        ResultSetMetaData metaData = results.getMetaData();
        int columnCount = metaData.getColumnCount();
        htmlTable.append("<table>");
        htmlTable.append("<tr>");
        for (int i = 1; i <= columnCount; i++) {
            htmlTable.append("<th>");
            htmlTable.append(metaData.getColumnName(i));
            htmlTable.append("</th>");
        }
        htmlTable.append("</tr>");
        while (results.next()) {
            htmlTable.append("<tr>");
            for (int i = 1; i <= columnCount; i++) {
                htmlTable.append("<td>");
                htmlTable.append(results.getString(i));
                htmlTable.append("</td>");
            }
            htmlTable.append("</tr>");
        }
        htmlTable.append("</table>");
        return htmlTable.toString();
    }

    public static List<String> getAuteurs() {

        String sqlStatement = "select DISTINCT auteur from livres;";
        List<String> sqlResult = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/elibrairie";
            String username = "ouissal";
            String password = "mypassword";

            Connection conn = DriverManager.getConnection(dbURL, username, password);
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery(sqlStatement);

            while (rs.next()) {

                String str = rs.getString("auteur");

                sqlResult.add(str);
            }

            statement.close();
            conn.close();

        } catch (Exception ignored) {}
        return sqlResult;

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            PrintWriter out = resp.getWriter();

            req.getParameter("tosearch");
            String auteur = req.getParameter("auteur");

            String sqlStatement = null;
            if (!auteur.equals("select")) {
                 sqlStatement = "select * from livres where auteur = \"" + auteur + "\";";
            }
            else {
                 sqlStatement = "select * from livres where auteur LIKE \"%" + req.getParameter("tosearch") + "%\" OR titre LIKE \"%" + req.getParameter("tosearch") + "%\";";
            }
            String sqlResult;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbURL = "jdbc:mysql://localhost:3306/elibrairie";
                String username = "ouissal";
                String password = "mypassword";

                Connection conn = DriverManager.getConnection(dbURL, username, password);
                Statement statement = conn.createStatement();

                ResultSet resultSet = statement.executeQuery(sqlStatement);

                sqlResult = SQLUtil.getHtmlTable(resultSet);

                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>SQLUtil</title>");
                out.println("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\"/>");
                out.println("</head><body>");
                out.println("<h1>Resultat d'execution de l'instruction SQL:</h1>");

                out.println(sqlResult);
                out.println("</body></html>");

                statement.close();
                conn.close();

            } catch (Exception ignored) {ignored.getStackTrace();}


}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
