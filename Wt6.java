import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Wt6 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession(false);
		String x=(String)s.getAttribute("ses");
		if(x!=null){
		s.invalidate();
		out.println("<h2 align='center'style='color:yellow'>You have successfully logged out!</h2>");
		req.getRequestDispatcher("l1.html").include(req,res);}
	}
}
