package com.example.WebApp;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            Connection connection= null;
            try {
                //final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
              //  Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatheory","root","ayan123");
                Statement statement = connection.createStatement();



            String query="";
            String username = request.getParameter("user");
                String age = request.getParameter("age");

                int ageOfPerson=Integer.valueOf(request.getParameter("age"));
                double totalCost=0;
                if(ageOfPerson>62)
                {
                    totalCost=7;
                }
                else if(ageOfPerson<10)
                {
                    totalCost=5;
                }
                else
                {
                    totalCost=9.50;
                }



            query = "INSERT INTO personDetails " + "VALUES ("+username+", '"+age+"', " +
                    ""+totalCost+"+"+"')";
            statement.executeUpdate(query);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>The price of the movie Tickets are</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello welcome " + username "</h2>");
            out.println("<h3>Your age is : " + age + "</h3>");
            out.println("<h4> Hence the cost of the movie Ticket is  : " + totalCost +
                    "</h4>");
                out.println("<h4>Total Cost : " + result +
                        "</h4>");
            out.println("</body>");
            out.println("</html>");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            out.close();
        }
    }
}
