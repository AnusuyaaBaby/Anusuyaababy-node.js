import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
 
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		PrintWriter out=resp.getWriter();
		
		
		String username=req.getParameter("username");
		String userpass=req.getParameter("userpass");
		
		if(username.equals("admin")&& userpass.equals("admin"))
		{
			
			RequestDispatcher rd=req.getRequestDispatcher("WelcomeServlet");
			rd.forward(req, resp);
			//out.println("Success");
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
			//out.println("Login Failed");
		}
		// TODO Auto-generated method stub
		
		//super.doPost(req, resp);
	}
}
