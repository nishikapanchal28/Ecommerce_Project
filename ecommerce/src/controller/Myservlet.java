package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import model.Customer;


@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		try{
	        
	        
	        Class.forName("org.h2.Driver");

		//creating connection with the database 
	          Connection  con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");

	        PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?)");

	        ps.setString(1, name);
	        ps.setString(2, email);
	        ps.setString(3, password);
	        int i=ps.executeUpdate();
	        
	          if(i>0)
	          {
	        out.println("You are sucessfully registered");
	          }
	        
	        }
	        catch(Exception se)
	        {
	            se.printStackTrace();
	        }
		
	      }
	/**	try(PrintWriter out=response.getWriter())
		{
				
	Customer c=new Customer();
	c.setName(name);
	c.setPassword(password);
	c.setEmail(email);
	
	RequestDispatcher rd;
	if(name.equals("niit123") && password.equals("niit@123"))
		{
		rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		}
	else{
		 rd=request.getRequestDispatcher("index.jsp");
				out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!WORNG USERNAME OR PASSWORD !!!!!!!!!!!!!!!!!!!!");
				rd.include(request, response);
		}
		}	*/

}
