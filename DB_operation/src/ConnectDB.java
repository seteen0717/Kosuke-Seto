import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDB {

	public static void main(String[] args) {
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("ドライバーOK");
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:8889/COLLABO_DB", "SETEEN", "joni1571");
			//System.out.println("接続成功");
			//String sql = "SELECT name FROM employee1 WHERE age = ?";


		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("ドライバのセットミス");

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("接続失敗");
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
