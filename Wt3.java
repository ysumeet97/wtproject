import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider; 
import javax.sql.rowset.RowSetFactory;
import javax.servlet.ServletException;
public class Wt3 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String x=req.getParameter("t1");
		String y=req.getParameter("password");
		String z="";
		try{Class.forName("com.mysql.jdbc.Driver");}catch(ClassNotFoundException c){System.out.println(c.getStackTrace().toString());}
		try
		{
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl("jdbc:mysql://localhost:3306/userreg");  
		rs.setUsername("root");  
		rs.setPassword("sumeet");            
		rs.setCommand("Select * from usrinfo where email=?"); 
		rs.setString(1,x);
		rs.execute();
		//Connection con=null;
		//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userreg","root","sumeet");
		//PreparedStatement ps = con.prepareStatement("Select * from usrinfo where email=?");
		//ps.setString(1,x);
		//ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
		z=(String)rs.getString("password");
		if(y.equals(z))
		{	
			req.getRequestDispatcher("Wt4").forward(req,res);	
		}
		else
		{
			out.print("<h2 align='center'style='color:yellow'>Sorry, password incorrect!</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");rd.include(req,res);
		}
		}
		else
		{
			out.println("<h2 align='center'style='color:yellow'>Invalid username</h2>");
			req.getRequestDispatcher("login.html").include(req,res);
		}
		rs.close();
		//ps.close();
		//con.close();
		}catch(SQLException e){System.out.println(e);}
	out.close();
	}	
}
