package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javabeans.Readblog;
@WebServlet("/readblog")
public class readblog extends HttpServlet {
	
    public readblog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		Readblog rd = new Readblog();
		boolean flag = rd.read(id);
		if (flag == true) {
			response.sendRedirect("title.jsp");
		}
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
}
