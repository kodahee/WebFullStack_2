package com.lalalala.s1.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankBookDAO {

	public BankBookDTO getSelect(long bookNumber) throws Exception {
		// 1. 
		String user = "user01";
		String password = "user01";
		String url = "jdbc:Oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 2. 
		Class.forName(driver);

		// 3. 
		Connection con = DriverManager.getConnection(url, user, password);

		// 4. 
		String sql = "SELECT * "
				+ "FROM BANKBOOK "
				+ "WHERE BOOKNUMBER = ?";

		// 5. 
		PreparedStatement st = con.prepareStatement(sql);

		// 6. 
		st.setLong(1, bookNumber);

		// 7.
		ResultSet rs = st.executeQuery();
		BankBookDTO bankbookDTO = null;

		if(rs.next()) {
			bankbookDTO = new BankBookDTO();
			bankbookDTO.setBookNumber(rs.getLong("bookNumber"));
			bankbookDTO.setBookName(rs.getString("bookName"));
			bankbookDTO.setBookRate(rs.getDouble("bookRate"));
			bankbookDTO.setBookSale(rs.getString("bookSale"));
		}

		// 8. 
		rs.close();
		st.close();
		con.close();

		return bankbookDTO;

	}

	// getList
	// bankbook table의 모든 데이터 조회 후 리턴

	public List<BankBookDTO> getList() throws Exception {

		// 1. 
		String user = "user01";
		String password = "user01";
		String url = "jdbc:Oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 2. 
		Class.forName(driver);

		// 3. 
		Connection con = DriverManager.getConnection(url, user, password);

		// 4. 
		String sql = "select * from bankbook";

		// 5.
		PreparedStatement st = con.prepareStatement(sql);

		// 6.

		// 7. 
		ResultSet rs = st.executeQuery();

		ArrayList<BankBookDTO> ar = new ArrayList<>();

		while(rs.next()) {
			BankBookDTO bankbookDTO = new BankBookDTO();
			bankbookDTO.setBookNumber(rs.getLong("bookNumber"));
			bankbookDTO.setBookName(rs.getString("bookName"));
			bankbookDTO.setBookRate(rs.getDouble("bookRate"));
			bankbookDTO.setBookSale(rs.getString("bookSale"));

			ar.add(bankbookDTO);
		}

		// 8. 
		rs.close();
		st.close();
		con.close();

		return ar;

	}

}
