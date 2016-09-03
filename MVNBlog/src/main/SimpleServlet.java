package main;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
// this is for version3 
//@WebServlet("/home")
@WebServlet( urlPatterns = {"/home" , "*.do"})
public class SimpleServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		//resp.getWriter().write("Hello Java Servlet");
		
		String name  = req.getParameter("name");
		if(name!=null)
			resp.getWriter().printf("Hello %s",name);
		else 
			resp.getWriter().write("Please enter a name"); 
		 
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		//resp.getWriter().write("Hello Java Servlet");
		//Addin new commit
		
		String name  = req.getParameter("name");
		if(name!=null)
			resp.getWriter().printf("Hello %s",name);
		else 
			resp.getWriter().write("Please enter a name"); 
		 
		
		
	}

}
