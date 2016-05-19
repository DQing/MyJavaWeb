package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javabeans.Writeblog;
@WebServlet("/writeblog")
public class writeblog extends HttpServlet {
	public writeblog(){
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String str=request.getParameter("text");
		String title=request.getParameter("title");
		Writeblog wb=new Writeblog();
		boolean flag=wb.writeblog(title, str);
		if(flag==true){
			response.sendRedirect("title.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
