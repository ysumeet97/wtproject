import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Wt9 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession(false);
		String x=(String)s.getAttribute("ses");
		if(x==null)
		{
			out.println("<body style='background-color:black;color:yellow'>");
			out.println("<h2 align-='center'><a href='anime2.html'>Go to main page!</a></h2>");
		}
	}
}