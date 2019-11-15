import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
import javax.servlet.ServletException;
public class Wt5 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String a=req.getParameter("pa");
		String b=req.getParameter("rpa");
		String c=req.getParameter("t1");
		String d=req.getParameter("t2");
		String e=req.getParameter("t3");
		String f=req.getParameter("t4");
		if(a.equals(b))
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userreg","root","sumeet");
				PreparedStatement ps=con.prepareStatement("insert into usrinfo values(?,?,?,?,?)");
				ps.setString(1,c);
				ps.setString(2,d);
				ps.setString(3,e);
				ps.setString(4,f);
				ps.setString(5,a);
				int i=ps.executeUpdate();
				Mailer.sendEmailTo(c,f);
				{
					out.println("<h2 style='color:yellow;'align='center'>Your name has been registered</h2>");
					out.println("<h2 style='color:yellow;'align='center'>Please login with your username as Email-id</h2>");
					RequestDispatcher rd=req.getRequestDispatcher("login.html");
					rd.forward(req,res);
				}
		

			}catch(Exception e1){System.out.println(e1);}
		}
		else
		{
			out.println("<h2 style='color:yellow;'align='center'>Your password and re-enter password fields did not match!");
			RequestDispatcher rd=req.getRequestDispatcher("register.html");
			rd.include(req,res);
		}
		out.close();
	}	
}
