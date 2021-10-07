package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	      name = "OiServlet3",
	      urlPatterns = {"/ola"},
	      initParams = {
	          @WebInitParam(name = "param1", value = "value1"),
	          @WebInitParam(name = "param2", value = "value2")}
	  )public class OiServlet3 extends HttpServlet {
		 public void service(HttpServletRequest request,
		          HttpServletResponse response) throws ServletException, IOException {
	
		      response.setContentType("text/html");
		      PrintWriter out = response.getWriter();
	
		      out.println("<h2>Exemplo com InitParam Servlet</h2>");
	
		      ServletConfig config = getServletConfig();
	
		      out.println("Valor do parâmetro 1: "
		    		    + getServletConfig().getInitParameter("param1"));
	
		      out.close();
		  }
}
