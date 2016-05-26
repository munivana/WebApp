import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request,
	        HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Enumeration<String> e = request.getParameterNames();
		
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			pw.println(name + ": ");
			String value = request.getParameter(name);
			pw.println(value+"<br>");
		}
		pw.println("<a href=\"index-ajax.html\">link na ajax</a>");
		pw.close();
	}
	
	@Override
	public void doGet(HttpServletRequest request,
	        HttpServletResponse response) throws ServletException, IOException {
	    String text = "Vypisujem doGet";
	    PrintWriter pw = response.getWriter();
		pw.write(text);
		pw.close();
	}
	
	@Override
	public void doPut(HttpServletRequest request,
	        HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.write("doPut");
		pw.close();
	}

}
