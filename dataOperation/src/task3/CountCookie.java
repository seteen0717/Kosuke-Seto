package task3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html><head></head><body>");
		out.println("<h1>訪問回数テスト（クッキー）</h1>");

		Cookie cookies[] = request.getCookies();
		Cookie visitedCookie = null;

		if (cookies != null){
			for (int i = 0 ; i < cookies.length ; i++){
				if (cookies[i].getName().equals("visited")){
					visitedCookie = cookies[i];
				}
			}

			int countVisited = Integer.parseInt(visitedCookie.getValue()) + 1;

			out.println("<p>" + countVisited + "回目の訪問です。</p>");

			visitedCookie.setValue(Integer.toString(countVisited));
			visitedCookie.setMaxAge(300);
		    response.addCookie(visitedCookie);

		}else{
			out.println("<p>初めての訪問です。</p>");

			Cookie cookie = new Cookie("visited", "1");
			cookie.setMaxAge(300);
			response.addCookie(cookie);
		}

		out.println("<a href=\"CountCookie\">画面を再訪問</a>");
		out.println("</body></html>");

		out.close();

	}

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	*/
}
