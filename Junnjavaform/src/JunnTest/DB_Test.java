package JunnTest;

import java.sql.Connection;
import java.sql.ResultSet;

import JunnConnect.JunnConnect;
import JunnDBControl.InsertControl;
import JunnDBControl.SelectControl;
import JunnDBControl.UpdateControl;

public class DB_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JunnConnect JunnConn = new JunnConnect();
		
		Connection conn = JunnConn.connect();
		
		if ( conn != null) System.out.println("Junn Connect Success");
		else System.out.println("Junn Connect Fail");
		
		SelectControl sc = new SelectControl();
		InsertControl ic = new InsertControl();
		UpdateControl uc = new UpdateControl();
		
//		ResultSet rs = sc.SelectPerResume(conn);
		sc.SelectPerResume(conn);
//		ic.InsertPerResume(conn, "7777", "Junwoo", "경기도 평택시 비전2동", "wnsdn1207@naver.com", "19920911");
//		ic.InsertPerResume(conn, "7778", "Heejin", "인천 서구 당하동", "heejin7124@naver.com", "19931104");
//		ic.InsertEmpInfo(conn, "JunWoo", 7555);
	}
}