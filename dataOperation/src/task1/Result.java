package task1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		/*String name = request.getParameter("q1");
		String gender = request.getParameter("q2");
		String contact1 = request.getParameter("q3");
		String contact2 = request.getParameter("q4");
		*/
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p>");
		out.println("<br>");
		out.println("<p>名前：" + request.getParameter("name") + "様</p>");
		out.println("<p>性別：" + request.getParameter("gender") + "性</p>");
		out.println("<p>お問い合わせ種類：" + request.getParameter("contactA") + "</p>");
		out.println("<p>お問い合わせ内容：" + request.getParameter("contactB") + "</p>");
		out.println("</body></html>");

		out.close();
	}

	/* protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} */

}
