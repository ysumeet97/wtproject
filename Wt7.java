import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Wt7 implements Filter
{
	FilterConfig config;
	public void init(FilterConfig x)throws ServletException
	{
		config=x;
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException
	{
		ServletContext context=config.getServletContext();
		Integer count=(Integer)context.getAttribute("c");
		if(count==null){count=new Integer(0);}
		count=new Integer(count.intValue()+1);
		context.setAttribute("c",count.intValue());
		chain.doFilter(req,res);
	}
	public void destroy()
	{
	}
}