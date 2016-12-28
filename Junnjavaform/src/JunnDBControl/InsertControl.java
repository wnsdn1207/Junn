package JunnDBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JunnQuery.QueryInsert;

public class InsertControl {

	QueryInsert insert = new QueryInsert();

	public void InsertPerResume(Connection conn, String pid, String pname, String padress, String pemail, String pbirth){
		PreparedStatement pstmt = null; // 토드시 작성할 수 있는 쿼리입력탭 객체
		
		
//		SELECT EMPNO, ENAME FROM SCOTT.EMP WHERE ENAME = ?"
		try { // 예외처리 기능
			pstmt = conn.prepareStatement(insert.getInPerResume()); // 커넥션.입력객체(쿼리문)
			pstmt.setString(1, pid); // 값을 넣어줄 때 set을 써준다, set+type(1번쨰 물음표, Ename)
			pstmt.setString(2, pname);
			pstmt.setString(3, padress);
			pstmt.setString(4, pemail);
			pstmt.setString(5, pbirth);
			
			pstmt.executeUpdate(); // executeQuery() - 셀렉트문 / excuteUpdate() - 값이 변경되는 쿼리문.		
			
		} catch (SQLException e) { // try문이 오류났을 시 catch문으로 넘어감, 
			// TODO Auto-generated catch block
			e.printStackTrace(); // printStackTrace() - 오류를 보여주는 문장.
		}
	}

}
 