package task5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
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

			String sql = "DELETE FROM employee1 WHERE ID = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			int id = Integer.parseInt(request.getParameter("deleteId"));
			ps.setInt(1, id);

			int result = ps.executeUpdate();
			out.println("<html><head></head><body>");
			out.println("<p>削除完了</p>");
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



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
