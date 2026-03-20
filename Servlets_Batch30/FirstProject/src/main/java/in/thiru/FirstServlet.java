package in.thiru;
//in.thiru.FirstServlet
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Method : destroy");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Method : getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Method : getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Method : init");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Method : service");
		
		PrintWriter writer = resp.getWriter();
		writer.write("Hi Welcome to VersionIT");
		
		
	}

	

}
