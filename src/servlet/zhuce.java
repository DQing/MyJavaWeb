package servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javabeans.ISzhuce;

@WebServlet("/zhuce")
public class zhuce extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usename=request.getParameter("username");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");
		String phone=request.getParameter("phone");
		LinkedList<String> list=new LinkedList<String>();
		list.add(usename);
		list.add(password);
		list.add(name);
		list.add(age);
		list.add(sex);
		list.add(phone);
		ISzhuce is = new ISzhuce();
		boolean flag=is.zhuce(list);
		if(flag==true){
			response.sendRedirect("dologin.jsp");
		}

	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
