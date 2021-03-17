package com.lalalala.s1.bankbook;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lalalala.s1.util.ActionForward;

/**
 * Servlet implementation class BankBookController
 */
@WebServlet("/BankBookController")
public class BankBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BankBookService bankbookService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankBookController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// Controller 객체 생성 후 자동 호출되는 초기화 메서드
    	bankbookService = new BankBookService();
    	BankBookDAO bankbookDAO = new BankBookDAO();
    	bankbookService.setBankbookDAO(bankbookDAO);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// MemberController 참조
		
		// /WebFullStack_2/bankbook/bankbookList.do
		String uri = request.getRequestURI();
		int index = uri.lastIndexOf("/");
		uri = uri.substring(index+1);				// bankbookList.do
		
		ActionForward actionForward = null;
		
		try {
			if(uri.equals("bankbookList.do")) {
				actionForward = bankbookService.getList(request);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// forward, redirect
		if(actionForward.isCheck()) {
			// forward
			RequestDispatcher view = request.getRequestDispatcher(actionForward.getPath());
			view.forward(request, response);
			
		} else {
			// redirect
			response.sendRedirect(actionForward.getPath());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
