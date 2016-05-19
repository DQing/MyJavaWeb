package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabeans.Islogin;

@WebServlet("/dologin")
public class dologin extends HttpServlet {

    public dologin() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String usename=request.getParameter("usename");
		String password=request.getParameter("password");
		String[] str=request.getParameterValues("isusecookies");
		 Islogin d=new Islogin();
		 try {
			boolean flag=d.login(usename, password);
			if(flag==true){
				Cookie usenamecookie=new Cookie("usename",usename);
				Cookie paswordcookie=new Cookie("password",password);
				response.addCookie(usenamecookie);
				response.addCookie(paswordcookie);
				response.sendRedirect("title.jsp");
			}
			else
				response.sendRedirect("error.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
