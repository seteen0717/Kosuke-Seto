package task4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/countSession")
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();

		out.println("<html><head></head><body>");
		out.println("<h1>訪問回数テスト（セッション）</h1>");

		if (session != null) {
			String count = (String)session.getAttribute("visited");
			int countVisited = Integer.parseInt(count) + 1;
			out.println("<p>" + countVisited + "回目の訪問です。</p>");
			session.setAttribute("visited", Integer.toString(countVisited));
		} else {
			out.println("<p>初めての訪問です。</p>");
			session.setAttribute("visited", "1");

		}
		out.println("<a href=\"countSession\">画面を再訪問</a>");
		out.println("</body></html>");

		out.close();


	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

	}
}