package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnTest {
	    public static void main(String[] args) {
	    	/*String sql = "SELECT TEAM_ID, PLAYER_NAME, HEIGHT FROM PLAYER\n" WHERE TEAM_ID LIKE '%s'
					"    AND HEIGHT >= %s\n" + 
					"    AND PLAYER_NAME LIKE '%s%'";
	    	String result = String.format(sql, "K03","170","DD");
	    	System.out.println(result);*/
		/*Connection conn = null;
		Statement state = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe",
				username = "C##JONG",
				password="008313";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
			if(conn != null) {
				System.out.println("연결 성공");
				state = conn.createStatement();
				rs = state.executeQuery("SELECT DISTINCT POSITION\r\n position" + 
						"FROM PLAYER");
				List<String> list = new ArrayList<>();
				while (rs.next()) {
					list.add(rs.getString("position"));
				}
				
				System.out.println("포지션 \n " + list);
				
			}else {
				System.out.println("연결 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	    
	}
}
