package com.lalalala.s1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String contextPath = request.getContextPath();
		String encoding = request.getCharacterEncoding();
		String method = request.getMethod();
		String pathInfo = request.getPathInfo();
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String servletPath = request.getServletPath();
		
		System.out.println("ContextPath : " + contextPath);
		System.out.println("Encoding : " + encoding);
		System.out.println("Method : " + method);
		System.out.println("PathInfo : " + pathInfo);
		System.out.println("URI : " + uri);
		System.out.println("URL : " + url);
		System.out.println("Servlet Path : " + servletPath);
		
		
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		// parameter이름이 틀리면 해당 값이 없기 때문에 Null이 나옴
		
		System.out.println(id);
		System.out.println(age);
		
		RequestDispatcher view = request.getRequestDispatcher("./index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
