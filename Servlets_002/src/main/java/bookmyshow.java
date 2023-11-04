import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pet")
public class bookmyshow extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	  String name=req.getParameter("n");
    	  String Fname=req.getParameter("f");
    	  String Mname=req.getParameter("m");
    	  String DOB=req.getParameter("d");
    	  int Age=Integer.parseInt(req.getParameter("a"));
    	  String address=req.getParameter("add");
    	  int sal=Integer.parseInt(req.getParameter("s"));
    	 int  bonus=Integer.parseInt(req.getParameter("b"));
    	 
    	 
    	 PrintWriter pw=resp.getWriter();
    	  pw.write("<h1>Name     : "+ name + " </h1> ");
		  pw.write("<h1>Fname      : "+ Fname + " </h1> ");
		  pw.write("<h1>MName     : "+Mname + " </h1> ");
		  pw.write("<h1>DOB     : "+ DOB + " </h1> ");
		  pw.write("<h1>Age     : "+ Age + " </h1> ");
		  pw.write("<h1>address      : "+ address + " </h1> ");
		  pw.write("<h1>sal     : "+ sal + " </h1> ");
		  pw.write("<h1>bonus      : "+ bonus + " </h1> ");
    }
	//mvn
    // hibernet core in search bar
   // -->hibernet core relocation , cleck on it ... and select version most usages
}
