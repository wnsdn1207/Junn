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
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow()); // 여기서 0이 나와야 정상. 확인차
			while(rs.next()){ // 결과값이 있는 지 없는 지 확인해서 있으면 있는 컬럼 다 조회 가능하게 해주는 반복문.
				String pid = rs.getString("PID");
				String pname = rs.getString("PNAME");
				String padress = rs.getString("PADRESS");
				String pemail = rs.getString("PEMAIL");
				String pbirth = rs.getString("PBIRTH");
				
				System.out.println("PID : " + pid + "\t PNAME : " + pname + "\t PADRESS : " + padress + "\t PEMAIL : " + pemail + "\t PBIRTH : " + pbirth);
			}
			
			System.out.println("SELECT RESULT COUNT : " + rs.getRow()); // 실제 카운팅한 총 건수. 진짜.
			flag = true;
			
		}catch(SQLException se){ // 쿼리오류만 잡아준다.
			se.printStackTrace();			
		}catch(Exception e){ // 이외의 모든 오류를 다 잡아준다.
			e.printStackTrace();
		}finally{ // 생략가능, try문의 마지막 단계며 catch문에 들어가도 finally를 거쳐서 나간다.
			System.out.println("Query Select End");			
		} 
		
		return rs;
	}
}

