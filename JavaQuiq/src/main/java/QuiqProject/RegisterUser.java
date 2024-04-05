package QuiqProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String gmail=request.getParameter("mail");
		String u=request.getParameter("uname");
		String p=request.getParameter("pwd");
		String cp=request.getParameter("cpassword");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","Durga@123");
		    PreparedStatement ps=con.prepareStatement("insert into QuizRegister values(?,?,?)");
			
		    ps.setString(1, gmail);	
			ps.setString(2, u);	
//			ps.setString(3, p);	
//			ps.setString(4, cp);	
			
			
			if(p.equals(cp))
			{
				ps.setString(3, p);	
			}
			else
			{
				out.println("Sorry, password or confirm password is incorrect reload the page");
			}
		
			int ch=ps.executeUpdate();
			
			if(ch==1)
			{
				response.sendRedirect("WelcomePage.jsp");
			}
			else
			{
				out.println("Register not Successfully");
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
