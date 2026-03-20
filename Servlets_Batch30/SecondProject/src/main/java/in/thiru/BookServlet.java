package in.thiru;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//BookName :<input type="text" name="name"> <br>
//BookPrice :<input type="number" name="price"><br>
//BookAuthor :<input type="text" name="author"><br>
//ShopName :<input type="text" name="shopname"><br>

public class BookServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		 resp.setContentType("text/html");
		
		String bookName = req.getParameter("name");
		String bookPrice = req.getParameter("price");
		String bookAuthor = req.getParameter("author");
		String shopName = req.getParameter("shopname");
		
		int price = Integer.parseInt(bookPrice);
		
		
		BookDao dao=new BookDao();
		try {
			boolean isInsertBook = dao.insertBook(bookName,price,bookAuthor,shopName);
			if(isInsertBook)
			{
				
				//<h1 style="color: red; font-size: 30px;">Books Data Inserted SUCCESSFULLY</h1>
				
				resp.getWriter().write("<h1 style=\"color: green; font-size: 30px;\">Books Data Inserted SUCCESSFULLY</h1>");
				
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
				
				requestDispatcher.include(req, resp);
			}
			else
			{
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
