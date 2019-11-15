import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Wt4 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	HttpSession s1=req.getSession();
	String b=req.getParameter("t1");
	s1.setAttribute("ses",b);
	out.println("<h2 align='center' style='color:yellow;'>Welcome "+b+"</h2>");
	out.println("<html>");
	out.println("<head><title>GoAnime</title><style>a{color:yellow;}</style></head>");
	out.println("<body style='background-color:black;color:white'>");
	out.println("<table style='background-color:black;color:green'>");
	out.println("<tr><th align='left' width='90%'><h1 style='font-size:50px;'><a href='anime2.html' style='text-decoration:none;'>GoAnime</a></h1></th><th align='center' style='font-size:20px'></th></tr></table>");
	out.println("<table  width='100%' cellspacing='5' style='background-color:green;'><tr></tr></table><table cellspacing='20' ><tr>");
	
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=sao1' style='text-decoration:none;'><img src='sao1.jpg'width='158' height='250'/></a><a href='sao1.html' style='text-decoration:none;'><h3>Sword art online-I</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=sao2' style='text-decoration:none;'><img src='sao2.jpg'width='158' height='250'/></a><a href='sao2.html' style='text-decoration:none;'><h3>Sword art online-II</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=stg' style='text-decoration:none;'><img src='stg.jpg'width='158' height='250'/></a><a href='stg.html' style='text-decoration:none;'><h3>Steins; Gate</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=ft' style='text-decoration:none;'><img src='ft.jpg'width='158' height='250'/></a><a href='ft.html' style='text-decoration:none;'><h3>Fairy Tail</h3></a></td></tr>");
	
	out.println("<tr><td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=ft2' style='text-decoration:none;'><img src='ft2.jpg'width='158' height='250'/></a><a href='ft2.html' style='text-decoration:none;'><h3>Fairy Tail(2014)</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=ngnl' style='text-decoration:none;'><img src='ngnl.jpg'width='158' height='250'/></a><a href='ngnl.html' style='text-decoration:none;'><h3>No Game No Life</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=sds' style='text-decoration:none;'><img src='sds.jpg'width='158' height='250'/></a><a href='sds.html' style='text-decoration:none;'><h3>The Seven Deadly Sins</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=ad' style='text-decoration:none;'><img src='ad.jpg'width='158' height='250'/></a><a href='ad.html' style='text-decoration:none;'><h3>Absolute Duo</h3></a></td></tr>");
	
	out.println("<tr><td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=znt1' style='text-decoration:none;'><img src='znt1.jpg'width='158' height='250'/></a><a href='znt1.html' style='text-decoration:none;'><h3>The Familiar of <br/>Zero-I</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=znt2' style='text-decoration:none;'><img src='znt2.jpg'width='158' height='250'/></a><a href='znt2.html' style='text-decoration:none;'><h3>The Familiar of <br/>Zero-II</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=znt3' style='text-decoration:none;'><img src='znt3.jpg'width='158' height='250'/></a><a href='znt3.html' style='text-decoration:none;'><h3>The Familiar of <br/>Zero-III</h3></a></td>");
	out.println("<td width='18.75%' align='center'><a href='http://localhost:8080/Watproject/Wt1?name=munr' style='text-decoration:none;'><img src='munr.jpg'width='158' height'250'/></a><a href='munr.html' style='text-decoration:none;'><h3>The Irregular at <br/>Magic High School</h3></a></td></tr>");
	
	out.println("</table></body>");
	out.println("</html>");
	
}
}
