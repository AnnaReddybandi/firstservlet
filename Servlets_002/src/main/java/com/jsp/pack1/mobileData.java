package com.jsp.pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/act")
public class mobileData extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	   String name=req.getParameter("n");
    	   int price=Integer.parseInt(req.getParameter("pr"));
    	   String model=req.getParameter("mo");
    	   String color=req.getParameter("co");
    	   String power=req.getParameter("po");
    	   String cemera=req.getParameter("ce");
    	  
    	   try {
    		   Class.forName("com.mysql.cj.jdbc.Driver");
    		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/animal?user=root&password=root");
    		     String sql="insert into mobile(name,price,model,color,power,cemera)values(?,?,?,?,?,?)";
    		     PreparedStatement ps=con.prepareStatement(sql);
    		     ps.setString(1, name);
    		     ps.setInt(2, price);
    		     ps.setString(3, model);
    		     ps.setString(4, color);
    		     ps.setString(5, power);
    		     ps.setString(6, cemera);
    		     ps.execute();
    		     con.close();
    		   
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   
    }
}
