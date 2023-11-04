import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/form1")
public class stuRegistration extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name=req.getParameter("n");
		 String city=req.getParameter("c");
		 String email=req.getParameter("e");
		 String mobile=req.getParameter("m");
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/animal?user=root&password=root");
			 
			 String sql="update student set name=?,city=?";
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setString(1, name);
			 ps.setString(2, city);
			 ps.setString(3, email);
			 ps.setString(4, mobile);
			 ps.execute();
			 con.close();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		 
		 
	}
}
