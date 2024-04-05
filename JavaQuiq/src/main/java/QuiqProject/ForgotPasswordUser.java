package QuiqProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForgotPasswordUser")
public class ForgotPasswordUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String gmail=request.getParameter("ugmail");
		String name=request.getParameter("uname");
				
        try {
			
			Class.forName("com.mysql.jdbc.Driver");    //load the Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Durga@123"); //connection creation
		    PreparedStatement ps=con.prepareStatement("select * from QuizRegister where gmail=? and username=?"); //statement creation
			
		    ps.setString(1, gmail);	
			ps.setString(2, name);	
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				response.sendRedirect("WelcomePage.jsp");
			}
			else
			{
				out.println("login unSuccessfully");
			}
			con.close();
			ps.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
