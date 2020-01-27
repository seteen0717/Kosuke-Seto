package task3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/COLLABO_DB", "SETEEN", "joni1571");

			String sql = "SELECT * FROM employee1 WHERE name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);

			String name = request.getParameter("name");
			ps.setString(1, "%" + name + "%");

			ResultSet rs = ps.executeQuery();
			out.println("<html><head></head><body>");
			out.println("<p>検索結果</p>");

			while(rs.next()) {
				int id = rs.getInt("id");
				name = rs.getString("name");
				Date birthday = rs.getDate("birthday");
				int age = rs.getInt("age");
				out.println("<p>ID：" + id + "</p>");
				out.println("<p>名前：" + name + "</p>");
				out.println("<p>生年月日：" + birthday + "</p>");
				out.println("<p>年齢：" + age + "</p>");
			}
			rs.close();
			ps.close();
			out.println("</body></html>");
		} catch(SQLException e) {
			//out.println("SQL失敗");
			e.printStackTrace();


		} catch(ClassNotFoundException e) {
			//out.println("ドライバー見つからない");
			e.printStackTrace();

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

	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	*/
}
