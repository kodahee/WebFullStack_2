package com.lalalala.s1.test;

import com.lalalala.s1.member.MemberDAO;
import com.lalalala.s1.member.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		// Web에서 메인메서드는 테스트 용도로만 사용	
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id3");
		memberDTO.setPw("pw3");
		memberDTO.setName("name3");
		memberDTO.setPhone("01033333333");
		memberDTO.setEmail("id3@naver.com");
		
		try {
			int result = memberDAO.memberJoin(memberDTO);
			System.out.println(result != 0);
//			memberDTO = memberDAO.login(memberDTO);
			
//			System.out.println(memberDTO != null);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
