import java.sql.*;
import javax.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider; 
import javax.sql.rowset.RowSetFactory;
import javax.servlet.ServletException;
public class Wt2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s3=req.getSession(false);
		String c=(String)s3.getAttribute("ses");String z=""; 
		out.println("<h2 align='right' style='color:yellow;'>"+c+"</h2>");
		String a=req.getParameter("name");
		String b=req.getParameter("value");
		out.println("<html><head><script>function display(){window.history.go(+1);}</script></head>");
		out.println("<body onload='display()' style='background-color:black;color:white'>");
		out.println("<table style='background-color:black;color:green'>");
		out.println("<tr>");
		out.println("<th align='left' width='90%'><h1 style='font-size:50px;'><a href='anime2.html' style='text-decoration:none;color:yellow;'>GoAnime</a></h1></th>");
		out.println("<th align='center' style='font-size:20px'><a href='http://localhost:8080/Watproject/Wt6' style='text-decoration:none;color:yellow;'>logout</a>");
		out.println("<form action=' ' method='get' style='border:2px solid #ccc;border-radius:4px;'><input type='text' name='Search' placeholder='Search..'background-color='white'></form></th>");
		out.println("</tr>");
		out.println("</table>");
		if(a.equals("sao1"))
		{
			out.println("<h1 style='color:yellow;'>Sword Art Online-I</h1>");
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}	
		}
		if(a.equals("sao2"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
		}
		if(a.equals("stg"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}	
		}
		if(a.equals("ft"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400  controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		if(a.equals("ft2"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		if(a.equals("ngnl"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		if(a.equals("sds"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		if(a.equals("ad"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		if(a.equals("znt1"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		if(a.equals("znt2"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}	
		}
		if(a.equals("znt3"))
		{
	
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}		
		}
		if(a.equals("munr"))
		{
			if(b.equals("e1")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode1</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e2")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode2</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e3")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode3</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}
			if(b.equals("e4")){out.println("<table align='center'><tr><td><h2 style='color:yellow;'>Episode4</h2></td></tr><tr><td><video width='400' controls><source src='mov_bbb.mp4' type='video/mp4'><source src='mov_bbb.ogg' type='video/ogg'>Your browser does not support HTML5 video.</video></td></tr></table>");}			
		}
		out.println("</body></html>");
	}
}
