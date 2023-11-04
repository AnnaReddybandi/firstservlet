import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/for")
public class formCls  extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String name=req.getParameter("n");
	   int age=Integer.parseInt(req.getParameter("a"));
	   int sal=Integer.parseInt(req.getParameter("s"));
	   String gender=req.getParameter("g");
	   
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/industry?user=root&password=root");
		   String sql="insert into form(name,age,sal,gender)values(?,?,?,?)";
		   PreparedStatement ps=con.prepareStatement(sql);
		   ps.setString(1,name);
		   ps.setInt(2, age);
		   ps.setInt(3, sal);
		   ps.setString(4, gender);
		   ps.execute();
		   con.close();
	   }catch(Exception e) {
		    e.printStackTrace();
		  
	   }
}
}
