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

@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
        try {
			
			Class.forName("com.mysql.jdbc.Driver");    //load the Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Durga@123"); //connection creation
		    PreparedStatement ps=con.prepareStatement("select * from QuizRegister where username=? and password=?"); //statement creation
			
		    ps.setString(1, name);	
			ps.setString(2, pass);	
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
//				out.println("login Successfully");
//				String name1=rs.getString(1);
//				out.println(name1);
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
