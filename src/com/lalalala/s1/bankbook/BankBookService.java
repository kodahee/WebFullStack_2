package com.lalalala.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lalalala.s1.util.ActionForward;

public class BankBookService {
	
	private BankBookDAO bankbookDAO;
	
	public void setBankbookDAO(BankBookDAO bankbookDAO) {
		this.bankbookDAO = bankbookDAO;
	}
	
	public ActionForward getSelect(HttpServletRequest request) throws Exception {
		ActionForward actionForward = new ActionForward();
		
		long bookNumber = Long.parseLong(request.getParameter("bookNumber"));
		
		BankBookDTO bankbookDTO = bankbookDAO.getSelect(bookNumber);

		actionForward.setPath("../WEB-INF/bankbook/bankbookSelect.jsp");
		actionForward.setCheck(true);
		request.setAttribute("bankbookDTO", bankbookDTO);
		
		return actionForward;
	}

	// getList
	// DAO의 getList 호출 후 리턴
	public ActionForward getList(HttpServletRequest request) throws Exception {
		
		ActionForward actionForward = new ActionForward();
		List<BankBookDTO> ar = bankbookDAO.getList();
		
		request.setAttribute("list", ar);
		actionForward.setPath("../WEB-INF/bankbook/bankbookList.jsp");
		actionForward.setCheck(true);
		
		return actionForward;
	}
	

}
