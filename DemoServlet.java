package webapp.com;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request,HttpServletResponse response ) {
		
		response.setContentType("text/html");
		try {
			response.getWriter().println("Hello World");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
