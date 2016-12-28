package JunnDBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JunnQuery.QueryInsert;

public class InsertControl {

	QueryInsert insert = new QueryInsert();

	public void InsertPerResume(Connection conn, String pid, String pname, String padress, String pemail, String pbirth){
		PreparedStatement pstmt = null; // ���� �ۼ��� �� �ִ� �����Է��� ��ü
		
		
//		SELECT EMPNO, ENAME FROM SCOTT.EMP WHERE ENAME = ?"
		try { // ����ó�� ���
			pstmt = conn.prepareStatement(insert.getInPerResume()); // Ŀ�ؼ�.�Է°�ü(������)
			pstmt.setString(1, pid); // ���� �־��� �� set�� ���ش�, set+type(1���� ����ǥ, Ename)
			pstmt.setString(2, pname);
			pstmt.setString(3, padress);
			pstmt.setString(4, pemail);
			pstmt.setString(5, pbirth);
			
			pstmt.executeUpdate(); // executeQuery() - ����Ʈ�� / excuteUpdate() - ���� ����Ǵ� ������.		
			
		} catch (SQLException e) { // try���� �������� �� catch������ �Ѿ, 
			// TODO Auto-generated catch block
			e.printStackTrace(); // printStackTrace() - ������ �����ִ� ����.
		}
	}

}
 