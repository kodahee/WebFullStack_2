package com.lalalala.s1.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lalalala.s1.util.ActionForward;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private MemberService memberService;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	memberService = new MemberService();
    	MemberDAO memberDAO = new MemberDAO();
    	memberService.setMemberDAO(memberDAO);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("*********MemberController*********");
		
		String path = request.getServletPath();
		String uri = request.getRequestURI();
		System.out.println(path);
		System.out.println(uri);
		String result="";
		
		//subString 으로 마지막 주소
		//1. 자르려고 하는 시작 인덱스 번호 찾기
		int index = uri.lastIndexOf("/");
		//2. 해당 인덱스부터 잘라오기
		result = uri.substring(index+1);
		System.out.println(result);
		String pathInfo = "";
		
		ActionForward actionForward = null;
		
		if(result.equals("memberLogin.do")) {
			System.out.println("로그인 처리");
//			pathInfo = "../WEB-INF/member/memberLogin.jsp";
			
			try {
				actionForward = memberService.memberLogin(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(result.equals("memberJoin.do")) {
			System.out.println("회원가입 처리");
			
			try {
				actionForward = memberService.memberJoin(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			System.out.println("그 외 다른 처리");
		}
		
		if(actionForward.isCheck()) {
			// forward
			RequestDispatcher view = request.getRequestDispatcher(actionForward.getPath());
			view.forward(request, response);
		} else {
			// redirect
			response.sendRedirect(actionForward.getPath());
		}
		
		
		
		/*
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		String result = "";
		
		try {
			memberDTO = memberDAO.login(memberDTO);
			
			if(memberDTO != null) {
				result = "로그인 성공";
			} else {
				result = "로그인 실패";
				memberDTO.setId(null);
				memberDTO.setPw(null);
				memberDTO.setName(null);
				memberDTO.setPhone(null);
				memberDTO.setEmail(null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// attribute 속성
		request.setAttribute("r", result);
		
		// attribute 에 로그인한 MemberDTO
		request.setAttribute("dto", memberDTO);
//		request.setAttribute("id", memberDTO.getId());
//		request.setAttribute("pw", memberDTO.getPw());
//		request.setAttribute("name", memberDTO.getName());
//		request.setAttribute("phone", memberDTO.getPhone());
//		request.setAttribute("email", memberDTO.getEmail());
		
		
		// forward 
		RequestDispatcher view = request.getRequestDispatcher("./memberResult.jsp");
		view.forward(request, response);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
