package JunnDBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JunnQuery.QueryUpdate;

public class UpdateControl {
	
	QueryUpdate update = new QueryUpdate();
	
	public void UpdatePerResume(Connection conn, String pid, String pname, String padress, String pemail, String pbirth){
		PreparedStatement pstmt = null;
		
		try{
			pstmt = conn.prepareStatement(update.getUpPerResume());
			pstmt.setString(1,pid);
			pstmt.setString(2,pname);
			pstmt.setString(3,padress);
			pstmt.setString(4,pemail);
			pstmt.setString(5,pbirth);
			
			pstmt.executeUpdate();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

}
