package JunnDBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JunnQuery.QuerySelect;

public class SelectControl {
	
	QuerySelect select = new QuerySelect();
	boolean flag = false;
	
	public ResultSet SelectPerResume(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			pstmt = conn.prepareStatement(select.getSelPerResume());
			
			rs = pstmt.executeQuery();
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow()); // ���⼭ 0�� ���;� ����. Ȯ����
			while(rs.next()){ // ������� �ִ� �� ���� �� Ȯ���ؼ� ������ �ִ� �÷� �� ��ȸ �����ϰ� ���ִ� �ݺ���.
				String pid = rs.getString("PID");
				String pname = rs.getString("PNAME");
				String padress = rs.getString("PADRESS");
				String pemail = rs.getString("PEMAIL");
				String pbirth = rs.getString("PBIRTH");
				
				System.out.println("PID : " + pid + "\t PNAME : " + pname + "\t PADRESS : " + padress + "\t PEMAIL : " + pemail + "\t PBIRTH : " + pbirth);
			}
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow()); // ���� ī������ �� �Ǽ�. ��¥.
			flag = true;
			
		}catch(SQLException se){ // ���������� ����ش�.
			se.printStackTrace();			
		}catch(Exception e){ // �̿��� ��� ������ �� ����ش�.
			e.printStackTrace();
		}finally{ // ��������, try���� ������ �ܰ�� catch���� ���� finally�� ���ļ� ������.
			System.out.println("Query Select End");			
		} 
		
		return rs;
	}
}

