package com.jsp.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int A=Integer.parseInt(req.getParameter("a"));
		int B=Integer.parseInt(req.getParameter("b"));
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int C=A+B;
		pw.println("welcome to add servlet");
		pw.println("<h2>sum of "+A +"and "+ B+"="+C+"</h2>");
		
		
		
		
		
	}
	
}
