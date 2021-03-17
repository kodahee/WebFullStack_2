package com.lalalala.s1.test;

import java.util.List;

import com.lalalala.s1.bankbook.BankBookDAO;
import com.lalalala.s1.bankbook.BankBookDTO;

public class BankBookDAOTest {

	public static void main(String[] args) {

		BankBookDAO bankbookDAO = new BankBookDAO();
		try {
			List<BankBookDTO> ar = bankbookDAO.getList();
			System.out.println(ar.size() != 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
