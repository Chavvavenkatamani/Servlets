package ytpractice1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {
	ServletConfig config;
	public void init(ServletConfig config) {
		this.config = config;
	}
	public void service(ServletRequest request,ServletResponse response) throws IOException {
       String fname = request.getParameter("fname");
       String secondname = request.getParameter("sname");
       //parsing
      // int num = Integer.parseInt(request.getParameter("20"));
       //int num2 = Integer.parseInt(request.getParameter("30"));
       //int result = num+num2;
       //Date d = new Date();
		PrintWriter writer = response.getWriter();
     //writer.println(result+"  "+"is the value");
		writer.println("<h1><i><u>Hello Welcome to first Servlet</i></u><h1>"+fname+" "+secondname);
}
	public void destroy() {
		
	}
	public ServletConfig getServletConfig() {
		return config;
		
	}
	public String getServletInfo() {
		return null;
		
	}
}