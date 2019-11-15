import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public  class Wt1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s2=req.getSession(false);
		String b=(String)s2.getAttribute("ses");
		out.println("<h2 align='right' style='color:yellow;'>"+b+"</h2>");
		String a=req.getParameter("name");
		out.println("<body style='background-color:black;color:white'>");
		out.println("<table style='background-color:black;color:green'>");
		out.println("<tr>");
		out.println("<th align='left' width='90%'><h1 style='font-size:50px;'><a href='anime2.html' style='text-decoration:none;color:yellow;'>GoAnime</a></h1></th>");
		out.println("<th align='center' style='font-size:20px'>");
		out.println("</th>");
		out.println("</tr>");
		out.println("</table>");
		if(a.equals("sao1"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='sao1.jpg'/><h3 style='color:yellow;'>Sword Art Online-I</h3></td>");	
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao1&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao1&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao1&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao1&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");		
		}
		if(a.equals("sao2"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='sao2.jpg'/><h3 style='color:yellow;'>Sword Art Online-II</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao2&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao2&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao2&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sao2&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("stg"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='stg.jpg'/><h3 style='color:yellow;'>Steins; Gate</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=stg&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=stg&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=stg&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=stg&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("ft"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='ft.jpg'/><h3 style='color:yellow;'>Fairy Tail</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("ft2"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='ft2.jpg'/><h3 style='color:yellow;'>Fairy Tail(2014)</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft2&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft2&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft2&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ft2&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("ngnl"))
		{
			out.println("<table align='center'>");
			out.println("<tr>");
			out.println("<td align='center'><img src='ngnl.jpg'/><h3 style='color:yellow;'>No Game No Life</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ngnl&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ngnl&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2/h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ngnl&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ngnl&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("sds"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='sds.jpg'/><h3 style='color:yellow;'>The Seven Deadly Sins</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sds&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sds&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sds&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=sds&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("ad"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='ad.jpg'/><h3 style='color:yellow;'>Absolute Duo</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ad&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ad&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ad&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=ad&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("znt1"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='znt1.jpg'/><h3 style='color:yellow;'>The Familiar of Zero-I</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt1&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt1&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt1&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt1&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("znt2"))
		{	
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='znt2.jpg'/><h3 style='color:yellow;'>The Familiar of Zero-II</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt2&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt2&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt2&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt2&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("znt3"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='znt3.jpg'/><h3 style='color:yellow;'>The Familiar of Zero-III</h3></td>");
			out.println("<td></td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt3&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt3&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt3&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=znt3&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		if(a.equals("munr"))
		{
			out.println("<table align='center'>");
			out.println("<tr align='center'>");
			out.println("<td align='center'><img src='munr.jpg'/><h3 style='color:yellow;'>The Irregular at Magic High School</h3></td>");
			out.println("<td>");
			out.println("</td>");
			out.println("<td align='center'>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=munr&value=e1' style='text-decoration:none;color:yellow;'><h3>Episode1</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=munr&value=e2' style='text-decoration:none;color:yellow;'><h3>Episode2</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=munr&value=e3' style='text-decoration:none;color:yellow;'><h3>Episode3</h3></a>");
			out.println("<a href='http://localhost:8080/Watproject/Wt2?name=munr&value=e4' style='text-decoration:none;color:yellow;'><h3>Episode4</h3></a>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		}
		out.println("</body>");
	}
}
