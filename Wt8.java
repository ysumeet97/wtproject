import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Wt8 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletContext context=getServletContext();
		Integer count=(Integer)context.getAttribute("c");
		out.println("<html><meta content='no-cache'>");
		out.println("<body style='background-color:black;'>");
		out.println("<h1 align='center' style='color:yellow;'>Number of visitors to the Goanime are</h2>");
		if(count!=null){out.println("<p style='font-size:100px;color:yellow;'align='center'>"+count+"</p>");}
		else {out.println("<p style='font-size:100px;color:yellow;'align='center'>Sorry! count not available.</p>");}
		out.println("</body></html>");
	}
}