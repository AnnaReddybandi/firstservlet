package com.jsp.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/anchor")
public class Anchor extends HttpServlet{
 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
	  int age=Integer.parseInt(req.getParameter("age"));
	  int salary=Integer.parseInt(req.getParameter("salary"));
	  
	//  resp.setContentType("text/html");
	  
		PrintWriter out=resp.getWriter();
		out.println("<h1"+name+"</h1>");
		out.println(name);
		out.println(fname);
		out.println(age);
		out.println(salary);
	}
}
